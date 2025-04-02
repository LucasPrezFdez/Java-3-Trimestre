package Mascotas;

public class Perro extends Mascota{

    protected double peso;
    protected boolean muerde;

    public Perro(String color, int edad, String nombre, boolean muerde, double peso) {
        super(color, edad, nombre);
        this.muerde = muerde;
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Perro{" +
                "muerde=" + muerde +
                ", peso=" + peso +
                "} " + super.toString();
    }

    @Override
    public String sonido() {
        return "Los perros ladran";
    }
}
