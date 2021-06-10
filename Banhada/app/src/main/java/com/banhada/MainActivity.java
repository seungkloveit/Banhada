package com.banhada;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.banhada.login.NaverLogin;
import com.banhada.login.NormalUser_Login;
import com.banhada.login.NormalUser_SignUp;
import com.example.banhada.R;

public class MainActivity extends AppCompatActivity {


    ImageView imageView;
    Button button10,button11;
    TextView btn_sign_up;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView=findViewById(R.id.imageView);
        btn_sign_up=findViewById(R.id.btn_sign_up);
        button10=findViewById(R.id.button10);
        button11=findViewById(R.id.button11);


        btn_sign_up.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // 일반 사용자 로그인 시 로그인 화면으로 전환되는 인텐트 작성
                Intent intent = new Intent(MainActivity.this, NormalUser_SignUp.class);
                startActivity(intent);
            }
        });
        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // 네이버 로그인 시 네이버 로그인 화면으로 전환되는 인텐트 작성ㄴㄴ
                // 네이버 로그인 API를 여기다 연결해야 하나?
                Intent intent = new Intent(MainActivity.this, NormalUser_Login.class);
                startActivity(intent);
            }
        });

        button11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // 네이버 로그인 시 네이버 로그인 화면으로 전환되는 인텐트 작성ㄴㄴ
                // 네이버 로그인 API를 여기다 연결해야 하나?
                Intent intent = new Intent(MainActivity.this, NaverLogin.class);
                startActivity(intent);
            }
        });
    }
}