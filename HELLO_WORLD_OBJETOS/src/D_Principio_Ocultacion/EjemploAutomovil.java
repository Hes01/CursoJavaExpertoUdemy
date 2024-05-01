package D_Principio_Ocultacion;

public class EjemploAutomovil {
    public static void main(String[] args) {
        
        Automovil subaru= new Automovil();
        subaru.setFabricante("subaru");
        subaru.setModelo("Impreza");
        subaru.setCilindrada(2.0);
        subaru.setColor("blanco");

        Automovil mazda = new Automovil();
        mazda.setFabricante("Mazda");
        mazda.setModelo("BT-50");
        mazda.setCilindrada(3.0);
        mazda.setColor("rojo");

        System.out.println("ver fabricante= "+mazda.getFabricante());

        System.out.println( subaru.verDetalle());
        System.out.println(mazda.verDetalle());
        System.out.println(subaru.acelerar(3000));
        System.out.println(subaru.frenar());
        System.out.printf(mazda.acelerarFrenar(4000));

        System.out.println("kilomentros por litro "+ subaru.calcularConsumo(300,.6f));
        System.out.println("kilomentros por litro "+ subaru.calcularConsumo(300,60));
    }
}
