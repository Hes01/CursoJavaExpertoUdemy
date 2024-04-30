package C_ClaseWrapper;

public class C_WrapperOperadoresRelacionales {
    public static void main(String[] args) {


        //objetos que contienen un valor encapsulados
        Integer num1=Integer.valueOf(1000);
        Integer num2=num1;

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
        System.out.println("son el mismo objeto? "+(num1==num2));//ambas instancias son las mismas, true

        num2=1000;
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
        System.out.println("son el mismo objeto? "+(num1==num2));//ambas instancias son las diferentes, false

        /*
        == en primitivos compara por el valor
        == en objetos compara por la instancia
        */

        //COMPARACIONES POR VALOR PRIMITIVOS Y OBJETOS O INSTANCIAS

        // equals comparamos por el valor
        System.out.println("son el mismo objeto? "+(num1.equals(num2)));//ambas instancias son las diferentes, false
        //convirtiendo de forma explicita(controlada) a valores enteros con value
        System.out.println("Son el mismo objeto "+(num1.intValue()==num2.intValue()));

        num2=500;
        boolean condicion=num1>num2;//cualquier operaciona aritmetica y relacional se puede hacer excepto el == hay que tener en cuenta
        System.out.println("condicion = " + condicion);

        boolean condicion2=num1.intValue()>num2.intValue();//cualquier operaciona aritmetica y relacional se puede hacer excepto el == hay que tener en cuenta
        System.out.println("condicion = " + condicion);

    }
}
