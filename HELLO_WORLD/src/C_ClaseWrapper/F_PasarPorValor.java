package C_ClaseWrapper;

public class F_PasarPorValor {
    //inmutable
    public static void main(String[] args) {
        Integer i = 10;
        //pasar por valor (int i=10) vs pasar por referencia(Integer i=10)

        System.out.println("iniciamos el main con i = " + i);
        test(i);
        System.out.println("finaliza el metodo main con el valor de i= " + i);//no cambia
    }

    public static  void test(Integer i){
        System.out.println(" iniciaimos el etodo test con : "+i);
        i=35;//esta es otra instancia
        System.out.println("Finaliza con el nuevo valor de i = " + i);
    }
}
