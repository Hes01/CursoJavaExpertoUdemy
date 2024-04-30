package D_ClasesDateyCalendar;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class E_EjemploCompararFechas {
    public static void main(String[] args) {

        //FECHA ESCRITA


        Scanner str= new Scanner(System.in);
        System.out.println("Ingrese la fecha en el formato dd-MM-yyyy ejm,(31-12-2020) :");

        String fechaStr= str.nextLine();
        SimpleDateFormat format= new SimpleDateFormat("dd-MM-yyyy");//2020/02/21

        try {
            Date fecha=format.parse(fechaStr);
            //System.out.println("fecha sin formato = " + fecha);
            //System.out.println("fecha con formato = " + format.format(fecha));

            Date fecha2=new Date();//vamos a comparar con la fecha actual

            System.out.println("La fecha actual es  = " + fecha2);

            //manera 1 de comparar
            if(fecha.after(fecha2)){
                System.out.println("Fecha del usuario es despues que fecha2 ");
            }else if (fecha.before(fecha2)){
                System.out.println("fecha es anterior que fecha2 ");
            } else if (fecha.equals(fecha2)) {
                System.out.println("las fechas son iguales");
            }

            //manera 2 de comparar
            if(fecha.compareTo(fecha2) >0)//fecha es mayor que fecha 2
            {
                System.out.println("fecha1 (del usuario) es despues que fecha2 (actual)");
            } else if (fecha.compareTo(fecha2)<0) {
                System.out.println("fecha es anterior que fecha2");
            } else if (fecha.compareTo(fecha2)==0) {
                System.out.println("fecha es igual a fecha2");
            }

        } catch (ParseException e) {
            e.printStackTrace();
        }

    }
}
