package Z_Ejecicios;

public class I_A_EjercicioMatrices_Cruz {
    public static void main(String[] args) {

        int[][] matriz = new int[5][5];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if ( i==j || j==matriz[i].length-1 - i){
                    matriz[i][j]=1;
                }
            }
        }

        for(int[] fila: matriz){
            for(int n: fila){
                System.out.print(n+"\t");
            }
            System.out.println();
        }




    }
}
