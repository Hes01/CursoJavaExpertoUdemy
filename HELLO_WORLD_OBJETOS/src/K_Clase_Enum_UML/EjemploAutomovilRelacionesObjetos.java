package K_Clase_Enum_UML;


import javax.print.attribute.standard.ReferenceUriSchemesSupported;

public class EjemploAutomovilRelacionesObjetos {

    public static void main(String[] args) {




        
        Persona conductorSubaru = new Persona("Luci","Martinez");
       Automovil subaru = new Automovil("subaru", "Impreza");
       subaru.setMotor(new Motor(3,TipoMotor.DIESEL));
        //subaru.setRuedas(ruedasSubaru);

       subaru.setEstanque(new Estanque(2));
        subaru.setColor(Color.BLANCO);
        subaru.setTipo(TipoAutomovil.HATCHBACK);
        subaru.setConductor(conductorSubaru);



        /*Rueda[] ruedasMazda = {
                new Rueda("Michelin",18,10.5),
                new Rueda("Michelin",18,10.5),
                new Rueda("Michelin",18,10.5),
                new Rueda("Michelin",18,10.5),
                new Rueda("Michelin",18,10.5),
        };
*/

        Rueda[] ruedasSubaru= new Rueda[6];

        for (int i = 0; i < ruedasSubaru.length; i++) {
            subaru.addRueda(new Rueda("Yokohama",16,7.5));
        }


        
        
        Persona pato = new Persona("Pato","Rodriguez");
       Automovil mazda = new Automovil("Mazda", "BT-50",Color.ROJO, new Motor(3,TipoMotor.BENCINA));
       mazda.setEstanque(new Estanque(60));
        mazda.setTipo(TipoAutomovil.PICKUP);
        mazda.setConductor(pato);
       // mazda.setRuedas(ruedasMazda);


     /*   Rueda[] ruedasNissan = {
                new Rueda("Pirelli",20,11.5),
                new Rueda("Pirelli",20,11.5),
                new Rueda("Pirelli",20,11.5),
                new Rueda("Pirelli",20,11.5),
                new Rueda("Pirelli",20,11.5),
        };
        */
        Rueda[] ruedasMazda = new Rueda[5];
        for (int i = 0; i < ruedasMazda.length; i++) {
            mazda.addRueda(new Rueda("Michelin",18,10.5));
        }


        Rueda[] ruedaNissan=new Rueda[5];

        for (int i = 0; i <ruedaNissan.length ; i++) {
            ruedaNissan[i] = new Rueda("Pirelli",20,11.5);
        }

        Persona bea =  new Persona("Bea","Gonzáles");
       Automovil nissan = new Automovil("Nissan", "Navara",Color.GRIS,
               new Motor(3.5,TipoMotor.BENCINA), new Estanque(50));//este es del constructor vacio es decir de la sobrecarga
        nissan.setConductor(bea);
        nissan.setTipo(TipoAutomovil.PICKUP);

        nissan.addRueda(new Rueda("Pirelli",20,11.5))
                .addRueda(new Rueda("Pirelli",20,11.5))
                .addRueda(new Rueda("Pirelli",20,11.5))
                .addRueda(new Rueda("Pirelli",20,11.5))
                .addRueda(new Rueda("Pirelli",20,11.5));


/*        Rueda[] ruedasNissan2 = {
                new Rueda("Pirelli",20,11.5),
                new Rueda("Pirelli",20,11.5),
                new Rueda("Pirelli",20,11.5),
                new Rueda("Pirelli",20,11.5),
                new Rueda("Pirelli",20,11.5),
        };*/

        Rueda[] ruedasNissan2=new Rueda[5];

        for (int i = 0; i <ruedasNissan2.length ; i++) {
            ruedasNissan2[i] = new Rueda("Pirelli",20,11.5);
        }
        Persona lalo = new Persona("Lalo","Mena");
       Automovil nissan2 = new Automovil("Nissan", "Navara",
               Color.GRIS, new Motor(3.5,TipoMotor.DIESEL), new Estanque(50),lalo,ruedasNissan2);//este es del constructor vacio es decir de la sobrecarga
        nissan2.setTipo(TipoAutomovil.PICKUP);
        nissan2.setColor(Color.AMARILLO);
       Automovil.setColorPatente(Color.AZUL);//para modificar por el nombre de la clase porque le pertence a la clase



        Rueda[] ruedasAuto={
                new Rueda("Toyota x4",28,13.9),
                new Rueda("Toyota x4",28,13.9),
                new Rueda("Toyota x4",28,13.9),
                new Rueda("Toyota x4",28,13.9),
                new Rueda("Toyota x4",28,13.9)

        };
       Automovil auto = new Automovil();
        System.out.println(subaru.verDetalle());
        System.out.println(mazda.verDetalle());
        System.out.println(nissan.verDetalle());
        System.out.println(nissan2.verDetalle());

/*        System.out.println("Conductor subaru: "+subaru.getConductor());
        System.out.println("Ruedas subaru: ");
        for(Rueda r: subaru.getRuedas()){
            System.out.println(r.getFabricante()+", "+r.getAro()+", "+r.getAncho());
        }*/
    }
}
