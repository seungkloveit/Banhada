package com.banhada_mart.order;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.banhada_mart.R;

import java.util.ArrayList;

public class MartOrderManageListAdapter extends BaseAdapter {
    Context context;
    ArrayList<MartOrderManageListItem> mart_order_Item;

    public MartOrderManageListAdapter(Context context, ArrayList<MartOrderManageListItem> mart_order_Item) {
        this.context = context;
        this.mart_order_Item = mart_order_Item;
    }

    @Override
    public int getCount() {
        return mart_order_Item.size();
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
            convertView = layoutInflater.inflate(R.layout.mart_order_list, parent, false);
        }

        TextView tv_mart_order_date1 = convertView.findViewById(R.id.tv_mart_order_date1);
        TextView tv_mart_order_userName1 = convertView.findViewById(R.id.tv_mart_order_userName1);
        final TextView tv_mart_order_prodName1 = convertView.findViewById(R.id.tv_mart_order_prodName1);
        final TextView tv_mart_order_price1 = convertView.findViewById(R.id.tv_mart_order_price1);
        final TextView tv_mart_order_state1 = convertView.findViewById(R.id.tv_mart_order_state1);
        Button btn_detail = convertView.findViewById(R.id.btn_detail);
        final TextView tv_mart_order_time = convertView.findViewById(R.id.tv_mart_order_time);
        final Button btn_change_state = convertView.findViewById(R.id.btn_change_state);

        final MartOrderManageListItem martOrderManageListItem = mart_order_Item.get(position);
        tv_mart_order_date1.setText(martOrderManageListItem.getText1());
        tv_mart_order_userName1.setText(martOrderManageListItem.getText2());
        tv_mart_order_prodName1.setText(martOrderManageListItem.getText3());
        tv_mart_order_price1.setText(martOrderManageListItem.getText4());
        tv_mart_order_state1.setText(martOrderManageListItem.getText5());
        btn_change_state.setText(martOrderManageListItem.getText6());
        tv_mart_order_time.setText(martOrderManageListItem.getText7());
        tv_mart_order_time.setVisibility(View.INVISIBLE);


        btn_detail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder detail_builder = new AlertDialog.Builder(context);
                detail_builder.setTitle(tv_mart_order_prodName1.getText().toString() + "\n" + tv_mart_order_price1.getText().toString() + "???");
                StringBuilder sb = new StringBuilder();
                sb.append("\nA??????\t\t\t200g\t\t\t14000???\n");
                sb.append("B??????\t\t\t50g\t\t\t2000???\n");
                sb.append("C??????\t\t\t100g\t\t\t5000???\n");
                sb.append("\n\n??????\t\t\t");
                sb.append("210000???");
                detail_builder.setMessage(sb);
                detail_builder.setPositiveButton("??????",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int which) {
                            }
                        });
                detail_builder.show();
            }
        });
        btn_change_state.setOnClickListener(new View.OnClickListener() {
            String arrayWhich;

            @Override
            public void onClick(View v) {

                if (btn_change_state.getText().equals("????????????")) {
                    AlertDialog.Builder receive_builder = new AlertDialog.Builder(context);
                    receive_builder.setTitle("??????????????? ???????????????????");
                    receive_builder.setPositiveButton("???",
                            new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int which) {
                                    btn_change_state.setText("????????????");
                                    tv_mart_order_state1.setText("????????????: ????????????");
                                    Toast.makeText(context, "????????? ?????????????????????.", Toast.LENGTH_LONG).show();
                                }
                            });
                    receive_builder.setNegativeButton("?????????", null);
                    receive_builder.show();
                } else if (btn_change_state.getText().equals("????????????")) {
                    final String[] timeArray = new String[]{"30???", "45???", "60???", "75???", "90???"};
                    AlertDialog.Builder timeSet_builder = new AlertDialog.Builder(context);
                    timeSet_builder.setTitle("?????? ?????? ??????");
                    timeSet_builder.setSingleChoiceItems(timeArray, 0, new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            arrayWhich = timeArray[which];
                        }
                    });
                    timeSet_builder.setPositiveButton("??????",
                            new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int which) {
                                    tv_mart_order_time.setText(arrayWhich);
                                    tv_mart_order_time.setVisibility(View.VISIBLE);
                                    btn_change_state.setText("?????????");
                                    tv_mart_order_state1.setText("????????????: ????????????");
                                }
                            });
                    timeSet_builder.setNegativeButton("??????", null);
                    timeSet_builder.show();
                } else if (btn_change_state.getText().equals("?????????")) {
                    AlertDialog.Builder clear_builder = new AlertDialog.Builder(context);
                    clear_builder.setTitle("????????? ?????????????????????????");
                    clear_builder.setPositiveButton("???",
                            new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int which) {
                                    tv_mart_order_state1.setText("????????????: ????????????");
                                    btn_change_state.setVisibility(View.INVISIBLE);
                                    tv_mart_order_time.setVisibility(View.INVISIBLE);
                                    Toast.makeText(context, "????????? ?????????????????????.", Toast.LENGTH_LONG).show();
                                }
                            });
                    clear_builder.setNegativeButton("?????????", null);
                    clear_builder.show();
                }
            }
        });
        return convertView;
    }
}

