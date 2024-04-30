package B_FlujosControl;

public class C_SentenciaSwitchCase {
    public static void main(String[] args) {
        //ejm1
        int num=1;
        switch(num)
        {
            case 0:
                System.out.println("0 = " + 0);
                break;
            case 1:
                System.out.println("1 = " + 1);
                break;
            case 2:
                System.out.println("2 = " + 2);
                break;
            case 3:
                System.out.println("3 = " + 3);
                break;
            default:
                System.out.println("no se encontro valor");
        }
        //ejm2
        String nombre="juan";
        switch (nombre)
        {
            case "admin":
                System.out.println("hola admin, bienvenido");
                break;
            case "andres":
                System.out.println("hola andres");
                break;
            case "pepe":
                System.out.println("hola pepe");
                break;
            default:
                System.out.println("usuario desconocido");
        }
    }
}
