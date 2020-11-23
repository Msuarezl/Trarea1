package com.example.holamundoprcatica0001;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        //Localizar los controles
        TextView  txtSaludo = (TextView)findViewById(R.id.txtSaludo);
        //Recuperamos la información pasada en el intent
        Bundle bundle = this.getIntent().getExtras();
        //Construimos el mensaje a mostrar
        txtSaludo.setText("Hola!, Bienvenido \n " + bundle.getString("NOMBRE")+
                " Su telefono es:"+ bundle.getString("Telefono")+
                " Y nacio el:"+ bundle.getString("Nacimiento") + bundle.getString("Sexo"));

    }
}