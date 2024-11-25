package org.aguzman.app.hogar;

import java.util.PropertyResourceBundle;

public class Persona {
    private String nombre;
    private String apellido;
    private ColorPelo color;

    public static final String GERENERO_MACULINO="Masculino";
    public static  final String GENERO_FEMENINO="Femenino";

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public  String lanzarPelota(){
        return "lanzar la pelota!";
    }

    public static String saludar(){
        return "hola que tal !";
    }

    public ColorPelo getColorPelo() {
        return color;
    }

    public void setColorPelo(ColorPelo color) {
        this.color = color;
    }
}
