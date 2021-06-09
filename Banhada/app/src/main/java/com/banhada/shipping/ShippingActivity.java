package com.banhada.shipping;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.example.banhada.R;

import java.util.ArrayList;

public class ShippingActivity extends AppCompatActivity {
    Button btn_add_shipping;
    Button btn_complete_shipping1;
    ListView shippingListView;
    static ArrayList<ShippingListItem> shipping_address_item;
    static ShippingListAdapter shippingListAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.shipping);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayShowCustomEnabled(true);
        actionBar.setDisplayShowTitleEnabled(false);
        actionBar.setDisplayHomeAsUpEnabled(true);

        btn_add_shipping = findViewById(R.id.btn_add_shipping);
        btn_add_shipping.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Shipping2Activity.class);
                startActivity(intent);
            }
        });
        btn_complete_shipping1 = findViewById(R.id.btn_complete_shipping1);
        btn_complete_shipping1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "배송지 연결을 완료하였습니다.", Toast.LENGTH_SHORT).show();
            }
        });
        shipping_address_item = new ArrayList<ShippingListItem>();

        shipping_address_item.add(new ShippingListItem("12343 서울시 서초구 서초동 12-3", "100호", "김영희", "010-1111-1111"));
        shipping_address_item.add(new ShippingListItem("04123 서울시 광진구 능동로 3-3", "200호", "박철수", "010-2222-2222"));
        shipping_address_item.add(new ShippingListItem("02220 서울시 중랑구 면목동 332-3", "300호", "홍길동", "010-3333-3333"));

        shippingListView = findViewById(R.id.shippingListView);
        shippingListAdapter = new ShippingListAdapter(this, shipping_address_item);
        shippingListView.setAdapter(shippingListAdapter);

        shippingListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                shippingListAdapter.setSelectedPosition(position);
                shippingListAdapter.notifyDataSetChanged();
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
