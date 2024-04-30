package A_HelloWorld;

public class EjemploStringValidar {
    public static void main(String[] args) {
        String curso=null;
        boolean esNulo=curso ==null;

        System.out.println("esNulo = " + esNulo);

        if (esNulo){
            curso ="programacion java";
        }

        boolean esVacio=curso.length()==0;

        System.out.println("esVacio = " + esVacio);
        boolean esVacio2=curso.isEmpty();
        System.out.println("esVacio2 = " + esVacio2);

        boolean esVacio3=curso.isBlank();//si tiene caracter en blanco
        System.out.println("esVacio3 = " + esVacio3);
        if (!esVacio3){
            System.out.println(curso.toUpperCase());
            //al null no lo puedo concatenar
            System.out.println("bienvenido al curso ".concat(curso));
        }




    }
}
