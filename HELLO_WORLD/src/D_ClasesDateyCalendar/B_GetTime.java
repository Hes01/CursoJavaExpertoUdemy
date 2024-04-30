package D_ClasesDateyCalendar;

import java.text.SimpleDateFormat;
import java.util.Date;

public class B_GetTime {
    public static void main(String[] args) {

        Date fecha= new Date();//fecha de partida

        System.out.println("fecha = " + fecha);

        // miércoles 03 de abril, 2024
        SimpleDateFormat df= new SimpleDateFormat("EEEE dd 'de' MMMM, YYYY");//Si queremos con / entonces solo hacemos dd/MM/YYYY
        String fechaStr=df.format(fecha);
        
        //contar los milisegundos de lo que ocurre dentro de un for
        long j=0;
        for (int i = 0; i <10000000 ; i++) {
            j+=i;
        }
        System.out.println("j = " + j);

        Date fecha2= new Date();
        long tiempoFinal= fecha2.getTime() - fecha.getTime();//numero de milisegundos
        System.out.println("Tiempo transcurrido en el for = " + tiempoFinal+" milisegundos");
        System.out.println("fechaStr = " + fechaStr);
    }
}
