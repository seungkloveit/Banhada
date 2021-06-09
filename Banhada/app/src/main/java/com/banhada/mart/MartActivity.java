package com.banhada.mart;

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

public class MartActivity extends AppCompatActivity {
    ListView martListView;
    Button btn_add_mart;
    Button btn_complete_mart1;
    ArrayList<String> mart_address_item;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mart);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayShowCustomEnabled(true);
        actionBar.setDisplayShowTitleEnabled(false);
        actionBar.setDisplayHomeAsUpEnabled(true);

        btn_add_mart=findViewById(R.id.btn_add_mart);
        btn_add_mart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(), Mart2Activity.class);
                startActivity(intent);
            }
        });
        btn_complete_mart1=findViewById(R.id.btn_complete_mart1);
        btn_complete_mart1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "마트연결을 완료하였습니다.", Toast.LENGTH_SHORT).show();
            }
        });

        mart_address_item = new ArrayList<String>();

        mart_address_item.add("그레이트마트 서울시 서초구 서초동 123-33");
        mart_address_item.add("abcdd마트 서울시 서초구 서초동 3-3");
        mart_address_item.add("홈마트 서울시 서울시 서초구 서초동 1111-22");

        martListView = findViewById(R.id.martListView);
        final MartListAdapter martListAdapter = new MartListAdapter(this, mart_address_item);

        martListView.setAdapter(martListAdapter);

        martListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                martListAdapter.setSelectedPosition(position);
                martListAdapter.notifyDataSetChanged();
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

