package K_Clase_Enum_UML;

public class Persona {
    private String nombre;
    private String apellido;
    private int id;
    private static int ultId;//parte de la clase

    public Persona(){
        this.id=++Persona.ultId;
    }

    public Persona(String nombre, String apellido) {
        this();
        this.nombre = nombre;
        this.apellido = apellido;
    }

    @Override
    public String toString() {
        return  this.id+": " + apellido +" " + nombre ;
    }


    public int getId() {
        return id;
    }
}
