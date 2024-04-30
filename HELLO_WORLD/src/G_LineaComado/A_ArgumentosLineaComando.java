package G_LineaComado;
//para poder compilar esto, debes mover o copiar el archivo a /src
//porque desde aqui sale error :c

/*
* hay dos formas de compilar por lineas de comandos nota:
*
* la primera forma
*
*  es desde src pero este no te agrega el utf8 es decir la codificacion para simbolos
* entonces compilar por consola asi :
* javac A_ArgumentosLineaComando.java -> esto genera un .class con le mismo nombre
* java A_ArgumentosLineaComando -> esto es el .class pero solo el nombre ahora con este que es el compilador ya se ejecuta
* Para pasar parametros es :
* java A_ArgumentosLineaComando hola "me llamo elvis" -> esto ejecutara hola, luego , me llamo elvis, pero ojo
* te hable de la codificacion utf8 bueno aqui no la tienes para agregar entonces haces
* javac A_ArgumentosLineaComando.java -encoding utf8 ->aqui ya agregas la codificación utf8, ahora cuando pases parametros normal funcionara
* si tienes tildes etc...
*
* La otra forma
*
*  es hacerlo desde out/production/ desde aqui para ello primero generas el .class con run mayus+f10
* luego le haces
* java A_ArgumentosLineaComando -> y claro le pones sus argumentos
* */

public class A_ArgumentosLineaComando {
    public static void main(String[] args) {

        if (args.length==0){
            System.out.println("Debe ingresar argumentos o parámetros!");
            System.exit(-1);//0 si todo sale bien, 1 si hay excepcion,-1 error
        }
        for (int i = 0; i <args.length ; i++) {
            System.out.println("Argumentos nro = " + i+": "+args[i]);
        }
    }
}
