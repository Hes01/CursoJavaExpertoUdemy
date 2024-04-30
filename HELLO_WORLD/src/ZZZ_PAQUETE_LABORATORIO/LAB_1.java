package ZZZ_PAQUETE_LABORATORIO;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.io.IOException;
public class LAB_1 {
    public static void main(String[] args) {

    int[][] numeros= new int[2][3];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                numeros[i][j]=j+i;
                System.out.println(numeros[i][j]);
            }
        }


    
    }
}
