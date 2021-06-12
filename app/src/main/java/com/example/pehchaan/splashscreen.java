package com.example.pehchaan;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Handler;

public class splashscreen extends AppCompatActivity {

    private static int SPLASH=5000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashscreen);

        if(ActivityCompat.checkSelfPermission(this, Manifest.permission.SEND_SMS) != PackageManager.PERMISSION_GRANTED)
        {
            ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.SEND_SMS},1);
        }
        else {

        }




        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intents=new Intent(splashscreen.this,MainActivity.class);
                startActivity(intents);
                finish();
            }
        },SPLASH);

    }





}