package Z_Ejecicios;

import java.util.Scanner;

public class B_C_EjercicioFlujosDeControl_Multiplicar2NumerosSinSimboloProducto {
    public static void main(String[] args) {

        Scanner e=new Scanner(System.in);
        System.out.println("Ingrese el n1 positivo o negativos: ");
        int n1=e.nextInt();
        System.out.println("Ingrese el n2 positivo o negativos: ");
        int n2=e.nextInt();
        int ini;
        int c;
        if (n2 <0){
             ini=n2;
             c=0;
            n1=-n1;

        }else {
            ini=0;
            c=n2;

        }

        int sum=0;

        for (int i = ini; i <c ; i++) {
            sum+=n1;
        }
        System.out.println("La multiplicación es : "+sum);


    }
}
