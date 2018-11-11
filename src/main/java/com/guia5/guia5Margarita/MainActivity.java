package com.guia5.guia5Margarita;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button btnejemplo,btnejercicio;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.btnejemplo = findViewById(R.id.btnEjemplos);
        this.btnejercicio = findViewById(R.id.btnejercicio);

        this.btnejemplo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,EjemploActivity.class));
            }
        });

        this.btnejercicio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,EjercicioActivity.class));
            }
        });
    }
}
