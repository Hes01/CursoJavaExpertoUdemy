package I_Matrices;

public class C_EjemploMatricesStringFor2 {
    public static void main(String[] args) {
        String[][] nombres = {{"pepe","pepa"},{"josefa","paco"},{"lucas","pancha"}};

        System.out.println("Iterando con foreach");

        for (String[] fila: nombres){
            for (String nombre: fila){
                System.out.print(nombre+"\t");
            }
            System.out.println();
        }
    }
}
