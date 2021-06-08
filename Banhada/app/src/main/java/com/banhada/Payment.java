package com.banhada;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.banhada.R;

public class Payment extends AppCompatActivity {

    TextView textView2,textView8,textView10;
    Button payment_btn,moreshopping_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment);

        //DB업데이트 시 칼럼 추가하는 코드
        // onUpgrade 함수에 db.execSQL("ALTER TABLE"+테이블명+"ADD COLUMN"+컬럼명+컬럼형식);

        //내 배송지 정보=>DB에서 끌고오기?

        textView2=findViewById(R.id.textView2);
        textView8=findViewById(R.id.textView8);
        textView10=findViewById(R.id.textView10);
        payment_btn=findViewById(R.id.payment_btn);
        moreshopping_btn=findViewById(R.id.moreshopping_btn);

        payment_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Payment.this, PaymentProcess2.class);
                startActivity(intent);
            }
        });

        moreshopping_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Intent로 밀키트 쇼핑 화면 돌아가기
                Intent intent = new Intent(Payment.this, MainActivity.class);
                startActivity(intent);
            }
        });




    }


}