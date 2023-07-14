package com.example.semestral;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button BotonEmpezar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_presentacion);

        BotonEmpezar = findViewById(R.id.bEmpezar);
        BotonEmpezar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Intent para pasar del main a la pantalla de Login
                Intent IntentToPreguntas = new Intent(MainActivity.this, Preguntas.class);
                startActivity(IntentToPreguntas);
            }
        });
    }
}