package Z_Ejecicios;

public class I_B_EjercicioMatrices_Sillah {
    public static void main(String[] args) {

        String[][] matriz = new String[5][5];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                    if(j==0 || (i==2 && j<=2) || (j==2 && i>=2)){
                        matriz[i][j]="*";
                    }else {
                        matriz[i][j]="";
                    }
            }
        }

        for(String[] fila: matriz){
            for(String n: fila){
                System.out.print(n+"\t");
            }
            System.out.println();
        }




    }
}
