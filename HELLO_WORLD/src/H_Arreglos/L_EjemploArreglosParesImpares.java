 package H_Arreglos;

 import java.util.Scanner;

 public class L_EjemploArreglosParesImpares {
    
    public static void main(String[] args) {

        int[] a ,pares,impares;
        int totalPares=0,totalImpares=0;

        a= new int[10];

        Scanner s= new Scanner(System.in);

        System.out.println("Ingresa 10 números enteros: ");
        for (int i = 0; i < a.length; i++) {
            a[i]=s.nextInt();
        }
        for (int i = 0; i < a.length; i++) {
            if (a[i]%2==0){
                totalPares++;
            }else {
                totalImpares++;
            }
        }

        pares = new int[totalPares];
        impares= new int[totalImpares];
        int j=0;//para par
        int k=0;//para impar
        for (int i = 0; i < a.length; i++) {
            if (a[i]%2==0){
                pares[j++]=a[i];
            }else {
                impares[k++]=a[i];
            }
        }

        System.out.println("pares");
        for(int i: pares){
            System.out.print(" " + i+" ");
        }
        System.out.println("\nimpares");
        for(int i : impares){
            System.out.print(" " + i+" ");
        }

    }
}
