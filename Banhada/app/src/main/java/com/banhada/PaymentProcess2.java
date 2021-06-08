package com.banhada;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.banhada.R;

public class PaymentProcess2 extends AppCompatActivity {

    TextView textView9,textView2;
    View view;
    ImageView imageView,imageView9,imageView11,imageView4;
    Button payment_creditbtn,payment_bankbookbtn,payment_phonebtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment_process2);

        textView9=findViewById(R.id.textView9);
        textView2=findViewById(R.id.textView2);
        imageView11=findViewById(R.id.imageView11);
        imageView4=findViewById(R.id.imageView4);
        imageView=findViewById(R.id.imageView);
        imageView9=findViewById(R.id.imageView9);
        view=findViewById(R.id.view);
        payment_creditbtn=findViewById(R.id.payment_creditbtn);
        payment_bankbookbtn=findViewById(R.id.payment_bankbookbtn);
        payment_phonebtn=findViewById(R.id.payment_phonebtn);

        payment_creditbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(PaymentProcess2.this, Payment_CreditCard.class);
                startActivity(intent);
            }
        });

        payment_bankbookbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent(PaymentProcess2.this, Payment_BankBook.class);
                startActivity(intent2);
            }
        });

        payment_phonebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent3 = new Intent(PaymentProcess2.this, Payment_Phone.class);
                startActivity(intent3);
            }
        });


    }
}