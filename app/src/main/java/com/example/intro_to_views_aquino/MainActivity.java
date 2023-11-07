package com.example.intro_to_views_aquino;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ActionBar actionBarObject = getSupportActionBar();
        if(actionBarObject != null) {
            actionBarObject.setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.action)));
        }
    }
}