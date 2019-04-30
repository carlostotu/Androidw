package com.example.acer.ejemplo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Registrarse extends AppCompatActivity {
    Button btn_registro;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrarse);
        btn_registro=(Button) findViewById(R.id.btnregistro);
        btn_registro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentinicio =new Intent(Registrarse.this,MainActivity.class);
                Registrarse.this.startActivity(intentinicio);
            }
        });

    }
}
