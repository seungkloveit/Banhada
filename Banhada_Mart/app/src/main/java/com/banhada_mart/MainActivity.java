package com.banhada_mart;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.banhada_mart.myinfo.MartAdmin_MyInfo;
import com.banhada_mart.order.MartOrderActivity;
import com.example.banhada_mart.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn_mart_order=(Button)findViewById(R.id.btn_mart_order);
        Button btn_mart_myinfo=(Button)findViewById(R.id.btn_mart_myinfo);

        btn_mart_order.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(), MartOrderActivity.class);
                startActivity(intent);
            }
        });
        btn_mart_myinfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(), MartAdmin_MyInfo.class);
                startActivity(intent);
            }
        });
    }
}
