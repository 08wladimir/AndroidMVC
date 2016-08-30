package com.example.wladimir.androidmvc.View;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.wladimir.androidmvc.Controller.AppController;
import com.example.wladimir.androidmvc.R;


/**
 * Created by Wladimir on 29/08/2016.
 */

public class Registro extends AppCompatActivity {

    EditText nombre;
    EditText apellido;
    EditText userName;
    EditText edad;
    EditText contraseña;
    EditText ccontraseña;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);

        nombre = (android.widget.EditText) this.findViewById(R.id.nombre);
        apellido = (android.widget.EditText) this.findViewById(R.id.apellido);
        userName = (android.widget.EditText) this.findViewById(R.id.usuario);
        edad = (android.widget.EditText) this.findViewById(R.id.edad);
        contraseña = (android.widget.EditText) this.findViewById(R.id.contraseña);
        ccontraseña = (android.widget.EditText) this.findViewById(R.id.ccontraseña);


    }

    public void guardar(View v) {
        if (AppController.getInstance().IsValidPass(contraseña.getText().toString(), ccontraseña.getText().toString())) {
            AppController.getInstance().llenar(nombre.getText().toString(), apellido.getText().toString(),
                    userName.getText().toString(), contraseña.getText().toString(), Integer.parseInt(edad.getText().toString()));

            Toast.makeText(this, "Registrado", Toast.LENGTH_SHORT).show();
            nombre.setText("");
            apellido.setText("");
            userName.setText("");
            contraseña.setText("");
            edad.setText("");
            ccontraseña.setText("");

        } else {
            Toast.makeText(this, "Las contraseñas no son iguales", Toast.LENGTH_SHORT).show();

            contraseña.setText("");
            ccontraseña.setText("");
        }
    }

}
