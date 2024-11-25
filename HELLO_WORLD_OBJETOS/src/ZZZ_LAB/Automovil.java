package ZZZ_LAB;

public class Automovil {


    private int id;
    private String fabricante ;
    private  String modelo ;
    private String color ; //color automovil
    private double cilindrada;
    private static  int contadorAutomoviles=0;




    public Automovil(String fabricante, String modelo, String color, double cilindrada) {
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.color = color;
        this.cilindrada = cilindrada;
        contadorAutomoviles++;
    }

    //metodos normales

    public static int getContadorAutomoviles() {
        return contadorAutomoviles;
    }

    public static double convertirCilindradaCC(double cilindradaLitros){
        return cilindradaLitros*1000; // 1 litro = 1000cc
    }


    //metodos get and set


    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(double cilindrada) {
        this.cilindrada = cilindrada;
    }

    public void detalle(){
        System.out.println("Automovil: ");
        System.out.println("Fabricante: "+this.fabricante);
        System.out.println("Modelo: "+this.modelo);
        System.out.println("Color: "+this.color);
        System.out.println("Cilindrada: "+this.cilindrada+" L");
    }







}
