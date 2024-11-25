package I_Atributos_Constantes_Final;

public class Automovil {

/*
*                       Atributos
* */

    private int id;//para asignar un id a los automoviles, no ponemos cero porque al ser primitivo int parte en cero
    private String fabricante;
    private String  modelo;
    private String color=COLOR_GRIS;//puedo utilizar la constante directamente por que esta en la misma clase
    private double cilindrada;
    private int capacidadEstanque=40;//litros de gas o bencina

//static:modificador acceso que le pertenece a la clase

    private static String colorPatente="naranja";
    private static  int capacidadEstanqueEstatico=30;
    private static int ultimoId;//no inicializamos con valores por que por defecto parte en cero ya sabemos

//final
    //nomenclatura de final es solo en mayuscula se crea
    //static and final: se basan en el comportamiento
    //public,private...: se basan en el acceso
    public  static  final Integer VELOCIDAD_MAX_CARRETERA=120;
    public static final int VELOCIDAD_MAX_CIUDAD=60;

    public static  final String COLOR_ROJO= "Rojo";
    public static  final String COLOR_AMARILLO= "Amarillo";
    public static  final String COLOR_AZUL= "Azul";
    public static  final String COLOR_BLANCO= "Blanco";
    public static  final String COLOR_GRIS= "Gris oscuro";


/*
*                      Constructores
* */

    public Automovil(){
        this.id=++Automovil.ultimoId;
    }
    public Automovil(String fabricante,String modelo){
        this();
        this.fabricante=fabricante;
        this.modelo=modelo;
    }

    //this(aqui van los parametros del cual queremos reutilizar) :para reutilizar constructores ojito
    public Automovil(String fabricante, String modelo, String color) {
        this(fabricante,modelo);//llama al constructor anterior
        this.color = color;
    }

    public Automovil(String fabricante, String modelo, String color, double cilindrada) {
        this(fabricante,modelo,color);
        this.cilindrada = cilindrada;
    }

    public Automovil(String fabricante, String modelo, String color, double cilindrada, int capacidadEstanque) {
        this(fabricante,modelo,color,cilindrada);
        this.capacidadEstanque = capacidadEstanque;
    }

/*                      Get and set
*
* POJO:
* plain old java object
* */
    public String getFabricante(){
        return this.fabricante;
    }
    public String getModelo(){
        return  this.modelo;
    }
    public String getColor(){
        return  this.color;
    }
    public double getCilindrada(){
        return this.cilindrada;
    }
    public int getCapacidadEstanque(){
        return this.capacidadEstanque;
    }
    public static String getColorPatente() {
        return colorPatente;
    }
    public static int getcapacidadEstanqueEstatico(){return Automovil.capacidadEstanqueEstatico; }
    public int getId() {
        return id;
    }

    public void setFabricante(String fabricante){
        this.fabricante=fabricante;
    }
    public void setModelo(String modelo){
        this.modelo=modelo;
    }
    public void setColor(String color  ){
        this.color=color;
    }
    public void setCilindrada(double cilindrada){
        this.cilindrada=cilindrada;
    }
    public void setCapacidadEstanque(int capacidadEstanque){
        this.capacidadEstanque=capacidadEstanque;
    }
    public static void setColorPatente(String colorPatente) {
        Automovil.colorPatente = colorPatente;
    }
    public static void setCapacidadEstanqueEstatico(int capacidadEstanqueEstatico){Automovil.capacidadEstanqueEstatico=capacidadEstanqueEstatico;}
    public void setId(int id) {
        this.id = id;
    }

/*
*                       Metodos
* */
    public String verDetalle(){
        StringBuilder sb= new StringBuilder();
        sb.append("Auto.id = "+this.id);
        sb.append("\nfabricante = " + this.fabricante);
        sb.append("\nmodelo = " + this.modelo);
        sb.append("\ncolor = " + this.color);
        sb.append("\ncolorPatente ="+colorPatente);//para acceder al estatic puede ser tambien Automovil.colorPatente
        sb.append("\ncilindrada = " + this.cilindrada);
        return sb.toString();
    }


    public String acelerar(int rpm){
        return  "el auto "+this.fabricante +" acelerando a "+ rpm + " rpm";
    }

    public String frenar(){
        return this.fabricante + " "+ this.modelo + " frenando!";//se puede obviar el this para mejor practica el this
    }

    public  String acelerarFrenar(int rpm){
        String acelerar= this.acelerar(rpm);//this: se refiere a atributos y metodos de la clase
        String frenar=this.frenar();
        return acelerar + "\n"+frenar+"\n";
    }

    public float calcularConsumo(int km, float porcentajeBencina){
        return  km/(this.capacidadEstanque*porcentajeBencina);
    }

//metodo estatico
    //dentro de ellos los atributos globales de la clase
    //tambien deben ser estaticos
    public static float calcularConsumo(int km, int porcentajeBencina){
        return  (km/(Automovil.capacidadEstanqueEstatico*(porcentajeBencina/100f)));
    }


    /*
    *                        SOBREESCRITURA DE METODOS QUE YA EXISTEN
    *
    * @Override: Es una marca que se le indica al compilador para hacerle saber que se esta sobreescribiendo un metodo
    * */


    /*      Metodo equals
    * */
    @Override
    public boolean equals(Object obj) {

        if(this ==obj){//si ambos objetos son iguales por referencia retornamos true
            return true;
        }

        //para evitar comparar de distintas instancias
        if(!(obj instanceof Automovil)){//si obj pasado no es instancia de automovil entonces falso
            return false;
        }


        Automovil a = (Automovil) obj;//casteamos el objeto
        return (this.fabricante!=null && this.fabricante.equals(a.getFabricante())
                && this.modelo!=null && this.modelo.equals(a.getModelo()));
    }


    /*      Metodo toString
     * */

    @Override
    public String toString() {
        //esto es para imprimir el objeto como texto podrias modificarlo sin problemas :D
        return "Automovil ["+this.id+"] {" +
                "fabricante='" + fabricante + '\'' +
                ", modelo='" + modelo + '\'' +
                ", color='" + color + '\'' +
                ", cilindrada=" + cilindrada +
                ", capacidadEstanque=" + capacidadEstanque +
                '}';
    }
}
