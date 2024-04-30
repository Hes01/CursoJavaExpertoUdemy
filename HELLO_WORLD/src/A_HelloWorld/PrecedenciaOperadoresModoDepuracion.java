package A_HelloWorld;

public class PrecedenciaOperadoresModoDepuracion {
    public static void main(String[] args) {
        int i = 14;
        int j=8;
        int k=20;

        double promedio= (i+j+k)/3d;//3d la d es de double ;)
        System.out.println("promedio = " + promedio);

        promedio= (i+j+k)/3d*10;// de izq  a derecha primero divide luego multiplica luego suma 14+8+.6=22.6
        System.out.println("promedio = " + promedio);


        promedio= ++i + j-- + k/3d*10;//(15+8)+66.6 = 89.6
        System.out.println("promedio = " + promedio);
        System.out.println("j = " + j);
        System.out.println("i = " + i);

    }
}
