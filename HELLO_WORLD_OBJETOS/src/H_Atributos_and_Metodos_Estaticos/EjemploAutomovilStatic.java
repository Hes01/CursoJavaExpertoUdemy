package H_Atributos_and_Metodos_Estaticos;

public class EjemploAutomovilStatic {

    public static void main(String[] args) {

        Automovil.setCapacidadEstanqueEstatico(45);
        Automovil subaru = new Automovil("subaru", "Impreza");
        subaru.setCilindrada(2.0);
        subaru.setColor("Blanco");

        Automovil mazda = new Automovil("Mazda", "BT-50", "Rojo", 3.0);
        System.out.println("mazda.fabricante = "+mazda.getFabricante());

        Automovil nissan = new Automovil("Nissan", "Navara", "Gris oscuro", 3.5, 50);//este es del constructor vacio es decir de la sobrecarga

        Automovil nissan2 = new Automovil("Nissan", "Navara", "Gris oscuro", 3.5, 50);//este es del constructor vacio es decir de la sobrecarga
        nissan2.setColor("amarillo");
        Automovil.setColorPatente("azul");//para modificar por el nombre de la clase porque le pertence a la clase

        Automovil auto = new Automovil();
        System.out.println(subaru.verDetalle());
        System.out.println(mazda.verDetalle());
        System.out.println(nissan.verDetalle());

        System.out.println(nissan2.verDetalle());
        System.out.println("Automovil.getColorPatente() = " + Automovil.getColorPatente());
        System.out.println(" kilometros por litros =  " + Automovil.calcularConsumo(300, 60));//forma correcto de llamar al metodo
        System.out.println(" kilometros por litros =  " + subaru.calcularConsumo(300, 60));//forma no practica pero en si funciona

    }
}
