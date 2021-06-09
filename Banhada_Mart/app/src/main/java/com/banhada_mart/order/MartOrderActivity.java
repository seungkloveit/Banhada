package com.banhada_mart.order;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import com.example.banhada_mart.R;

import java.util.ArrayList;


public class MartOrderActivity extends AppCompatActivity {
    private Spinner spinner_mart1;
    private Spinner spinner_mart2;
    ArrayList<String> order_arrayList1;
    ArrayList<String> order_arrayList2;
    ArrayAdapter<String> order_arrayAdapter1;
    ArrayAdapter<String> order_arrayAdapter2;

    ListView martOrderListView;
    ArrayList<MartOrderManageListItem> mart_order_Item;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mart_order_management);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayShowCustomEnabled(true);
        actionBar.setDisplayShowTitleEnabled(false);
        actionBar.setDisplayHomeAsUpEnabled(true);

        order_arrayList1 = new ArrayList<>();
        order_arrayList1.add("전체");
        order_arrayList1.add("접수대기");
        order_arrayList1.add("주문접수");
        order_arrayList1.add("배송중");
        order_arrayList1.add("배송완료");

        order_arrayAdapter1 = new ArrayAdapter<>(getApplicationContext(),
                android.R.layout.simple_spinner_dropdown_item,
                order_arrayList1);

        spinner_mart1 = (Spinner) findViewById(R.id.spinner1_mart);
        spinner_mart1.setAdapter(order_arrayAdapter1);

        order_arrayList2 = new ArrayList<>();
        order_arrayList2.add("전체");
        order_arrayList2.add("오늘");
        order_arrayList2.add("1주일 이내");
        order_arrayList2.add("1개월 이내");
        order_arrayList2.add("6개월 이내");

        order_arrayAdapter2 = new ArrayAdapter<>(getApplicationContext(),
                android.R.layout.simple_spinner_dropdown_item,
                order_arrayList2);

        spinner_mart2 = (Spinner) findViewById(R.id.spinner2_mart);
        spinner_mart2.setAdapter(order_arrayAdapter2);

        mart_order_Item = new ArrayList<MartOrderManageListItem>();

        mart_order_Item.add(new MartOrderManageListItem("주문일자: 2021/04/08 11:11:11", "회원이름: 홍길동", "상품이름: 김치찌개", "가격: 20000", "현재상태: 접수대기", "주문접수", "0"));
        mart_order_Item.add(new MartOrderManageListItem("주문일자: 2021/05/12 14:11:12", "회원이름: 홍길순", "상품이름: 닭볶음탕", "가격: 24000", "현재상태: 주문접수", "배송준비", "0"));
        mart_order_Item.add(new MartOrderManageListItem("주문일자: 2021/05/15 23:11:11", "회원이름: 홍길자", "상품이름: 육개장", "가격: 18000", "현재상태: 접수대기", "주문접수", "0"));

        martOrderListView = findViewById(R.id.martOrderListView);
        MartOrderManageListAdapter martOrderManageListAdapter = new MartOrderManageListAdapter(this, mart_order_Item);

        martOrderListView.setAdapter(martOrderManageListAdapter);
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
