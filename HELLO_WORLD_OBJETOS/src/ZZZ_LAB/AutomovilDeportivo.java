package ZZZ_LAB;

//herencia
public class AutomovilDeportivo extends Automovil{
    private double velocidadMaxima;

    public AutomovilDeportivo(String fabricante, String modelo, String color, double cilindrada,double velocidadMaxima) {
        super(fabricante, modelo, color, cilindrada);
        this.velocidadMaxima=velocidadMaxima;
    }

    public double getVelocidadMaxima(){
        return velocidadMaxima;
    }
    public  void setVelocidadMaxima(double velocidadMaxima){
        this.velocidadMaxima=velocidadMaxima;
    }


    //Sobreescribe un metodo heredado
    @Override
    public void detalle(){
         super.detalle() ;
        System.out.println("Velocidad máxima : "+velocidadMaxima+" k/h");;
    }



}
