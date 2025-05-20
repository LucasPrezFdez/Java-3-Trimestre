package Perrari;

public class Carroceria {

    tipoCarroceria tipo;
    String color;

    Carroceria (tipoCarroceria tipo, String color) {
        this.tipo = tipo;
        this.color = color;
    }

    public tipoCarroceria getTipo() {
        return tipo;
    }

    public void setTipo(tipoCarroceria tipo) {
        this.tipo = tipo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Carroceria{" +
                "tipo=" + tipo +
                ", color='" + color + '\'' +
                '}';
    }
}
