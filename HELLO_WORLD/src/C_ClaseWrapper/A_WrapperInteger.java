package C_ClaseWrapper;

public class A_WrapperInteger {
    public static void main(String[] args) {

        /*
        FORMA OBSOLETA DE CREAR UN OBJETO CON EL OPERADOR NEW

        Integer intObjeto= new Integer(32768);*/



        //OBJETO DE FORMA ESTICA(EXPLICITA) BOXIN:Toma un valor y lo convierte a objeto
        Integer intObjeto= Integer.valueOf(32768);

        //OBJETO DE FORMA ESTICA(EXPLICITA) AUTOBOXIN:Toma un valor y lo convierte a objeto de de forma automatica
        Integer intObjeto2= 32768;

        //CONVERTIR PRIMITIVO A OBJETO REFERENCIA INTEGER
        int intPrimitivo= 32768;
        //primer forma
        Integer intConversionObject=Integer.valueOf(intPrimitivo);
        //segunda forma
        Integer intConversionObject2=intPrimitivo;
        System.out.println("intConversionObject2 = " + intConversionObject2);


        //CONVERTIR DE OBJETO REFERENCIA A ENTERO PRIMITIVO
        
        int num=intObjeto2;//implicita automaticamente lo convierte
        System.out.println("num = " + num);
        
        int num2=intObjeto2.intValue();//explicita retorna el objeto primitivo
        System.out.println("num2 = " + num2);

        //CONVERTIR DE STRING A UN VALOR ENTERO
        String valorTvLcd="67000";
        Integer valor=Integer.valueOf(valorTvLcd);
        System.out.println("valor = " + valor);

        //convertir int a short
        Integer intObjeto3= 22;//no se puede convertir de int a short exepto si esta en los rangos
        Short shortObjeto=intObjeto3.shortValue();
        System.out.println("shortObjeto = " + shortObjeto);//hay perdida de información si el numero Integer es demaciado grande
        
        
        //convertir int a byte
        Integer intObjeto4= 32767;
        Byte byteObjeto=intObjeto4.byteValue();
        System.out.println("byteObjeto = " + byteObjeto);

        //convertir de int a long
        Integer intObjeto5=32768;
        Long longObjeto=intObjeto5.longValue();

        System.out.println("longObjeto = " + longObjeto);

        //convierte de int a Float
        Integer intObjeto6=36768;
        Float floatObjeto=intObjeto6.floatValue();
        System.out.println("floatObjeto = " + floatObjeto);
        
        //convierte de int a Double
        Integer intObjeto7=36764;
        Double doubleObjeto=intObjeto7.doubleValue();
        System.out.println("doubleObjeto = " + doubleObjeto);
    }
}
