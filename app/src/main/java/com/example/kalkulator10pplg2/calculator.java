package com.example.kalkulator10pplg2;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class calculator extends AppCompatActivity {

    EditText angka_pertama, angka_kedua;
    Button plus, kurang, kali, bagi, bersihkan;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);

        angka_pertama = (EditText) findViewById(R.id.angka_pertama);
        angka_kedua = (EditText) findViewById(R.id.angka_kedua);

        plus = (Button) findViewById(R.id.plus);
        kurang = (Button) findViewById(R.id.kurang);
        kali = (Button) findViewById(R.id.kali);
        bagi = (Button) findViewById(R.id.bagi);

        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if ((angka_pertama.getText().length() > 0) &&
                        (angka_kedua.getText().length() > 0)) {
                    double angka1 =
                            Double.parseDouble(angka_pertama.getText().toString());
                    double angka2 =
                            Double.parseDouble(angka_kedua.getText().toString());
                    double result = angka1 + angka2;
                    Toast.makeText(getApplicationContext(), "Hasilnya adalah " + result, Toast.LENGTH_SHORT).show();
                }else{
                    Toast toast = Toast.makeText(calculator.this, "Mohon masukkan Angka pertama & Kedua", Toast.LENGTH_LONG);
                    toast.show();
                }
            }
        });
    }
}