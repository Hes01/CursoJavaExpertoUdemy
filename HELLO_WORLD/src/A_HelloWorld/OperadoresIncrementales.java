package A_HelloWorld;

public class OperadoresIncrementales   {
    public static void main(String[] args) {
        //  PRE INCREMENTO
        System.out.println("\n\nPRE INCREMENTO");
        int i =1;
        int j= ++i;//i = i+1
        System.out.println("i = " + i);
        System.out.println("j = " + j);
        
        //POST INCREMENTO
        System.out.println("\n\nPOST INCREMENTO");
        i=2;
        System.out.println("inicial i = " + i);
        j= i++;
        System.out.println("i = " + i);
        System.out.println("j = " + j);


        //PRE DECREMENTO
        System.out.println("\n\nPRE DECREMENTO");
        i=3;
        j=--i;//i=i-1=2
        System.out.println("i = " + i);
        System.out.println("j = " + j);

        //POST DECREMENTO
        System.out.println("\n\nPOST DECREMENTO");
        i=4;
        j=i--;
        System.out.println("i = " + i);
        System.out.println("j = " + j);

        System.out.println("(++j) = " + (++j));
        System.out.println("(j++) = " + (j++));
        System.out.println("j = " + j);

    }
}
