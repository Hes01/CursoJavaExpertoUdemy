package F_ClaseMath;

import java.util.Random;

public class B_EjemploClaseMathRandom {
    public static void main(String[] args) {
        //generar un numero decimal entre 0 y 1 pero 1, no es inclusivo

        String[] colores = {"azul", "amarillo", "rojo", "verde", "blanco", "negro"};

        double random = Math.random();
        System.out.println("random = " + random);

        //random*= 7;
        //aleatorio entre 0 y 7 pero 7 no se incluye

        //random = Math.random();
        random *= colores.length;
        System.out.println("random*7 = " + random);


        random = Math.floor(random);//redondea a min valor
        System.out.println("random minimo redondeado = " + random);

        System.out.println("colores = " + colores[(int) random]);//casteamos


        //CLASE RANDOM (creando instandiando la clase )
        Random randomObj = new Random();
        //da mas flexibilidad  para generar enteros y decimales con rangos mas amplios
        int randomInt = randomObj.nextInt();//si no le pones parametros -2^32 a 2^32
        System.out.println("randomInt = " + randomInt);

        randomInt = randomObj.nextInt(7);//generamos numero entre 0 y 7, pero no incluye el 7
        System.out.println("randomInt = " + randomInt);

        randomInt = randomObj.nextInt(7 + 1);//aqui si incluyes el 7
        System.out.println("randomInt = " + randomInt);

        //random entre dos valores
        randomInt = 15 + randomObj.nextInt(25 - 15);//rango entre 15 y 25 ,25 no se incluye (parte en 15 ...luego suma el random de 0 a 10 osea 25-15)
        System.out.println("randomInt = " + randomInt);
        //si quiere incluir el 25 le sumas 1 osea asi
        randomInt = 15 + randomObj.nextInt(25 - 15 + 1);

        //para el ejemplo del arreglo
        randomInt = randomObj.nextInt(colores.length);
        System.out.println("randomInt = " + randomInt);
        System.out.println("colores = " + colores[randomInt]);//no se convierte ni nada porque es entero
    }
}
