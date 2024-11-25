package K_Clase_Enum_UML;

public enum Color {
    //CONSTANTES
    ROJO("Rojo"),//esto seria como invocar un constructor
    AMARILLO("Amarillo"),
    AZUL("Azul"),
    BLANCO("Blanco"),
    GRIS("Gris oscuro"),
    NARANJO("Naranja");


    private final String color;//atributo

    Color(String color) {//constructor
        this.color = color;//asignar a atributo
    }

    public String getColor() {//solo hay get porque no se puede modificar
        return color;
    }

    /*
    * si pones esto se mostrara el valor tal cual lo tienen las constantes pero sino lo pones
    * las constantes pondran el valor en mayuscula!
    * */

    @Override
    public String toString() {
        return this.color ;
    }
}
