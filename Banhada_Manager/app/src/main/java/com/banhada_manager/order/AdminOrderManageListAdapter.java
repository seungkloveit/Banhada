package com.banhada_manager.order;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.TextView;

import com.example.banhada_manager.R;

import java.util.ArrayList;

public class AdminOrderManageListAdapter extends BaseAdapter {
    Context context;
    ArrayList<AdminOrderManageListItem> admin_order_Item;

    public AdminOrderManageListAdapter(Context context, ArrayList<AdminOrderManageListItem> admin_order_Item) {
        this.context = context;
        this.admin_order_Item = admin_order_Item;
    }

    @Override
    public int getCount() {
        return admin_order_Item.size();
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
        if (convertView == null) {
            LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = layoutInflater.inflate(R.layout.admin_order_list, parent, false);
        }

        TextView tv_admin_order_date1 = convertView.findViewById(R.id.tv_admin_order_date1);
        TextView tv_admin_order_userName1 = convertView.findViewById(R.id.tv_admin_order_userName1);
        final TextView tv_admin_order_prodName1 = convertView.findViewById(R.id.tv_admin_order_prodName1);
        final TextView tv_admin_order_price1 = convertView.findViewById(R.id.tv_admin_order_price1);
        TextView tv_admin_order_state1 = convertView.findViewById(R.id.tv_admin_order_state1);
        Button btn_detail_ad = convertView.findViewById(R.id.btn_detail_ad);

        final AdminOrderManageListItem adminOrderManageListItem = admin_order_Item.get(position);
        tv_admin_order_date1.setText(adminOrderManageListItem.getText1());
        tv_admin_order_userName1.setText(adminOrderManageListItem.getText2());
        tv_admin_order_prodName1.setText(adminOrderManageListItem.getText3());
        tv_admin_order_price1.setText(adminOrderManageListItem.getText4());
        tv_admin_order_state1.setText(adminOrderManageListItem.getText5());

        btn_detail_ad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder detail_builder = new AlertDialog.Builder(context);
                detail_builder.setTitle(tv_admin_order_prodName1.getText().toString() + "\n" + tv_admin_order_price1.getText().toString() + "원");
                StringBuilder sb = new StringBuilder();
                sb.append("\nA재료\t\t\t200g\t\t\t14000원\n");
                sb.append("B재료\t\t\t50g\t\t\t2000원\n");
                sb.append("C재료\t\t\t100g\t\t\t5000원\n");
                sb.append("\n\n합계\t\t\t");
                sb.append("210000원");
                detail_builder.setMessage(sb);
                detail_builder.setPositiveButton("확인",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int which) {
                            }
                        });
                detail_builder.show();
            }
        });

        return convertView;
    }
}

