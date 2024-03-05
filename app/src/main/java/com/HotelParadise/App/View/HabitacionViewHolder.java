package com.HotelParadise.App.View;

import android.view.View;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.HotelParadise.App.R;
import com.HotelParadise.App.View.HabitacionViewAdapter;


public class HabitacionViewHolder extends RecyclerView.ViewHolder {
    final HabitacionViewAdapter mAdapter;
    private TextView txIdHab;
    private TextView txEstado;
    private TextView txTipo;
    private TextView txCapacidad;
    public HabitacionViewHolder(View itemView, HabitacionViewAdapter adapter) {
        super(itemView);
        txIdHab = itemView.findViewById(R.id.txIdHab);
        txEstado = itemView.findViewById(R.id.txEstado);
        txTipo = itemView.findViewById(R.id.txTipo);
        txCapacidad = itemView.findViewById(R.id.txCapacidad);
        this.mAdapter = adapter;
    }
    public void setIdHab(String data) {
        txIdHab.setText(data);
    }
    public void setEstado(String data) {
        txEstado.setText(data);
    }
    public void setTipo(String data) {
        txTipo.setText(data);
    }
    public void setCapacidad(String data) {
        txCapacidad.setText(data);
    }
}

