package K_Clase_Enum_UML;

public class Rueda {
    private String  fabricante;
    private int aro;
    private double ancho;

    public Rueda(String fabricante, int aro, double ancho) {
        this.fabricante = fabricante;
        this.ancho = ancho;
        this.aro = aro;
    }

    public String getFabricante() {
        return fabricante;
    }

    public int getAro() {
        return aro;
    }

    public double getAncho() {
        return ancho;
    }
}
