package org.aguzman.app.hogar;


public class EjemploHogar {
    public static void main(String[] args) {
        Persona p = new Persona();
        p.setNombre("jose");
        p.setApellido("ramires");
        System.out.println(p.getNombre()+" "+p.getApellido());


        Gato gato = new Gato();
        System.out.println(gato.jugar(p));


        System.out.println(Persona.saludar());
    }
}
