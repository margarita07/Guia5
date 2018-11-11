package com.guia5.guia5Margarita;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class EjercicioActivity extends AppCompatActivity {
    Button btnizq,btncentro,btnder;
    ImageView coronaizq,coronacentro,coronader;
    Animation anim_COMBINADO;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio);
        btnizq = findViewById(R.id.btnizq);
        btncentro = findViewById(R.id.btncentro);
        btnder = findViewById(R.id.btnder);

        coronaizq = findViewById(R.id.coronaizq);
        coronacentro = findViewById(R.id.coronacentro);
        coronader = findViewById(R.id.coronader);
        //combinado
        //horizontal
        anim_COMBINADO = AnimationUtils.loadAnimation(this, R.anim.bajar_aparecer);
        anim_COMBINADO.setDuration(1000);
        anim_COMBINADO.setFillAfter(true);

        btnizq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                coronacentro.clearAnimation();
                coronader.clearAnimation();
                coronaizq.startAnimation(anim_COMBINADO);
            }
        });

        btncentro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                coronaizq.clearAnimation();
                coronader.clearAnimation();
                coronacentro.startAnimation(anim_COMBINADO);

            }
        });

        btnder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                coronacentro.clearAnimation();
                coronaizq.clearAnimation();
                coronader.startAnimation(anim_COMBINADO);

            }
        });
    }
}
