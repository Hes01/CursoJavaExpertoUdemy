package H_Arreglos;

import java.util.Arrays;

public class A_EjemploArreglos {
    public static void main(String[] args) {

        String[] productos = new String[7];
        productos[0] = "leche";
        productos[1] = "atun";
        productos[2] = "ajinomoto";
        productos[3] = "arroz";
        productos[4] = "bicicleta";
        productos[5] = "disco";
        productos[6] = "computadora";

        Arrays.sort(productos);//para ordenar

        int[] numeros = {1, 2, 3, Integer.valueOf("5")};
        for (String a : productos) {
            System.out.println(a);
        }
    }
}
