package D_ClasesDateyCalendar;

import java.text.SimpleDateFormat;
import java.util.Date;

public class A_EjemploJavaUtilDate {
    public static void main(String[] args) {
        Date fecha= new Date();
        
        //imprime la fecha actual
        System.out.println("fecha = " + fecha);
        
        //PODEMOS DARLE FORMATO A LA FECHA
        /*
        //02 04, 2024
        SimpleDateFormat df= new SimpleDateFormat("dd MM, YYYY");

        //Tue Apr 02 21:15:33 PET 2024
        SimpleDateFormat df= new SimpleDateFormat("dd MMMM, YYYY");
        */

        // miércoles 03 de abril, 2024
        SimpleDateFormat df= new SimpleDateFormat("EEEE dd 'de' MMMM, YYYY");//Si queremos con / entonces solo hacemos dd/MM/YYYY

        String fechaStr=df.format(fecha);

        System.out.println("fechaStr = " + fechaStr);
    }
    
}
