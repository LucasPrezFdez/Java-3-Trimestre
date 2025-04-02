package Mascotas;

public class PerroGrande extends Perro{

    enum razas{
        pastorAleman, doberman, rotweiller
    }

    private razas Grandes;

    public PerroGrande(String color, int edad, String nombre, boolean muerde, double peso, razas grandes) {
        super(color, edad, nombre, muerde, peso);
        Grandes = grandes;
    }

    @Override
    public String toString() {
        return "PerroGrande{" +
                "Grandes=" + Grandes +
                "} " + super.toString();
    }

    @Override
    public String sonido() {
        return super.sonido()+ "y estos amedrentan";
    }
}
