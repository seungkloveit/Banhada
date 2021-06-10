package com.banhada.product;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;

import com.banhada.payment.Payment_Phone;
import com.example.banhada.R;

import java.util.ArrayList;

public class User_Product extends AppCompatActivity {

    private Spinner spinner_kit;
    ArrayList<String> kit_arrayList1;
    ArrayAdapter<String> kit_arrayAdapter1;
    ListView kitListView;
    ArrayList<MealKitListItem> meal_kit_list_item;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_product);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayShowCustomEnabled(true);
        actionBar.setDisplayShowTitleEnabled(false);
        actionBar.setDisplayHomeAsUpEnabled(true);

        kit_arrayList1 = new ArrayList<>();
        kit_arrayList1.add("전체");
        kit_arrayList1.add("한식");
        kit_arrayList1.add("양식");
        kit_arrayList1.add("일식");
        kit_arrayList1.add("중식");
        kit_arrayList1.add("기타");

        kit_arrayAdapter1 = new ArrayAdapter<>(getApplicationContext(),
                android.R.layout.simple_spinner_dropdown_item,
                kit_arrayList1);

        spinner_kit = (Spinner)findViewById(R.id.spinner_kit);
        spinner_kit.setAdapter(kit_arrayAdapter1);

        meal_kit_list_item = new ArrayList<MealKitListItem>();

        meal_kit_list_item.add(new MealKitListItem(R.drawable.gimchijjigae, "김치찌개", "24000원"));
        meal_kit_list_item.add(new MealKitListItem(R.drawable.miyeokguk, "미역국", "21000원"));
        meal_kit_list_item.add(new MealKitListItem(R.drawable.sobulgogi, "소불고기", "18000원"));
        meal_kit_list_item.add(new MealKitListItem(R.drawable.gimchijjigae, "김치찌개", "24000원"));
        meal_kit_list_item.add(new MealKitListItem(R.drawable.miyeokguk, "미역국", "21000원"));
        meal_kit_list_item.add(new MealKitListItem(R.drawable.sobulgogi, "소불고기", "18000원"));
        meal_kit_list_item.add(new MealKitListItem(R.drawable.gimchijjigae, "김치찌개", "24000원"));
        meal_kit_list_item.add(new MealKitListItem(R.drawable.miyeokguk, "미역국", "21000원"));
        meal_kit_list_item.add(new MealKitListItem(R.drawable.sobulgogi, "소불고기", "18000원"));

        kitListView = findViewById(R.id.kitListView);
        MealKitListAdapter martOrderManageListAdapter = new MealKitListAdapter(this, meal_kit_list_item);

        kitListView.setAdapter(martOrderManageListAdapter);


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