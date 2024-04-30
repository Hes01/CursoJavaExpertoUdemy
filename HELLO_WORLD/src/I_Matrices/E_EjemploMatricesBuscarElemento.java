package I_Matrices;

public class E_EjemploMatricesBuscarElemento {
    public static void main(String[] args) {

        int[][] matrizDeEnteros= {
                {35,90,3,19,78},
                {15,2020,10,5},
                {677,127,32767,1999}
        };
        int elementoBuscar=1999;
        boolean encontrado=false;

        int i ;
        int j=0 ;
        buscar:for ( i = 0; i < matrizDeEnteros.length; i++) {
            for ( j = 0; j < matrizDeEnteros[i].length; j++) {
                if (matrizDeEnteros[i][j]==elementoBuscar){
                    encontrado=true;
                    break buscar;
                }
            }
        }

        if (encontrado){
            System.out.println("encontrado "+elementoBuscar+" en las coordenadas "+i+","+j);
        }else
        {
            System.out.println("no se encontro en la matriz");
        }

    }
}
