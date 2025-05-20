package Compos;

public class Circulo {

    Punto centro;
    int radio;

    public Circulo(int x, int y, int radio) {
        centro = new Punto(x, y);
        this.radio = radio;
    }

    public Punto getCentro() {
        return centro;
    }

    public void setCentro(Punto centro) {
        this.centro = centro;
    }

    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }

    void imprimir() {
        System.out.println("El centro del circulo esta en las coordenadas: " + centro.getX() + ", " + centro.getY() +
                "y tiene un radio de: " + radio);
    }


}
