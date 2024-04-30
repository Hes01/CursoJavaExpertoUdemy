package Z_Ejecicios;

import java.util.Scanner;

public class E_A_Ejercicio_AreaCirculo {
    //formula : area=PI*r^2(CONSTANTE PI MULTIPLICADO POR EL RADIO AL CUADRADO
    public static void main(String[] args) {
        Scanner intput=new Scanner(System.in);
        float radio=0.0f;
        float area=0.0f;
        System.out.println("Ingrese el radio del Circulo: ");
        radio=intput.nextFloat();
        area= (float) (Math.PI*Math.pow(radio,2));
        System.out.println("el area es= " + area);
    }
}
