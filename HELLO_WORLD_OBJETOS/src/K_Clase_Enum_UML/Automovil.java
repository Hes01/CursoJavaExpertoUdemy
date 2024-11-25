package K_Clase_Enum_UML;



public class Automovil implements Comparable<Automovil>{

/*
*                       Atributos
* */

    private int id;//para asignar un id a los automoviles, no ponemos cero porque al ser primitivo int parte en cero
    private String fabricante;
    private String  modelo;
    private Color color=Color.GRIS;//se declara del tipo de la clase luego se le asigna el enum colo la clase.atributo
    private Motor motor;
    private Estanque estanque;//litros de gas o bencina
    private Persona conductor;
    private Rueda[] ruedas;//porque tiene 5, 1 de repuesto
private int indiceRuedas;

    private TipoAutomovil tipo;

//static:modificador acceso que le pertenece a la clase

    private static Color colorPatente=Color.NARANJO;
    private static  int capacidadEstanqueEstatico=30;
    private static int ultimoId;//no inicializamos con valores por que por defecto parte en cero ya sabemos

//final
    //nomenclatura de final es solo en mayuscula se crea
    //static and final: se basan en el comportamiento
    //public,private...: se basan en el acceso
    public  static  final Integer VELOCIDAD_MAX_CARRETERA=120;
    public static final int VELOCIDAD_MAX_CIUDAD=60;

//    public static  final String COLOR_ROJO= "Rojo";
//    public static  final String COLOR_AMARILLO= "Amarillo";
//    public static  final String COLOR_AZUL= "Azul";
//    public static  final String COLOR_BLANCO= "Blanco";
//    public static  final String COLOR_GRIS= "Gris oscuro";


/*
*                      Constructores
* */

    public Automovil(){
        this.id=++Automovil.ultimoId;
        this.ruedas= new Rueda[5];
    }

    public Automovil(String fabricante, String modelo){
        this();
        this.fabricante=fabricante;
        this.modelo=modelo;
    }

    //this(aqui van los parametros del cual queremos reutilizar) :para reutilizar constructores ojito
    public Automovil(String fabricante, String modelo, Color color) {
        this(fabricante,modelo);//llama al constructor anterior
        this.color = color;
    }

    public Automovil(String fabricante, String modelo, Color color, Motor motor) {
        this(fabricante,modelo,color);
        this.motor = motor;
    }

    public Automovil(String fabricante, String modelo, Color color, Motor motor, Estanque estanque) {
        this(fabricante,modelo,color,motor);
        this.estanque = estanque;
    }

    public Automovil(String fabricante, String modelo, Color color, Motor motor, Estanque estanque, Persona conductor, Rueda[] ruedas) {
        this(fabricante,modelo,color,motor,estanque);
        this.conductor = conductor;
        this.ruedas = ruedas;
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
    public Color getColor(){
        return  this.color;
    }

    public static Color getColorPatente() {
        return colorPatente;
    }
    public static int getcapacidadEstanqueEstatico(){return Automovil.capacidadEstanqueEstatico; }
    public int getId() {
        return id;
    }

    public TipoAutomovil getTipo() {
        return tipo;
    }


    public void setTipo(TipoAutomovil tipo) {
        this.tipo = tipo;
    }

    public void setFabricante(String fabricante){
        this.fabricante=fabricante;
    }
    public void setModelo(String modelo){
        this.modelo=modelo;
    }
    public void setColor(Color color  ){
        this.color=color;
    }

    public static void setColorPatente(Color colorPatente) {
        Automovil.colorPatente = colorPatente;
    }
    public static void setCapacidadEstanqueEstatico(int capacidadEstanqueEstatico){Automovil.capacidadEstanqueEstatico=capacidadEstanqueEstatico;}
    public void setId(int id) {
        this.id = id;
    }




    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public Estanque getEstanque() {
       return  estanque ==null? this.estanque=(new Estanque()) :  estanque;
    }

    public void setEstanque(Estanque estanque) {
        this.estanque = estanque;
    }

    public Persona getConductor() {
        return conductor;
    }

    public void setConductor(Persona conductor) {
        this.conductor = conductor;
    }

    public Rueda[] getRuedas() {
        return ruedas;
    }

    public void setRuedas(Rueda[] ruedas) {
        this.ruedas = ruedas;
    }

    public Automovil addRueda(Rueda rueda)
    {
        if(indiceRuedas < this.ruedas.length) {
            this.ruedas[indiceRuedas++] = rueda;//
        }
        return this;
    }







    /*
*                       Metodos
* */





    public String verDetalle(){
        String tipo= this.getTipo()!=null? this.tipo.getNombre():"Tipo no asignado";
        double cilindrada = this.motor!=null? this.motor.getCilindrada():0;
        String ruedas ="";
        for(Rueda r: this.getRuedas()){
            ruedas += ("\n"+r.getFabricante()+", "+r.getAro()+", "+r.getAncho());
        };


        String conductorr = (conductor !=null) ?  this.conductor.getId() +": "+ this.getConductor().toString() : "";
        return "-----------------"+
                "\nauto.id= "+this.id+
                "\nauto.fabricante = "+this.getFabricante()+
                "\nauto.modelo = "+this.getModelo()+
                "\nauto.tipo = "+tipo+
                "\nauto.color = "+this.color.getColor()+
                "\nauto.patenteColor = "+this.colorPatente.getColor()+
                "\nauto.cilindrada =" +cilindrada+
                "\nruedas = " + ruedas+

                ("\nConductor subaru: id "+conductorr)+
                "\n-----------------" ;
                
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
        return  km/(this.getEstanque().getCapacidad()*(porcentajeBencina));
    }

    public float calcularConsumo(int km, int porcentajeBencina){
        return  km/(this.getEstanque().getCapacidad()*(porcentajeBencina)/100f);
    }

//metodo estatico
    //dentro de ellos los atributos globales de la clase
    //tambien deben ser estaticos
   /* public static float calcularConsumo(int km, int porcentajeBencina){
        return  km/(this.estanque.getCapacidad()*(porcentajeBencina)/100f);
    }*/


    public static float calcularConsumo(int km, int porcentajeBencina,Estanque estanque){
        return  km/(estanque.getCapacidad()*(porcentajeBencina)/100f);
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
        return this.id+": " +
                "fabricante='" + fabricante + '\'' +
                ", modelo='" + modelo + '\'' +
                //", tipo='" + tipo + '\'' +
                //", color='" + color + '\'' +
                //", cilindrada= " + this.motor.getCilindrada() +
                //", capacidadEstanque=" + this.motor.getCilindrada() +
                '}';
    }

    /*@Override
    public int compareTo(Object o) {
        Automovil a =(Automovil) o;


        return this.fabricante.compareTo(a.fabricante);
    }*/


    @Override//con <tipo>//omite cast
    public int compareTo(Automovil a) {

        return this.fabricante.compareTo(a.fabricante);
        //return this.conductor.toString().compareTo(a.conductor.toString());
    }


}
