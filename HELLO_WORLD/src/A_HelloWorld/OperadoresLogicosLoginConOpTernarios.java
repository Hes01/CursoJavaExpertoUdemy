package A_HelloWorld;

import java.util.Scanner;

public class OperadoresLogicosLoginConOpTernarios {
    public static void main(String[] args) {

        //PRIMERA FORMA

        /*

        String[] usernames= new String[3];
        String[] passwords= new String[3];

        usernames[0]="andres";
        passwords[0]="12345";

        usernames[1]="admin";
        passwords[1]="12345";

        usernames[2]="pepe";
        passwords[2]="12345";*/

        //SEGUNDA FORMA
        String[] usernames={"andres","admin","pepe"} ;
        String[] passwords= {"12345","12345","123456"};

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el username:");
        String u=scanner.nextLine();
        System.out.println("Ingrese el password: ");
        String p=scanner.nextLine();

        boolean esAutenticado=false;
        for(int i=0 ; i< usernames.length;i++) {
            esAutenticado=((usernames[i].equals(u) && passwords[i].equals(p)))?true:esAutenticado;

            /*if ((usernames[i].equals(u) && passwords[i].equals(p))) {
                esAutenticado = true;
                break;//salir del for
            }*/
        }


        String mensaje=esAutenticado?"Bienvenido usuario ".concat(u).concat("!"):"Lo siento, requiere autenticación \n Lo siento, requiere autenticación";
        System.out.println("mensaje = " + mensaje);
        /*if (esAutenticado) {
            System.out.println("Bienvenido usuario ".concat(u).concat("!"));

        } else {
            System.out.println("Username o contraseña incorrecto!");
            System.out.println("Lo siento, requiere autenticación");
        }*/

    }
}
