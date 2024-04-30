package B_FlujosControl;

public class F_SentenciaFor {
    public static void main(String[] args) {
        /*
        * PARA CONOCIMIENTO:
        * */
        /*int i =0;
        for (;;){
            if (i>=5){
                break;
            }
            System.out.println("i = " + i);
            i++;
        }*/

        /*
        *       POSINCREMENTO
        * */

        /*for (int i = 0; i <10 ; i++) {
            System.out.println("i = " + i);
        }*/

        /*
        *       POSDECREMENTO
        * */

        /*for (int i = 10; i > 0 ; i--) {
            System.out.println("i = " + i);
        }*/

        /*
        *        CON DOS VARIABLES
        * */
        
        /*for (int i = 0,j=10; i <j ; i++,j--) {
            System.out.println("i = " + i+" -----> j = " + j);
        }*/

        /*
        *       IMPRIMER NUMEROS IMPARES CON "CONTINUE" TAMBIEN PUEDES USAR "BREAK"
        * */
        for (int i = 0; i <=10 ; i++) {
            if ((i%2==0)){
                continue;
            }
            System.out.println("i = " + i);//impares

        }
    }
}
