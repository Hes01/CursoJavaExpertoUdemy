package A_HelloWorld;

public class EjemploStringInmutable {
    public static void main(String[] args) {

        String curso="Programación Java";//String es un tipo especial no como los primitivos pero es objeto
        String profesor ="Andres Guzmán";

        String resultado =curso.concat(profesor);//retorna nueva instancia
        System.out.println("curso = " + curso);
        System.out.println("resultado = " + resultado);
        System.out.println(curso==resultado);

        String resultado2 =curso.transform(c -> { //funcion de flecha para modificar el valor string 
            return  c + " con " + profesor;
        });//recibe una funcion
        System.out.println("curso = " + curso);
        System.out.println("resultado2 = " + resultado2);
        String resultado3= resultado.replace("a","A");//reemplazar caracteres
        System.out.println("resultado = " + resultado);
        System.out.println("resultado3 = " + resultado3);

    }


}
