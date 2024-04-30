package A_HelloWorld;

import javax.swing.*;

public class SistemasNumericos {
    public static void main(String[] args) {
        System.out.println();

        //DECIMAL
        int numeroDecimal=0;
        String numeroStr=JOptionPane.showInputDialog(null,"ingrese un número entero");
        try {//tratar de ejecutar codigo
            numeroDecimal= Integer.parseInt(numeroStr);//convertir de string a int
        }catch (NumberFormatException e) {//NumberFormatException e
            JOptionPane.showMessageDialog(null,"Error debe ingresar numero entero");
            main(args);//invocamos al main de nuevo :O
            System.exit(0);//para salir xd sino no salia se forma bucle sino se pone
        }
        System.out.println("numeroDecimal = " + numeroDecimal);

        System.out.println();
        System.out.println("numero binario de " + numeroDecimal+" = " +Integer.toBinaryString(numeroDecimal));
        //BINARIO
        int numeroBinario=0b111110100;//con 0b delante se entiende  que es binario
        System.out.println("numero binario ="+numeroBinario);
        System.out.println();
        System.out.println("numero octal="+Integer.toOctalString(numeroDecimal));
        System.out.println();
        //OCTAL
        int numeroOctal=0764;//para indicar que es octal se pone delante el 0
        System.out.println("numeroOctal = " + numeroOctal);
        System.out.println();
        System.out.println("numero hexadecimal de "+numeroDecimal+"="+Integer.toHexString(numeroDecimal));
        //HEXADECIMAL
        int numeroHex=0x1f4;//con 0x delante indicamos que el número es un hexadecimal
        System.out.println("numeroHex = " + numeroHex);

        String mensaje= "numero binario de " + numeroDecimal+" = " +Integer.toBinaryString(numeroDecimal)+
                "\n"+
                "numero octal de "+numeroDecimal+"="+Integer.toOctalString(numeroDecimal)+
                "\n"+
                "numero hexadecimal de "+numeroDecimal+"="+Integer.toHexString(numeroDecimal);
        JOptionPane.showMessageDialog(null,mensaje);

    }
}
