 package H_Arreglos;

public class H_ArreglosCombinadosEnTercero {
    //cuando los arreglos son del tipo primitivo entonces tienen 0 en el valor de inicio la mayoria
    //cuando los arreglos son del tipo referencia entonces tienen null en el valor de inicio



    public static void main(String[] args) {

       int[] a , b ,c ;
       a= new int[10];
       b= new int[10];
       c= new int[20];

        for (int i = 0; i <a.length ; i++) {
            a[i]=i+1;
        }

        for (int i = 0; i <b.length ; i++) {
            b[i]=(i+1)*5;
        }

        int aux=0;
        for (int i = 0; i <10 ; i++) {
            c[aux++]=a[i];
            c[aux++]=b[i];
        }

        for(int i: c ){
            System.out.println("valores " + i);
        }


    }
}
