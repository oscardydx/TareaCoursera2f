package com.example.vulcanussoft.tareacoursera2f;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Bundle X=getIntent().getExtras();

        String nombre= X.getString(getResources().getString(R.string.pnombre));
        String email= X.getString(getResources().getString(R.string.pemail));
        String telefono= X.getString(getResources().getString(R.string.ptel));
        String descrip= X.getString(getResources().getString(R.string.pdescrip));
        String dcalendar= X.getString(getResources().getString(R.string.pdcalendar));
        String mcalendar= X.getString(getResources().getString(R.string.pmcalendar));
        String ycalendar= X.getString(getResources().getString(R.string.pycalendar));


        TextView TNombre= findViewById(R.id.RtextView) ;
        TextView TEmail= findViewById(R.id.RtextView2) ;
        TextView TTelefono= findViewById(R.id.RtextView3) ;
        TextView TDescrip= findViewById(R.id.RtextView5) ;
        TextView TDCalendar= findViewById(R.id.RtextView4) ;
        TextView TMCalendar= findViewById(R.id.RtextView6) ;
        TextView TYCalendar= findViewById(R.id.RtextView7) ;

        switch (mcalendar){
            case "0":  mcalendar = "Enero";
                               break;
            case "1": mcalendar="Febrero";
                                break;
            case "2": mcalendar="Marzo";
            break;
            case "3": mcalendar="Abril";
            break;
            case"4": mcalendar="Mayo";
            break;
            case "5": mcalendar="Junio";
            break;
            case "6": mcalendar="Julio";
            break;
            case "7": mcalendar="Agosto";
            break;
            case "8": mcalendar="Septiembre";
            break;
            case "9": mcalendar="Octubre";
            break;
            case "10": mcalendar="Noviembre";
            break;
            case "11": mcalendar="Diciembre";
            break;


        }


        TNombre.setText(nombre);
        TEmail.setText(email);
        TTelefono.setText(telefono);
        TDescrip.setText(descrip);
        TDCalendar.setText(dcalendar);
        TMCalendar.setText(mcalendar);
        TYCalendar.setText(ycalendar);


        Button botonB=findViewById(R.id.button2) ;

        botonB.setOnClickListener(new View.OnClickListener( ) {
            @Override
            public void onClick(View view) {
              onBackPressed();

            }
        });
    }
}
