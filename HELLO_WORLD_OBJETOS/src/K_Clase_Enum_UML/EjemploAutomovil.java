package K_Clase_Enum_UML;



import java.awt.image.TileObserver;
import java.util.Date;

public class EjemploAutomovil {
    public static void main(String[] args) {
        //constructor solo se puede llamar con el new
        Automovil subaru= new Automovil("subaru","Impreza");
        subaru.setMotor(new Motor(2.0,TipoMotor.DIESEL));
        subaru.setEstanque(new Estanque());


        Automovil nissan= new Automovil("Nissan","Navara", Color.GRIS,new Motor(4.0,TipoMotor.BENCINA),new Estanque(50));//este es del constructor vacio es decir de la sobrecarga
        Automovil nissan2= new Automovil("Nissan","Navara",Color.GRIS,new Motor(3.5,TipoMotor.DIESEL),new Estanque(50));//este es del constructor vacio es decir de la sobrecarga
        Automovil mazda = new Automovil("Mazda","BT-50",Color.ROJO,new Motor(2.0,TipoMotor.DIESEL));
        mazda.setEstanque(new Estanque(45));


        Automovil auto= new Automovil();
        Date fecha=new Date();

        System.out.println("compara referencias con ==,  son iguales?= "+(nissan==nissan2));
        System.out.println("compara referencias con equals,  son iguales?= "+(nissan.equals(nissan2)));
        subaru.setTipo(TipoAutomovil.STATION_WAGON);
        mazda.setTipo(TipoAutomovil.PICKUP);
        nissan.setTipo(TipoAutomovil.CONVERTIBLE);

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
