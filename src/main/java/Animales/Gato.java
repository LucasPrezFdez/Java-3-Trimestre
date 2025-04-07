package Animales;

public class Gato extends Felino{

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
        return "Felis Catus";
    }

    @Override
    public String getSonido() {
        return "Maullido";
    }


}
