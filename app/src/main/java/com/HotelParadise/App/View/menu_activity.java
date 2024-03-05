package com.HotelParadise.App.View;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.HotelParadise.App.R;

public class menu_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_activity);

        Button btnListarClientes = findViewById(R.id.btnListarClientes);
        Button btnListarHabitaciones = findViewById(R.id.btnListarHabitaciones);

        btnListarClientes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(menu_activity.this, VistaClienteActivity.class);
                startActivity(intent);
            }
        });

        btnListarHabitaciones.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(menu_activity.this, VistaHabitacionActivity.class);
                startActivity(intent);
            }
        });
    }
}
