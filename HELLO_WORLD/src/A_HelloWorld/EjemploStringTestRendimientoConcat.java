package A_HelloWorld;

public class EjemploStringTestRendimientoConcat {
    public static void main(String[] args) {

        String a ="a";
        String b = "b";
        String c = a;
        //tiempos
        long inicio=System.currentTimeMillis();//tiempo milisegundos

        StringBuilder sb = new StringBuilder(a);//premite crear string es mutable
        for (int i =0; i<100000;i++){
            //c=c.concat(a).concat(b).concat("\n");//500 veces => 2ms,1k veces =>5 ms,10kveces =>250 ms,100k veces=>6656 ms
            //c += a + b + "\n"; //500 veces => 14 ms,,1k veces =>22 ms,10kveces =>82 ms,100k veces=>2161 ms
            sb.append(a).append(b).append("\n");//500 veces => 0 ms,1k veces =>0 ms,,10k veces =>3 ms,100kveces =>13 ms
        }
        //invocar el recolector de forma implicita para que sea mas rapido, esto es opcional
        System.gc();//esto si es muchos objetos para que lo haga mas rapido porque lo hace de forma automatica



        /*
        Por eficiencia :
        -mas rapido a mas lento
                > StringBuilder es mas rapido que los tres
                > + : siempre y cuando sean muchos es mas rapido que concat() sino es lento
                > concat() : si son pocos pero si son muchos es mas rapido "+"
         */

        long fin =System.currentTimeMillis();
        System.out.println(fin-inicio);
        System.out.println("c = " + c);
        System.out.println("sb.toString() = " + sb.toString());
        //un ejemplo opcional es esto tambien por que lo hace de forma automacia

        System.exit(0);



    }
}
