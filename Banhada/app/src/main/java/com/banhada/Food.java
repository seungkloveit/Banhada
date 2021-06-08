package com.banhada;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

import com.example.banhada.R;

public class Food extends AppCompatActivity {

    View viewFood;
    TextView textView3, textView15, materialAdd, textView16;
    ImageView imageView10, imageView12;
    Button buttonPlus, buttonMinus, btn_pay;
    Spinner spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food);

        viewFood = findViewById(R.id.viewFood);
        textView3 = findViewById(R.id.textView3);
        textView15 = findViewById(R.id.textView15);
        materialAdd = findViewById(R.id.materialAdd);
        imageView10 = findViewById(R.id.imageView10);
        imageView12 = findViewById(R.id.imageView12);
        buttonMinus = findViewById(R.id.buttonMinus);
        buttonPlus = findViewById(R.id.buttonPlus);
        spinner = findViewById(R.id.spinner);
        btn_pay=findViewById(R.id.btn_pay);

        // 음식 그램수에 따라서 종목이 여러 개인 것은 spinner 적용
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long l) {
//                textView16.setText(adapterView.getItemAtPosition(position).toString());
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        buttonPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        buttonMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        btn_pay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(), Payment.class);
                startActivity(intent);
            }
        });


    }
}