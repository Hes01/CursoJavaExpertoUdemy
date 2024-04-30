package Z_Ejecicios;

public class H_B_EjercicioArreglos_NumeroMayor {
    public static void main(String[] args) {
        int[] numeros={3,2,1,6,5,4,8,9,7,10};

        int max=0;
        for (int i = 0; i < numeros.length; i++) {
            max=(numeros[max]>numeros[i]? max:i);
        }
        System.out.println("numeros[max] = " + numeros[max]);
    }
}
