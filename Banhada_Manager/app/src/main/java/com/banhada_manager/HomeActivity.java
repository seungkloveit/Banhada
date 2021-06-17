package com.banhada_manager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.banhada_manager.Member.Member_management;
import com.banhada_manager.mart.RegisteredMart_Admin;
import com.banhada_manager.notice.Notice;
import com.banhada_manager.order.AdminOrderActivity;
import com.example.banhada_manager.R;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);
        //ActionBar actionBar =getSupportActionBar();
        //actionBar.hide();

        Button main_btn1 = (Button) findViewById(R.id.main_btn1);
        Button main_btn2 = (Button) findViewById(R.id.main_btn2);
        Button main_btn3 = (Button) findViewById(R.id.main_btn3);
        Button main_btn4 = (Button) findViewById(R.id.main_btn4);

        main_btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Member_management.class);       // 회원관리
                startActivity(intent);
            }
        });

        main_btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), RegisteredMart_Admin.class);     // 마트관리
                startActivity(intent);
            }
        });

        main_btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), AdminOrderActivity.class);       //주문관리
                startActivity(intent);
            }
        });
        main_btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Notice.class);       //공지사항
                startActivity(intent);
            }
        });
        // 원래 계획에 1대1 문의가 없었는데 추가할지 추후에 결정

        ImageButton logout_btn = (ImageButton) findViewById(R.id.logout_btn);
        logout_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "로그아웃 되었습니다.",Toast.LENGTH_SHORT).show();
                //Intent intent = new Intent(getApplicationContext(), p0_logout.class);
                //startActivity(intent);
            }
        });
    }
}

