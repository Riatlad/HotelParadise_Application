package com.HotelParadise.App.Control;

import com.HotelParadise.App.Model.Cliente;
import com.HotelParadise.App.Model.Habitacion;
import com.HotelParadise.App.View.MainActivity;
import com.HotelParadise.App.Model.Respuesta;
import com.HotelParadise.App.View.VistaClienteActivity;
import com.HotelParadise.App.View.VistaHabitacionActivity;

import java.util.ArrayList;

public class MainController {
    private static MainController mySingleController;
    private Respuesta respuesta;
    private Peticion peticion;
    private ArrayList<Cliente> listadoClientes;
    private ArrayList<Habitacion> listadoHabitaciones;
    private static MainActivity activeActivity;
    private VistaHabitacionActivity vistaHabitacion;
    private VistaClienteActivity vistaCliente;
    private MainController() {
        respuesta = new Respuesta();
        peticion = new Peticion();
    }


    public static MainController getSingleton() {
        if (MainController.mySingleController == null) {
            mySingleController = new MainController();
        }
        return mySingleController;
    }
    public void obtenerClientes(VistaClienteActivity vistaClienteActivity) {
        this.vistaCliente=vistaClienteActivity;
        peticion.listar("clientes");
    }
    public void parsearListadoClientes(String datos) {
        listadoClientes = respuesta.parsearClientes(datos);
        vistaCliente.cargarDatos(listadoClientes);
    }

    public ArrayList<Cliente> getListadoClientes() {
        return listadoClientes;
    }

    public ArrayList<Habitacion> getListadoHabitaciones() {
        return listadoHabitaciones;
    }

    public void obtenerHabitaciones() {
        peticion.listar("habitaciones");
    }
    public void parsearListadoHabitaciones(String datos) {
        listadoHabitaciones = respuesta.parsearHabitaciones(datos);
        vistaHabitacion.cargarDatos(listadoHabitaciones);
    }

    public void setError(String respuesta) {
        System.out.println(respuesta);
    }
}


