package com.banhada_manager.order;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.example.banhada_manager.R;

import java.util.ArrayList;

public class AdminOrderActivity extends AppCompatActivity {
    private Spinner spinner1_admin;
    ArrayList<String> order_arrayList_ad1;
    ArrayAdapter<String> order_arrayAdapter_ad1;
    private Spinner spinner2_admin;
    ArrayList<String> order_arrayList_ad2;
    ArrayAdapter<String> order_arrayAdapter_ad2;

    ListView adminOrderListView;
    ArrayList<AdminOrderManageListItem> admin_order_Item;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.admin_order_management);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayShowCustomEnabled(true);
        actionBar.setDisplayShowTitleEnabled(false);
        actionBar.setDisplayHomeAsUpEnabled(true);

        order_arrayList_ad1 = new ArrayList<>();
        order_arrayList_ad1.add("전체");
        order_arrayList_ad1.add("접수대기");
        order_arrayList_ad1.add("주문접수");
        order_arrayList_ad1.add("배송중");
        order_arrayList_ad1.add("배송완료");

        order_arrayAdapter_ad1 = new ArrayAdapter<>(getApplicationContext(),
                android.R.layout.simple_spinner_dropdown_item,
                order_arrayList_ad1);

        spinner1_admin = (Spinner)findViewById(R.id.spinner1_admin);
        spinner1_admin.setAdapter(order_arrayAdapter_ad1);

        order_arrayList_ad2 = new ArrayList<>();
        order_arrayList_ad2.add("전체");
        order_arrayList_ad2.add("오늘");
        order_arrayList_ad2.add("1주일 이내");
        order_arrayList_ad2.add("1개월 이내");
        order_arrayList_ad2.add("6개월 이내");

        order_arrayAdapter_ad2 = new ArrayAdapter<>(getApplicationContext(),
                android.R.layout.simple_spinner_dropdown_item,
                order_arrayList_ad2);

        spinner2_admin = (Spinner)findViewById(R.id.spinner2_admin);
        spinner2_admin.setAdapter(order_arrayAdapter_ad2);

        admin_order_Item = new ArrayList<AdminOrderManageListItem>();

        admin_order_Item.add(new AdminOrderManageListItem("주문일자: 2021/04/08 11:11:11", "회원이름: 홍길동", "상품이름: 김치찌개", "가격: 20000", "현재상태: 접수대기"));
        admin_order_Item.add(new AdminOrderManageListItem("주문일자: 2021/05/12 14:11:12", "회원이름: 홍길순", "상품이름: 닭볶음탕", "가격: 24000", "현재상태: 주문접수"));
        admin_order_Item.add(new AdminOrderManageListItem("주문일자: 2021/05/15 23:11:11", "회원이름: 홍길자", "상품이름: 육개장", "가격: 18000", "현재상태: 배송중"));

        adminOrderListView = findViewById(R.id.adminOrderListView);
        AdminOrderManageListAdapter adminOrderManageListAdapter = new AdminOrderManageListAdapter(this, admin_order_Item);

        adminOrderListView.setAdapter(adminOrderManageListAdapter);

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
