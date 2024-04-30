package B_FlujosControl;

public class H_SentenciaWhile {
    public static void main(String[] args) {


        /*
        * while:llamado pre-evaluacion, se ejecuta siempre que la condición sea verdad
        * */

        //nota el for vs while el for es mas rapido
        int i=0;//iterador

        /*while (i<5)
        {
            System.out.println("i = " + i);
            i++;
        }*/

        /*i=0;
        boolean prueba = true;
        while(prueba)
        {
            if (i==7)
            {
                prueba=false;
            }
            System.out.println("i = " + i);
            i++;
        }*/

        //dowhile: posprueba,se ejecuta al menos una sola vez
        /*prueba=false;
        do
        {
            System.out.println("Se ejecuta al menos una sola vez");
        }while (prueba);*/

        i=0;
        boolean prueba = true;
        do
        {
            if (i==7)
            {
                prueba=false;
            }
            System.out.println("i = " + i);
            i++;
        }while(prueba);

    }
}
