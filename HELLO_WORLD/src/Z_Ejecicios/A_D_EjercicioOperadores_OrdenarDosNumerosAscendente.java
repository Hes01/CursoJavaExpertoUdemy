package Z_Ejecicios;

import java.util.Scanner;

public class A_D_EjercicioOperadores_OrdenarDosNumerosAscendente {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int numero1 = 0;
        int numero2 = 0;
        int max = 0;
        int min = 0;

        System.out.println("ingrese el numero1 = " );
        numero1 = scanner.nextInt();
        System.out.println("ingrese el numero2 = " );
        numero2 = scanner.nextInt();

        max = (numero1 > numero2) ? numero1 : numero2;
        min = (numero1 < numero2) ? numero1 : numero2;

        System.out.println(" Números de mayor a menor: " + max + "-" + min);


    }
}
