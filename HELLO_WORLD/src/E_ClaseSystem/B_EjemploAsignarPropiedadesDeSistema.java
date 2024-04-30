package E_ClaseSystem;

import javax.rmi.ssl.SslRMIClientSocketFactory;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class B_EjemploAsignarPropiedadesDeSistema {
    public static void main(String[] args) {


        //creamos una instancia que obtenga el contenido

        //stream viene de flujos de datos aca se procesan los bytes
        try {//excepcion por si no se encuentre el archivo
            FileInputStream archivo=new FileInputStream("src/E_ClaseSystem/config.properties");
            Properties p= new Properties(System.getProperties());//cargamos las configuraciones del sistema
            //podrias ponerlo asi con una nueva excepcion o poner la excepcion general que es Exception

            /*try {//se maneja
                p.load(archivo);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }*/

            //cargamos el archivo
            p.load(archivo);

            //agregamos una configuracion sin el archivo ojo mi.propiedad... las palabras compuestas van unidas con un punto
            p.setProperty("mi.propiedad.personalizada","Mi valor guardado en el objeto properties");

            System.setProperties(p);//actualizamos nuestras configurarciones personalizadas para que se muestres
            //System.getProperties().list(System.out);//mostramos propiedades del systema

            //System.getProperties().list(System.out); otro equivalente es lo de abajo es lo mismo
            Properties ps = System.getProperties();


            //forma de mostrar una configuracion
            System.out.println("ps.getProperty(...) = "+ps.getProperty("mi.propiedad.personalizada"));
            //otra forma de mostrar directamente llamando las variables del archivo config.properties
            System.out.println(System.getProperty("config.puerto.servidor"));
            System.out.println(System.getProperty("config.autor.nombre"));
            System.out.println(System.getProperty("config.autor.email"));
            ps.list(System.out);//lista propiedades del sistema



        } catch( Exception e) {// en ves de FileNotFoundException pones la generica Exception
            System.err.println("no existe el archivo= " + e);
            System.exit(1);//terminamos
            //-1:error basico
            //1:falla de sistema

        }

    }
}
