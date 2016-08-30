package com.example.wladimir.androidmvc.View;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import com.example.wladimir.androidmvc.R;

/**
 * Created by Wladimir on 29/08/2016.
 */
public class Main extends AppCompatActivity {

    Button btnIniciar;
    Button btnRegistro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnIniciar = (Button) findViewById(R.id.btnIniciar);
        btnIniciar.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

                Intent iniciar = new Intent(Main.this, LoginActivity.class);
                startActivity(iniciar);
            }
        });

        btnRegistro = (Button) findViewById(R.id.btnRegistro);
        btnRegistro.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

                Intent registro = new Intent(Main.this, Registro.class);
                startActivity(registro);
            }
        });





    }
}