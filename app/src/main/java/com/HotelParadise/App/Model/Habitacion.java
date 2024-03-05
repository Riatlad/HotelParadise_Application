package com.HotelParadise.App.Model;

public class Habitacion {
    private String idHab;
    private String tipo;
    private String estado;
    private String capacidad;

    public Habitacion(String idHab, String tipo, String estado, String capacidad) {
        this.idHab = idHab;
        this.tipo = tipo;
        this.estado=estado;
        this.capacidad=capacidad;
    }

    public String getIdHab() {
        return idHab;
    }


    public String getTipo() {
        return tipo;
    }

    public String getEstado() {
        return estado;
    }

    public String getCapacidad() {
        return capacidad;
    }
}