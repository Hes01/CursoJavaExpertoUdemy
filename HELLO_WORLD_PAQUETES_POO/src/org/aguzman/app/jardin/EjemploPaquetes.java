package org.aguzman.app.jardin;



//import org.aguzman.app.hogar.Persona; importar clase a clase
import org.aguzman.app.hogar.*; //importar todo de ese paquete


import static org.aguzman.app.hogar.Persona.*;//todo lo de la clase persona

import  static  org.aguzman.app.hogar.ColorPelo.*;



public class EjemploPaquetes {
    public static void main(String[] args) {

        Persona persona = new Persona();
        Gato gato = new Gato();

        persona.setNombre("elvis");
        persona.setApellido("ramirez");
        System.out.println(persona.getNombre()+" "+persona.getApellido());

        Perro perro = new Perro();
        perro.nombre="tobby";
        perro.raza="buldog";

        String jugando = perro.jugar(persona);//relacion de dependencia

        System.out.println("jugando = "+jugando);

        String saludo = saludar();
        System.out.println(saludo);
        System.out.println(GERENERO_MACULINO);

        persona.setColorPelo(CAFE);//ColorPelo.CAFE
        System.out.println(persona.getColorPelo().toString());


    }
}

