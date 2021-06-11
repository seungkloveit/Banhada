package com.banhada.payment;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.banhada.HomeActivity;
import com.banhada.MainActivity;
import com.banhada.shipping.ShippingActivity;
import com.example.banhada.R;

public class Payment extends AppCompatActivity {

    TextView textView2, textView8, textView10, basket_name2, basket_price2;
    Button payment_btn, moreshopping_btn, change_shipping;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayShowCustomEnabled(true);
        actionBar.setDisplayShowTitleEnabled(false);
        actionBar.setDisplayHomeAsUpEnabled(true);

        //DB업데이트 시 칼럼 추가하는 코드
        // onUpgrade 함수에 db.execSQL("ALTER TABLE"+테이블명+"ADD COLUMN"+컬럼명+컬럼형식);

        //내 배송지 정보=>DB에서 끌고오기?

//        textView2 = findViewById(R.id.textView2);
//        textView8 = findViewById(R.id.textView8);
//        textView10 = findViewById(R.id.textView10);
        payment_btn = findViewById(R.id.payment_btn);
        moreshopping_btn = findViewById(R.id.moreshopping_btn);
        change_shipping = findViewById(R.id.change_shipping);
        basket_name2 = findViewById(R.id.basket_name2);
        basket_price2 = findViewById(R.id.basket_price2);

        //결제금액 받아오기
        Bundle extras = getIntent().getExtras();
        final String total_price = extras.getString("total_price");
        final String kit_name = extras.getString("kit_name");
        basket_name2.setText(kit_name);
        basket_price2.setText(total_price);

        payment_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Payment.this, PaymentProcess2.class);
                intent.putExtra("total_price", total_price); //받은 값 PaymentProfcess2.java로 보냄
                startActivity(intent);
            }
        });

        moreshopping_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
        change_shipping.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Payment.this, ShippingActivity.class);
                startActivity(intent);
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