package Z_Ejecicios;

import java.util.Scanner;

public class A_E_EjercicioOperadores_SistemaEstanqueGasolina {
    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);
        double medida=0.0d;
        String estado="";
        System.out.println("\n--------------SISTEMA DE GASOLINA--------------");
        System.out.println("Ingrese la medida actual en litros : ");
        medida= scanner.nextDouble();
        /*

        nota:descomente uno de las dos formas para probar con
            ctl+shift+/ : para comentar  o descomentar */   /**/   /*
             y
            ctrl + /: para comentar o descomentar //

        */


        /*CON OPERADORES TERNARIOS*/

        //estado=(medida==70)? "Estanque lleno":((medida >=60 && medida<70)? "Estanque casi lleno":((medida >=40 && medida<60)? "Estanque 3/4":((medida >=35 && medida<40)? "Medio tanque":((medida >=20 && medida<35)? "Suficiente":((medida >=1 && medida<20)? "Insuficiente":"Error!")))));



        /*CON IF ANIDADO*/

        /*if(medida==70){
            estado="Estanque lleno";
        }else if(medida >=60){
            estado="Estanque casi lleno";
        }else if(medida >=40){
            estado="Estanque 3/4";
        }else if(medida >=35){
            estado = "Medio Estanque";
        }else if(medida >=20){
            estado="Sufiente";
        }else if(medida >=1){
            estado="Insuficiente";
        }*/


        System.out.println(estado);

    }
}
