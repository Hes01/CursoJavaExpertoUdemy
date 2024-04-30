package A_HelloWorld;

public class EjemploStringMetodosArreglo {
    public static void main(String[] args) {

        String  trabalenguas="trabalenguas";
        System.out.println("trabalenguas.toCharArray() = " + trabalenguas.length());

        char[] arreglo= trabalenguas.toCharArray();//arreglo de characteres
        for (int i=0 ;i<arreglo.length;i++){
            System.out.println("arreglo ["+(i)+"] : "+arreglo[i]);
        }

        System.out.println("trabalenguas = " + trabalenguas.split("a"));//divide en arreglo pero no incluye la "a"
        String[] arreglo2= trabalenguas.split("a");//arreglo de characteres
        for (int i=0 ;i<arreglo2.length;i++){
            System.out.println("arreglo ["+(i)+"] : "+arreglo2[i]);
        }

        String archivo ="alguna.imagen.pdf";
        String[] archivoArr=archivo.split("[.]");//para que tome el punto se pone [.] para definir expresion regular
        for (int i=0 ;i<archivoArr.length;i++){
            System.out.println("arreglo ["+(i)+"] : "+archivoArr[i]);
        }

        System.out.println("extension= "+archivoArr[archivoArr.length-1]);//extension pdf
    }
}
