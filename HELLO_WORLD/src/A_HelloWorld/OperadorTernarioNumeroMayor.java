package A_HelloWorld;

import java.util.Scanner;

public class OperadorTernarioNumeroMayor {
    public static void main(String[] args) {

        int max=0;
        Scanner scanner= new Scanner(System.in);

        System.out.print("ingrese un número : ");
        int num1 = scanner.nextInt();

        System.out.print("ingrese un segundo número : ");
        int num2 = scanner.nextInt();

        System.out.print("ingrese un tercer número : ");
        int num3 = scanner.nextInt();

        System.out.print("ingrese un cuarto número : ");
        int num4 = scanner.nextInt();

        max=(num1>num2)? num1:num2;
        max=(max>num3)? max:num3;
        max=(max>num4)? max:num4;
        System.out.println("el número max es = " + max);
    }
}
