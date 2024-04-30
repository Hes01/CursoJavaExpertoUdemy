package I_Matrices;

public class I_EjemploMatricesSumar {
    public static void main(String[] args) {

        int[][] a = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        int[][] b= {
                {10,20,30},
                {40,50,60},
                {70,80,90}
        };

        int[][] suma = new int[3][3];

        for (int i = 0; i < a.length; i++) {

            for (int j = 0; j < a[i].length; j++) {
                suma[i][j]=a[i][j]+b[i][j];
            }
        }


        for(int[] filas: suma){
            for(int n: filas){
                System.out.print(n+"\t");
            }
            System.out.println();
        }


    }
}
