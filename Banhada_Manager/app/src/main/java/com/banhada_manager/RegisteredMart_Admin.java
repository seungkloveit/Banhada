package com.banhada_manager;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.banhada_manager.R;

public class RegisteredMart_Admin extends AppCompatActivity {

   TextView enrolledMartName,martName,martAddress,martPhoneNumber;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registered_mart_admin);
    }
}