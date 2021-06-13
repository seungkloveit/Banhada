package com.banhada.mypage;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import com.example.banhada.R;

import java.util.ArrayList;

public class delivery extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_delivery);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayShowCustomEnabled(true);
        actionBar.setDisplayShowTitleEnabled(false);
        actionBar.setDisplayHomeAsUpEnabled(true);

        Spinner sortspinner = (Spinner) findViewById(R.id.statespinner);
        ArrayAdapter sortadapter = ArrayAdapter.createFromResource(this, R.array.delivery, R.layout.item_spinner);
        sortadapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        sortspinner.setAdapter(sortadapter);

        ArrayList<delivery_record> list = new ArrayList<delivery_record>() {{
            add(new delivery_record("규동","202005112225478","배송완료",R.drawable.guydon));
            add(new delivery_record("규동","202005112225478","주문접수",R.drawable.ic_launcher_background));
            add(new delivery_record("규동","202005112225478","배송중",R.drawable.ic_launcher_background));
            add(new delivery_record("규동","202005112225478","배송중",R.drawable.ic_launcher_background));
            add(new delivery_record("규동","202005112225478","배송중",R.drawable.ic_launcher_background));
            add(new delivery_record("규동","202005112225478","배송중",R.drawable.ic_launcher_background));
            add(new delivery_record("규동","202005112225478","배송완료",R.drawable.guydon));
            add(new delivery_record("규동","202005112225478","배송중",R.drawable.ic_launcher_background));
            add(new delivery_record("규동","202005112225478","배송중",R.drawable.ic_launcher_background));
            add(new delivery_record("규동","202005112225478","배송중",R.drawable.ic_launcher_background));
            add(new delivery_record("규동","202005112225478","배송중",R.drawable.ic_launcher_background));

        }
        };

        RecyclerView recyclerView = findViewById(R.id.deliveryrv);
        deliberyAdapter adapter = new deliberyAdapter(this);
        adapter.setData(list);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);
        recyclerView.addItemDecoration(new RecyclerViewDecoration(10,20));
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case android.R.id.home:{ //toolbar의 back키 눌렀을 때 동작
                finish();
            }
        }
        return super.onOptionsItemSelected(item);
    }
}
