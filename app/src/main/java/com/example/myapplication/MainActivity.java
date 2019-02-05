package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText etnama, etnpm, etkelas, etuts, etuas;
    Button btnproses;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etnama = (EditText) findViewById(R.id.et_nama);
        etnpm = (EditText) findViewById(R.id.et_npm);
        etkelas = (EditText) findViewById(R.id.et_kelas);
        etuts = (EditText) findViewById(R.id.et_uts);
        etuas = (EditText) findViewById(R.id.et_uas);
        Button btnproses = (Button) findViewById(R.id.btnproses);

        btnproses.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (TextUtils.isEmpty(etnama.getText().toString())) {
                    etnama.setError("yang bener lah");
                } else if(TextUtils.isEmpty(etnpm.getText().toString())) {
                    etnpm.setError("yang bener lah");
                } else if(TextUtils.isEmpty(etkelas.getText().toString())) {
                    etkelas.setError("yang bener lah");
                } else if(TextUtils.isEmpty(etuts.getText().toString())) {
                    etuts.setError("yang bener lah");
                } else if (TextUtils.isEmpty(etuas.getText().toString())) {
                    etuas.setError("yang bener lah");
                } else {
                    Intent Intent = new Intent(MainActivity.this, Main2Activity.class);
                    Intent.putExtra("nama", etnama.getText().toString());
                    Intent.putExtra("npm", etnpm.getText().toString());
                    Intent.putExtra("kelas", etkelas.getText().toString());
                    Intent.putExtra("uts", etuts.getText().toString());
                    Intent.putExtra("uas", etuas.getText().toString());
                    startActivity(Intent);
                }

            }
        });


    }
}
