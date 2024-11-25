package org.aguzman.app.jardin;

import org.aguzman.app.hogar.Persona;

public class Perro {
    protected   String nombre;
    public String raza;

    String jugar(Persona persona){
        return persona.lanzarPelota();
    }


}


//protected: mmismo paquete y herencia
//public : todos los paquetes
//default : para el mismo paquete
//private : dentro de la misma clase
