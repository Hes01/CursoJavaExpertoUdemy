package Z_Ejecicios;

import java.util.Scanner;

public class B_D_EjercicioFlujosDeControl_MenuIterativo {
    public static void main(String[] args) {

        Scanner e=new Scanner(System.in);
        int opcion,salir=3;
        do{
            System.out.println("seleccione opcion:");
            System.out.println("Opcion 1: Sonreir");
            System.out.println("Opcion 2: Llorar xd");
            System.out.println("Opcion 0:  salir");
            System.out.println(": ");

            opcion = e.nextInt();
            switch (opcion){
                case 1:
                    System.out.println("sonreir");
                    break;
                case 2:
                    System.out.println("llorar");
                    break;
                case 0:
                    salir=opcion;
                case 3:
                    break;
                default:
                    System.out.println("Opcion no reconocida!");
            }

            if (opcion!=0){
                System.out.println("Desea continuar? 3:si;0:no");
                salir = e.nextInt();
            }
            if (salir==0){
                System.out.println("HASTA LUEGO...");
            }


        }while(salir !=0);


    }
}
