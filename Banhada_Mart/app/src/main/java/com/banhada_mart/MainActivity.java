package com.banhada_mart;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Handler;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

import com.banhada_mart.Login.LoginLayout;
import com.banhada_mart.myinfo.MartAdmin_MyInfo;
import com.banhada_mart.myinfo.p0_signup;
import com.banhada_mart.order.MartOrderActivity;
import com.example.banhada_mart.R;

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

