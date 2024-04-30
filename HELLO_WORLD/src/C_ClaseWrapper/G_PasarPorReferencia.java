package C_ClaseWrapper;

public class G_PasarPorReferencia {
    //mutable 
    public static void main(String[] args) {
        int[] edad = {10,11,12};
        //pasar por valor (int i=10) vs pasar por referencia(Integer i=10)

        System.out.println("iniciamos el main ");
        for(int i=0;i<edad.length;i++)
        {
            System.out.println("edad[i] = " + edad[i]);
        }
        System.out.println("Antes de llamar al metodo test");
        test(edad);//modifica el arreglo
        System.out.println("Despues de invocar al metodo test");

        for(int i=0;i<edad.length;i++)
        {
            System.out.println("edad[i] = " + edad[i]);
        }

        System.out.println("finaliza el metodo main con los datos del arreglos modificados " );//no cambia
    }

    public static  void test(int[] edadArr){
        System.out.println(" iniciaimos el etodo test ");
        for(int i=0;i<edadArr.length;i++)
        {
            edadArr[i]=edadArr[i]+20;
        }
        System.out.println("Finaliza con el metodo test ");
    }
}
