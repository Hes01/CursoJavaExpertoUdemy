package Z_Ejecicios;

import java.util.Scanner;

public class A_F_EjercicioOperadores_ObtenerNombreMasLargo {
    public static void main(String[] args) {
        //Objetivo : Obtener el nombre mas largo de tres personas
        /*String nombre="Guillermo Doe";
        String nombre2="Elvis Huanca";*/

        //Split divide la cadena en arreglo segun se indique cual es el caracter para dividir
        /*String[] arr=nombre.split(" ");
        String[] arr1=nombre2.split(" ");
        System.out.println(arr[0]);
        System.out.println(arr[1]);*/

        /*Solución*/

        String nombre1="hola";
        String nombre2="";
        String nombre3="";
        String[] arr1;
        String[] arr2;
        String[] arr3;
        Scanner scanner= new Scanner(System.in);

        System.out.println("Ingrese el nombre completo nombre1= ");
        nombre1=scanner.nextLine();
        arr1=nombre1.split(" ");

        System.out.println("Ingrese el nombre completo nombre2= ");
        nombre2=scanner.nextLine();
        arr2=nombre2.split(" ");

        System.out.println("Ingrese el nombre completo nombre3= ");
        nombre3=scanner.nextLine();
        arr3=nombre3.split(" ");

        String largo = "";

        largo= (arr1[0].length()>arr2[0].length()) ? ((arr1[0].length()>arr3[0].length())? arr1[0]+" "+arr1[1] : arr3[0]+" "+arr3[1]):  ((arr2[0].length()>arr3[0].length())? arr2[0]+" "+arr2[1] : arr3[0]+" "+arr3[1]);

        System.out.println("El nombre mas largo es : "+largo);





    }
}
