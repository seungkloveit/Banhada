package com.banhada_manager;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.banhada_manager.order.AdminOrderActivity;
import com.banhada_manager.mart.RegisteredMart_Admin;
import com.example.banhada_manager.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn_admin_order=(Button)findViewById(R.id.btn_admin_order);
        Button btn_admin_mart_manage=(Button)findViewById(R.id.btn_admin_mart_manage);

        btn_admin_order.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(), AdminOrderActivity.class);
                startActivity(intent);
            }
        });
        btn_admin_mart_manage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(), RegisteredMart_Admin.class);
                startActivity(intent);
            }
        });
    }
}
