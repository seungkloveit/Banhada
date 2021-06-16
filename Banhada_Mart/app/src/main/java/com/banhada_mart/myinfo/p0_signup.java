package com.banhada_mart.myinfo;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.banhada_mart.MainActivity;
import com.example.banhada_mart.R;

public class p0_signup extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mart_login);
        //ActionBar actionBar =getSupportActionBar();
        //actionBar.hide();

        Button mLog_confirm_btn = (Button) findViewById(R.id.mLog_confirm_btn);
        mLog_confirm_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);        // 확인버튼
                startActivity(intent);
            }
        });

        Button mLog_cal_btn = (Button) findViewById(R.id.mLog_cal_btn);
        Button mLog_IDcheck_btn = (Button) findViewById(R.id.mLog_IDcheck_btn);


    }

}
