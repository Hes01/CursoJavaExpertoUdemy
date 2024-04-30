package Z_Ejecicios;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class D_A_EjercicioClasesDateyCalendar_CalcularEdadPorFechaNacimiento {


    public static void main(String[] args) throws ParseException {
        Date fecha = new Date();
        long edad=0;
        Scanner e = new Scanner(System.in);
        System.out.println("Ingresa tu fecha de nacimiento dd/MM/yyyy :");

        String fechaStr = e.nextLine();

        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        
        try {
            Date fechaNacimiento = format.parse(fechaStr);
            Date fechaActual = new Date();
            long miliSegundos=fechaActual.getTime()-fechaNacimiento.getTime();
            edad=((((miliSegundos/1000)/60)/60)/24)/365;//segundos/minutos/horas/dias/años

            System.out.println("edad = " + edad);
            
        } catch (Exception e1) {
            e1.printStackTrace();
        }

    }
}
