package com.example.vulcanussoft.tareacoursera2f;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText etnombre =findViewById(R.id.etnombre);
        final EditText etemail =findViewById(R.id.etemail);
        final EditText ettel =findViewById(R.id.ettel);
        final EditText etdescrip =findViewById(R.id.etdescrip);
        final DatePicker calendar= findViewById(R.id.calendarView);


      Button boton = findViewById(R.id.button);

        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nombre = etnombre.getText().toString();
                String email = etemail.getText().toString();
                String telefono = ettel.getText().toString();
                String descrip = etdescrip.getText().toString();

                int dCalendar=calendar.getDayOfMonth();
                int mCalendar=calendar.getMonth();
                int yCalendar=calendar.getYear();

                String dia=Integer.toString(dCalendar);
                String mes=Integer.toString(mCalendar);
                String ano=Integer.toString(yCalendar);


                Intent intent= new Intent(MainActivity.this,Main2Activity.class );
                intent.putExtra(getResources().getString(R.string.pnombre), nombre);
                intent.putExtra(getResources().getString(R.string.pemail), email);
                intent.putExtra(getResources().getString(R.string.ptel), telefono);
                intent.putExtra(getResources().getString(R.string.pdescrip), descrip);
                intent.putExtra(getResources().getString(R.string.pdcalendar),dia);
                intent.putExtra(getResources().getString(R.string.pmcalendar),mes);
                intent.putExtra(getResources().getString(R.string.pycalendar),ano);

                startActivity( intent);

            }
        });

    }
}
