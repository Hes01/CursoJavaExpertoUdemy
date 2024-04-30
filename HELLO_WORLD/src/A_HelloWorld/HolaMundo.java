package A_HelloWorld;

public class HolaMundo {
    //metodo principal
    public static void main(String[] args) {//void no retorna nada
        //argumentos del tipo string o arreglo de cadenas
        String saludar="hola mundo desde java";
        System.out.println(saludar);
        System.out.println("saludar.toUpperCase()="+saludar.toUpperCase());//convierte a mayuscular

        int numero =11;
        System.out.println("numero = " + numero);
        //contexto de una variable
        int numero2=5;
        boolean valor = true ;
        if (valor){
            numero2 =10;

        }
        System.out.println("numero2 = " + numero2);
        var numero3=15;//tipo flexible :acepta string, enteros , decimales, etc...

        String nombre;//tipo cadena
        nombre="Andrés";
        if (numero>10){
            nombre="juan";
        }
        System.out.println("nombre = " + nombre);
        int edad_persona=5;
        /*comentario multiple*/
        //comentario por lineas

    }
}
