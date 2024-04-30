package E_ClaseSystem;

import java.util.Properties;

public class A_EjemploPropiedadesDeSistema {
    public static void main(String[] args) {

        //para ver el nombre de usuario del sistema
        String userName=System.getProperty("user.name");
        System.out.println("userName = " + userName);

        //ruta del usuario home
        String home=System.getProperty("user.home");
        System.out.println("home = " + home);

        //directorio completo de trabajo del proyecto
        String workspace=System.getProperty("user.dir");
        System.out.println("workspace = " + workspace);
        
        //version de java
        String java=System.getProperty("java.version");
        System.out.println("java = " + java);

        //saltos de lines
        String lineSeparator=System.getProperty("line.separator");
        String lineSeparator2=System.lineSeparator();//es lo mismo
        System.out.println("lineSepator "+lineSeparator+"Una linea nueva");

        //mostrar todas las configuraciones del sistema
        Properties p= System.getProperties();//conjunto completo
        p.list(System.out);//imprime una lista

    }
}
