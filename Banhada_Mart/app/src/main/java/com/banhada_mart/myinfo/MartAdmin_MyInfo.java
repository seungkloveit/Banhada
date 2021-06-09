package com.banhada_mart.myinfo;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.banhada_mart.R;

public class MartAdmin_MyInfo extends AppCompatActivity {

//    View martview;
//    TextView mart1,textView11,textView12,textView13,textView14;
//    ImageView imageView10;
    Button btn_material_total_stock;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mart_admin_myinfo);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayShowCustomEnabled(true);
        actionBar.setDisplayShowTitleEnabled(false);
        actionBar.setDisplayHomeAsUpEnabled(true);

//        martview=findViewById(R.id.martview);
//        mart1=findViewById(R.id.mart1);
//        textView11=findViewById(R.id.textView11);
//        textView12=findViewById(R.id.textView12);
//        textView13=findViewById(R.id.textView13);
//        textView14=findViewById(R.id.textView14);
//        imageView10=findViewById(R.id.imageView10);
        btn_material_total_stock=findViewById(R.id.btn_material_total_stock);

        btn_material_total_stock.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(), MartHaveMaterials.class);
                startActivity(intent);
            }
        });

        // 갤러리뷰로 이미지 가져오기 + db연동 
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