package Aritmetica;

import java.util.Objects;

public class Numero {

    protected int num = 17;

    public Numero(int num) {
        this.num = num;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public Numero sumar(Numero numero) {
        return new Numero(this.getNum() + numero.getNum());
    }

    public Numero restar(Numero numero) {
        return new Numero((this.getNum() - numero.getNum()));
    }

    public Numero multiplicar(Numero numero) {
        return new Numero((this.getNum() * numero.getNum()));
    }

    public Numero dividir(Numero numero) {
        return new Numero((this.getNum() / numero.getNum()));
    }


    @Override
    public boolean equals(Object obj) {
        if (obj == null || getClass() != obj.getClass()) return false;
        Numero numero = (Numero) obj;
        return num == numero.num;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(num);
    }

    public String toString() {
        return "Numero [num=" + num + "]";
    }


}
