package com.app.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class Main2ActivityTow extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2_tow);

        //Inicialmente Creamos un objeto de tipo Bundle que va a contener dos extras que que el mandamos de la actividad anterior
        Bundle miBundle = this.getIntent().getExtras();

        //Hacemos una validacion para saber si existe un Bundle

        if(miBundle != null){

            //Utilizando el nombre de la key, la cual fue creada anteriormente
            //se puede acceder a el contedido que se ha enviado anterior mente

            String mensajeRecivido = miBundle.getString("texto");
            Log.d("Mensaje",mensajeRecivido);
        }


    }
}
