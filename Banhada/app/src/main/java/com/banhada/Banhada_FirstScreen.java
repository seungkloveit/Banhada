package com.banhada;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.example.banhada.R;

public class Banhada_FirstScreen extends AppCompatActivity {


    ImageView imageView;
    Button button10,button11;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_banhada_first_screen);

        imageView=findViewById(R.id.imageView);
        button10=findViewById(R.id.button10);
        button11=findViewById(R.id.button11);


        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // 일반 사용자 로그인 시 로그인 화면으로 전환되는 인텐트 작성
                Intent intent = new Intent(Banhada_FirstScreen.this, NormalUser_SignUp.class);
                startActivity(intent);
            }
        });

        button11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // 네이버 로그인 시 네이버 로그인 화면으로 전환되는 인텐트 작성ㄴㄴ
                // 네이버 로그인 API를 여기다 연결해야 하나?
                Intent intent = new Intent(Banhada_FirstScreen.this, NaverLogin.class);
                startActivity(intent);
            }
        });
    }
}