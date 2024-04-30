package E_ClaseSystem;

import java.util.Map;

public class C_OtrasCaracteristicasyFuncionesUtilesDeSystem {
    public static void main(String[] args) {

        //mapa java :arreglo que asocia nombre y elemento
        Map<String,String> varEnv =System.getenv();//nombre y valor de tipo string
        System.out.println("variables de ambiente del sistema = " + varEnv);

        System.out.println("-------Listando variables de entorno del sistema---------");
        for (String key:varEnv.keySet()){
            System.out.println(key+" => "+varEnv.get(key));//por cada nombre o key obtenemos su valor con get
        }

        //ver variables del sistema listando
        String username=System.getenv("USERNAME");
        System.out.println("username = " + username);

        String javaHome=System.getenv("JAVA_HOME");
        System.out.println("javaHome = " + javaHome);

        String temDir= System.getenv("TEMP");
        System.out.println("temDir = " + temDir);
        
        String path = System.getenv("PATH");//aqui puedes ser en mayuscula o minuscula pero si es mapa cuidado!.
        System.out.println("path = " + path);

        //listar del mapa
        String path2 = varEnv.get("Path");//CUIDADO:un mapa es estricto respecto a como se guardan sus datos en el sistema si pones PATH se mostrara null porque no lo encontro
        System.out.println("path = " + path2);

        //podemos crear nuestras propias variables de entorno en el sistema Editar variables de entorno
        //como ejemplo se creo la variable de entorno APPLICATION_ENV o entorno de desarrollo en ingles
        String path3 = varEnv.get("APPLICATION_ENV");
        System.out.println("path = " + path3);

        //tambien podemos hacerlo por el terminal con setx luego la variable seguido de su valor en comillas
        // setx SALUDAR_HOLA "Hola amigos que tal"
        String hola= varEnv.get("SALUDAR_HOLA");
        System.out.println("hola = " + hola);




    }
}
