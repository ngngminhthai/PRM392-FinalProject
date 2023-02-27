package com.example.prm392project.ui.notification;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.prm392project.ui.notification.ui.main.NotificationFragment;

public class notification extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notification);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.container, NotificationFragment.newInstance())
                    .commitNow();
        }
    }
}