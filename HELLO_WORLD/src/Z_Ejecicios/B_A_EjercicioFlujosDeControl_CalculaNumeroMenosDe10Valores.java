package Z_Ejecicios;

import java.util.Scanner;

public class B_A_EjercicioFlujosDeControl_CalculaNumeroMenosDe10Valores {
    public static void main(String[] args) {
        Scanner e=new Scanner(System.in);
        int[]  arr=new int[10];
        int arrmax= arr.length;
        System.out.println("Ingrese los "+(arrmax)+" valores enteros: ");
        for (int i = 0; i <arrmax ; i++) {
            System.out.print((i+1)+": ");
            arr[i]= e.nextInt();
        }

        int menor =arr[0];
        for (int i = 1; i < arr.length ; i++) {
            if (menor>arr[i]){
                menor=arr[i];
            }
        }
        if ((menor<10)? true:false)
        {
            System.out.println("El número es menor que 10!");
        }else
        {
            System.out.println("El número menor es igual o mayor que 10!");
        }
    }
}
