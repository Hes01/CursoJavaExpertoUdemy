package Z_Ejecicios;

import java.util.Scanner;

public class A_C_EjercicioCadenas_NombresDeFamiliares {
    public static void main(String[] args) {


        /*EXPLICACION DE COMO FUNCIONA*/

        /*
        * Se toma la segunda letra y se la convierte en mayuscula
        * Luego se le concatena el punto
        * Luego se le concatena las ultimas dos letras
        * Finalmente mostrar los nombres separados por un guion bajo
        * Ejm : N.es_A.ia_E.pe
        * */

        /*
        Andres
        n=N
        N+.=N.
        N.=N.+es
        N.es              */

        /*
        Maria
        a=A
        A+.=A.
        A. + ia=A.ia*/

        /*
        Pepe
        e=E
        E+.=E.
        E.+pe=E.pe*/

        //RESULTADO FINAL
        /*N.es_A.ia_E.pe*/



     /*   String a="Maria";
        String segunda ="";

        System.out.println("la segunda letra es : "+a.charAt(1));
        segunda= String.valueOf(a.charAt(1));
        System.out.println("los dos ultimos caracteres: "+a.substring(a.length()-2));
        System.out.println("convierte a mayuscula: "+segunda.toUpperCase().concat(".").concat(a.substring(a.length()-2)));

      */


        //solucion

        String nombre1="";
        String nombre2="";
        String nombre3="";
        String concatena="";
        String var="_";

        Scanner entrada=new Scanner(System.in);
        System.out.println("Ingrese el nombre1 = " );
        nombre1=entrada.nextLine();
        concatena+=String.valueOf(nombre1.charAt(1)).toUpperCase().concat(".").concat(nombre1.substring(nombre1.length()-2)).concat(var);


        System.out.println("Ingrese el nombre2 = " );
        nombre2=entrada.nextLine();
        concatena+=String.valueOf(nombre2.charAt(1)).toUpperCase().concat(".").concat(nombre2.substring(nombre2.length()-2)).concat(var);

        System.out.println("Ingrese el nombre3 = ");
        nombre3=entrada.nextLine();
        concatena+=String.valueOf(nombre3.charAt(1)).toUpperCase().concat(".").concat(nombre3.substring(nombre3.length()-2));

        System.out.println(concatena);





    }
}
