package Mascotas;

public class GatoSinPelo extends Gato{

    enum razas{
        esfinge, elfo, donskay
    }

    private razas SinPelo;

    public GatoSinPelo(String color, int edad, String nombre, double saltoAltura, double saltaLargura, razas sinPelo) {
        super(color, edad, nombre, saltoAltura, saltaLargura);
        SinPelo = sinPelo;
    }

    @Override
    public String toString() {
        return "GatoSinPelo{" +
                "SinPelo=" + SinPelo +
                "} " + super.toString();
    }

    @Override
    public String sonido() {
        return super.sonido() + "y dan grima";
    }
}
