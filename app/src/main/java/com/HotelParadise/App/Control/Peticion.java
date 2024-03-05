package com.HotelParadise.App.Control;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;


import com.HotelParadise.App.Control.MainController;

import java.io.IOException;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

/**
 * Clase Peticion
 *
 * Es utilizado por el controlador. El controlador le proporciona
 * los datos necesarios
 *
 * Se apoyará en OkHttp (librería cliente http/http2)
 *
 */
public class Peticion {
    //ESTADO
    //Clase utilidad que no necesita nada más que poner a funcionar la peticion HTTPs
    private static final String URL = "http://79.144.103.160:7777/HotelServlet/Servlet?peticion=";
    private String clienteOHabitacion;
    //COMPORTAMIENTO
    public Peticion(){

    }

    public void listar(String variable) { //Aqui es donde se le manda clientes o habitaciones
        //La clase para hacer peticion en internet
        OkHttpClient cliente = new OkHttpClient();
        this.clienteOHabitacion=variable;   //esto lo almacenamos para luego en el onresponse acceder a listarHabitaciones o listarClientes
        String urlFinal=URL+variable;

        //construimos la peticion
        Request peticion = new Request.Builder()
                .url(urlFinal)
                .get()
                .addHeader("cache-control", "no-cache")
                .build();


        //realizamos la llamada al server, pero en otro thread (con enqueue)
        Call llamada = cliente.newCall(peticion);
        llamada.enqueue(new Callback() {
            public void onResponse(Call call, Response respuestaServer)
                    throws IOException {
                //Got answer!!!!!
                String respuesta = respuestaServer.body().string();
                // Create a handler that associated with Looper of the main thread
                Handler manejador = new Handler(Looper.getMainLooper());
                // Send a task to the MessageQueue of the main thread
                manejador.post(new Runnable() {
                    @Override
                    public void run() {
                        // Code will be executed on the main thread
                        if(clienteOHabitacion.equals("clientes")){
                            Log.d("clienterecibido", respuesta);
                            MainController.getSingleton().parsearListadoClientes(respuesta);
                        } else {
                            MainController.getSingleton().parsearListadoHabitaciones(respuesta);
                        }
                    }
                });
            }

            public void onFailure(Call call, IOException e) {
                String respuesta = e.getMessage();
                e.printStackTrace();
                Handler manejador = new Handler(Looper.getMainLooper());

                // Send a task to the MessageQueue of the main thread
                manejador.post(new Runnable() {
                    @Override
                    public void run() {
                        // Code will be executed on the main thread

                        MainController.getSingleton().setError(respuesta);
                    }
                });
            }
        });





    }

}

