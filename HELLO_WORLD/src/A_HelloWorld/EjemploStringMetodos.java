package A_HelloWorld;

public class EjemploStringMetodos {
    public static void main(String[] args) {
        String nombre="elvis";

        System.out.println("nombre.length()= "+nombre.length());//ver tamaño de caracteres pero +1
        System.out.println("nombre.toUpperCase() = " + nombre.toUpperCase());//convertir a mayusculas
        System.out.println("nombre.toLowerCase() = " + nombre.toLowerCase());//convertir a minusculas
        System.out.println("nombre.equals(\"elvis\") = " + nombre.equals("elvis"));//comparar cadenas considerando si son mayus o minus
        System.out.println("nombre.equals(\"Elvis\") = " + nombre.equals("Elvis"));
        System.out.println("nombre.equalsIgnoreCase(\"Elvis\") = " + nombre.equalsIgnoreCase("Elvis"));//comparar cadenas sin considerar si son mayus o minus
        System.out.println("nombre.compareTo(\"elvis\") = " + nombre.compareTo("elvis"));// comparar si son iguales da 0 sino otro numero
        System.out.println("nombre.compareTo(\"Elvito\") = " + nombre.compareTo("Elvito"));
        System.out.println("nombre.charAt(0) = " + nombre.charAt(0));//obtener un caracter de la cadena segun se especifique

        System.out.println("nombre.substring(1) = " + nombre.substring(1));//tomar parte de la cadena desde donde hasta todo a la derecha
        System.out.println("nombre = " + nombre.substring(1,4));//tambien se especifica hasta donde 1 desde donde inicia y 4 es no inclusivo osea toma hasta el 3
        System.out.println("nombre.substring(nombre.length()-1) = " + nombre.substring(nombre.length()-1));
        
        //Segunda parte
        System.out.println();
        String  trabalengua="trabalenguas";
        System.out.println("trabalengua.replace(\"a\",\".\") = " + trabalengua.replace("a","."));//inmutable la original no cambia 
        System.out.println("trabalengua = " + trabalengua);
        System.out.println("trabalengua.indexOf('a') = " + trabalengua.indexOf('a'));//str o char //retorna la primera ocurrencia en posicion entera
        System.out.println("trabalengua.lastIndexOf('a') = " + trabalengua.lastIndexOf('a'));//retorna la ultima ocurrencia
        System.out.println("trabalengua.indexOf('z') = " + trabalengua.indexOf("ba"));//sino lo encuentra da -1
        System.out.println("trabalengua.contains('t') = " + trabalengua.contains("lenguas"));//solo acepta string retorna boolean
        System.out.println("trabalengua.startsWith(\"traba\") = " + trabalengua.startsWith("traba"));//si comienza con esa coincidencia
        System.out.println("trabalengua.endsWith(\"lenguas\") = " + trabalengua.endsWith("lenguas"));//con la coincidencia que termina

        System.out.println("  trabalenguas ");
        System.out.println("  trabalenguas ".trim());//trim elimina espacios izq y der

    }
}
