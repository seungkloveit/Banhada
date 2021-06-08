package com.banhada;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.ButtonBarLayout;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.banhada.R;

public class Payment_CreditCard extends AppCompatActivity {

    View view;
    ImageView imageView10;
    EditText edt1,edt2,edt3;
    TextView textView3,card_number,card_companyname,payment_way;
    Button creditway_btn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment_creditcard);

        view=findViewById(R.id.view);
        imageView10=findViewById(R.id.imageView10);
        edt1=findViewById(R.id.edt1);
        edt2=findViewById(R.id.edt2);
        edt3=findViewById(R.id.edt3);
        textView3=findViewById(R.id.textView3);
        card_number=findViewById(R.id.card_number);
        card_companyname=findViewById(R.id.card_companyname);
        payment_way=findViewById(R.id.payment_way);
        creditway_btn=findViewById(R.id.creditway_btn);

        creditway_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"결제가 완료되었습니다",Toast.LENGTH_LONG);
            }
        });

    }
}