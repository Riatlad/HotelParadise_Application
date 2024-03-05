package com.HotelParadise.App.View;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.HotelParadise.App.Model.Habitacion;
import com.HotelParadise.App.R;

import java.util.LinkedList;

public class HabitacionViewAdapter extends RecyclerView.Adapter<HabitacionViewHolder> {

    private final LinkedList<Habitacion> mList;
    private LayoutInflater mInflater;

    public HabitacionViewAdapter(Context context, LinkedList<Habitacion> list) {
        mInflater = LayoutInflater.from(context);
        this.mList = list;
    }


    @NonNull
    @Override
    public HabitacionViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View mItemView = mInflater.inflate(R.layout.habitacion_items,
                parent, false);
        return new HabitacionViewHolder(mItemView, this);
    }

    @Override
    public void onBindViewHolder(@NonNull HabitacionViewHolder holder, int position) {
        holder.setIdHab(this.mList.get(position).getIdHab());
        holder.setEstado(this.mList.get(position).getEstado());
        holder.setTipo(this.mList.get(position).getTipo());
        holder.setCapacidad(this.mList.get(position).getCapacidad());
    }



    @Override
    public int getItemCount() {
        return mList.size();
    }

}
