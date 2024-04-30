package A_HelloWorld;

public class PrimitivosFloat {


    public static void main(String[] args) {
        //decimal corto
        float realFloat=3.4028235E38f;//se pone f al final para decir que es float
        System.out.println("realFloat = " + realFloat);
        System.out.println("El numero de bytes es: "+Float.BYTES);
        System.out.println("El numero de bits es: "+Float.SIZE);
        System.out.println("El maximo valor es :" +Float.MAX_VALUE);
        System.out.println("El minimo valor es :" +Float.MIN_VALUE);

        System.out.println();
        //decimal largo
        double realDouble=1.7976931348623157E308d;// se pone al final d para mostrar que es double
        System.out.println("realDouble = " + realDouble);
        System.out.println("El numero de bytes de double es: "+Double.BYTES);
        System.out.println("El numero de bits de double es :"+Double.SIZE);
        System.out.println("El tamaño de double es : "+Double.MAX_VALUE);
        System.out.println("El tamaño minimo de double es :"+Double.MIN_VALUE);

        //variable sensible
        var varFlotante=3.141516;
        System.out.println("varFlotante = " + varFlotante);


    }
}
