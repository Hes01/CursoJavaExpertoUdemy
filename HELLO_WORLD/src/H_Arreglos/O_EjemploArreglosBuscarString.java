package H_Arreglos;

import java.util.Scanner;

public class O_EjemploArreglosBuscarString {

    public static void main(String[] args) {

        String[] a = new String[4];

        Scanner s= new Scanner(System.in);

        for (int i = 0; i < a.length; i++) {
            System.out.println("Ingrese un nombre:");
            a[i]=s.nextLine();
        }
        System.out.println("\r\nIngrese un nombre a buscar: ");
        String nombre=s.nextLine();
        int i = 0;
        for(;i< a.length && !a[i].equalsIgnoreCase(nombre);i++){}//que tenga elementos y que no exista sigue buscando
             
        if (i==a.length ){
            System.out.println("nombre no encontrado");
        }else if (a[i].toLowerCase().compareTo(nombre.toLowerCase())==0){//en ves de esto pongo el equalsIgnoreCase :/
            System.out.println("Encontrado en la posicion: "+i);
        }
    }
}
