package C_Metodos_Sobrecarga_Encapsulamiento;

public class EjemploAutomovil {
    public static void main(String[] args) {
        
        Automovil subaru= new Automovil();
        subaru.fabricante="subaru";
        subaru.modelo="impresa";
        subaru.cilindrada=2.0;
        subaru.color="blanco";

        Automovil mazda = new Automovil();
        mazda.fabricante="Mazda";
        mazda.modelo="BT-50";
        mazda.cilindrada=3.0;
        mazda.color="rojo";

        System.out.println( subaru.verDetalle());
        System.out.println(mazda.verDetalle());
        System.out.println(subaru.acelerar(3000));
        System.out.println(subaru.frenar());
        System.out.printf(mazda.acelerarFrenar(4000));

        System.out.println("kilomentros por litro "+ subaru.calcularConsumo(300,.6f));
        System.out.println("kilomentros por litro "+ subaru.calcularConsumo(300,60));
    }
}
