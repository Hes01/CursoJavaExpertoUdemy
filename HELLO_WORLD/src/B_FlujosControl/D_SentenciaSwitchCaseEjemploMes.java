package B_FlujosControl;

import java.util.Scanner;

public class D_SentenciaSwitchCaseEjemploMes {
    public static void main(String[] args) {
        //ejm1

        Scanner s = new Scanner(System.in);
        System.out.println("ingres el numero del mes entre 1 y 12: ");
        int mes=s.nextInt();
        String nombreMes=null;
        switch(mes)
        {
            case 1:
                nombreMes="enero";
                break;
            case 2:
                nombreMes="febrero";
                break;
            case 3:
                nombreMes="marzo";
                break;
            case 4:
                nombreMes="abril";
            case 5:
                nombreMes="mayo";
                break;
            case 6:
                nombreMes="junio";
                break;
            case 7:
                nombreMes="julio";
                break;
            case 8:
                nombreMes="agosto";
                break;
            case 9:
                nombreMes="setiembre";
                break;
            case 10:
                nombreMes="octubre";
                break;
            case 11:
                nombreMes="noviembre";
            case 12:
                nombreMes="diciembre";
                break;
            default:
                System.out.println("no se reconoce mes!");
        }
        System.out.println("nombreMes = " + nombreMes);




        char num=1;
        switch(num)
        {
            case 0:
                System.out.println("0 = " + 0);
                break;
            case 1:
                System.out.println("1 = " + 1);
                break;
            case 2:
                System.out.println("2 = " + 2);
                break;
            case 3:
                System.out.println("3 = " + 3);
                break;
            default:
                System.out.println("no se encontro valor");
        }
        //ejm2
        String nombre="juan";
        switch (nombre)
        {
            case "admin":
                System.out.println("hola admin, bienvenido");
                break;
            case "andres":
                System.out.println("hola andres");
                break;
            case "pepe":
                System.out.println("hola pepe");
                break;
            default:
                System.out.println("usuario desconocido");
        }
    }
}
