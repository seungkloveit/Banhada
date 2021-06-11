package com.banhada.payment;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.example.banhada.R;

import java.util.ArrayList;

public class Payment_BankBook extends AppCompatActivity {


    View view4;
    TextView mutongjang1,mutongjang3,mutongjang5,mutongjang7, tv_price_final_bb2;
    ImageView mutongjang2;
    EditText mutongjang4,mutongjang6,mutongjang8;
    Button mutongjang_btn;

//    private Spinner spinner_bank;
//    ArrayList<String> bank_arrayList;
//    ArrayAdapter<String> bank_arrayAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment_bankbook);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayShowCustomEnabled(true);
        actionBar.setDisplayShowTitleEnabled(false);
        actionBar.setDisplayHomeAsUpEnabled(true);

//        view4=findViewById(R.id.view4);
//        mutongjang2=findViewById(R.id.mutongjang2);
//        mutongjang1=findViewById(R.id. mutongjang1);
//        mutongjang3=findViewById(R.id.mutongjang3);
//        mutongjang5=findViewById(R.id.mutongjang5);
//        mutongjang4=findViewById(R.id.mutongjang4);
//        mutongjang6=findViewById(R.id.mutongjang6);
//        mutongjang7=findViewById(R.id.mutongjang7);
//        mutongjang8=findViewById(R.id.mutongjang8);
        mutongjang_btn=findViewById(R.id.mutongjang_btn);
        tv_price_final_bb2=findViewById(R.id.tv_price_final_bb2);

        //결제금액 받아오기
        Bundle extras=getIntent().getExtras();
        String total_price=extras.getString("total_price");
        tv_price_final_bb2.setText(total_price);
//
//        bank_arrayList = new ArrayList<>();
//        bank_arrayList.add("NH농협");
//        bank_arrayList.add("KB국민");
//        bank_arrayList.add("신한");
//        bank_arrayList.add("우리");
//        bank_arrayList.add("하나");
//        bank_arrayList.add("IBK기업");
//        bank_arrayList.add("SC제일");
//        bank_arrayList.add("씨티");
//        bank_arrayList.add("새마을");
//        bank_arrayList.add("신협");
//        bank_arrayList.add("수협");
//        bank_arrayList.add("카카오뱅크");
//        bank_arrayList.add("케이뱅크");
//        bank_arrayAdapter = new ArrayAdapter<>(getApplicationContext(),
//                android.R.layout.simple_spinner_dropdown_item,
//                bank_arrayList);
//        spinner_bank = (Spinner) findViewById(R.id.spinner_bank);
//        spinner_bank.setAdapter(bank_arrayAdapter);

        mutongjang_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"입금이 확인되면 안내드리겠습니다.",Toast.LENGTH_LONG).show();
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