package I_Matrices;

import java.util.Arrays;

public class G_EjemploMatricesTranspuesta {
    public static void main(String[] args) {

        int[][] matriz = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}
        };

        System.out.println("matriz original");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j]+"\t");
            }
            System.out.println();
        }


        //System.out.println(Arrays.deepToString(matriz));
        System.out.println("matriz transpuesta");
        int aux;
        for (int i = 1; i < matriz.length; i++) {//empieza desde 1 porque ahora una iteracion que es la de 0,0 la cual no se va a intercambiar por las
            for (int j = 0; j <i; j++) {//solo recorremos la mitad :D mas optimizado
                aux=matriz[i][j];
                matriz[i][j]=matriz[j][i];
                matriz[j][i]=aux;
            }
        }

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j]+"\t");
            }
            System.out.println();
        }


    }
}
