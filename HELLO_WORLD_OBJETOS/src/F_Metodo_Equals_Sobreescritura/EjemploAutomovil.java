package F_Metodo_Equals_Sobreescritura;

import java.util.Date;

public class EjemploAutomovil {
    public static void main(String[] args) {
        //constructor solo se puede llamar con el new
        Automovil subaru= new Automovil("subaru","Impreza");

        subaru.setCilindrada(2.0);
        subaru.setColor("blanco");

        Automovil mazda = new Automovil("Mazda","BT-50","Rojo",3.0);
        System.out.println("ver fabricante= "+mazda.getFabricante());

        Automovil nissan= new Automovil("Nissan","Navara","Gris oscuro",3.5,50);//este es del constructor vacio es decir de la sobrecarga

        Automovil nissan2= new Automovil("Nissan","Navara","Gris oscuro",3.5,50);//este es del constructor vacio es decir de la sobrecarga





        System.out.println("compara referencias con ==,  son iguales?= "+(nissan==nissan2));
        System.out.println("compara referencias con equals,  son iguales?= "+(nissan.equals(nissan2)));

        /*como ya sobreescribimos el metodo equals entonces ahora si sera iguales
        * eso es principio de polimorfismo hacer que un mismo metodo funcione de diferentes maneras
        *
        * Nota: antes nos daba tanto con == como con equals() , falso porque solo comparaban referencias pero
        * cuando ya lo sobreescribimos para que pueda comparar a nuestra preferencia entonces ahora si esta mucho mejor
        * el @override puedes quitarlo pero es mejor dejarlo por el hecho que otro desarrollador se puede dar cuenta que es lo
        * que hemos nosotros realizado
        * */


        System.out.println( subaru.verDetalle());
        System.out.println(mazda.verDetalle());
        System.out.println(nissan.verDetalle());
        System.out.println(subaru.acelerar(3000));
        System.out.println(subaru.frenar());
        System.out.printf(mazda.acelerarFrenar(4000));

        System.out.println("kilomentros por litro "+ subaru.calcularConsumo(300,.6f));
        System.out.println("kilomentros por litro "+ subaru.calcularConsumo(300,60));
        System.out.println("kilomentros por litro "+ nissan.calcularConsumo(300,60));



        Automovil auto= new Automovil();
        System.out.println(auto.equals(nissan));


        System.out.println("\033[0;32m");
        /*pongamos que queremos comparar objetos de diferentes intancias como date y coche o factura y clientes etc
        *esto me saldria error porque son de tipo incopatible error de cast
        * veamos
        * */
        Date fecha=new Date();

        System.out.println(auto.equals(fecha));
    }
}
