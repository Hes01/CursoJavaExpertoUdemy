 package H_Arreglos;

public class I_ArreglosCombinadosEnTerceroMultiplesValores {
    //cuando los arreglos son del tipo primitivo entonces tienen 0 en el valor de inicio la mayoria
    //cuando los arreglos son del tipo referencia entonces tienen null en el valor de inicio


    //copiar n elementos de a y n elementos de b en c luego c tendria que ser 2n

    public static void main(String[] args) {

       int[] a , b ,c ;
       a= new int[12];
       b= new int[12];
       c= new int[24];

        for (int i = 0; i <a.length ; i++) {
            a[i]=i+1;
        }

        for (int i = 0; i <b.length ; i++) {
            b[i]=(i+1)*5;
        }

        int aux=0;
        for (int i = 0; i <a.length ; i+=4) {//número de elementos a copiar
            for (int j = 0; j <4 ; j++) {//número de veces a copiar en el arreglo c
                c[aux++]=a[i+j];
                System.out.println("a");
            }
            for (int j = 0; j <4 ; j++) {
                c[aux++]=b[i+j];
                System.out.println("b");
            }
        }

        for(int i: c ){
            System.out.println("valores " + i);
        }


    }
}
