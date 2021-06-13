package com.banhada_manager.Member;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import com.banhada_manager.RecyclerViewDecoration;
import com.example.banhada_manager.R;

import java.util.ArrayList;

public class Member_management extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_member_management);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayShowCustomEnabled(true);
        actionBar.setDisplayShowTitleEnabled(false);
        actionBar.setDisplayHomeAsUpEnabled(true);


        Spinner schspinner = (Spinner)findViewById(R.id.spinner);
        ArrayAdapter schadapter = ArrayAdapter.createFromResource(this, R.array.sch, R.layout.item_spinner);
        schadapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        schspinner.setAdapter(schadapter);

        Spinner sortspinner = (Spinner)findViewById(R.id.spinner2);
        ArrayAdapter sortadapter = ArrayAdapter.createFromResource(this,R.array.Sort, R.layout.item_spinner);
        schadapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        sortspinner.setAdapter(sortadapter);

        ArrayList<memberinfo> list = new ArrayList<memberinfo>() {{

            add(new memberinfo("홍길동","user1","010-1234-5678","user@naver.com","서울특별시 어딘가"));
            add(new memberinfo("홍길동","user1","010-1234-5678","user@naver.com","서울특별시 어딘가"));
            add(new memberinfo("홍길동","user1","010-1234-5678","user@naver.com","서울특별시 어딘가"));
            add(new memberinfo("홍길동","user1","010-1234-5678","user@naver.com","서울특별시 어딘가"));
            add(new memberinfo("홍길동","user1","010-1234-5678","user@naver.com","서울특별시 어딘가"));
            add(new memberinfo("홍길동","user1","010-1234-5678","user@naver.com","서울특별시 어딘가"));
            add(new memberinfo("홍길동","user1","010-1234-5678","user@naver.com","서울특별시 어딘가"));
            add(new memberinfo("홍길동","user1","010-1234-5678","user@naver.com","서울특별시 어딘가"));
            add(new memberinfo("홍길동","user1","010-1234-5678","user@naver.com","서울특별시 어딘가"));
            add(new memberinfo("홍길동","user1","010-1234-5678","user@naver.com","서울특별시 어딘가"));
        }
        };

        RecyclerView recyclerView = findViewById(R.id.mmrcv);
        mmrcvAdapter adapter = new mmrcvAdapter(this);
        adapter.setData(list);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);
        recyclerView.addItemDecoration(new RecyclerViewDecoration(10,20));
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home: {
                finish();
            }
        }
        return true;
    }

}
