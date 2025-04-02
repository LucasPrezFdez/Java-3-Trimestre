package Mascotas;

public class GatoPeloCorto extends Gato {

    enum razas {
        azulRuso, britanico, manx, devanRex
    }

    private razas PeloCorto;


    public GatoPeloCorto(String color, int edad, String nombre, double saltoAltura, double saltaLargura, razas peloCorto) {
        super(color, edad, nombre, saltoAltura, saltaLargura);
        PeloCorto = peloCorto;
    }

    @Override
    public String toString() {
        return "GatoPeloCorto{" +
                "PeloCorto=" + PeloCorto +
                "} " + super.toString();
    }

    @Override
    public String sonido() {
        return super.sonido() + "y son monos";
    }
}
