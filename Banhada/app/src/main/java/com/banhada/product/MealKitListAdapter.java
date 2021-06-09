package com.banhada.product;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.banhada.login.NormalUser_SignUp;
import com.example.banhada.R;

import java.util.ArrayList;

public class MealKitListAdapter extends BaseAdapter {
    Context context;
    ArrayList<MealKitListItem> meal_kit_item;

    public MealKitListAdapter(Context context, ArrayList<MealKitListItem> meal_kit_item) {
        this.context = context;
        this.meal_kit_item = meal_kit_item;
    }
    @Override
    public int getCount() {
        return meal_kit_item.size();
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
            convertView = layoutInflater.inflate(R.layout.meal_kit_list_item, parent, false);
        }
        ImageView kit_img=convertView.findViewById(R.id.kit_img);
        TextView tv_kit_name=convertView.findViewById(R.id.tv_kit_name);
        final MealKitListItem mealKitListItem =meal_kit_item.get(position);

        kit_img.setImageResource(mealKitListItem.getImgView());
        tv_kit_name.setText(mealKitListItem.getText1());

        convertView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, Food.class);
                context.startActivity(intent);
            }
        });

        return convertView;
    }

}
