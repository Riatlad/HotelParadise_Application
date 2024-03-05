package com.HotelParadise.App.Model;

import com.HotelParadise.App.Model.Cliente;
import com.HotelParadise.App.Model.Habitacion;

import java.util.ArrayList;

public class Hotel {
    private ArrayList<Cliente> listaClientes;
    private ArrayList<Habitacion> listaHabitaciones;

    public Hotel() {
        this.listaClientes = new ArrayList<>();
        this.listaHabitaciones = new ArrayList<>();
    }

    public ArrayList<Cliente> getListaClientes() {
        return listaClientes;
    }

    public ArrayList<Habitacion> getListaHabitaciones() {
        return listaHabitaciones;
    }


}
