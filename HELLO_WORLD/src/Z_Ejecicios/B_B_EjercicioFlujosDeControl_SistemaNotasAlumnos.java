package Z_Ejecicios;

import java.util.Scanner;

public class B_B_EjercicioFlujosDeControl_SistemaNotasAlumnos {
    public static void main(String[] args) {
        Scanner e=new Scanner(System.in);
        Double[] notas=new Double[20];
        int nnotas=notas.length;
        double contador1=0;
        double contador5=0;
        double contador4=0;
        double suma5=0;
        double suma4=0;

        System.out.println("Ingrese las notas de los "+nnotas+" alumnos en escala 1-7: ");
        for (int i = 0; i <nnotas ; i++) {
            System.out.print((i+1)+": ");
            notas[i]= e.nextDouble();
            if(notas[i]>5){
                contador5++;
                suma5+=notas[i];
            } else {
                contador4++;
                suma4+=notas[i];
                if (notas[i]==1){
                    contador1++;
                }
            }

        }
        double prom5=suma5/contador5;
        double prom4= suma4/contador4;
        double promTot=(suma4+suma5)/(contador5+contador4);
        System.out.println("------------------------------------------------------------------");
        System.out.println("El promedio de notas mayores a 5 es : "+prom5);
        System.out.println("El promedio de notas inferiores a 4 es : "+prom4);
        System.out.println("La cantidad de notas 1 es : "+contador1);
        System.out.println("El promedio Total es : "+promTot);
    }
}
