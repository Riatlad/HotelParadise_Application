package com.HotelParadise.App.Model;

import com.HotelParadise.App.Model.Cliente;
import com.HotelParadise.App.Model.Habitacion;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;

import java.util.ArrayList;

public class Respuesta {


    public ArrayList<Cliente> parsearClientes(String json) {

        ArrayList<Cliente> dataCliente = new ArrayList<>();

        JsonArray jsonArray = JsonParser.parseString(json).getAsJsonArray();

        for (int i = 0; i < jsonArray.size(); i++) {
            JsonElement cliente = jsonArray.get(i);
            dataCliente.add(new Cliente(
                    cliente.getAsJsonObject().get("nombre").getAsString(),
                    cliente.getAsJsonObject().get("apellidos").getAsString(),
                    cliente.getAsJsonObject().get("email").getAsString(),
                    cliente.getAsJsonObject().get("telefono").getAsString(),
                    cliente.getAsJsonObject().get("DNI").getAsString(),
                    cliente.getAsJsonObject().get("numTarjetaCredito").getAsString()
            ));
        }

        return dataCliente;
    }

    public ArrayList<Habitacion> parsearHabitaciones(String json) {

        ArrayList<Habitacion> dataHabitacion = new ArrayList<>();

        JsonArray jsonArray = JsonParser.parseString(json).getAsJsonArray();

        for (int i = 0; i < jsonArray.size(); i++) {
            JsonElement habitacion = jsonArray.get(i);
            dataHabitacion.add(new Habitacion(
                    habitacion.getAsJsonObject().get("idHabitacion").getAsString(),
                    habitacion.getAsJsonObject().get("tipoHabitacion").getAsString(),
                    habitacion.getAsJsonObject().get("disponibilidad").getAsString(),
                    habitacion.getAsJsonObject().get("capacidadMaxima").getAsString()
            ));
        }

        return dataHabitacion;
    }
}
