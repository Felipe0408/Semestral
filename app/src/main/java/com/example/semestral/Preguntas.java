package com.example.semestral;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class Preguntas extends AppCompatActivity {

    RadioGroup Grupo1, Grupo2, Grupo3, Grupo4, Grupo5;
    RadioButton P1_R1, P1_R2, P1_R3, P1_R4,
            P2_R1, P2_R2, P2_R3, P2_R4,
            P3_R1, P3_R2, P3_R3, P3_R4,
            P4_R1, P4_R2, P4_R3, P4_R4,
            P5_R1, P5_R2, P5_R3, P5_R4;

    Button Enviar;
    ImageView Atras;

    int Resp1 = 0, Resp2= 0, Resp3= 0, Resp4= 0, Resp5= 0, Total= 0;
    int[] Arreglo = new int[5];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_preguntas);

        //Se identifican los grupos y los botones
        Grupo1 = findViewById(R.id.RG1);
        Grupo2 = findViewById(R.id.RG2);
        Grupo3 = findViewById(R.id.RG3);
        Grupo4 = findViewById(R.id.RG4);
        Grupo5 = findViewById(R.id.RG5);
        Enviar = findViewById(R.id.bEnviar);
        Atras = findViewById(R.id.Atras);

        //Se identifican los radio button
        P1_R1 = findViewById(R.id.p1_r1);
        P1_R2 = findViewById(R.id.p1_r2);
        P1_R3 = findViewById(R.id.p1_r3);
        P1_R4 = findViewById(R.id.p1_r4);
        P2_R1 = findViewById(R.id.p2_r1);
        P2_R2 = findViewById(R.id.p2_r2);
        P2_R3 = findViewById(R.id.p2_r3);
        P2_R4 = findViewById(R.id.p2_r4);
        P3_R1 = findViewById(R.id.p3_r1);
        P3_R2 = findViewById(R.id.p3_r2);
        P3_R3 = findViewById(R.id.p3_r3);
        P3_R4 = findViewById(R.id.p3_r4);
        P4_R1 = findViewById(R.id.p4_r1);
        P4_R2 = findViewById(R.id.p4_r2);
        P4_R3 = findViewById(R.id.p4_r3);
        P4_R4 = findViewById(R.id.p4_r4);
        P5_R1 = findViewById(R.id.p5_r1);
        P5_R2 = findViewById(R.id.p5_r2);
        P5_R3 = findViewById(R.id.p5_r3);
        P5_R4 = findViewById(R.id.p5_r4);

        //Listener del grupo 1 de radio button
        Grupo1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener(){
            @Override
            public void onCheckedChanged(RadioGroup arg0, int selectedId) {
                selectedId=Grupo1.getCheckedRadioButtonId();
                RadioButton Respchoose = (RadioButton) findViewById(selectedId);
                //Decide si sumar puntos y guarda la respuesta elegida en el arreglo en la posición 0
                if (Respchoose == P1_R1){
                    Resp1 = 1;
                    Arreglo[0] = 1;
                } else if (Respchoose == P1_R2){
                    Resp1 = 0;
                    Arreglo[0] = 2;
                } else if (Respchoose == P1_R3){
                    Resp1 = 0;
                    Arreglo[0] = 3;
                } else if (Respchoose == P1_R4){
                    Resp1 = 0;
                    Arreglo[0] = 4;
                }
            }
        });

        //Listener del grupo 2 de radio button
        Grupo2.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener(){
            @Override
            public void onCheckedChanged(RadioGroup arg0, int selectedId) {
                selectedId=Grupo2.getCheckedRadioButtonId();
                RadioButton Respchoose = (RadioButton) findViewById(selectedId);
                //Decide si sumar puntos y guarda la respuesta elegida en el arreglo en la posición 0
                if (Respchoose == P2_R1){
                    Resp2 = 1;
                    Arreglo[1] = 1;
                } else if (Respchoose == P2_R2){
                    Resp2 = 0;
                    Arreglo[1] = 2;
                } else if (Respchoose == P2_R3){
                    Resp2 = 0;
                    Arreglo[1] = 3;
                } else if (Respchoose == P2_R4){
                    Resp2 = 0;
                    Arreglo[1] = 4;
                }
            }
        });

        //Listener del grupo 3 de radio button
        Grupo3.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener(){
            @Override
            public void onCheckedChanged(RadioGroup arg0, int selectedId) {
                selectedId=Grupo3.getCheckedRadioButtonId();
                RadioButton Respchoose = (RadioButton) findViewById(selectedId);
                //Decide si sumar puntos y guarda la respuesta elegida en el arreglo en la posición 0
                if (Respchoose == P3_R1){
                    Resp3 = 1;
                    Arreglo[2] = 1;
                } else if (Respchoose == P3_R2){
                    Resp3 = 0;
                    Arreglo[2] = 2;
                } else if (Respchoose == P3_R3){
                    Resp3 = 0;
                    Arreglo[2] = 3;
                } else if (Respchoose == P3_R4){
                    Resp3 = 0;
                    Arreglo[2] = 4;
                }
            }
        });

        //Listener del grupo 4 de radio button
        Grupo4.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener(){
            @Override
            public void onCheckedChanged(RadioGroup arg0, int selectedId) {
                selectedId=Grupo4.getCheckedRadioButtonId();
                RadioButton Respchoose = (RadioButton) findViewById(selectedId);
                //Decide si sumar puntos y guarda la respuesta elegida en el arreglo en la posición 0
                if (Respchoose == P4_R1){
                    Resp4 = 1;
                    Arreglo[3] = 1;
                } else if (Respchoose == P4_R2){
                    Resp4 = 0;
                    Arreglo[3] = 2;
                } else if (Respchoose == P4_R3){
                    Resp4 = 0;
                    Arreglo[3] = 3;
                } else if (Respchoose == P4_R4){
                    Resp4 = 0;
                    Arreglo[3] = 4;
                }
            }
        });

        //Listener del grupo 5 de radio button
        Grupo5.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener(){
            @Override
            public void onCheckedChanged(RadioGroup arg0, int selectedId) {
                selectedId=Grupo5.getCheckedRadioButtonId();
                RadioButton Respchoose = (RadioButton) findViewById(selectedId);
                //Decide si sumar puntos y guarda la respuesta elegida en el arreglo en la posición 0
                if (Respchoose == P5_R1){
                    Resp5 = 1;
                    Arreglo[4] = 1;
                } else if (Respchoose == P5_R2){
                    Resp5 = 0;
                    Arreglo[4] = 2;
                } else if (Respchoose == P5_R3){
                    Resp5 = 0;
                    Arreglo[4] = 3;
                } else if (Respchoose == P5_R4){
                    Resp5 = 0;
                    Arreglo[4] = 4;
                }
            }
        });

        Enviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Total = Resp1+Resp2+Resp3+Resp4+Resp5;
                //Intent para pasar a la interfaz de resultados
                Intent IntentToResultados = new Intent(Preguntas.this, resultados.class);
                IntentToResultados.putExtra("Arreglo", Arreglo);
                IntentToResultados.putExtra("Total", Total);
                startActivity(IntentToResultados);
                //Toast Toast1 = Toast.makeText(getApplicationContext(), "Funciona"+Resp1+" "+Resp2+" "+Resp3+" "+Resp4+" "+Resp5+" "+Total+" "+Arreglo[0]+" "+Arreglo[1]+" "+Arreglo[2]+" "+Arreglo[3]+" "+Arreglo[4], Toast.LENGTH_LONG);
                //Toast1.setGravity(Gravity.CENTER, 200, -650);
                //Toast1.show();
                Toast Toast1 = Toast.makeText(getApplicationContext(), "Funciona"+Total+" "+Arreglo[0]+" "+Arreglo[1]+" "+Arreglo[2]+" "+Arreglo[3]+" "+Arreglo[4], Toast.LENGTH_LONG);
                Toast1.setGravity(Gravity.CENTER, 200, -650);
                Toast1.show();
            }
        });

        Atras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent IntentBack = new Intent(Preguntas.this, MainActivity.class);
                startActivity(IntentBack);
            }
        });

    }
}