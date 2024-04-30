 package H_Arreglos;

public class G_ArreglosImprimiendoiPrincipioiFinal {
    //cuando los arreglos son del tipo primitivo entonces tienen 0 en el valor de inicio la mayoria
    //cuando los arreglos son del tipo referencia entonces tienen null en el valor de inicio

    public static void arregloInverso(String[] arr) {
        int total = arr.length - 1;
        int total2 = arr.length;
        for (int i = 0; i < total2; i++) {
            String actual = arr[i];
            String inverso = arr[total - i];
            arr[i] = inverso;
            arr[total - i] = actual;
            total2--;
        }
    }

    public static void  metodoBurbuja(Object[] arr){//arreglos de objetos para cualquier tipo
        int total=arr.length;
        for (int i = 0; i < total-1; i++) {
            for (int j = 0; j < total-1 -i; j++) {//-i porque las posiciones ultimas ya se van ordenando
                if ((((Comparable)arr[j+1]).compareTo(arr[j]))<0){//casteo a comparabla porque toda clase de primitivo implementa a comparable
                    //al arr dentro del compareTo no se le hace porque ese ya implementa o tiene la interfaz comparable el metodo
                    Object auxiliar=arr[j];
                    arr[j]=arr[j+1]  ;
                    arr[j+1]=auxiliar;
                }
            }
        }
    }

    public static void main(String[] args) {

        //1,2,3,4
        //funcion:14,23 asi se mostrara el primero y el ultimo
        Object[]  arr=new Object[10];
        Object[] a = new Object[10];

        Object n=arr.length;
        for (int i = 0; i < (Integer) n ; i++) {
            arr[i]=i+1;
        }

        //1 10,2 9....
        /*for (int i = 0; i <(Integer) n -i; i++) {//(Integer) n/2 :asi tambien
            System.out.print(arr[i]+" ");
            System.out.println(arr[((Integer)n-1- i )]);

        }*/

        //llenar el arreglo
        int aux=0;
        for (int i = 0; i <(Integer) n -i; i++) {//(Integer) n/2 :asi tambien
            a[aux++]=arr[i];
            a[aux++]=arr[((Integer)n-1- i )];
        }

        for (int i = 0; i < (Integer) n; i++) {
            System.out.println("a[i] = " + a[i]);
        }

    }
}
