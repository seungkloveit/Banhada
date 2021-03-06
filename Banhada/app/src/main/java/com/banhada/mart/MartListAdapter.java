package com.banhada.mart;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import com.example.banhada.R;

import java.util.ArrayList;

public class MartListAdapter extends BaseAdapter {
    Context context;
    LayoutInflater layoutInflater;
    ArrayList<String> mart_address_item;

    private int mSelectedRadioPosition;

    public MartListAdapter(Context context, ArrayList<String> mart_address_item) {
        this.context = context;
        this.layoutInflater = LayoutInflater.from(context);
        this.mart_address_item = mart_address_item;
    }

    @Override
    public int getCount() {
        return mart_address_item.size();
    }

    @Override
    public Object getItem(int position) {
        return mart_address_item.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        View view = layoutInflater.inflate(R.layout.mart_list, null);

        RadioButton rb_address_mart = view.findViewById(R.id.rb_address_mart);
        rb_address_mart.setText(mart_address_item.get(position));

        if (mSelectedRadioPosition == position) {
            rb_address_mart.setChecked(true);
        } else {
            rb_address_mart.setChecked(false);
        }

        Button btn_delete_mart = view.findViewById(R.id.btn_delete_mart);
        btn_delete_mart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder detail_builder = new AlertDialog.Builder(context);
                detail_builder.setTitle("?????? ??????");
                detail_builder.setMessage("????????? ?????? ?????????????????????????");
                detail_builder.setPositiveButton("??????",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int which) {
                                Toast.makeText(context, "????????? ????????? ?????????????????????.", Toast.LENGTH_SHORT).show();
                                mart_address_item.remove(position);
                                notifyDataSetChanged();
                            }
                        });
                detail_builder.setNegativeButton("??????", null);
                detail_builder.show();
            }
        });
        return view;
    }

    public void setSelectedPosition(int position) {
        mSelectedRadioPosition = position;
    }
}
