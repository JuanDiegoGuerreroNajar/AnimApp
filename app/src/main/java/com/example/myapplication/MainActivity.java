package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Crear el anlace entre el elemento real y el logico
        TextView tv1 = findViewById(R.id.tv1);
        TextView tv2 = findViewById(R.id.tv2);
        Button btn1 = findViewById(R.id.btn1);
        TextView tv4 = findViewById(R.id.tv4);
        TextView tv3 = findViewById(R.id.tv3);

        //Crear la animacion y cargarla
        Animation anim_out = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fade_out);
        Animation anim_in = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fade_in);
        Animation anim_road = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.rotation);
        Animation anim_translate = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.translate);
        Animation anim_scale = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.scale);
        //Iniciar la animacion
        tv1.startAnimation(anim_out);
        tv2.startAnimation(anim_in);
        btn1.startAnimation(anim_road);
        tv3.startAnimation(anim_translate);
        tv4.startAnimation(anim_scale);
    }
}