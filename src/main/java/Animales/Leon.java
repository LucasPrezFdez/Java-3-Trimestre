package Animales;

public class Leon extends Felino{

    @Override
    public String getAlimentos() {
        return "Carnivoro";
    }

    @Override
    public String getHabitat() {
        return "Selva";
    }

    @Override
    public String getNombreCientifico() {
        return "Panthera leo";
    }

    @Override
    public String getSonido() {
        return "Rugido";
    }


}
