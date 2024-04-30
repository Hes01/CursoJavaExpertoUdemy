package B_FlujosControl;

public class J_SentenciasBucleEtiquetas_For_and_While {

    public static void main(String[] args) {


        /*
        * ETIQUETAS:
        * Con ellas (interrumpir o continuar) en los bucles sobre
        * todo en bucles anidados podemos
        * indicar donde hacer CONTINUE; o BREAK;
        * si bien en el bucle interno o en el
        * externo.
        * Como se puede apreciar en el ejem que sigue.
        * */

        // CONTINUE
        System.out.println("CON ETIQUETA CONTINUE \n");
        bucle1:
        for (int i = 0; i < 5; i++) {
            System.out.println();
            for (int j = 0; j < 5; j++) {


                if (j == 2) {
                    continue bucle1;//salta y continua en el bucle externo
                }
                System.out.print("(i: " + i+"; j: "+j+")  ");
            }

        }
        System.out.println("\n\nSIN ETIQUETA PERO CON CONTINUE \n");

        for (int i = 0; i < 5; i++) {
            System.out.println();
            for (int j = 0; j < 5; j++) {


                if (j == 2) {
                    continue ;//salta en el bucle interno
                }
                System.out.print("(i: " + i+"; j: "+j+")  ");
            }

        }

        // BREAK
        /*System.out.println("CON ETIQUETA BREAK \n");
        bucle1:
        for (int i = 0; i < 5; i++) {
            System.out.println();
            for (int j = 0; j < 5; j++) {


                if (j == 2) {
                    break  bucle1;//salta y termina  en el bucle externo
                }
                System.out.print("(i: " + i+"; j: "+j+")  ");
            }

        }
        System.out.println("\n\nSIN ETIQUETA PERO CON BREAK \n");

        for (int i = 0; i < 5; i++) {
            System.out.println();
            for (int j = 0; j < 5; j++) {


                if (j == 2) {
                    break ;//termina en el bucle interno
                }
                System.out.print("(i: " + i+"; j: "+j+")  ");
            }

        }*/


        //EJEMPLO: DECIR HORAS y DIAS LABORABLES

        //System.out.println("CON ETIQUETA CONTINUE \n");
        /*bucle1:
        for (int i = 1; i <= 7; i++) {
            System.out.println();
            int j = 1;
            while ( j <= 8 ) {


                if (i == 6 || i==7) {
                    System.out.println("Dia "+i+" : descanso de fin de semana!");
                    continue  bucle1;//salta y continua  en el bucle externo
                }
                System.out.println("Dia "+i+" : trabajando a las !"+j+"hrs. ");
                j++;
            }

        }*/


        //con do while
        /*int i=0,j=0;
        etiqueta:
        do{
            j++;
            i++;
            System.out.println("i,j :" +i+","+j);
            while (j==2){
                System.out.println("j : "+j);
                break etiqueta;
            }

        }while (i<5);*/


    }
}

