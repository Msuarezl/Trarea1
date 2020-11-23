package com.example.holamundoprcatica0001;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        }
    public void btnEnviar(View view){
        //Creamos el Intent
        Intent intent = new Intent(MainActivity.this, Activity2.class);
        EditText txtNombre = (EditText)findViewById(R.id.txtNombre);
        EditText txtNacimiento = (EditText)findViewById(R.id.txtNacimiento);
        EditText txtTelefono = (EditText)findViewById(R.id.txtTelefono);
        RadioButton rbdfem =  findViewById(R.id.rbdFemenino);
        RadioButton rbdmas =  findViewById(R.id.rbdMAsculino);

        //Creamos la información a pasar entre actividades - Pares Key-Value
        Bundle b = new Bundle();
        b.putString("NOMBRE", txtNombre.getText().toString());
        b.putString("Nacimiento", txtNacimiento.getText().toString());
        b.putString("Telefono", txtTelefono.getText().toString());
        if (rbdfem.isChecked())
            b.putString("Sexo","Es Mujer");
        else  if (rbdmas.isChecked())
            b.putString("Sexo","Es Hombre");
        // Añadimos la información al intent
        intent.putExtras(b);
        // Iniciamos la nueva actividad
        startActivity(intent);
    }
}