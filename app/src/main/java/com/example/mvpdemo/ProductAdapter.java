package com.example.mvpdemo;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class ProductAdapter extends BaseAdapter {
    @Override
    public int getCount() {
        return 0;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View view =  null;
        MyViewholder hodler;
        if (view==null){

           view = View.inflate(convertView.getContext(),R.layout.activity_main,null);
            hodler = new MyViewholder(view);
            view.setTag(hodler);
        }else{
            hodler = (MyViewholder) view.getTag();
        }

        hodler.tv.setText("kson");
        return view;
    }

    class MyViewholder {

        @BindView(R.id.tv)
         TextView tv;
        @BindView(R.id.btn)
         Button btn;

        public MyViewholder(View itemView){

            ButterKnife.bind(this,itemView);
//            tv = itemView.findViewById(R.id.tv);
        }
    }
}
