package C_Metodos_Sobrecarga_Encapsulamiento;

public class Automovil {
    //atributos le pertenecen al objeto
    String fabricante;
    String  modelo;
    String color="griss";
    double cilindrada;
    int capacidadEstanque=40;//litros de gas o bencina


    //nota: dentro de una clase no es bueno que se imprima datos sino mas bien retornar luego ya imprimir eso por el vodi que tenia aqui

    //funcion que no retorna nada void=vacio
    public String verDetalle(){
        StringBuilder sb= new StringBuilder();//para concatenar :D

        sb.append("fabricante = " + this.fabricante);//this: hace referencia a los atributos de la clase pero ojo es distinto si esta dentro del metodo
        sb.append("\nmodelo = " + this.modelo);
        sb.append("\ncolor = " + this.color);
        sb.append("\ncilindrada = " + this.cilindrada);
        return sb.toString();
    }

    //nota: dentro de una clase no es bueno que se imprima datos sino mas bien retornar luego ya imprimir

    public String acelerar(int rpm){
        return  "el auto "+this.fabricante +" acelerando a "+ rpm + " rpm";
    }

    public String frenar(){
        return this.fabricante + " "+ this.modelo + " frenando!";//se puede obviar el this para mejor practica el this
    }


    public  String acelerarFrenar(int rpm){
        String acelerar= this.acelerar(rpm);//this: se refiere a atributos y metodos de la clase
        String frenar=this.frenar();
        return acelerar + "\n"+frenar+"\n";
    }

    public float calcularConsumo(int km, float porcentajeBencina){
        return  km/(this.capacidadEstanque*porcentajeBencina);
    }

    //sobrecarga de metodos mismo nombre; cambio esta en el tipo retorno o numero de parametros
    //en este caso es por el parametro el tipo de parametro esta como int ahi esta el cambio
    public float calcularConsumo(int km, int porcentajeBencina){
        return  (km/(this.capacidadEstanque*(porcentajeBencina/100f)));
    }


}
