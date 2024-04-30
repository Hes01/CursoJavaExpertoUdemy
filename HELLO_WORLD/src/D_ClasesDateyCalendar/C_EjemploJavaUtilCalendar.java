package D_ClasesDateyCalendar;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class C_EjemploJavaUtilCalendar {
    public static void main(String[] args) {

        //esta es clase abstracta lo cual no permite crear con el
        //operador new
        Calendar calendario = Calendar.getInstance();//asi se invoca la instancia de calendar


        //INDICAMOS LA FECHA EN ESPECIFICO
        //________________________________


        //FORMA 1

        //año, mes(empieza enero con 0 luego diciembre es 12), dia,hora,minutos,segundos
        //calendario.set(2020,11,25,20,18,10);


        //FORMA 2


        calendario.set(Calendar.YEAR, 2025);//para el año
        calendario.set(Calendar.MONTH, Calendar.JULY);//enero
        calendario.set(Calendar.DAY_OF_MONTH, 25);

        //calendario.set(Calendar.HOUR_OF_DAY,21);
        calendario.set(Calendar.HOUR,7);
        //para decir si es AM_PM,seguido seleccionamos si es AM o PM con  las constantes AM o PM
        calendario.set(Calendar.AM_PM,Calendar.AM);
        calendario.set(Calendar.MINUTE,20);
        calendario.set(Calendar.SECOND,10);
        calendario.set(Calendar.MILLISECOND,125);

        Date fecha = calendario.getTime();//retorna un date de java util
        System.out.println("fecha sin formato  = " + fecha);//fecha actual
        
        //d: dia del mes ,D: dia del año
        //si pones MM: numero de mes, MMM: mes abreviado, MMMM:nombre del mes completo
        //para milisegundos SSS: porque son de mil osea 3 digitos
        //para pm o am solo con a: eso te dara si es p.m o si es a.m
        //HH: es formato de 24 horas
        //hh: es formato de 12 horas comienza de 0 a 12 horas

        SimpleDateFormat formato= new SimpleDateFormat("yyyy-MM-dd hh:mm:ss:SSS a");
        String fechaConFormato=formato.format(fecha);
        System.out.println("fecha con formato = " + fechaConFormato);






        //*Esto se puso despues puedes obviarlo o eliminarlo solo funciona con lo que esta de
        // arriba pero se hizo con el fin de entender que tambien se podia comparar las fechas
        // con la clase calendar
        // */
        //podemos comparar dos fechas con la clase calendar

        Calendar calActual = Calendar.getInstance();//asi se invoca la instancia de calendar
        Date fecha2=calActual.getTime();

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


    }
}
