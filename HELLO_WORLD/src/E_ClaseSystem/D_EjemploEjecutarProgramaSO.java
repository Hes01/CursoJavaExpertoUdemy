package E_ClaseSystem;

public class D_EjemploEjecutarProgramaSO {
    public static void main(String[] args) {
        //clase runtine que permite ejecutar aplicaciones

        //EJEMPLO EJECUTAR EL BLOC DE NOTAS
        Runtime rt=Runtime.getRuntime();//tiempo ejecucion de un programa
        Process proceso;

        try {
            if(System.getProperty("os.name").toLowerCase().startsWith("windows")){
                proceso=rt.exec("notepad");//proceso a ejecutar para windows , calc: para ejecutar la calculadora
            }else{
                proceso=rt.exec("gedit");//para linux
            }
            proceso.waitFor();//esperar a que finalice o cierres el proceso (mejor dicho la ventana que se ejecuta)
        }catch (Exception e ){
            System.err.println("El comando es desconocido"+e.getMessage());
            System.exit(1);
        }

        System.out.println("Se ha cerrado el editor");
        System.exit(0);//salimos del sistema con 0:por defecto
    }
}
