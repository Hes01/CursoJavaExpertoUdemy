package H_Arreglos;

import java.util.Scanner;

public class P_EjemploArreglosDesplazarUnaPosicion {

    public static void main(String[] args) {

        int[] num={1,2,3,4,5,6,7,8,9,10};
        int n = num.length;
        int aux;
        for (int i = 0; i < 3; i++) {//numero de desplazamientos en este caso 3
            
            aux=num[n-1];


            /*          MI SOLUCIÓN
            for (int j = 1; j < n; j++) {
                num[n-j]=num[n-1-j];
            }*/
            for (int j = n-2; j >=0; j--) {
                num[j+1]=num[j];//chanca el ultimo por el anterior
            }
            num[0]=aux;
        }
        
        for(int i :num){
            System.out.println("i = " + i);
        }
        
    }
}
