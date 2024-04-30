package B_FlujosControl;

import java.util.Scanner;

public class B_SentenciaIfElseNumDiasMes {
    public static void main(String[] args) {

        Scanner s= new Scanner(System.in);
        System.out.println("ingrese el numero de mes de 1 a 12: ");
        int mes=s.nextInt();
        int numeroDias=0;

        System.out.println("ingrese el año (yyyy): ");
        int anio= s.nextInt();
        //determinar si tiene 30 o 31 dias
        if (mes==1 || mes == 3 || mes==5 ||mes ==7||mes ==8||mes==10||mes ==12) //31 dias
        {
            numeroDias=31;
        } else if (mes==4 || mes==6 || mes==9 || mes ==11)
        {
            numeroDias=30;
        } else if (mes==2)//febrero puede ser bisiesto
        {
            if (anio % 400==0 || ( (anio%4==0) && ! (anio%100==0) ))
            {
                numeroDias=29;
            }else{
                numeroDias=28;
            }
        }

        String decir = (numeroDias==29)? "año bisiesto":"año normal";
        System.out.println("El año " + anio+" tiene "+numeroDias+" y es "+decir);
    }
}
