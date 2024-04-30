package A_HelloWorld;

public class EjemploString {
    public static void main(String[] args) {

        String curso="Programación Java";//String es un tipo especial no como los primitivos pero es objeto
        String curso2= new String("Programación Java");//lo mismo que lo anterior
        //estos por mas que compartan el mismo contenido son distintos


        boolean esIgual=curso2==curso; //comparacion por referencia
        System.out.println("\ncurso2==curso = " + esIgual);

        //forma correcta de comparar
        esIgual=curso.equals(curso2);//compara por valor o texto
        System.out.println("\ncurso.equals(curso2) = " + esIgual);

        String curso3="Programación Java";
        esIgual=curso==curso3;
        System.out.println("curso==curso3 = " + esIgual);

        //RECOMENDACIÓN: para comparar por valor usar metodo
        //  > cadena.equals(cadena2) //este toma en cuenta que toda la cadena sea igual
        //  > cadena.equalsIgnoreCase(cadena2) //este ignora minusculas o mayusculas
    }
}
