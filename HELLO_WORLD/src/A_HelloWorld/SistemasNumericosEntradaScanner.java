package A_HelloWorld;

import java.util.Scanner;

public class SistemasNumericosEntradaScanner {
    public static void main(String[] args) {
        System.out.println();

        String mensaje="";
        Scanner scanner = new Scanner(System.in);//in:entrada por el terminal
        System.out.println("ingrese un número entero: ");
        //DECIMAL
        int numeroDecimal=0;
        //String numeroStr=scanner.nextLine();//obtenemos un string
        try {//tratar de ejecutar codigo
            numeroDecimal= scanner.nextInt();//Integer.parseInt(numeroStr);//convertir de string a int
        }catch (Exception e) {//NumberFormatException e
            System.out.println("Error debe ingresar numero entero");
            main(args);//invocamos al main de nuevo :O
            System.exit(0);//para salir xd sino no salia se forma bucle sino se pone
        }
        System.out.println("numeroDecimal = " + numeroDecimal);

        System.out.println();
        //BINARIO
        mensaje=("numero binario de " + numeroDecimal+" = " +Integer.toBinaryString(numeroDecimal)+"\n");
        //OCTAL
        mensaje +=("numero octal de " + numeroDecimal+" = " +Integer.toOctalString(numeroDecimal)+"\n");
        System.out.println();
        //HEXADECIMAL
        mensaje +=("numero hexadecimal de "+numeroDecimal+"="+Integer.toHexString(numeroDecimal)+"\n");
        System.out.println(mensaje);
    }
}
