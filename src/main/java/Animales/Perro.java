package Animales;

public class Perro extends Canido{

    @Override
    public String getAlimentos() {
        return "Carnivoro";
    }

    @Override
    public String getHabitat() {
        return "Domestico";
    }

    @Override
    public String getNombreCientifico() {
        return "Chucho";
    }

    @Override
    public String getSonido() {
        return "Ladrido";
    }
}
