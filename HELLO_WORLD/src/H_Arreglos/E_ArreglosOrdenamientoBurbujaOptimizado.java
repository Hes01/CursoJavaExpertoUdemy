package H_Arreglos;

public class E_ArreglosOrdenamientoBurbujaOptimizado {
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

    public static void main(String[] args) {

        String[] productos = {
                "Manzanas",
                "Papel higiénico",
                "Auriculares inalámbricos",
                "Jabón de manos",
                "Botella de agua",
                "Cartera",
                "Pasta de dientes"};
        int total = productos.length;

        int vecesRecorrido=0;
        //Algoritmo de burbuja
        /*
        * Este tipo de ordenamiento toma un pivot y lo recorre intercambiando uno por uno
        * dando varias pasadas hasta que este ordenado
        * frase:"Si el actual es mayor que el segundo intercambias"
        * */
        for (int i = 0; i < total-1; i++) {
            for (int j = 0; j < total-1 -i; j++) {//-i porque las posiciones ultimas ya se van ordenando
                if ((productos[j+1].compareTo(productos[j]))<0){
                    String auxiliar=productos[j];
                    productos[j]=productos[j+1]  ;
                    productos[j+1]=auxiliar;
                }
                vecesRecorrido++;
            }
        }
        System.out.println("las veces que conto es : "+vecesRecorrido);

        //Arrays.sort(productos);//para ordenar implicita(api java)
        //arregloInverso(productos);//para inversa explicita(por nosotros)
        //Collections.reverse(Arrays.asList(productos));//convierte arreglo a list, para hacer reverse(api java)
        for (int j = 0; j < total; j++) {
            System.out.println(productos[j]);
        }

    }
}
