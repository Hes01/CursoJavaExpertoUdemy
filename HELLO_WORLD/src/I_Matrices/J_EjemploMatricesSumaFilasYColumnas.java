package I_Matrices;

public class J_EjemploMatricesSumaFilasYColumnas {
    public static void main(String[] args) {

        int sumaFila,sumaColumna;
        int[][] a = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };





        for (int i = 0; i < a.length; i++) {
            sumaColumna=0;
            sumaFila=0;
            for (int j = 0; j < a[i].length; j++) {
                sumaFila+=a[i][j];
                sumaColumna+=a[j][i];
            }
            System.out.println("total fila "+i+" : "+sumaFila);
            System.out.println("total columna "+i+" : "+sumaColumna);
        }





    }
}
