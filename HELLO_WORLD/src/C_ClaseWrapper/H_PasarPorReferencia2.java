package C_ClaseWrapper;
class  Persona{
    private String nombre;
    
    public void modificarNombre(String nuevoNombre){
        this.nombre=nuevoNombre;//this para hacer referencia a atributo de la misma clase
    }
    public String leerNombre(){
        return nombre;//se puede omitir this siempre y cuando no hay otro atributo llamado igual
    }
}

public class H_PasarPorReferencia2 {
    //mutable 
    public static void main(String[] args) {

        Persona persona= new Persona();
        persona.modificarNombre("Elvis");

        System.out.println("iniciamos el main ");
        System.out.println("persona = " + persona.leerNombre());
        System.out.println("Antes de llamar al metodo test");
        test(persona);//modifica el arreglo
        System.out.println("Despues de invocar al metodo test");

        System.out.println("persona.leerNombre() = " + persona.leerNombre());

        System.out.println("finaliza el metodo main con los datos de la persona modificados " );//no cambia
    }

    public static  void test(Persona persona){
        System.out.println(" iniciaimos el etodo test ");
        persona.modificarNombre("pepe");
        System.out.println("Finaliza con el metodo test ");
    }
}
