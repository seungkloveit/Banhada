package com.banhada;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.banhada.R;

public class Payment_BankBook extends AppCompatActivity {


    View view4;
    TextView mutongjang1,mutongjang3,mutongjang5,mutongjang7;
    ImageView mutongjang2;
    EditText mutongjang4,mutongjang6,mutongjang8;
    Button mutongjang_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment_bankbook);

        view4=findViewById(R.id.view4);
        mutongjang2=findViewById(R.id.mutongjang2);
        mutongjang1=findViewById(R.id. mutongjang1);
        mutongjang3=findViewById(R.id.mutongjang3);
        mutongjang5=findViewById(R.id.mutongjang5);
        mutongjang4=findViewById(R.id.mutongjang4);
        mutongjang6=findViewById(R.id.mutongjang6);
        mutongjang7=findViewById(R.id.mutongjang7);
        mutongjang8=findViewById(R.id.mutongjang8);
        mutongjang_btn=findViewById(R.id.mutongjang_btn);

        mutongjang_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"결제가 완료되었습니다.\n입금이 확인되면 안내드리겠습니다",Toast.LENGTH_LONG);
            }
        });


    }
}