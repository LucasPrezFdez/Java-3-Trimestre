package Mascotas;

public class GatoPeloLargo extends Gato{

    enum razas {
        balines, angora, himalayo, somali
    }

    private razas PeloLargo;

    public GatoPeloLargo(String color, int edad, String nombre, double saltoAltura, double saltaLargura, razas peloLargo) {
        super(color, edad, nombre, saltoAltura, saltaLargura);
        PeloLargo = peloLargo;
    }

    @Override
    public String toString() {
        return "GatoPeloLargo{" +
                "PeloLargo=" + PeloLargo +
                "} " + super.toString();
    }

    @Override
    public String sonido() {
        return super.sonido()+ " y son calurosas";
    }
}
