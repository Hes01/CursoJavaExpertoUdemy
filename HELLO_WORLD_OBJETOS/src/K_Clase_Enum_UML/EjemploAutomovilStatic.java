package K_Clase_Enum_UML;



public class EjemploAutomovilStatic {

    public static void main(String[] args) {

       Automovil.setCapacidadEstanqueEstatico(45);
       Automovil subaru = new Automovil("subaru", "Impreza");
       subaru.setMotor(new Motor(3,TipoMotor.DIESEL));


       subaru.setEstanque(new Estanque(2));
        subaru.setColor(Color.BLANCO);
        subaru.setTipo(TipoAutomovil.HATCHBACK);



       Automovil mazda = new Automovil("Mazda", "BT-50",Color.ROJO, new Motor(3,TipoMotor.BENCINA));
       mazda.setEstanque(new Estanque(60));
        mazda.setTipo(TipoAutomovil.PICKUP);
        System.out.println("mazda.fabricante = "+mazda.getFabricante());


       Automovil nissan = new Automovil("Nissan", "Navara",Color.GRIS, new Motor(3.5,TipoMotor.BENCINA), new Estanque(50));//este es del constructor vacio es decir de la sobrecarga
        nissan.setTipo(TipoAutomovil.PICKUP);

       Automovil nissan2 = new Automovil("Nissan", "Navara",Color.GRIS, new Motor(3.5,TipoMotor.DIESEL), new Estanque(50));//este es del constructor vacio es decir de la sobrecarga
        nissan2.setTipo(TipoAutomovil.PICKUP);
        nissan2.setColor(Color.AMARILLO);
       Automovil.setColorPatente(Color.AZUL);//para modificar por el nombre de la clase porque le pertence a la clase

       Automovil auto = new Automovil();
        System.out.println(subaru.verDetalle());
        System.out.println(mazda.verDetalle());
        System.out.println(nissan.verDetalle());

        System.out.println(nissan2.verDetalle());
        System.out.println("Automovil.getColorPatente() = " +Automovil.getColorPatente());//Automovil.getColorPatente().getColor()
        System.out.println(" kilometros por litros =  " +Automovil.calcularConsumo(300, 60,new Estanque(80)));//forma correcto de llamar al metodo
        System.out.println(" kilometros por litros =  " + subaru.calcularConsumo(300, 60));//forma no practica pero en si funciona

        //constantes
        System.out.println("velocidad maxima de carretera "+Automovil.VELOCIDAD_MAX_CARRETERA);
        System.out.println("velocidad maxima de ciudad "+ Automovil.VELOCIDAD_MAX_CIUDAD);
        TipoAutomovil tipoSubaru= subaru.getTipo();
        System.out.println("tipo subaru: "+tipoSubaru.getNombre());
        System.out.println("tipo desc. subaru: "+tipoSubaru.getDescripcion());


    }
}
