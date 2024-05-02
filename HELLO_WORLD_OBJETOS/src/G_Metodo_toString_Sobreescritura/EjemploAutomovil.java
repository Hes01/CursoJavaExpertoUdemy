package G_Metodo_toString_Sobreescritura;

import java.util.Date;

public class EjemploAutomovil {
    public static void main(String[] args) {
        //constructor solo se puede llamar con el new
        Automovil subaru= new Automovil("subaru","Impreza");
        Automovil nissan= new Automovil("Nissan","Navara","Gris oscuro",3.5,50);//este es del constructor vacio es decir de la sobrecarga
        Automovil nissan2= new Automovil("Nissan","Navara","Gris oscuro",3.5,50);//este es del constructor vacio es decir de la sobrecarga
        Automovil mazda = new Automovil("Mazda","BT-50","Rojo",3.0);

        Automovil auto= new Automovil();
        Date fecha=new Date();

        System.out.println("compara referencias con ==,  son iguales?= "+(nissan==nissan2));
        System.out.println("compara referencias con equals,  son iguales?= "+(nissan.equals(nissan2)));
        System.out.println( subaru.verDetalle());
        System.out.println(mazda.verDetalle());
        System.out.println(nissan.verDetalle());

        System.out.println(auto.equals(fecha));
        /*veamos el toString
        * cuando vamos a imprimir un objeto asi como se ve abajo nos da una dirección(tambien conocido como hashcode() ) pero
        * es lo mismo si le ponemos nissan.toString() pero esto
        * al igual como el equals lo podemos personalizar para que funcione como nosotros queramos
        * */

        System.out.println(nissan);
        System.out.println(nissan.toString());

        System.out.println(subaru.acelerar(3000));
        System.out.println(subaru.frenar());
        System.out.printf(mazda.acelerarFrenar(4000));

        System.out.println("kilomentros por litro "+ subaru.calcularConsumo(300,.6f));

        System.out.println("kilomentros por litro "+ subaru.calcularConsumo(300,60));
        System.out.println("kilomentros por litro "+ nissan.calcularConsumo(300,60));


    }
}
