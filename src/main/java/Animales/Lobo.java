package Animales;

public class Lobo extends Canido{

    @Override
    public String getAlimentos() {
        return "Carne";
    }

    @Override
    public String getHabitat() {
        return "Bosque";
    }

    @Override
    public String getNombreCientifico() {
        return "Canis Lupus";
    }

    @Override
    public String getSonido() {
        return "Aullido";
    }
}
