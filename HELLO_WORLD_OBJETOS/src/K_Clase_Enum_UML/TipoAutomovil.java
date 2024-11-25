package K_Clase_Enum_UML;

public enum TipoAutomovil {
    SEDAN("Sedan","Auto normal",4),
    STATION_WAGON("station wagon","Auto grande",5),
    HATCHBACK("Hatchback","Auto compacto",5),
    PICKUP("Pickup","camioneta",4),
    COUPE("Coupe","auto pequeño",2),
    CONVERTIBLE("Convertible","Auto deportivo",2),
    FURGON("Furgón","Auto utilitario",3),
    SUV("SUV","Todo terreno deportivo",5),
    ;


    private final String nombre;
    private final int numeroPuertas;
    private  final String descripcion;

    TipoAutomovil(String nombre, String descripcion , int numeroPuertas) {
        this.nombre = nombre;
        this.numeroPuertas = numeroPuertas;
        this.descripcion = descripcion;
    }

    //solo tiene getter por que no es modificable el tipo private :v

    public String getDescripcion() {
        return descripcion;
    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return "TipoAutomovil{" +
                "nombre='" + nombre + '\'' +
                ", numeroPuertas=" + numeroPuertas +
                ", descripcion='" + descripcion + '\'' +
                '}';
    }
}
