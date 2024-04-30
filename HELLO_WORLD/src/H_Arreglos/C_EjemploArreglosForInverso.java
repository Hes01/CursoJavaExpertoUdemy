package H_Arreglos;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Random;

public class C_EjemploArreglosForInverso {
    //cuando los arreglos son del tipo primitivo entonces tienen 0 en el valor de inicio la mayoria
    //cuando los arreglos son del tipo referencia entonces tienen null en el valor de inicio

    public  static void arregloInverso(String[] arr){
        int total = arr.length-1;
        int total2=arr.length;
        System.out.println("--------------------------");
        for (int i = 0; i <total2 ; i++) {
            String actual=arr[i];
            String inverso=arr[total-i];
            arr[i]=inverso;
            arr[total-i]=actual;
            total2--;
        }
    }

    public static void main(String[] args) {

        String[] productos = new String[7];
        int total = productos.length;


        productos[0] = "leche";
        productos[1] = "atun";
        productos[2] = "ajinomoto";
        productos[3] = "arroz";
        productos[4] = "bicicleta";
        productos[5] = "disco";
        productos[6] = "computadora";

        //Arrays.sort(productos);//para ordenar implicita(api java)
        //arregloInverso(productos);//para inversa explicita(por nosotros)
        Collections.reverse(Arrays.asList(productos));//convierte arreglo a list, para hacer reverse(api java)
        for (int j = 0; j <total ; j++) {
            System.out.println(productos[j]);
        }


    }
}
