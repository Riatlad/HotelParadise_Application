package com.HotelParadise.App.View;

import android.app.Activity;
import android.os.Bundle;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.HotelParadise.App.Control.MainController;
import com.HotelParadise.App.Model.Habitacion;
import com.HotelParadise.App.R;

import java.util.ArrayList;
import java.util.LinkedList;

public class VistaHabitacionActivity extends Activity {

    private RecyclerView listaHabitaciones;
    private HabitacionViewAdapter miAdapter;
    LinkedList<Habitacion> mList=new LinkedList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.vista_habitacion_activity);

        listaHabitaciones = findViewById(R.id.listaHabitaciones);

        miAdapter = new HabitacionViewAdapter(this, mList);

        listaHabitaciones.setAdapter(miAdapter);

        listaHabitaciones.setLayoutManager(new LinearLayoutManager(this));
        MainController.getSingleton().obtenerHabitaciones();
    }

    public void cargarDatos(ArrayList<Habitacion> habitaciones) {
        mList.clear();
        for (Habitacion item : habitaciones) {
            mList.add(item);
        }
        miAdapter.notifyDataSetChanged();
    }
}
