package Mamiferos;

public class Ornitorrinco extends Mamifero implements Oviparo{

    private int numCrias;

    public Ornitorrinco(String nombre, int numCrias) {
        super(nombre);
        this.numCrias = numCrias;
    }

    @Override
    public void amamantarCrias() {
        System.out.println("los ornis exudan milky");
    }

    @Override
    public void ponerHuevos() {
        System.out.println("ponen huevos cantando Olivera dos cen anos");
    }

    @Override
    public String toString() {
        return "\nOrnitorrinco{" +
                "numCrias=" + numCrias +
                "} " + super.toString();
    }
}
