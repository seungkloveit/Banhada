package com.banhada.login;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.banhada.MainActivity;
import com.example.banhada.R;

public class NormalUser_SignUp extends AppCompatActivity {
    View view;
    TextView textView7,user_name,user_email,user_phone,userAddress;
    EditText name_tv,email_tv,phone_tv;
    Button button_address_search,button13;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_normaluser_signup);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayShowCustomEnabled(true);
        actionBar.setDisplayShowTitleEnabled(false);
        actionBar.setDisplayHomeAsUpEnabled(true);

        view=findViewById(R.id.view);
        user_name=findViewById(R.id.user_name);
        user_phone=findViewById(R.id.user_phone);
        userAddress=findViewById(R.id.userAddress);
        name_tv=findViewById(R.id.name_tv);
        email_tv=findViewById(R.id.email_tv);
        phone_tv=findViewById(R.id.phone_tv);
        button_address_search=findViewById(R.id.button_address_search);
        button13=findViewById(R.id.button13);

        button_address_search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // 주소 설정 화면으로 이동 (인텐트)
            }
        });

        button13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent(NormalUser_SignUp.this, SignUp_Complete.class);
                startActivity(intent2);
            }
        });

    }

    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home: {
                finish();
            }
        }
        return true;
    }
}

