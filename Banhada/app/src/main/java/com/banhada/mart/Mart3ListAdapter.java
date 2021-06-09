package com.banhada.mart;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.banhada.R;

import java.util.ArrayList;

public class Mart3ListAdapter extends BaseAdapter {
    Context context;
    LayoutInflater layoutInflater;
    ArrayList<Mart3ListItem> mart3_item;

    public Mart3ListAdapter(Context context, ArrayList<Mart3ListItem> mart3_item) {
        this.context = context;
        this.layoutInflater = LayoutInflater.from(context);
        this.mart3_item = mart3_item;
    }

    @Override
    public int getCount() {
        return mart3_item.size();
    }

    @Override
    public Object getItem(int position) {
        return mart3_item.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = layoutInflater.inflate(R.layout.mart3_list, parent, false);
        }

        final TextView tv_mart_name = convertView.findViewById(R.id.tv_mart_name);
        TextView tv_mart_address = convertView.findViewById(R.id.tv_mart_address);
        Button btn_choice = convertView.findViewById(R.id.btn_choice);

        final Mart3ListItem mart3ListItem = mart3_item.get(position);
        tv_mart_name.setText(mart3ListItem.getText1());
        tv_mart_address.setText(mart3ListItem.getText2());

        btn_choice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, tv_mart_name.getText()+"(을)를 선택하였습니다.", Toast.LENGTH_SHORT).show();
                ((Activity)context).finish();
            }
        });

        return convertView;
    }
}
