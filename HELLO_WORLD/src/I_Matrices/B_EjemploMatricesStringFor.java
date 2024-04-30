package I_Matrices;

public class B_EjemploMatricesStringFor {
    public static void main(String[] args) {
        String[][] nombre = new String[3][2];
        nombre[0][0]="pepe";
        nombre[0][1]="pepa";
        nombre[1][0]="josefa";
        nombre[1][1]="paco";
        nombre[2][0]="lucas";
        nombre[2][1]="pancha";

        System.out.println("iterando con for ");
        for (int i = 0; i < nombre.length; i++) {
            for (int j = 0; j < nombre[0].length; j++) {
                System.out.print(nombre[i][j]+"\t");
            }
            System.out.println();
        }

        System.out.println("Iterando con foreach");

        for (String[] fila: nombre){
            for (String columnas: fila){
                System.out.print(columnas+"\t");
            }
            System.out.println();
        }
    }
}
