package Mascotas;

public class PerroMediano extends Perro {

    enum razas {
        collie, dalmata, bulldog, galgo, sabueso
    }

    private razas Mediano;

    public PerroMediano(String color, int edad, String nombre, boolean muerde, double peso, razas mediano) {
        super(color, edad, nombre, muerde, peso);
        Mediano = mediano;
    }

    @Override
    public String toString() {
        return "PerroMediano{" +
                "Mediano=" + Mediano +
                "} " + super.toString();
    }

    @Override
    public String sonido() {
        return super.sonido() + "y estos divierten";
    }
}
