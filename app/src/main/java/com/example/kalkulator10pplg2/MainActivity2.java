package com.example.kalkulator10pplg2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;

public class MainActivity2 extends AppCompatActivity {

    EditText angka_pertama, angka_kedua;
    Button tambah, kurang, kali, bagi;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        angka_pertama = (EditText) findViewById(R.id.angka_pertama);
        angka_kedua = (EditText) findViewById(R.id.angka_kedua);

        tambah = (Button) findViewById(R.id.tambah);
        kurang = (Button) findViewById(R.id.kurang);
        kali = (Button) findViewById(R.id.kali);
        bagi = (Button) findViewById(R.id.bagi);

        tambah.setOnClickListener(new View.OnClickListener() {
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

                } else {
                    Toast toast = Toast.makeText(MainActivity2.this, "Mohon masukkan Angka pertama & Kedua", Toast.LENGTH_LONG);
                    toast.show();
                }
            }
        });
        kurang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if ((angka_pertama.getText().length() > 0) && (angka_kedua.getText().length() > 0)) {
                    double angka1 =
                            Double.parseDouble(angka_pertama.getText().toString());
                    double angka2 =
                            Double.parseDouble(angka_kedua.getText().toString());
                    double result = angka1 - angka2;
                    Toast.makeText(getApplicationContext(), "Hasilnya adalah " + result, Toast.LENGTH_SHORT).show();
                } else {
                    Toast toast = Toast.makeText(MainActivity2.this, "Mohon masukkan Angka pertama & Kedua", Toast.LENGTH_LONG);
                    toast.show();
                }
            }
        });
        kali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if ((angka_pertama.getText().length() > 0) && (angka_kedua.getText().length() > 0)) {
                    double angka1 =
                            Double.parseDouble(angka_pertama.getText().toString());
                    double angka2 =
                            Double.parseDouble(angka_kedua.getText().toString());
                    double result = angka1 * angka2;
                    Toast.makeText(getApplicationContext(), "Hasilnya adalah " + result, Toast.LENGTH_SHORT).show();
                } else {
                    Toast toast = Toast.makeText(MainActivity2.this, "Mohon masukkan Angka pertama & Kedua", Toast.LENGTH_LONG);
                    toast.show();
                }
            }
        });
        bagi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if ((angka_pertama.getText().length() > 0) && (angka_kedua.getText().length() > 0)) {
                    double angka1 =
                            Double.parseDouble(angka_pertama.getText().toString());
                    double angka2 =
                            Double.parseDouble(angka_kedua.getText().toString());
                    double result = angka1 / angka2;
                    Toast.makeText(getApplicationContext(), "Hasilnya adalah " + new DecimalFormat("##.##").format(result), Toast.LENGTH_SHORT).show();
                } else {
                    Toast toast = Toast.makeText(MainActivity2.this, "Mohon masukkan Angka pertama & Kedua", Toast.LENGTH_LONG);
                    toast.show();
                }
            }
        });
    }
}