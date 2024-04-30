package H_Arreglos;

import java.util.Scanner;

public class Q_EjemploArreglosAgreagarElementoAUnaPosicion {

    public static void main(String[] args) {

        int[] num = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        int n = num.length;
        int aux;


        int agregar=100;
        int posicion=6;

        //aux = num[n - 1];
        for (int j = n - 2; j >= posicion; j--) {
            num[j + 1] = num[j];//chanca el ultimo por el anterior
        }
        num[posicion] = agregar;


        for (int i : num) {
            System.out.println("i = " + i);
        }

    }
}
