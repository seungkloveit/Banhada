package com.banhada.shipping;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import com.example.banhada.R;

import java.util.ArrayList;

public class ShippingListAdapter extends BaseAdapter {
    Context context;
    ArrayList<ShippingListItem> shipping_address_item;

    private int mSelectedRadioPosition;

    public ShippingListAdapter(Context context, ArrayList<ShippingListItem> shipping_address_item) {
        this.context = context;
        this.shipping_address_item = shipping_address_item;
    }

    @Override
    public int getCount() {
        return shipping_address_item.size();
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
    public View getView(final int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = layoutInflater.inflate(R.layout.shipping_list, parent, false);

        }

        RadioButton rb_address = convertView.findViewById(R.id.rb_address);

        if (mSelectedRadioPosition == position) {
            rb_address.setChecked(true);
        } else {
            rb_address.setChecked(false);
        }

        TextView tv_user_detail_final = convertView.findViewById(R.id.tv_user_detail_final);
        TextView tv_user_name_final = convertView.findViewById(R.id.tv_user_name_final);
        TextView tv_user_tel_final = convertView.findViewById(R.id.tv_user_tel_final);
        Button btn_delete = convertView.findViewById(R.id.btn_delete);

        final ShippingListItem shippingListItem = shipping_address_item.get(position);
        rb_address.setText(shippingListItem.getText1());
        tv_user_detail_final.setText(shippingListItem.getText2());
        tv_user_name_final.setText(shippingListItem.getText3());
        tv_user_tel_final.setText(shippingListItem.getText4());

        btn_delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder detail_builder = new AlertDialog.Builder(context);
                detail_builder.setTitle("배송지 삭제");
                detail_builder.setMessage("배송지를 정말 삭제하시겠습니까?");
                detail_builder.setPositiveButton("확인",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int which) {
                                Toast.makeText(context, "배송지를 삭제하였습니다.", Toast.LENGTH_SHORT).show();
                                shipping_address_item.remove(position);
                                notifyDataSetChanged();
                            }
                        });
                detail_builder.setNegativeButton("취소", null);
                detail_builder.show();
            }
        });

        return convertView;
    }

    public void setSelectedPosition(int position) {
        mSelectedRadioPosition = position;
    }
}
