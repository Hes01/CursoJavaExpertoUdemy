package A_HelloWorld;

public class OperadorInstanceOf {
    public static void main(String[] args) {


        //NOTA:Las definiciones tienen que ser del tipo referencia no primitivo
        //ejm: Boolean no boolean
        String texto="Creando un objeto de la clase String... Que tal!";

        Integer num=7;

        Boolean b1=texto instanceof String; // para ver si un objeto es instancia de una clase

        System.out.println("texto es del tipo String = " + b1);

        //b1=texto instanceof Integer; //error tipos incompatibles
        b1= texto instanceof Object;//todos heredan de la clase Object

        System.out.println("texto es del tipo Object="+b1);

        b1= num instanceof Integer;

        System.out.println("num es del tipo Integer="+b1);

        b1= num instanceof Number;//todos los tipos de numero pertenecena a esta clase
        System.out.println("num es del tipo Number="+b1);

        b1= num instanceof Object;//todos los tipos de numero pertenecena a esta clase
        System.out.println("num es del tipo Object="+b1);

        Double decimal = 45.54;
        b1= decimal instanceof Number;
        System.out.println("decimal es del tipo Number = " + b1);

        b1= b1 instanceof Boolean;//todos los tipos de numero pertenecena a esta clase
        System.out.println("b1 es del tipo Boolean="+b1);







    }
}
