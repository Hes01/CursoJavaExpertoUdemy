package B_FlujosControl;

import javax.swing.*;

public class G_SentenciaForArreglo {
    public static void main(String[] args) {

        /*
        *                                       FORMAS DE CREAR UN ARREGLOS
        *
        * FIJANDO CANTIDAD*
        *
        * 1- String[] nombres=new String[6];
        *
        * INGRESANDO DIRECTAMENTE POR DEFAULT*
        *
        * 2- String[] nombres={"luis","juan"};
        *
        * NOTA:
        * el corchete puede ir con el tipo o el nombre de la variable ejm:
        * - String nombres[] ...
        *
        * >CAUTION: pero es recomendable mejor que se ponga en el tipo.
        * */
        String[] nombres= {"Andres","Pepe","Maria","Paco","Lalo","Bea","Pato","Pepa"};
        int count=nombres.length;
        /*for(int i = 0; i<count;i++)
        {
            //ignorar a andres y pepa ,nota: que el ignoreCase es para omitir si son mayusculas o minusculas

            //toLowerCase(): convierte a minusculas
            //toUpperCase(): convierte a mayusculas
            //.equalsIgnoreCase("Andres") es similar a .contains("Andres") diferencia que el constains no es sensible a mayuscula y minuscula
            if (nombres[i].toLowerCase().contains("ANDRES".toLowerCase())//andres==andres
                 || nombres[i].toLowerCase().contains("PEpa".toLowerCase()))//pepa==pepa
            {
                continue;
            }
            System.out.println("nombres = " + nombres[i]);
        }*/


        //buscar un nombre
        String nombreBuscar= JOptionPane.showInputDialog(null,"ingrese un nombre, ejemplo \"Pepe\" o \"Maria\" ");
        System.out.println("nombreBuscar = " + nombreBuscar);
        boolean estado=false;
        for (int i = 0; i <count ; i++) {
            if (nombres[i].equalsIgnoreCase(nombreBuscar))// es similar a esto -> nombres[i].toLowerCase().contains("ANDRES".toLowerCase()
            {
                estado=true;
                break;
            }

        }
        String decir=(estado==true)? "Si se encontro nombre "+nombreBuscar:"No se encontro nombre "+nombreBuscar;
        JOptionPane.showMessageDialog(null,decir);

    }
}
