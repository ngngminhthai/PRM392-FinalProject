package com.example.prm392project;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.prm392project.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());

        setContentView(R.layout.activity_main);
    }
}