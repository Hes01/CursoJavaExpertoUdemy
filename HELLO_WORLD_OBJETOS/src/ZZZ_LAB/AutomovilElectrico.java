package ZZZ_LAB;

public class AutomovilElectrico extends Automovil{

    private double capacidadBateria;

    public AutomovilElectrico(String fabricante, String modelo, String color, double cilindrada, double capacidadBateria){
        super(fabricante,modelo,color,cilindrada);
        this.capacidadBateria=capacidadBateria;
        //String fabricante, String modelo, String color, double cilindrada
    }

    public double getCapacidadBateria(){
        return capacidadBateria;
    }

    public void setCapacidadBateria(double capacidadBateria){
        this.capacidadBateria=capacidadBateria;
    }

    @Override
    public void detalle(){
        super.detalle();
        System.out.println("CapacidadBateria: "+capacidadBateria);
    }






}
