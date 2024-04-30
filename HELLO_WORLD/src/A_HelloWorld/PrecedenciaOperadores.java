package A_HelloWorld;

public class PrecedenciaOperadores {
    public static void main(String[] args) {
        int i = 14;
        int j=8;
        int k=20;
        // que se resuelve primero:divide luego realiza suma de izq a der
        double promedio= (i+j+k)/3d;//3d la d es de double ;)
        System.out.println("promedio = " + promedio);

        promedio= (i+j+k)/3d*10;// de izq  a derecha primero divide luego multiplica luego suma 14+8+.6=22.6
        System.out.println("promedio = " + promedio);


        promedio= ++i + j-- + k/3d*10;//(15+8)+66.6 = 89.6
        System.out.println("promedio = " + promedio);
        System.out.println("(k/3d*10) = " + (k/3d*10));
        System.out.println("j = " + j);
        System.out.println("i = " + i);

        System.out.println("\n");
        int p=5,r=0;
        r=(++p)*2;
        System.out.println("Operación con preincremento suma= " + r);
        System.out.println("p = " + p);

        p=5;
        r=(--p)*2;
        System.out.println("Operación con preincremento resta= " + r);
        System.out.println("p = " + p);

        p=5;
        r=(p++)*2;
        System.out.println("Operación con post incremento suma= " + r);
        System.out.println("p = " + p);

        p=5;
        r=(p--)*2;
        System.out.println("Operación con post incremento resta= " + r);
        System.out.println("p = " + p);

    }
}
