package I_Matrices;

public class F_EjemploMatricesDepuracion {
    public static void main(String[] args) {

        int[][] matriz= new int[3][];

        matriz[0]=new int[2]; //fila con 2 elementos
        matriz[1]= new int[3];//fila con 3 elementos
        matriz[2]= new int[4];//fila con 4 elementos

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j]=i*j;
            }
        }

        System.out.println("matriz length: "+matriz.length);
        System.out.println("fila 0 length: "+matriz[0].length);
        System.out.println("fila 1 length: "+matriz[1].length);
        System.out.println("fila 2 length: "+matriz[2].length);

        System.out.println();
        for (int i = 0; i<matriz.length;i++){
            System.out.print("fila ("+i+") ->");
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j]+"\t");
            }
            System.out.println();
        }

    }
}
