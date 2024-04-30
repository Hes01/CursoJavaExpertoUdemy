package H_Arreglos;

public class U_EjemploArregloOrdenadoAgregarPosicionAdecuadaIncrementar {

    public static void main(String[] args) {

        int[] num = {15, 17, 19, 23, 25, 27};//21
        int n = num.length;
        int aux;



        int agregar=24;
        int i=0;

        while (i<n-1 && agregar>num[i]){
            i++;
        }

        //chancamos
        aux=num[n-1];
        for (int j = n-2; j >=i; j--) {
            num[j + 1] = num[j];//chanca el ultimo por el anterior
        }

        int[] b = new int[num.length+1];
        System.arraycopy(num,0,b,0,num.length);//el ultimo es el parametro de lo que vas a copiar

        if (agregar>aux){
            b[b.length-1]=agregar;
        }else {
            b[i] = agregar;//ponemos el numero en la posicion indicada
            b[b.length-1]=aux;
        }


        for (int p : b) {
            System.out.println("i = " + p);
        }

    }
}
