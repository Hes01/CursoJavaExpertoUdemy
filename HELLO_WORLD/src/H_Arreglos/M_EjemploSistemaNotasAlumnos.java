 package H_Arreglos;

 import java.sql.SQLOutput;
 import java.util.Scanner;

 public class M_EjemploSistemaNotasAlumnos {
    
    public static void main(String[] args) {

        double[] claseMatermaticas,claseHistoria,claseLenguaje;

        double sumNotasMatematicas=0,sumNotasHistoria=0,sumNotasLenguaje=0;
        claseMatermaticas= new double[7];//7alumnos
        claseHistoria= new double[7];
        claseLenguaje= new double[7];

        Scanner  s= new Scanner(System.in)  ;
        System.out.println("ingrese 7 notas de estudiantes de matematicas: ");
        for (int i = 0; i < claseMatermaticas.length; i++) {
            claseMatermaticas[i]=s.nextDouble();
        }

        System.out.println("ingrese 7 notas de estudiantes de Historia:");
        for (int i = 0; i < claseHistoria.length; i++) {
            claseHistoria[i]=s.nextDouble();
        }

        System.out.println("ingrese 7 notas de estudiantes de lenguaje: ");
        for (int i = 0; i < claseLenguaje.length; i++) {
            claseLenguaje[i]=s.nextDouble();
        }

        for (int i = 0; i < 7; i++) {
            sumNotasMatematicas+=claseMatermaticas[i];
            sumNotasHistoria+=claseHistoria[i];
            sumNotasLenguaje+=claseLenguaje[i];
        }

        double promedioMatematicas=(sumNotasMatematicas/claseMatermaticas.length);
        double promedioHistoria=(sumNotasHistoria/claseHistoria.length);
        double promedioLenguaje= (sumNotasLenguaje/claseLenguaje.length);
        System.out.println("promedio clase matematicas: "+ promedioMatematicas);
        System.out.println("promedio clase historia: "+promedioHistoria);
        System.out.println("promedio clase lenguaje: "+promedioLenguaje);
        System.out.println("promedio total del curso: "+(promedioMatematicas+promedioHistoria+promedioLenguaje)/3);

        System.out.println("ingrese el identificador del alumno( de 0 - 6):");
        int id=s.nextInt();
        double promedioAlumno=(claseHistoria[id]+claseLenguaje[id]+claseMatermaticas[id])/3;
        System.out.println("Promedio alumno nro "+id+" : "+promedioAlumno);
    }
}
