package H_Arreglos;

public class T_EjemploArregloAgregarElementoOrdenadoIncrementar {

    public static void main(String[] args) {

        int[] num = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};//elimina 6
        int n = num.length;
        int aux;

        int nAgregar = 50;
        int i = 7;

        aux=num[n-1];//ultimo
        for (int j = n-2; j >=i; j--) {
            num[j+1] = num[j];
        }

        int[] b = new int[num.length+1];
        System.arraycopy(num,0,b,0,num.length);

        /* PUEDE SER ASI O COMO SE VE MAS ABAJO COMO EJEMPLO ASIGNADOLO AL ARREGLO ORIGINAL :)
        b[i]=nAgregar;
        b[b.length-1]=aux;
        */

        num =b;//asignamos al arreglo original el b(arreglo intermedio )
        num[i]=nAgregar;
        num [b.length-1]=aux;



        for(int p:num){
            System.out.println("p = " + p);
        }
    }
}
