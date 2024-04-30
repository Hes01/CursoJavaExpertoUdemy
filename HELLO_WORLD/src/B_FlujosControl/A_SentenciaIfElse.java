package B_FlujosControl;

public class A_SentenciaIfElse {
    public static void main(String[] args) {
        float promedio=5.5f;//float pones siempre la  f
        if(promedio >=6.5){
            System.out.println("felicitaciones, excelente promedio!");
        }else if(promedio >=6.0){
            System.out.println("Muy buen promedio ");
        } else if (promedio>=5.5) {
            System.out.println("Buen promedio");
        } else if (promedio>=5.0) {
            System.out.println("regular,necesitas un poco mas de esfuerzo");
        } else if (promedio>=4.0) {
            System.out.println("insuficiente necesitas estudiar mas");
        }else{
            System.out.println("reprobado");
        }
        System.out.println("tu promedio es : "+promedio);
    }
}
