package com.banhada.shipping;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.example.banhada.R;

public class Shipping2Activity extends AppCompatActivity {
    Button btn_address_search;
    EditText et_user_address;
    EditText et_user_detail;
    EditText et_user_name;
    EditText et_user_tel;
    Button btn_complete_shipping2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.shipping2);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayShowCustomEnabled(true);
        actionBar.setDisplayShowTitleEnabled(false);
        actionBar.setDisplayHomeAsUpEnabled(true);

        btn_address_search = findViewById(R.id.btn_address_search);
        btn_address_search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        et_user_address = findViewById(R.id.et_user_address);
        et_user_detail = findViewById(R.id.et_user_detail);
        et_user_name = findViewById(R.id.et_user_name);
        et_user_tel = findViewById(R.id.et_user_tel);
        btn_complete_shipping2 = findViewById(R.id.btn_complete_shipping2);
        btn_complete_shipping2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String et1 = et_user_address.getText().toString();
                String et2 = et_user_detail.getText().toString();
                String et3 = et_user_name.getText().toString();
                String et4 = et_user_tel.getText().toString();

                if (et1.getBytes().length > 0 && et2.getBytes().length > 0 && et3.getBytes().length > 0 && et4.getBytes().length > 0) {
                    Toast.makeText(getApplicationContext(), "새 배송지를 추가하였습니다.", Toast.LENGTH_SHORT).show();
                    ShippingActivity.shipping_address_item.add(new ShippingListItem(et1, et2, et3, et4));
                    ShippingActivity.shippingListAdapter.notifyDataSetChanged();
                    finish();
                } else
                    Toast.makeText(getApplicationContext(), "올바르게 입력하였는지 확인해주세요.", Toast.LENGTH_SHORT).show();
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
