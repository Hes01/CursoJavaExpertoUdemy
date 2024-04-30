package A_HelloWorld;

public class EjemploStringExtensionArchivo {
    public static void main(String[] args) {
        String archivo ="alguna_imagen.pdf";
        int i =archivo.lastIndexOf(".")+1;//la ultima ocurrencia del punto la cual es la extension del archivo
        System.out.println("archivo.length() = " + archivo.length());
        System.out.println("archivo.substring(archivo.length()) = " + archivo.substring(i));
    }
}
