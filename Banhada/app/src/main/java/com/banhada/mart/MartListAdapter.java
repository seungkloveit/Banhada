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
                detail_builder.setTitle("마트 삭제");
                detail_builder.setMessage("마트를 정말 삭제하시겠습니까?");
                detail_builder.setPositiveButton("확인",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int which) {
                                Toast.makeText(context, "연결된 마트를 삭제하였습니다.", Toast.LENGTH_SHORT).show();
                                mart_address_item.remove(position);
                                notifyDataSetChanged();
                            }
                        });
                detail_builder.setNegativeButton("취소", null);
                detail_builder.show();
            }
        });
        return view;
    }

    public void setSelectedPosition(int position) {
        mSelectedRadioPosition = position;
    }
}
