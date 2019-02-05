package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    TextView tvnama, tvnpm, tvkelas, tvtotal, tvgrade;
    String uts, uas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        tvnama = (TextView) findViewById(R.id.tv_nama);
        tvnpm = (TextView) findViewById(R.id.tv_npm);
        tvkelas = (TextView) findViewById(R.id.tv_kelas);
        tvtotal = (TextView) findViewById(R.id.tv_total);
        tvgrade = (TextView) findViewById(R.id.tv_grade);

        Intent intent = getIntent();
        tvnama.setText(intent.getStringExtra("nama"));
        tvnpm.setText(intent.getStringExtra("npm"));
        tvkelas.setText(intent.getStringExtra("kelas"));

        uts = intent.getStringExtra("uts");
        uas = intent.getStringExtra("uas");
        double mUts = Double.valueOf(uts);
        double mUas = Double.valueOf(uas);

        double total = (mUts+mUas)/2;
        tvtotal.setText(String.valueOf(total));

        if (total>=90){
            tvgrade.setText("Grade A");
        } else if (total >= 80) {
            tvgrade.setText("Grade B");
        } else {
            tvgrade.setText("GAGAL GOBLOK");
        }

    }
}
