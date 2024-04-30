 package H_Arreglos;

 import java.util.Scanner;

 public class K_EjemploArreglosDetectorOrden {
    
    public static void main(String[] args) {

        //detertar si es ascendente o descendente
       int[] a = new int[7];
       Scanner s= new Scanner(System.in);
        System.out.println("ingrese 7 numeros:");
        for (int i = 0; i < a.length; i++) {
            System.out.print("> ");a[i]=s.nextInt();
            System.out.println();;
        }

        boolean ascendente=false;
        boolean descendente= false;
        for (int i = 0; i < a.length-1; i++) {
            if (a[i]>a[i+1]){
                descendente=true;
            }
            if (a[i]<a[i+1]){
                ascendente=true;
            }
        }
        if (ascendente ==true && descendente==true){
            System.out.println("arreglo desordenado ");
        }
        if (ascendente ==false && descendente==false){
            System.out.println("arreglo iguales ");
        }
        if (ascendente==true && descendente==false)
        {
            System.out.println("arrglo ascendente");
        }
        if (ascendente==false && descendente==true)
        {
            System.out.println("arrglo descendente");
        }
    }
}
