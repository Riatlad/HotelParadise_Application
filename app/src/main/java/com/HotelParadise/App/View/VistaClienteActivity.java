package com.HotelParadise.App.View;

import android.app.Activity;
import android.os.Bundle;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.HotelParadise.App.Control.MainController;
import com.HotelParadise.App.Model.Cliente;
import com.HotelParadise.App.R;

import java.util.ArrayList;
import java.util.LinkedList;

public class VistaClienteActivity extends Activity {

    private RecyclerView listaClientes;
    private ClienteViewAdapter miAdapter;

    LinkedList<Cliente> mList=new LinkedList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.vista_cliente_activity);

        listaClientes = findViewById(R.id.listaClientes);
        miAdapter = new ClienteViewAdapter(this, mList);

        listaClientes.setAdapter(miAdapter);

        listaClientes.setLayoutManager(new LinearLayoutManager(this));
        MainController.getSingleton().obtenerClientes(this);
    }

    public void cargarDatos(ArrayList<Cliente> clientes) {
        mList.clear();
        for (Cliente item : clientes) {
            mList.add(item);
        }
        miAdapter.notifyDataSetChanged();
    }
}
