package com.banhada;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.banhada.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn_logo=(Button)findViewById(R.id.btn_logo);
        Button btn_product_click=(Button)findViewById(R.id.btn_product_click);
        Button btn_pay=(Button)findViewById(R.id.btn_pay);
        Button btn_shipping=(Button)findViewById(R.id.btn_shipping);
        Button btn_mart=(Button)findViewById(R.id.btn_mart);

        btn_logo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(), Banhada_FirstScreen.class);
                startActivity(intent);
            }
        });
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


    }
}
