package D_Principio_Ocultacion;

public class Automovil {
    private String fabricante;
    private String  modelo;
    private String color="griss";
    private double cilindrada;
    private int capacidadEstanque=40;//litros de gas o bencina

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


    public String verDetalle(){
        StringBuilder sb= new StringBuilder();
        sb.append("fabricante = " + this.fabricante);
        sb.append("\nmodelo = " + this.modelo);
        sb.append("\ncolor = " + this.color);
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

    public float calcularConsumo(int km, int porcentajeBencina){
        return  (km/(this.capacidadEstanque*(porcentajeBencina/100f)));
    }


}
