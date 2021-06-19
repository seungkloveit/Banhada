package com.banhada_mart;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.banhada_mart.Product.RegistrationActivity;
import com.banhada_mart.myinfo.MartAdmin_MyInfo;
import com.banhada_mart.myinfo.p0_signup;
import com.banhada_mart.order.MartOrderActivity;
import com.example.banhada_mart.R;

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

        main_btn1.setOnClickListener(new View.OnClickListener() {                                        // 주문관리
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MartOrderActivity.class);
                startActivity(intent);
            }
        });

        main_btn2.setOnClickListener(new View.OnClickListener() {                                       // 상품추가(아직 없음)
            @Override                                                                                   // 임시로 회원가입창 해놓음
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), RegistrationActivity.class);
                startActivity(intent);
            }
        });

        main_btn3.setOnClickListener(new View.OnClickListener() {                                       // 내정보관리
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MartAdmin_MyInfo.class);
                startActivity(intent);
            }
        });

        ImageButton logout_btn = (ImageButton) findViewById(R.id.logout_btn);                       // 로그아웃
        logout_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
                Toast.makeText(getApplicationContext(),"로그아웃되었습니다.",Toast.LENGTH_SHORT).show();
                //Intent intent = new Intent(getApplicationContext(), p0_logout.class);
                //startActivity(intent);
            }
        });

    }
}

