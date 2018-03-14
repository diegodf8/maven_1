package com.cice.maven1;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        Usuario usuario = new Usuario("diego@gmail.com","diego");
        String Json = new GsonBuilder().setPrettyPrinting().create().toJson(usuario);
        System.out.println(Json);
        Usuario usuario2 = new Gson().fromJson(Json,Usuario.class);
        System.out.println("Segundo objeto: " + usuario2.getEmail());


    }
}
