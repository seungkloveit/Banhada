package com.banhada.mart;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.example.banhada.R;

import java.util.ArrayList;

public class Mart3Activity extends AppCompatActivity {
    Button btn_local;
    ListView martListView2;
    ArrayList<Mart3ListItem> mart3_item;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mart3);

        // 테스트 주석
        // ㅇㅇㅇ
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayShowCustomEnabled(true);
        actionBar.setDisplayShowTitleEnabled(false);
        actionBar.setDisplayHomeAsUpEnabled(true);

        btn_local = findViewById(R.id.btn_local);

        btn_local.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder dialog = new AlertDialog.Builder(Mart3Activity.this);
                dialog.setTitle("지역 설정");
                dialog.setPositiveButton("확인", null);
                dialog.setNegativeButton("취소", null);
                dialog.show();
            }
        });

        mart3_item = new ArrayList<Mart3ListItem>();

        mart3_item.add(new Mart3ListItem("애플마트", "서울시 서초구 서초동 12-3"));
        mart3_item.add(new Mart3ListItem("홈 마트","서울시 광진구 능동로 3-3"));
        mart3_item.add(new Mart3ListItem("그레이트 마트", "서울시 중랑구 면목동 332-3"));

        martListView2 = findViewById(R.id.martListView2);
        Mart3ListAdapter mart3ListAdapter = new Mart3ListAdapter(this, mart3_item);

        martListView2.setAdapter(mart3ListAdapter);

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
