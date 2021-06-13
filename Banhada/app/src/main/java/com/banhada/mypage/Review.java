package com.banhada.mypage;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.MenuItem;

import com.example.banhada.R;

import java.util.ArrayList;

public class Review extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_review);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayShowCustomEnabled(true);
        actionBar.setDisplayShowTitleEnabled(false);
        actionBar.setDisplayHomeAsUpEnabled(true);

        ArrayList<review_record> list = new ArrayList<review_record>() {{

            add(new review_record(R.drawable.ic_launcher_background,"후기내용",(float)2.5));
            add(new review_record(R.drawable.ic_launcher_background,"후기내용",3));
            add(new review_record(R.drawable.ic_launcher_background,"후기내용", 5));
            add(new review_record(R.drawable.ic_launcher_background,"후기내용",4));
            add(new review_record(R.drawable.ic_launcher_background,"후기내용",5));
            add(new review_record(R.drawable.ic_launcher_background,"후기내용", 5));
            add(new review_record(R.drawable.ic_launcher_background,"후기내용",4));
            add(new review_record(R.drawable.ic_launcher_background,"후기내용",5));

        }
        };

        RecyclerView recyclerView = findViewById(R.id.rvrcv);
        reviewAdapter adapter = new reviewAdapter(this);
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
