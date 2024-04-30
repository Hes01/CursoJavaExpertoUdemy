package C_ClaseWrapper;

import java.lang.reflect.Method;

public class E_EjemploMetodoGetClass {
    public static void main(String[] args) {
        String texto="Hola que tal!";
        Class strClass =texto.getClass();//nos retorna informacion sobre el objeto su estructura interna


        System.out.println("strClass.getName() = " + strClass.getName());//incluido el paquete
        System.out.println("strClass.getName() = " + strClass.getSimpleName());//solo el nombre
        System.out.println("strClass.getName() = " + strClass.getPackageName());//el nombre del paquete
        System.out.println("strClass = " + strClass);

        //Mostrar su metodos

        for(Method method: strClass.getMethods()){
            System.out.println("method.getName() = " + method.getName());//nombre del metodo
        }

        Integer num=34;
        Class intClass=num.getClass();
        Class objClass=intClass.getSuperclass().getSuperclass();
        System.out.println("intClass.getSimpleName() = " + intClass.getSuperclass());//ver el nombre del objeto
        System.out.println("intClass.getSimpleName() = " + objClass);//ver el objeto padre o superclase
        for(Method method: objClass.getMethods()){//todos los metodos de la clase object
            System.out.println("method.getName() = " + method.getName());//nombre del metodo
        }

    }
}
