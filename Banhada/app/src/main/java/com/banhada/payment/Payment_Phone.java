package com.banhada.payment;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.banhada.R;

public class Payment_Phone extends AppCompatActivity {

    View phoneView;
    TextView phone1,phone2,phone4;
    ImageView imageView10;
    EditText phone3,phone5;
    Button phone6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment_phone);

        phoneView=findViewById(R.id.phoneView);
        phone1=findViewById(R.id.phone1);
        phone2=findViewById(R.id.phone2);
        phone4=findViewById(R.id.phone4);
        imageView10=findViewById(R.id.imageView10);
        phone3=findViewById(R.id.phone3);
        phone5=findViewById(R.id.phone5);
        phone6=findViewById(R.id.phone6);

        phone6.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ShowToast")
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"결제가 완료되었습니다",Toast.LENGTH_LONG);
            }

            //뒤로가기 구현 
        });
    }
}