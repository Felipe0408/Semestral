package com.example.semestral;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class resultados extends AppCompatActivity {
    private Button btn_int;
    private Button btn_pag;

    private TextView puntos, Co_1, p1_r1, p2_r1, p3_r1, p4_r1, p5_r1, Co_2, Co_3, Co_4, Co_5, p1_r2, p2_r2, p3_r2, p4_r2, p5_r2, p1_r3, p2_r3, p3_r3, p4_r3, p5_r3, p1_r4, p2_r4, p3_r4, p4_r4, p5_r4, p1_r5, p2_r5, p3_r5, p4_r5, p5_r5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultados);

        btn_int = findViewById(R.id.btn_int);
        btn_pag = findViewById(R.id.btn_pag);
        puntos = findViewById(R.id.puntos);
        Co_1 = findViewById(R.id.Co_1);
        p1_r1 = findViewById(R.id.p1_r1);
        p2_r1 = findViewById(R.id.p2_r1);
        p3_r1 = findViewById(R.id.p3_r1);
        p4_r1 = findViewById(R.id.p4_r1);
        p5_r1 = findViewById(R.id.p5_r1);
        Co_2 = findViewById(R.id.Co_2);
        Co_3 = findViewById(R.id.Co_3);
        Co_4 = findViewById(R.id.Co_4);
        Co_5 = findViewById(R.id.Co_5);
        p1_r2 = findViewById(R.id.p1_r2);
        p2_r2 = findViewById(R.id.p2_r2);
        p3_r2 = findViewById(R.id.p3_r2);
        p4_r2 = findViewById(R.id.p4_r2);
        p5_r2 = findViewById(R.id.p5_r2);
        p1_r3 = findViewById(R.id.p1_r3);
        p2_r3 = findViewById(R.id.p2_r3);
        p3_r3 = findViewById(R.id.p3_r3);
        p4_r3 = findViewById(R.id.p4_r3);
        p5_r3 = findViewById(R.id.p5_r3);
        p1_r4 = findViewById(R.id.p1_r4);
        p2_r4 = findViewById(R.id.p2_r4);
        p3_r4 = findViewById(R.id.p3_r4);
        p4_r4 = findViewById(R.id.p4_r4);
        p5_r4 = findViewById(R.id.p5_r4);


        Intent intent = getIntent();
        int[] arreglo = intent.getIntArrayExtra("Arreglo");
        int total = intent.getIntExtra("Total", 0);
        String pregunta1 = "p1_r" + arreglo[0];
        int tv_p1 = getResources().getIdentifier(pregunta1, "id", getPackageName());
        TextView preg_id1 = findViewById(tv_p1);
        String pregunta2 = "p2_r" + arreglo[1];
        int tv_p2 = getResources().getIdentifier(pregunta2, "id", getPackageName());
        TextView preg_id2 = findViewById(tv_p2);
        String pregunta3 = "p3_r" + arreglo[2];
        int tv_p3 = getResources().getIdentifier(pregunta3, "id", getPackageName());
        TextView preg_id3 = findViewById(tv_p3);
        String pregunta4 = "p4_r" + arreglo[3];
        int tv_p4 = getResources().getIdentifier(pregunta4, "id", getPackageName());
        TextView preg_id4 = findViewById(tv_p4);
        String pregunta5 = "p5_r" + arreglo[4];
        int tv_p5 = getResources().getIdentifier(pregunta5, "id", getPackageName());
        TextView preg_id5 = findViewById(tv_p5);

        puntos.setText(total + " sobre 5");

        if (arreglo[0] == 1) {
            Co_1.setText("Respuesta correcta!");
            p1_r1.setTextColor(Color.GREEN);
        } else {
            preg_id1.setTextColor(Color.RED);
        }
        if (arreglo[1] == 1) {
            Co_2.setText("Respuesta correcta!");
            p2_r1.setTextColor(Color.GREEN);
        } else {
            preg_id2.setTextColor(Color.RED);
        }
        if (arreglo [2] == 1) {
            Co_3.setText("Respuesta correcta!");
            p3_r1.setTextColor(Color.GREEN);
        } else {
            preg_id3.setTextColor(Color.RED);
        }
        if (arreglo [3] == 1) {
            Co_4.setText("Respuesta correcta!");
            p4_r1.setTextColor(Color.GREEN);
        } else {
            preg_id4.setTextColor(Color.RED);
        }
        if (arreglo [4] == 1) {
            Co_5.setText("Respuesta correcta!");
            p5_r1.setTextColor(Color.GREEN);
        } else {
            preg_id5.setTextColor(Color.RED);
        }

        btn_int.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_int = new Intent(resultados.this, Preguntas.class);
                startActivity(intent_int);
            }
        });

        btn_pag.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_pag = new Intent(resultados.this, MainActivity.class);
                startActivity(intent_pag);
            }
        });
    }
}