package I_Matrices;

public class F_EjemploMatricesSimetrica {
    public static void main(String[] args) {

        /*ver si es simetrica*/
        boolean simetrica = true;
        int[][] matriz = {
                {1, 2, 3, 4},
                {2, 1, 0, 5},
                {3, 0, 1, 6},
                {4, 5, 6, 7}
        };


        int i, j;
        i = 0;
        while (i < matriz.length && simetrica == true) {
            j = 0;
            /*si lo dejamos asi (j < matriz[i].length && simetrica == true)
            * entonces compara todos pero las diagonal derecha no se deberia compara porque esos
            * son unicos osea para que entonces en ves de anterior podemos poner
            * (j < i && simetrica == true) ahi se ve mejor vean nomas
            *
            * otra forma es en ves de ponerle el simetrica == true solo le ponemos una etiqueta
            * si no encuentra entonces nos salimos ya no entra alli y es mas eficaz osea
            * en ves de esto (j < i && simetrica == true) ponemos (j < i) luego agregamos una etiqueta
            * */
            etiqueta:while (j < i ) {
                if (matriz[i][j] != matriz[j][i]) {
                    simetrica = false;
                    break etiqueta;
                }
                j++;
            }
            i++;
        }

        /*
        * Por for
        *
                for (int i=0;i < matriz.length ;i++) {
                    for(int j=0;j < i;j++) {
                        if (matriz[i][j] != matriz[j][i]) {
                            simetrica = false;
                            break etiqueta;
                        }
                    }
                }
        */
        if (simetrica) {
            System.out.println("la matriz es simetrica");
        } else {
            System.out.println("no es simetrica");
        }
    }
}
