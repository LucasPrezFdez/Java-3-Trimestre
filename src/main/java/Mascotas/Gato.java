package Mascotas;

public class Gato extends Mascota{


    protected double saltoAltura;
    protected double saltaLargura;

    public Gato(String color, int edad, String nombre, double saltoAltura, double saltaLargura) {
        super(color, edad, nombre);
        this.saltoAltura = saltoAltura;
        this.saltaLargura = saltaLargura;
    }

    @Override
    public String toString() {
        return "Gato{" +
                "saltaLargura=" + saltaLargura +
                ", saltoAltura=" + saltoAltura +
                "} " + super.toString();
    }

    @Override
    public String sonido() {
        return "Los gatos hacen miau";
    }
}
