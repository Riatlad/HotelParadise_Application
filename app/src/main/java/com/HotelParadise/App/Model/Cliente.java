package com.HotelParadise.App.Model;

public class Cliente {
    private String dni;
    private String nombre;
    private String apellidos;
    private String email;
    private String telefono;
    private String numTarjeta;

    public Cliente(String dni, String nombre, String apellidos, String email, String telefono, String numTarjeta) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.email = email;
        this.telefono = telefono;
        this.numTarjeta = numTarjeta;
    }


    public String getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getEmail() {
        return email;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getNumTarjeta() {
        return numTarjeta;
    }

    /*
    public static void JunitCliente() {

        Cliente cliente = new Cliente("123456789", "Juan", "Perez", "juan@example.com", "123456789", "1234-5678-9101-1121");

        String dni = cliente.getDni();
        String nombre = cliente.getNombre();
        String apellidos = cliente.getApellidos();
        String email = cliente.getEmail();
        String telefono = cliente.getTelefono();
        String numTarjeta = cliente.getNumTarjeta();

        assertNotNull(cliente);
        assertEquals("123456789J", dni);
        assertEquals("Juan", nombre);
        assertEquals("Perez", apellidos);
        assertEquals("juan@gmail.com", email);
        assertEquals("123456789", telefono);
        assertEquals("1234-5678-9101-2345", numTarjeta);
    } */
}
