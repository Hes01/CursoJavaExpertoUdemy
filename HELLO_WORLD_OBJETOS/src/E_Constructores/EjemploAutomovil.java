package E_Constructores;

public class EjemploAutomovil {
    public static void main(String[] args) {
        //constructor solo se puede llamar con el new
        Automovil subaru= new Automovil("subaru","Impreza");

        subaru.setCilindrada(2.0);
        subaru.setColor("blanco");

        Automovil mazda = new Automovil("Mazda","BT-50","Rojo",3.0);

        Automovil nissan= new Automovil("Nissan","Navara","Gris oscuro",3.5,50);//este es del constructor vacio es decir de la sobrecarga

        System.out.println("ver fabricante= "+mazda.getFabricante());

        System.out.println( subaru.verDetalle());
        System.out.println(mazda.verDetalle());
        System.out.println(nissan.verDetalle());
        System.out.println(subaru.acelerar(3000));
        System.out.println(subaru.frenar());
        System.out.printf(mazda.acelerarFrenar(4000));

        System.out.println("kilomentros por litro "+ subaru.calcularConsumo(300,.6f));
        System.out.println("kilomentros por litro "+ subaru.calcularConsumo(300,60));
        System.out.println("kilomentros por litro "+ nissan.calcularConsumo(300,60));
    }
}
