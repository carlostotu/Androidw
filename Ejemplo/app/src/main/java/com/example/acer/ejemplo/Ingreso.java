package com.example.acer.ejemplo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Ingreso extends AppCompatActivity {
    Button btn_consultar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ingreso);
        btn_consultar=(Button) findViewById(R.id.btn_consultar);
        btn_consultar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentin= new Intent(Ingreso.this,Medidas.class);
                Ingreso.this.startActivity(intentin);
            }
        });
    }




}
