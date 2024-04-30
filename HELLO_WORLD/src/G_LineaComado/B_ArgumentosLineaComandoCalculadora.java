package G_LineaComado;

public class B_ArgumentosLineaComandoCalculadora {
    //CALCULADORA
    /*
    * PARA EJECUTAR
    * lo pones en src/ para que funcione luego ejecutas por consola
    * luego ejecutar ya sabes incluyen la codificación utf8 porque no estas trabajando en out/production/
    * javac B_ArgumentosLineaComandoCalculadora.java -encoding utf8 ->esto te genera un "B_ArgumentosLineaComandoCalculadora.class"
    * java B_ArgumentosLineaComandoCalculadora  suma 20 2 -> los parametros para que haga la sume
    * */


    public static void main(String[] args) {
        //para que se envien los tres argumentos que se necesitan como parametros

        if (args.length != 3) {
            System.out.println("por favor ingresar una operacion(suma, resta,multi,div) y dos enteros");
            System.exit(-1);//error
        }

        String operacion = args[0];
        int a = 0;
        int b = 0;
        double resultado = 0.0d;

        try {//para que no sean otros mas que enteros
            a=Integer.parseInt(args[1]);
            b=Integer.parseInt(args[2]);
        }catch(NumberFormatException e){
            System.err.println("Cuidado a y b deben ser enteros,vuelva a intentar!");
            System.exit(-1);//error
        }

        switch (operacion) {
            case "suma":
                resultado = a + b;
                break;
            case "resta":
                resultado = a - b;
                break;
            case "multi":
                resultado = a * b;
                break;
            case "div":
                if (b == 0) {

                    System.out.println("no se puede dividir por 0!");
                    System.exit(-1);//error y sale
                }
                resultado = (double) a / b;
                break;
            default:
                resultado = a + b;
        }
        System.out.println("Resultado de la '" + operacion + "' es : " + resultado);
    }
}
