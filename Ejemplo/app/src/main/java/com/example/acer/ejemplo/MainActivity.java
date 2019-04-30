package com.example.acer.ejemplo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
   TextView tv_registrarse;
   Button btn_ingresar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       tv_registrarse=(TextView) findViewById(R.id.tv_registrarse);
       tv_registrarse.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent intentre=new Intent(MainActivity.this,Registrarse.class);
               MainActivity.this.startActivity(intentre);
           }
       });
        btn_ingresar=(Button) findViewById(R.id.btn_ingresar);
        btn_ingresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intententrar =new Intent(MainActivity.this,Ingreso.class);
                MainActivity.this.startActivity(intententrar);
            }
        });


    }
}
