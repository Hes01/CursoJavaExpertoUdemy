package B_FlujosControl;

import javax.swing.*;
import java.util.Scanner;

public class K_SentenciaBucleEtiquetasBuscar_Palabra_Ejercicio {
    public static void main(String[] args) {
      /*  //buscar un caracter dentro de esa frase y saber cuantas veces se encuentra
        String frase ="tres tistes tigres tragan trigo en un trigal";
        int max=frase.length();
        int cantidad=0;
        char letra='g';
        for (int i = 0; i < max; i++) {
            if (frase.charAt(i)!=letra)
            {
                continue;//pasa al siguiente si es diferente por lo cual no cuenta
            }
            cantidad++;
        }
        System.out.println("Encontrado = "+cantidad+" veces el caracter '"+letra+"' en la frase");
*/


        //BUSCAR UNA PALABRA EN LA FRASE

        /*String frase ="ab holaabab";//k
        //tres tistes tigres tragan trigotrigo trigo en un trigaltrigotrigo
        String palabra="ab";//palabra a buscar //j
        int maxPalabra=palabra.length();
        int maxFrase=frase.length()-maxPalabra;

        int cantidad=0;
        etiqueta:for (int i = 0; i <= maxFrase; ) {
            int k=i;
            for (int j = 0; j <maxPalabra ; j++) {
                if (frase.charAt(k++)!=palabra.charAt(j))
                {
                    i++;
                    continue etiqueta;//pasa al siguiente si es diferente por lo cual no cuenta
                }
            }
            cantidad++;
            i=i+maxPalabra;
        }
        System.out.println("Encontrado ("+cantidad+") veces la palabras '"+palabra+"'  en la frase");*/




        //Buscar una palabra en una frase
        //Scanner st=new Scanner(System.in);

        String p,f;
        //System.out.println("Ingrese la frase :");
        f="tres tristestr";
        //System.out.println("Ingrese la palabra a buscar en la frase: ");
        p="tr";
        //"tres tristestr"//i
        //"tr"//j
        int cantidad=0;
        int np=p.length();
        int nf=f.length()-np;


        etiqueta:
        for (int i = 0; i <=nf ; ) {
            int x =i;
            for (int j = 0; j <np ; j++) {

                if (p.charAt(j)!=f.charAt(x++)) {
                    i++;
                    continue etiqueta;
                }
            }
            i=i+np;
            cantidad++;
        }
        System.out.println("cantidad = " + cantidad);











    }
}
