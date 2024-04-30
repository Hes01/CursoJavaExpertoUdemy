package H_Arreglos;

public class R_EjemploArregloOrdenadoAgregarPosicionAdecuada {

    public static void main(String[] args) {

        int[] num = {15, 17, 19, 23, 25, 27, 0};//21
        int n = num.length;
        int aux;


        int agregar=21;
        int i=0;

        //buscamos posicion
        /*      MI FORMA
        for ( i = 0; i <n ; i++) {
            if (num[i]>agregar){break;}
        }*/

        while (i<n-1 && agregar>num[i]){
            i++;
        }

        //chancamos
        for (int j = n - 2; j >= i; j--) {
            num[j + 1] = num[j];//chanca el ultimo por el anterior
        }
        num[i] = agregar;//ponemos el numero en la posicion indicada


        for (int p : num) {
            System.out.println("i = " + p);
        }

    }
}
