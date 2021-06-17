package com.banhada;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Handler;
import android.os.Bundle;

import com.banhada.login.LoginLayout;
import com.example.banhada.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        startLoading();
    }// onCreate()..

    private void startLoading() {
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {

                Intent intent = new Intent(getApplicationContext(), LoginLayout.class);
                startActivity(intent);
                finish();   //현재 액티비티 종료
            }
        }, 1800); // 화면에 Logo 1.8초간 보이기
    }
}// MainActivity Class..