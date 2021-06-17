package com.banhada.product;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.app.AlertDialog;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.banhada.payment.Payment;
import com.banhada.payment.Payment_Phone;
import com.example.banhada.R;
import java.util.ArrayList;

public class Food extends AppCompatActivity {

    TextView tv_kit_name_activity_food, tv_kit_price_activity_food, tv_price_total2;
    ImageView imgv_kit;
    Button btn_add_detail_food, btn_add_detail_food2, btn_pay, btn_delete_spinner, btn_more_find;
    private Spinner spinner1, spinner2;
    ArrayList<String> spin_arrayList1, spin_arrayList2;
    ArrayAdapter<String> spin_arrayAdapter1, spin_arrayAdapter2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayShowCustomEnabled(true);
        actionBar.setDisplayShowTitleEnabled(false);
        actionBar.setDisplayHomeAsUpEnabled(true);

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
        btn_add_detail_food2=findViewById(R.id.btn_add_detail_food2);
        btn_delete_spinner=findViewById(R.id.btn_delete_spinner);
        btn_more_find=findViewById(R.id.btn_more_find);
        btn_pay=findViewById(R.id.btn_pay);
        tv_price_total2=findViewById(R.id.tv_price_total2);

        imgv_kit=(ImageView)findViewById(R.id.imgv_kit);
        tv_kit_name_activity_food=findViewById(R.id.tv_kit_name_activity_food);
        tv_kit_price_activity_food=findViewById(R.id.tv_kit_price_activity_food);

        Bundle extras=getIntent().getExtras();
        String name=extras.getString("name");
        String price=extras.getString("price");
        int i=extras.getInt("int");
        double d=extras.getDouble("double");
        byte[] byteArray=getIntent().getByteArrayExtra("image");
        Bitmap bitmap=BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length);

        tv_kit_name_activity_food.setText(name);
        tv_kit_price_activity_food.setText(price);
        tv_price_total2.setText(price);
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
                dialog.setTitle(tv_kit_name_activity_food.getText());
                dialog.setMessage("이 상품은 !@#@$$@%!$%!#%$%#@$~@#~%~%~@%!@#%~%~%@!#%~$#~%~%~%~%~@%~@%~@%~%~@%#%~@#$~%$~@%~");
                dialog.setPositiveButton("확인", null);
                dialog.show();
            }
        });
        btn_add_detail_food2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder dialog = new AlertDialog.Builder(Food.this);
                dialog.setTitle(tv_kit_name_activity_food.getText()+" 만드는 쉬운 방법!");
                dialog.setMessage("레시피는 !@#@$$@%!$%!#%$%#@$~@#~%~%~@%!@#%~%~%@!#%~$#~%~%~%~%~@%~@%~@%~%~@%#%~@#$~%$~@%~");
                dialog.setPositiveButton("확인", null);
                dialog.show();
            }
        });
        btn_delete_spinner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "재료를 삭제하였습니다.", Toast.LENGTH_SHORT).show();
            }
        });
        btn_more_find.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //일반재료페이지 이동
                //일반상품페이지 없어서 밀키트상품페이지로 함.
                Intent intent=new Intent(getApplicationContext(), User_Product.class);
                startActivity(intent);
            }
        });

        //추후엔 재료골라서 더하고 뺀 가격을 넣음
        tv_price_total2=tv_kit_price_activity_food;
        btn_pay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1=new Intent(getApplicationContext(), Payment.class);
                intent1.putExtra("total_price", tv_price_total2.getText());//받은 값 Payment.java로 보냄
                intent1.putExtra("kit_name", tv_kit_name_activity_food.getText());//상품이름 Payment.java로 보냄
                startActivity(intent1);
                Toast.makeText(getApplicationContext(), "상품을 장바구니에 담았습니다.", Toast.LENGTH_SHORT).show();
            }
        });


    }

    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home: {
                finish();
            }
        }
        return super.onOptionsItemSelected(item);
    }
}