package D_ClasesDateyCalendar;

import javax.swing.plaf.synth.SynthEditorPaneUI;
import javax.swing.plaf.synth.SynthTextAreaUI;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class D_EjemploJavaUtilDateParseConvertirStringAobjetoDate {
    public static void main(String[] args) {

        //FECHA ESCRITA


        Scanner str= new Scanner(System.in);
        System.out.println("Ingrese la fecha en el formato dd-MM-yyyy ejm,(31-12-2020) :");
        String fechaStr= str.nextLine();
        //creamos el patron con el cual lo deseamos analizar
        SimpleDateFormat format= new SimpleDateFormat("dd-MM-yyyy");//2020/02/21

        //"surround", que en inglés significa "rodear", osea se debe envolver en un trycatch por si salte un error
        try {
            //el formato se ingresara y se analizara por este : "yyyy-MM-dd"; el cual se puso mas arriba
            Date fecha=format.parse(fechaStr);//lo que causa error
            System.out.println("fecha sin formato = " + fecha);//sin formato
            System.out.println("fecha con formato = " + format.format(fecha));//con formato
        } catch (ParseException e) {
            //e.printStackTrace();
            System.err.println("La fecha tiene un formato incorrecto : "+e.getMessage());
            System.err.println("el formato debe ser 'yyyy-MM-dd'");
            //System.exit(1);//1: ya que se lanza una excepcion
            //main(args);//volver a invocar el main
        }

    }
}
