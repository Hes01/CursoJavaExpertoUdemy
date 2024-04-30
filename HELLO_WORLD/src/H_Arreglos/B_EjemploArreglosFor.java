package H_Arreglos;

import java.util.Arrays;
import java.util.Random;

public class B_EjemploArreglosFor {
    //cuando los arreglos son del tipo primitivo entonces tienen 0 en el valor de inicio la mayoria
    //cuando los arreglos son del tipo referencia entonces tienen null en el valor de inicio
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
        Arrays.sort(productos);//para ordenar

        /*for (int i = 0; i < total; i++) {
            System.out.println("Para indice " + i + " : " + productos[i]);
        }*/

        for(String a :productos){
            System.out.println(a);
        }

        int i=0;
        int n=productos.length;
        while (i<n){
            System.out.println("Para indice " + i + " : " + productos[i]);
            i++;
        }
        System.out.println("--------------------------------------------------------");
        i=0;
        do{
            System.out.println("Para indice " + i + " : " + productos[i]);
            i++;
        }while(i<n);
        System.out.println("--------------------------------------------------------");

        int[] numeros=new int[10];
        Random random=new Random();
        for (int j = 0; j <n ; j++) {
            numeros[j]=random.nextInt(10+1);
            System.out.println("Para indice " + j + " : " + numeros[j]);
        }

    }
}
