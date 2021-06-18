package com.banhada_mart.Login;

import android.app.AlertDialog;
import android.app.TabActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TabHost;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.example.banhada_mart.R;

public class FindIDPW extends TabActivity {
    TabHost tabHost;
    Button btn_login_complete, find_id_pw, btn_find_pw;
    View dialogView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.find_id_pw);

//        Toolbar toolbar = findViewById(R.id.toolbar);
//        setSupportActionBar(toolbar);
//        ActionBar actionBar = getSupportActionBar();
//        actionBar.setDisplayShowCustomEnabled(true);
//        actionBar.setDisplayShowTitleEnabled(false);
//        actionBar.setDisplayHomeAsUpEnabled(true);

        tabHost = getTabHost();
        TabHost.TabSpec tabid = tabHost.newTabSpec("ID").setIndicator("아이디");
        tabid.setContent(R.id.tabid);
        tabHost.addTab(tabid);

        tabHost = getTabHost();
        TabHost.TabSpec tabpw = tabHost.newTabSpec("PW").setIndicator("비밀번호");
        tabpw.setContent(R.id.tabpw);
        tabHost.addTab(tabpw);

        tabHost.setCurrentTab(0);

        btn_find_pw = findViewById(R.id.btn_find_pw);
        btn_find_pw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialogView = View.inflate(FindIDPW.this, R.layout.dialog_pwd, null);
                AlertDialog.Builder dialog = new AlertDialog.Builder(FindIDPW.this);
                dialog.setTitle("새 비밀번호 설정");
                dialog.setView(dialogView);
                dialog.setPositiveButton("확인", null);
                dialog.setNegativeButton("취소", null);
                dialog.show();
            }
        });
    }
}