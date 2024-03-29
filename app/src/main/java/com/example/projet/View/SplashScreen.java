package com.example.projet.View;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.app.Activity;

import com.example.projet.R;

public class SplashScreen extends Activity{
    private static int SPLASH_TIME_OUT = 3000;

    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        new Handler().postDelayed(new Runnable(){
            @Override
            public void run(){
                Intent i = new Intent(SplashScreen.this, MainActivity.class);
                startActivity(i);
                finish();
            }
        },SPLASH_TIME_OUT);

    }
}
