 package H_Arreglos;

public class F_ArreglosOrdenamientoBurbujaOptimizadoConObject {
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


        // Arreglo de enteros
        Integer[] arregloEnteros = {1, 5, 2, 7, 6, 3, 4};

        // Arreglo de caracteres
        Character[] arregloCaracteres = {'a', 'b', 'c', 'd', 'e', 'f', 'g'};

        // Arreglo de Strings
        String[] arregloStrings = {"hola", "adios", "bienvenido", "saludos", "java", "programacion", "ChatGPT"};

        //Arrays.sort(productos);//para ordenar implicita(api java)
        //arregloInverso(productos);//para inversa explicita(por nosotros)
        //Collections.reverse(Arrays.asList(productos));//convierte arreglo a list, para hacer reverse(api java)
        metodoBurbuja(arregloEnteros);
        for (Object a : arregloEnteros){
            System.out.println("a = " + a);
        }

    }
}
