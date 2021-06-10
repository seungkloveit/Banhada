package com.banhada.payment;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.banhada.R;

public class Payment_Phone extends AppCompatActivity {

    View phoneView;
    TextView phone1,phone2,phone4, tv_price_final;
    ImageView imageView10;
    EditText phone3,phone5;
    Button phone6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment_phone);

//        phoneView=findViewById(R.id.phoneView);
//        phone1=findViewById(R.id.phone1);
//        phone2=findViewById(R.id.phone2);
//        phone4=findViewById(R.id.phone4);
//        imageView10=findViewById(R.id.imageView10);
//        phone3=findViewById(R.id.phone3);
//        phone5=findViewById(R.id.phone5);
        phone6=findViewById(R.id.phone6);
        tv_price_final=findViewById(R.id.tv_price_final);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayShowCustomEnabled(true);
        actionBar.setDisplayShowTitleEnabled(false);
        actionBar.setDisplayHomeAsUpEnabled(true);

        //결제금액 받아오기
        Bundle extras=getIntent().getExtras();
        String total_price=extras.getString("total_price");
        tv_price_final.setText(total_price);

        phone6.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ShowToast")
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"결제가 완료되었습니다",Toast.LENGTH_LONG).show();
            }

            //뒤로가기 구현 
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