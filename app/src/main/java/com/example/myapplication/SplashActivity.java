package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AlphaAnimation;
import android.widget.ImageView;


public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        //  enlazo
        ImageView image1 = findViewById(R.id.image1);

        Animation fadeIn = new AlphaAnimation(0, 1);
        // Cuanto va a durar
        fadeIn.setDuration(3000);
        image1.startAnimation(fadeIn);

        image1.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent irHome = new Intent(SplashActivity.this, MainActivity.class);
                startActivity(irHome);
                finish();
            }
        }, 3000);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        ImageView image1 = findViewById(R.id.image1);
        image1.removeCallbacks(null);
    }
}