package A_HelloWorld;

public class OperadorInstanceOfTiposGenericos {
    public static void main(String[] args) {


        //NOTA: un tipo genérico, ya que Object es una forma de representar cualquier objeto en Java.
        Object texto="Creando un objeto de la clase String... Que tal!";

        Number num= 7;

        Boolean b1=texto instanceof String; // para ver si un objeto es instancia de una clase

        System.out.println("texto es del tipo String = " + b1);

        //b1=texto instanceof Integer; //error tipos incompatibles
        b1= texto instanceof Object;//todos heredan de la clase Object

        System.out.println("texto es del tipo Object="+b1);

        b1= texto instanceof Integer;//todos heredan de la clase Object

        System.out.println("texto es del tipo Integer="+b1);

        b1= num instanceof Integer;

        System.out.println("num es del tipo Integer="+b1);

        b1= num instanceof Number;//todos los tipos de numero pertenecena a esta clase
        System.out.println("num es del tipo Number="+b1);

        b1= num instanceof Object;//todos los tipos de numero pertenecena a esta clase
        System.out.println("num es del tipo Object="+b1);

        b1= num instanceof Long;//todos los tipos de numero pertenecena a esta clase
        System.out.println("num es del tipo Long="+b1);

        b1= num instanceof Double;//todos los tipos de numero pertenecena a esta clase
        System.out.println("num es del tipo Double="+b1);

        Number decimal = Float.valueOf(45.54f) ;//45.54f;

        b1= decimal instanceof Double;//todos los tipos de numero pertenecena a esta clase
        System.out.println("decimal es del tipo Double="+b1);

        b1= decimal instanceof Float;//todos los tipos de numero pertenecena a esta clase
        System.out.println("decimal es del tipo Float="+b1);

        b1= decimal instanceof Integer;
        System.out.println("decimal es del tipo Integer="+b1);

        b1= decimal instanceof Number;
        System.out.println("decimal es del tipo Number = " + b1);

        b1= b1 instanceof Boolean;//todos los tipos de numero pertenecena a esta clase
        System.out.println("b1 es del tipo Boolean="+b1);







    }
}
