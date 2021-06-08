package com.banhada;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.banhada.R;

public class NormalUser_SignUp extends AppCompatActivity {
    View view;
    TextView textView7,user_name,user_email,user_phone,userAddress;
    EditText name_tv,email_tv,phone_tv;
    Button setup_address,button12,button13;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_normaluser_signup);

        view=findViewById(R.id.view);
        textView7=findViewById(R.id.textView7);
        user_name=findViewById(R.id.user_name);
        user_phone=findViewById(R.id.user_phone);
        userAddress=findViewById(R.id.userAddress);
        name_tv=findViewById(R.id.name_tv);
        email_tv=findViewById(R.id.email_tv);
        phone_tv=findViewById(R.id.phone_tv);
        setup_address=findViewById(R.id.setup_address);
        button12=findViewById(R.id.button12);
        button13=findViewById(R.id.button13);

        setup_address.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // 주소 설정 화면으로 이동 (인텐트)
            }
        });

        button12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(NormalUser_SignUp.this, Banhada_FirstScreen.class);
                startActivity(intent);
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
}

