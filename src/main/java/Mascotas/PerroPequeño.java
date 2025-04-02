package Mascotas;

public class PerroPequeño extends Perro {


    enum razas {
        caniche, yorkshireTerrier, schnauzar, chihuahua
    }

    private razas Pequeño;

    public PerroPequeño(String color, int edad, String nombre, boolean muerde, double peso, razas pequeño) {
        super(color, edad, nombre, muerde, peso);
        Pequeño = pequeño;
    }

    @Override
    public String toString() {
        return "PerroPequeño{" +
                "Pequeño=" + Pequeño +
                "} " + super.toString();
    }

    @Override
    public String sonido() {
        return super.sonido() + " y dan risa";
    }
}
