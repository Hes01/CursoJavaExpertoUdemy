package B_FlujosControl;

import java.util.Scanner;

public class E_SentenciaSwitchCaseEjemploNumeroDiasMes {
    public static void main(String[] args) {


        Scanner s= new Scanner(System.in);
        System.out.println("ingrese el numero de mes de 1 a 12: ");
        int mes=s.nextInt();
        int numeroDias=0;

        System.out.println("ingrese el año (yyyy): ");
        int anio= s.nextInt();
        //determinar si tiene 30 o 31 dias
        switch(mes)
        {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                numeroDias=31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                numeroDias=30;
                break;
            case 2:
                if (anio % 400==0 || ( (anio%4==0) && ! (anio%100==0) ))
                {
                    numeroDias=29;
                }else{
                    numeroDias=28;
                }
                break;


        }

        String decir = (numeroDias==29)? "año bisiesto":"año normal";
        System.out.println("El año " + anio+" tiene "+numeroDias+" y es "+decir);


    }
}
