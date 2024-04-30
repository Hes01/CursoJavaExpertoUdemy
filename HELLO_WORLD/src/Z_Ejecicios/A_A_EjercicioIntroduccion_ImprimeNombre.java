package Z_Ejecicios;

import javax.swing.*;

public class A_A_EjercicioIntroduccion_ImprimeNombre {
    //Crear una clase java e imprimir tu nombre en la salida o consola.
    public static void main(String[] args) {
        String nombre="";

        /*POR MEDIO DE SCANNER*/
        /*Scanner scanner = new Scanner(System.in);*/
        /*System.out.println("Cual es tu nombre ? : ");
        nombre =scanner.nextLine();
        System.out.println("tu nombre es = " + nombre);*/

        /*POR MEDIO DE VENTANAS DE JOPTIONPANE INPUT Y MESSAGE*/
        nombre = JOptionPane.showInputDialog(null,"ingresa tu nombre : ");
        JOptionPane.showMessageDialog(null,"tu nombre es: "+nombre);

    }
}
