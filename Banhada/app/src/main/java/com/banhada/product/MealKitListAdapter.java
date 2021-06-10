package com.banhada.product;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.banhada.login.NormalUser_SignUp;
import com.example.banhada.R;

import java.io.ByteArrayOutputStream;
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
        final ImageView kit_img=convertView.findViewById(R.id.kit_img);
        final TextView tv_kit_name=convertView.findViewById(R.id.tv_kit_name);
        final TextView tv_kit_price=convertView.findViewById(R.id.tv_kit_price);
        final MealKitListItem mealKitListItem =meal_kit_item.get(position);

        kit_img.setImageResource(mealKitListItem.getImgView());
        tv_kit_name.setText(mealKitListItem.getText1());
        tv_kit_price.setText(mealKitListItem.getText2());

        convertView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ByteArrayOutputStream stream=new ByteArrayOutputStream();
                Bitmap bitmap=((BitmapDrawable)kit_img.getDrawable()).getBitmap();
                float scale=(float)(1024/(float)bitmap.getWidth());
                int image_w=(int)(bitmap.getWidth()*scale);
                int image_h=(int)(bitmap.getHeight()*scale);
                Bitmap resize=Bitmap.createScaledBitmap(bitmap, image_w, image_h, true);
                resize.compress(Bitmap.CompressFormat.JPEG, 100, stream);
                byte[] byteArray=stream.toByteArray();

                Intent intent = new Intent(context, Food.class);
                intent.putExtra("name", tv_kit_name.getText());
                intent.putExtra("price", tv_kit_price.getText());
                intent.putExtra("integer", 300);
                intent.putExtra("double", 3.141592);
                intent.putExtra("image", byteArray);
                context.startActivity(intent);
            }
        });

        return convertView;
    }

}
