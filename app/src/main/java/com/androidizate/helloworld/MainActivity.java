package com.androidizate.helloworld;

import android.graphics.Color;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    Button Boton;
    AlertDialog Alerta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }


    public void C(View view) {

        Boton = (Button) findViewById(R.id.boton1);
        Boton.setOnClickListener(new View.OnClickListener() {
            int A = 14;
             @Override

             public void onClick(View v) {

                 TextView Etiqueta;
                 Etiqueta = (TextView) findViewById(R.id.Label1);
                 ImageView FotoRobot;
                 FotoRobot = (ImageView) findViewById(R.id.Imagen1);

                 Alerta = new AlertDialog.Builder(MainActivity.this).create();

               if (Etiqueta.getText() == "Hello World!"  & A == 35){


                   Etiqueta.setText("Sucede Algo");
                   Etiqueta.setTextColor(Color.BLUE);
                   Etiqueta.setTextSize(40);
                   FotoRobot.setVisibility(View.VISIBLE);
                                     FotoRobot.setY(700);
                   FotoRobot.setX(200);

                   A = 14;
                   Boton.setText("Aprieta");

               }


                 else

                 {
                     if (A ==14){
                                 Boton.setText("Presione Otra Vez");
                     }else if(A == 21){
                             Boton.setText("Vuelve A Intentar");
                     }else if(A== 28){
                             Boton.setText("Una Ultima Vez");

                         }





                     Etiqueta.setText("Hello World!");
                     Etiqueta.setTextSize(A + 7);
                     Etiqueta.setTextColor(Color.BLACK);
                     FotoRobot.setVisibility(View.INVISIBLE);

                        A = A + 7;


                 }
                 if(Etiqueta.getText() == "Sucede Algo" ){
                     Alerta.setTitle("Grandioso");
                     Alerta.setMessage("Excelente");
                     Alerta.show();



                 }
             }
         });
    }
}
