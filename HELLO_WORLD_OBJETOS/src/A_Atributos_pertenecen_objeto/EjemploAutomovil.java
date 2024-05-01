package A_Atributos_pertenecen_objeto;

public class EjemploAutomovil {
    public static void main(String[] args) {
        
        Automovil auto= new Automovil();
        auto.fabricante="subaru";
        auto.modelo="impresa";
        auto.cilindrada=2.0;
        auto.color="blanco";

        Automovil mazda = new Automovil();
        mazda.fabricante="Mazda";
        mazda.modelo="BT-50";
        mazda.cilindrada=3.0;
        mazda.color="rojo";

        System.out.println("auto = " + auto.fabricante);
        System.out.println("auto = " + auto.modelo);
        System.out.println("auto.color = " + auto.color);
        System.out.println("auto.cilindrada = " + auto.cilindrada);
        System.out.println();
        System.out.println("auto = " + mazda.fabricante);
        System.out.println("auto = " + mazda.modelo);
        System.out.println("auto.color = " + mazda.color);
        System.out.println("auto.cilindrada = " + mazda.cilindrada);
    }
}
