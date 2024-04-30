package F_ClaseMath;
/*
 * es muy parecida a la clase system osea nose pueden instanciar y son solamente metodos
 * estaticos es decir se invoca con el nombre de la clase punto el nombre del metodo
 * */
public class A_EjemploClaseMath {
    public static void main(String[] args) {
        
        
        
        //valor absoluto de un numero entero
        int absoluto = Math.abs(-3);
        System.out.println("absoluto negativo = " + absoluto);
        
        absoluto=Math.abs(3);
        System.out.println("absoluto positivo= " + absoluto);
        
        //maximo entre dos enteros decimales o enteros
        double max= Math.max(3.5,1.2);
        System.out.println("max = " + max);
        
        //minimo entre dos enteros decimales o enteros
        double min =Math.min(1.2,1.3);
        System.out.println("min = " + min);
        
        //redondear al valor maximo de un decimal
        double techo=Math.ceil(3.5);
        System.out.println("techo = " + techo);
        
        //redondear al valor minimo de un decimal
        double piso=Math.floor(3.5);
        System.out.println("piso = " + piso);
        
        //redondear de forma automatica con round 
        long entero =Math.round(Math.PI);
        System.out.println("entero = " + entero);

        //exponencial elevado a la x : e^(x)
        double exp= Math.exp(1);//e^1
        System.out.println("exp = " + exp);
        
        //funcion logaritmo natural(ln)
        double log= Math.log(10);
        System.out.println("log = " + log);
        
        //potencia:numero elevado a la potencia
        double potencia=Math.pow(10,3);
        System.out.println("potencia = " + potencia);

        //raiz cuadrada de un numero
        double raiz=Math.sqrt(5);
        System.out.println("raiz = " + raiz);

        //convertir un angulo de Radianes a Grados
        double grados=Math.toDegrees(1.57);
        grados=Math.round(grados);//con esto lo redondeamos a 90 grados
        System.out.println("Convertir de radianes a grados = " + grados);

        //convertir un angulo de Grados a Radianes
        double radianes=Math.toRadians(90.00);
        System.out.println("convertir de grados a radianes = " + radianes);

        //seno recibe el valor en radianes
        System.out.println("Math.sin(90) = " + Math.sin(radianes));

        //coseno recibe el valor en radianes
        System.out.println("Math.cos(90) = " + Math.cos(radianes));

        radianes=Math.toRadians(180);
        System.out.println("Math.cos(180) = " + Math.cos(radianes));

        radianes=Math.toRadians(0.0);
        System.out.println("Math.cos(0) = " + Math.cos(radianes));

    }
}
