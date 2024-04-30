package Z_Ejecicios;

import java.util.Scanner;

public class H_A_EjercicioArreglos_OrdenarArregloUltimoPrimero {
    public static void main(String[] args) {

        int[]  arr= {6,5,4,1,2,10,3,8,7,9};
        int total= arr.length;
        for (int i = 0; i <total-1 ; i++) {
            for (int j = 0; j <total-i-1 ; j++) {
                if (arr[j]>arr[j+1]){
                    int aux = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=aux;
                }
            }
        }
        for(int i: arr){
            System.out.print(" " + i+" ");
        }
        System.out.println();
        total=total/2;
        int n=arr.length-1;
        int j=0;
        int[] arr1= new int[10];
        for (int i = 0; i <total ; i++) {
            arr1[j++]=arr[n-i];
            arr1[j++]=arr[i];
        }
        for(int i: arr1){
            System.out.print(" " + i+" ");
        }


    }
}
