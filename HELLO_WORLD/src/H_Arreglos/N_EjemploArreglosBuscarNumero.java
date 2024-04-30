package H_Arreglos;

import java.util.Scanner;

public class N_EjemploArreglosBuscarNumero {

    public static void main(String[] args) {

        int[] a = new int[10];

        Scanner s= new Scanner(System.in);

        for (int i = 0; i < a.length; i++) {

            System.out.println("Ingrese un número:");
            a[i]=s.nextInt();
        }
        System.out.println("\r\nIngrese un número a buscar: ");
        int num=s.nextInt();
        int i = 0;
        for(;i< a.length && a[i]!=num;i++){}//que tenga elementos y que no exista sigue buscando

        if (i==a.length ){
            System.out.println("número no encontrado");
        }else if (a[i]==num){
            System.out.println("Encontrado en la posicion: "+i);
        }
    }
}
