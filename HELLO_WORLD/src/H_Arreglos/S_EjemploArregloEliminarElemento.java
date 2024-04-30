package H_Arreglos;

public class S_EjemploArregloEliminarElemento {

    public static void main(String[] args) {

        int[] num = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};//elimina 6
        int n = num.length;
        int aux;

        int nEliminar = 6;
        int i = 0;


        while (i < n - 1 && nEliminar != num[i]) {
            i++;
        }

        for (int j = i; j < n-1; j++) {
            num[j] = num[j+1];
        }
        //chancamos
        /*for (int j = n - 2; j >= i; j--) {
            num[j + 1] = num[j];//chanca el ultimo por el anterior
        }*/
        //num[i] = agregar;//ponemos el numero en la posicion indicada


        /*for (int p : num) {
            System.out.println("num = " + p);
        }*/

        int[] b = new int[num.length-1];
        System.arraycopy(num,0,b,0,b.length);//arr origen, posicion inicio, arr destino,posicion inicio
        for (int p : b) {
            System.out.println("b = " + p);
        }
    }
}
