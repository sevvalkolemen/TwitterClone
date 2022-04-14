package com.nesneyonelimli.twitterclone.ui;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.nesneyonelimli.twitterclone.R;
import com.nesneyonelimli.twitterclone.ui.view.ApplicationActivity;


public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        new Handler().postDelayed(new Runnable(){
            @Override
            public void run() {
                startActivity(new Intent(MainActivity.this, ApplicationActivity.class));
            }
        }, 5000);
    }
}

