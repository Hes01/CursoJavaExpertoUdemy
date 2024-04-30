package Z_Ejecicios;

import java.util.Scanner;

public class A_B_EjercicioVariables_DetalleFactura {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        //nombre factura o descripcion
        String nombreFac = "";//factura de productos
        double precio = 0.0d;
        double totalBruto = 0.0d;
        double impuesto = 0.0d;
        double porcImpuesto=0.19d;
        double montoTotalNeto=0.0d;

        //sout(nombreFac + monto total bruto + impuesto + monto otal neto incluido con el impuesto)
        System.out.println("Ingrese el nombre de la factura: ");
        nombreFac= entrada.nextLine();// nombre de la factura
        System.out.println("Ingrese el primer precio del producto: ");
        precio = entrada.nextDouble();//primer precio de producto
        totalBruto +=precio;
        System.out.println("Ingrese el segundo precio del producto: ");
        precio =entrada.nextDouble();//segundo precio de producto
        totalBruto +=precio;

        //calculamos el impuesto
        impuesto=porcImpuesto*totalBruto;
        //calculo del monto total del impuesto
        montoTotalNeto=totalBruto+impuesto;

        System.out.println("La "+nombreFac+" tiene un total bruto de "+totalBruto+", con  un impuesto de "+impuesto+" y el monto " +
                "después de impuesto es de "+montoTotalNeto);

    }

}
