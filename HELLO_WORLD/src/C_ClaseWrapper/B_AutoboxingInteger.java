package C_ClaseWrapper;

public class B_AutoboxingInteger {
    public static void main(String[] args) {
        //autoboxing tipos primitivos a referencia
        Integer[] enteros={Integer.valueOf(1),2,3,4,5,6,7,8,9,10,11,12,13,14,15};

        int suma=0;
        /*
        //suma primitivia (explicita:controlada)
        for(Integer i : enteros){
            if (i.intValue() % 2==0){
                suma+=i.intValue();
            }
        }

        System.out.println("suma = " + suma);
        */

        //autoboxing (implicita:automatica)
        /*for(Integer i : enteros){
            if (i % 2==0){
                suma+=i;
            }
        }

        System.out.println("suma = " + suma);*/

        
        

    }

}
