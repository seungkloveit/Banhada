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
        spin_arrayList1.add("????????????");
        spin_arrayList1.add("??????");
        spin_arrayList1.add("??????");
        spin_arrayList1.add("??????");
        spin_arrayList1.add("??????");
        spin_arrayList1.add("??????");
        spin_arrayAdapter1 = new ArrayAdapter<>(getApplicationContext(),
                android.R.layout.simple_spinner_dropdown_item,
                spin_arrayList1);
        spinner1 = (Spinner) findViewById(R.id.spinner1);
        spinner1.setAdapter(spin_arrayAdapter1);

        spin_arrayList2 = new ArrayList<>();
        spin_arrayList2.add("400g(11000???)");
        spin_arrayList2.add("600g(16500???)");
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
//        spin_arrayList3.add("????????????");
//        spin_arrayList3.add("??????");
//        spin_arrayList3.add("??????");
//        spin_arrayList3.add("??????");
//        spin_arrayList3.add("??????");
//        spin_arrayList3.add("??????");
//        spin_arrayAdapter3 = new ArrayAdapter<>(getApplicationContext(),
//                android.R.layout.simple_spinner_dropdown_item,
//                spin_arrayList3);
//        spinner3 = (Spinner) findViewById(R.id.spinner3);
//        spinner3.setAdapter(spin_arrayAdapter3);



        // ?????? ???????????? ????????? ????????? ?????? ?????? ?????? spinner ??????
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
                dialog.setMessage("??? ????????? !@#@$$@%!$%!#%$%#@$~@#~%~%~@%!@#%~%~%@!#%~$#~%~%~%~%~@%~@%~@%~%~@%#%~@#$~%$~@%~");
                dialog.setPositiveButton("??????", null);
                dialog.show();
            }
        });
        btn_add_detail_food2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder dialog = new AlertDialog.Builder(Food.this);
                dialog.setTitle(tv_kit_name_activity_food.getText()+" ????????? ?????? ??????!");
                dialog.setMessage("???????????? !@#@$$@%!$%!#%$%#@$~@#~%~%~@%!@#%~%~%@!#%~$#~%~%~%~%~@%~@%~@%~%~@%#%~@#$~%$~@%~");
                dialog.setPositiveButton("??????", null);
                dialog.show();
            }
        });
        btn_delete_spinner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "????????? ?????????????????????.", Toast.LENGTH_SHORT).show();
            }
        });
        btn_more_find.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //????????????????????? ??????
                //????????????????????? ????????? ??????????????????????????? ???.
                Intent intent=new Intent(getApplicationContext(), User_Product.class);
                startActivity(intent);
            }
        });

        //????????? ??????????????? ????????? ??? ????????? ??????
        tv_price_total2=tv_kit_price_activity_food;
        btn_pay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1=new Intent(getApplicationContext(), Payment.class);
                intent1.putExtra("total_price", tv_price_total2.getText());//?????? ??? Payment.java??? ??????
                intent1.putExtra("kit_name", tv_kit_name_activity_food.getText());//???????????? Payment.java??? ??????
                startActivity(intent1);
                Toast.makeText(getApplicationContext(), "????????? ??????????????? ???????????????.", Toast.LENGTH_SHORT).show();
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