package A_HelloWorld;

public class EjemploStringConcatenacion {
    public static void main(String[] args) {

        String curso="Programación Java";//String es un tipo especial no como los primitivos pero es objeto
        String profesor ="Andres Guzmán";

        String  detalle= curso +" con el instructor "+profesor;
        System.out.println("detalle = " + detalle);

//========================================================================
        int numeroA=10;
        int numeroB=5;
        System.out.println(detalle + (numeroA +numeroB));//cadena + numero + numero =cadena
        //las expresiones se evaluan de izquierda a derecha
        System.out.println(numeroA+numeroB+detalle);//numero + numero + cadena = suma + cadena

        String detalle2=curso.concat(" con ").concat(profesor);//metodo que permite concatenar y la forma mas eficiente de hacerlo

        System.out.println("detalle2 = " + detalle2);

    }
}
