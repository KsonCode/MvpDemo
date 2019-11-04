package com.example.mvpdemo;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.tv)//findviewbyid
            TextView tv;

    @BindView(R.id.tv2)
    TextView tv2;


    Unbinder bind;
    @BindView(R.id.btn)
    Button send;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //进程
        //2
        //3
        //4
        //5
        //加载布局之后，注册butterknife
        bind = ButterKnife.bind(this);

        tv.setText("kson");
        tv2.setText("kson1");

//        tv = findViewById(R.id.tv);
//        tv.setText("kson");
        new Thread(new Runnable() {
            @Override
            public void run() {
                //1
            }
        }).start();


//        send.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//            }
//        });
    }

    @OnClick(R.id.btn)//
    public void sendClick(View view){

        Toast.makeText(this, "click", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        if (bind != null) {
            bind.unbind();//取消注册
        }
    }
}
