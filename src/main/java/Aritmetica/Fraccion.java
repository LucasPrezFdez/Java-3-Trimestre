package Aritmetica;

public class Fraccion extends Numero{

    private Numero numerador;
    private Numero denominador;


    public Fraccion(int num, Numero numerador, Numero denominador) {
        super(num);
        this.numerador = numerador;
        this.denominador = denominador;
    }
    
}
