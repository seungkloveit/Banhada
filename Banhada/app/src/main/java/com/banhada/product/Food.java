package com.banhada.product;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.app.AlertDialog;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

import com.banhada.payment.Payment;
import com.example.banhada.R;
import java.util.ArrayList;

public class Food extends AppCompatActivity {

    TextView tv_kit_name_activity_food;
    ImageView imgv_kit;
    Button btn_add_detail_food, btn_pay;
    private Spinner spinner1, spinner2, spinner3;
    ArrayList<String> spin_arrayList1, spin_arrayList2, spin_arrayList3;
    ArrayAdapter<String> spin_arrayAdapter1, spin_arrayAdapter2, spin_arrayAdapter3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food);

//        viewFood = findViewById(R.id.viewFood);
//        textView3 = findViewById(R.id.textView3);
//        textView15 = findViewById(R.id.textView15);
//        materialAdd = findViewById(R.id.materialAdd);
//        imageView10 = findViewById(R.id.imageView10);
//        imageView12 = findViewById(R.id.imageView12);
//        buttonMinus = findViewById(R.id.buttonMinus);
//        buttonPlus = findViewById(R.id.buttonPlus);
        //spinner = findViewById(R.id.spinner);
        btn_add_detail_food=findViewById(R.id.btn_add_detail_food);
        btn_pay=findViewById(R.id.btn_pay);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayShowCustomEnabled(true);
        actionBar.setDisplayShowTitleEnabled(false);
        actionBar.setDisplayHomeAsUpEnabled(true);

        imgv_kit=(ImageView)findViewById(R.id.imgv_kit);
        tv_kit_name_activity_food=findViewById(R.id.tv_kit_name_activity_food);

        Bundle extras=getIntent().getExtras();
        String s=extras.getString("String");
        int i=extras.getInt("int");
        double d=extras.getDouble("double");
        byte[] byteArray=getIntent().getByteArrayExtra("image");
        Bitmap bitmap=BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length);

        tv_kit_name_activity_food.setText(s);
        imgv_kit.setImageBitmap(bitmap);

        spin_arrayList1 = new ArrayList<>();
        spin_arrayList1.add("돼지고기");
        spin_arrayList1.add("김치");
        spin_arrayList1.add("대파");
        spin_arrayList1.add("당근");
        spin_arrayList1.add("양파");
        spin_arrayList1.add("두부");
        spin_arrayAdapter1 = new ArrayAdapter<>(getApplicationContext(),
                android.R.layout.simple_spinner_dropdown_item,
                spin_arrayList1);
        spinner1 = (Spinner) findViewById(R.id.spinner1);
        spinner1.setAdapter(spin_arrayAdapter1);

        spin_arrayList2 = new ArrayList<>();
        spin_arrayList2.add("400g(11000원)");
        spin_arrayList2.add("600g(16500원)");
        spin_arrayList2.add("");
        spin_arrayList2.add("");
        spin_arrayList2.add("");
        spin_arrayList2.add("");
        spin_arrayAdapter2 = new ArrayAdapter<>(getApplicationContext(),
                android.R.layout.simple_spinner_dropdown_item,
                spin_arrayList2);
        spinner2 = (Spinner) findViewById(R.id.spinner2);
        spinner2.setAdapter(spin_arrayAdapter2);
//
//        spin_arrayList3 = new ArrayList<>();
//        spin_arrayList3.add("돼지고기");
//        spin_arrayList3.add("김치");
//        spin_arrayList3.add("대파");
//        spin_arrayList3.add("당근");
//        spin_arrayList3.add("양파");
//        spin_arrayList3.add("두부");
//        spin_arrayAdapter3 = new ArrayAdapter<>(getApplicationContext(),
//                android.R.layout.simple_spinner_dropdown_item,
//                spin_arrayList3);
//        spinner3 = (Spinner) findViewById(R.id.spinner3);
//        spinner3.setAdapter(spin_arrayAdapter3);



        // 음식 그램수에 따라서 종목이 여러 개인 것은 spinner 적용
//        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
//            @Override
//            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long l) {
////                textView16.setText(adapterView.getItemAtPosition(position).toString());
//            }
//
//            @Override
//            public void onNothingSelected(AdapterView<?> adapterView) {
//
//            }
//        });

//        buttonPlus.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//            }
//        });
//
//        buttonMinus.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//            }
//        });
//
        btn_add_detail_food.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder dialog = new AlertDialog.Builder(Food.this);
                dialog.setTitle("상품 이름");
                dialog.setMessage("이 상품은 !@#@$$@%!$%!#%$%#@$~@#~%~%~@%!@#%~%~%@!#%~$#~%~%~%~%~@%~@%~@%~%~@%#%~@#$~%$~@%~");
                dialog.setPositiveButton("확인", null);
                dialog.setNegativeButton("취소", null);
                dialog.show();
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

    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home: {
                finish();
            }
        }
        return true;
    }
}