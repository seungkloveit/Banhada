package com.banhada;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.banhada.mart.MartActivity;
import com.banhada.mypage.MyPage;
import com.banhada.product.User_Product;
import com.banhada.shipping.ShippingActivity;
import com.example.banhada.R;

public class HomeActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);

        Button btn_product_click=(Button)findViewById(R.id.btn_product_click);
        Button btn_pay=(Button)findViewById(R.id.btn_pay);
        Button btn_shipping=(Button)findViewById(R.id.btn_shipping);
        Button btn_mart=(Button)findViewById(R.id.btn_mart);
        Button btn_mypage=(Button)findViewById(R.id.btn_mypage);

        btn_product_click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(), User_Product.class);
                startActivity(intent);
            }
        });

        btn_shipping.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(), ShippingActivity.class);
                startActivity(intent);
            }
        });
        btn_mart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(), MartActivity.class);
                startActivity(intent);
            }
        });

        btn_mypage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(), MyPage.class);
                startActivity(intent);
            }
        });


    }

}
