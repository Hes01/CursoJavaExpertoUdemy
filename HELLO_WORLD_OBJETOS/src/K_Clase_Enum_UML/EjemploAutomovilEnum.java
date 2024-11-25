package K_Clase_Enum_UML;



public class EjemploAutomovilEnum {

    public static void main(String[] args) {

        Automovil.setCapacidadEstanqueEstatico(45);
        Automovil subaru = new Automovil("subaru", "Impreza");
        subaru.setMotor(new Motor(2.0,TipoMotor.BENCINA));
        subaru.setColor(Color.BLANCO);
        subaru.setTipo(TipoAutomovil.HATCHBACK);



        Automovil mazda = new Automovil("Mazda", "BT-50", Color.ROJO, new Motor(3.0,TipoMotor.BENCINA));
        mazda.setEstanque(new Estanque(45));
        mazda.setTipo(TipoAutomovil.PICKUP);
        System.out.println("mazda.fabricante = "+mazda.getFabricante());



        TipoAutomovil tipo= subaru.getTipo();
        System.out.println("tipo subaru: "+tipo.getNombre());
        System.out.println("tipo desc. subaru: "+tipo.getDescripcion());

        tipo  = mazda.getTipo();

        //java v13 en adelante
        switch(tipo){
            case CONVERTIBLE ->
                System.out.println("El automovil es deportivo y descapotable de dos puertas.");
            case COUPE ->
                System.out.println("Es un automovil pequeño de dos puertas ytipicamente desportivo.");
            case FURGON ->
                System.out.println("es un automovil utilitario de transporte , de empresas.");
            case HATCHBACK ->
                System.out.println("Es un automovil mediano compacto, aspecto deportivo.");
            case PICKUP ->
                System.out.println("Es un automovil de doble cabina o camioneta");
            case SEDAN ->
                System.out.println("Es un automovil mediano");
            case STATION_WAGON ->
                System.out.println("Es un automovil mas grande , con maleta grande...");
        }

        TipoAutomovil[] tipos = TipoAutomovil.values();
        for(TipoAutomovil ta:tipos){
            System.out.println(ta+" => "+ta.name()+", "+
                    ta.getNombre()+", "+
                    ta.getDescripcion()+", "+
                    ta.getNumeroPuertas());
            System.out.println();
        }

    }
}
