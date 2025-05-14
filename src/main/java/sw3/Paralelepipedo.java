package sw3;

public class Paralelepipedo extends FiguraGeometrica{

    private double largo;
    private double ancho;
    private double alto;

    public Paralelepipedo(double largo, double ancho, double alto) {
        this.largo = largo;
        this.ancho = ancho;
        this.alto = alto;
        this.setVolumen(this.calcularVolumen());
        this.setSuperficie(this.calcularSuperficie());
    }


    public double calcularVolumen() {
        double vol = this.alto*this.ancho*this.largo;
        return vol;
    }

    public double calcularSuperficie() {
        double tapa = this.ancho*this.largo;
        double cara = this.ancho*this.alto;
        double otra = this.largo+this.alto;
        return 2*tapa+2*cara+2*otra;
    }

}
