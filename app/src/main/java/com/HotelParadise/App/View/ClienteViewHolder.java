package com.HotelParadise.App.View;

import android.view.View;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.HotelParadise.App.R;
import com.HotelParadise.App.View.ClienteViewAdapter;


public class ClienteViewHolder extends RecyclerView.ViewHolder {

    //ESTADO

    //TODO: declare attributes to hold two textviews, day and money
    final ClienteViewAdapter mAdapter;
    private TextView txNombre;
    private TextView txApellido;
    private TextView txCorreo;
    private TextView txTelefono;
    private TextView txDni;


    //COMPORTAMIENTO
    public ClienteViewHolder(View itemView, ClienteViewAdapter adapter) {
        super(itemView);
        txNombre = itemView.findViewById(R.id.txIdHab);
        txApellido = itemView.findViewById(R.id.txEstado);
        txCorreo = itemView.findViewById(R.id.txTipo);
        txTelefono = itemView.findViewById(R.id.txCapacidad);
        txDni = itemView.findViewById(R.id.txDni);
        this.mAdapter = adapter;
    }

    public void setNombre(String data) {
        txNombre.setText(data);
    }
    public void setApellido(String data) {
        txApellido.setText(data);
    }
    public void setCorreo(String data) {
        txCorreo.setText(data);
    }
    public void setTelefono(String data) {
        txTelefono.setText(data);
    }
    public void setDni(String data) {
        txDni.setText(data);
    }
}
