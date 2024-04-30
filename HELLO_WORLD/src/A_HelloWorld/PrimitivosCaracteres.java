package A_HelloWorld;

public class PrimitivosCaracteres {
    public static void main(String[] args) {
        System.out.println();
        char caracter='\u0040';//valor por defecto de char es '\u0000'
        char decimal=64;
        System.out.println();
        System.out.println("caracter = " + caracter);
        System.out.println();
        System.out.println("decimal = " + decimal);
        System.out.println();
        System.out.println("decimal = caracter:"+(decimal==caracter));
        System.out.println();
        char simbolo ='@';
        System.out.println("simbolo = " + simbolo);
        System.out.println("decimal = caracter:"+(simbolo==caracter));

        System.out.println();
        char espacio='\u0020';//espacio ''
        System.out.println(espacio+"espacio");
        char retroceso='\b';//borrar carater o retroceder un espacio
        System.out.println("retroceso=" + retroceso+retroceso);
        char tabulador='\t';//tabulador
        System.out.println("tabulador = " + tabulador+tabulador+"hola");
        char nuevaLinea='\n';
        System.out.println("nuevaLinea= "+ nuevaLinea+"salto de linea");
        char retornoCarro='\r';
        System.out.println("retornoCarro=" + System.lineSeparator()+retornoCarro);
        
        
        
        
        
        System.out.println();

        System.out.println("numero de bytes de char es: "+Character.BYTES);
        System.out.println("numero de bits de char es : "+Character.SIZE);
        System.out.println("maximo de char es :"+Character.MAX_VALUE);
        System.out.println("minimo de char es : "+Character.MIN_VALUE);//es espacio blanco




    }
}
