package com.banhada_manager.notice;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.banhada_manager.RecyclerViewDecoration;
import com.example.banhada_manager.R;

import java.util.ArrayList;

public class Notice extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notice);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayShowCustomEnabled(true);
        actionBar.setDisplayShowTitleEnabled(false);
        actionBar.setDisplayHomeAsUpEnabled(true);

        Button wrtbtn = (Button) findViewById(R.id.ntcbtn);


        wrtbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), NoticeSub.class);
                startActivity(intent);
            }
        });

        ArrayList<notice_record> list = new ArrayList<notice_record>() {
            {

                add(new notice_record("제목입니다", "내용", "2016-01-58"));
                add(new notice_record("제목입니다", "내용", "2016-01-58"));
                add(new notice_record("제목입니다", "내용", "2016-01-58"));
                add(new notice_record("제목입니다", "내용", "2016-01-58"));
                add(new notice_record("제목입니다", "내용", "2016-01-58"));
                add(new notice_record("제목입니다", "내용", "2016-01-58"));
                add(new notice_record("제목입니다", "내용", "2016-01-58"));
                add(new notice_record("제목입니다", "내용", "2016-01-58"));
                add(new notice_record("제목입니다", "내용", "2016-01-58"));
                add(new notice_record("제목입니다", "내용", "2016-01-58"));

            }
        };

        RecyclerView recyclerView = findViewById(R.id.noticerv);
        noticercvAdapter adapter = new noticercvAdapter(this);
        adapter.setData(list);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);
        recyclerView.addItemDecoration(new RecyclerViewDecoration(10, 10));
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home: { //toolbar의 back키 눌렀을 때 동작
                finish();
            }
        }
        return super.onOptionsItemSelected(item);
    }
}
