package com.example.prm392project.data.model;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.prm392project.data.model.ui.newfeed.NewFeed;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.container, NewFeed.newInstance())
                    .commitNow();
        }
    }
}