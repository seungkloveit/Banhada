package com.banhada.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.banhada.HomeActivity;
import com.banhada.MainActivity;
import com.example.banhada.R;

public class SignUp_Complete extends AppCompatActivity {


    ImageView imageView3;
    TextView textView;
    Button button9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup_complete);

        imageView3=findViewById(R.id.imageView3);
        textView=findViewById(R.id.textView);
        button9=findViewById(R.id.button9);

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(SignUp_Complete.this, HomeActivity.class);
                startActivity(intent);
                // 메인화면과 인텐트 연결하기
            }
        });

    }
}