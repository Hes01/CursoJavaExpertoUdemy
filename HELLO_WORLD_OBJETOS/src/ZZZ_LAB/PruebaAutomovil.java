package ZZZ_LAB;




public class PruebaAutomovil {
    public static void main(String[] args) {
        //Automovil auto1 = new Automovil("Toyota","Corolla","Rojo",1.8);
        //Automovil auto2 = new Automovil("Nissan","Sentra","Negro",2.0);
        /*System.out.println("Fabricante: "+auto.getFabricante());
        System.out.println("Modelo: "+auto.getModelo());
        System.out.println("Color: "+auto.getColor());
        System.out.println("Cilindrada: "+auto.getCilindrada());

        //modificar el color
        auto.setColor("azul");
        System.out.println("Color actualizado: "+auto.getColor());

        System.out.println("--------");

        System.out.println("hola");
        auto.verDetalle();
    */


        //System.out.println("Automoviles creadoss : "+Automovil.getContadorAutomoviles());
        //System.out.println("1.8 litros equivalen a "+Automovil.convertirCilindradaCC(1.8)+" cc");


        Automovil normal=new Automovil("Toyota","Corolla","Blanco",1.8);

        AutomovilDeportivo deportivo = new AutomovilDeportivo("Porshe", "911 Turbo", "Plata", 3.8, 330.0);


        AutomovilElectrico electrico= new AutomovilElectrico("Tesla","Model S","Negro",0.0,100.0);

        //usando polimorfismo para mostrar todos
        //veremos que tenemos a todos heredando de una clase pero todos muestran un mensaje diferente
        Automovil[] automoviles ={normal,deportivo,electrico};
        for(Automovil auto:automoviles){
            auto.detalle();
            System.out.println("--------------------------");
        }







    }

}
