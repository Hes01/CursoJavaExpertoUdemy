package A_HelloWorld;

import java.util.Scanner;

public class OperadorTernario {
    public static void main(String[] args) {

        //formado por 3 elementos donde el primero evalua operacion booleana
        //es como version abreviada del if-else
        //siempre devuelve un valor

        /*String variable=condicion? si es verdadero: si es falso;*/
        String variable= 5==7 ?"si es verdadero":"si es falso";
        System.out.println("variable = " + variable);


        String estado ="";
        double promedio=6.2;
        double matematicas=0.0;
        double ciencias=0.0;
        double historia =0.0;

        Scanner scanner= new Scanner(System.in);

        System.out.println("ingrese la nota de matematicas en escala de 2.0 y 7.0:"   );
        matematicas=scanner.nextDouble();
        System.out.println("ingrese la nota de ciencias en escala de 2.0 y 7.0:"   );
        ciencias=scanner.nextDouble();
        System.out.println("ingrese la nota de historia en escala de 2.0 y 7.0:"   );
        historia=scanner.nextDouble();
        promedio =(matematicas+ciencias+historia)/3;

        System.out.println("promedio = " + promedio );


        estado=(promedio>=5.49)?"aprobado":"rechazado";
        System.out.println("estado = " + estado);

        /*if(promedio>=5.49){
            System.out.println("aprobado" );;
        }else {
            System.out.println("rechazado");
        }*/

    }
}
