package com.HotelParadise.App.View;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.HotelParadise.App.Model.Cliente;
import com.HotelParadise.App.R;

import java.util.LinkedList;

public class ClienteViewAdapter extends RecyclerView.Adapter<ClienteViewHolder> {

    private final LinkedList<Cliente> mList;
    private LayoutInflater mInflater;

    public ClienteViewAdapter(Context context,
                              LinkedList<Cliente> list) {
        mInflater = LayoutInflater.from(context);
        this.mList = list;
    }


    @NonNull
    @Override
    public ClienteViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View mItemView = mInflater.inflate(R.layout.cliente_items,
                parent, false);
        return new ClienteViewHolder(mItemView, this);
    }

    @Override
    public void onBindViewHolder(@NonNull ClienteViewHolder holder, int position) {
        holder.setNombre(this.mList.get(position).getNombre());
        holder.setApellido(this.mList.get(position).getApellidos());
        holder.setCorreo(this.mList.get(position).getEmail());
        holder.setTelefono(this.mList.get(position).getTelefono());
        holder.setDni(this.mList.get(position).getDni());
    }



    @Override
    public int getItemCount() {
        return mList.size();
    }

}

