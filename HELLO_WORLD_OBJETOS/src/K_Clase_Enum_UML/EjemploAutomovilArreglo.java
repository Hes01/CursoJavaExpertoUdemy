package K_Clase_Enum_UML;


import java.util.Arrays;

public class EjemploAutomovilArreglo {

    public static void main(String[] args) {




        
        Persona conductorSubaru = new Persona("Luci","Martinez");
       Automovil subaru = new Automovil("subaru", "Impreza");
       subaru.setMotor(new Motor(3,TipoMotor.DIESEL));
        //subaru.setRuedas(ruedasSubaru);

       subaru.setEstanque(new Estanque(2));
        subaru.setColor(Color.BLANCO);
        subaru.setTipo(TipoAutomovil.HATCHBACK);
        subaru.setConductor(conductorSubaru);





        
        
        Persona pato = new Persona("Pato","Rodriguez");
       Automovil mazda = new Automovil("Mazda", "BT-50",Color.ROJO, new Motor(3,TipoMotor.BENCINA));
       mazda.setEstanque(new Estanque(60));
        mazda.setTipo(TipoAutomovil.PICKUP);
        mazda.setConductor(pato);


        Persona bea =  new Persona("Bea","Gonzáles");
       Automovil nissan = new Automovil("Nissan", "Navara",Color.GRIS,
               new Motor(3.5,TipoMotor.BENCINA), new Estanque(50));//este es del constructor vacio es decir de la sobrecarga
        nissan.setConductor(bea);
        nissan.setTipo(TipoAutomovil.PICKUP);




        Persona lalo = new Persona("Lalo","Mena");
       Automovil susuki = new Automovil("Suzuki", "Vitara",
               Color.GRIS, new Motor(1.6,TipoMotor.DIESEL), new Estanque(50));//este es del constructor vacio es decir de la sobrecarga
        susuki.setConductor(lalo);
        susuki.setTipo(TipoAutomovil.SUV);
        susuki.setColor(Color.AMARILLO);
       Automovil.setColorPatente(Color.AZUL);//para modificar por el nombre de la clase porque le pertence a la clase


       Automovil audi = new Automovil("Audi","A3");
       audi.setConductor(new Persona("Jano","Pérez"));


       Automovil[] autos = new Automovil[5];
        autos[0] = subaru;
        autos[1] = mazda;
        autos[2] = nissan;
        autos[3] = susuki;
        autos[4] = audi;

        Arrays.sort(autos);//ordenamos por fabricante ojo pero con interfaces :) que chill

        for(Automovil auto: autos ){
            System.out.println(auto);
        }





    }
}
