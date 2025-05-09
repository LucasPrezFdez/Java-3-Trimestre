package sw3;

public class Esfera extends FiguraGeometrica {

    private double radio; // Atributo que identifica el radio de una esfera

    public Esfera(double radio) {
        //super();
        this.radio = radio;
        this.setVolumen(this.calcularVolumen()); /* Calcula el volumen y establece su atributo */
        this.setSuperficie(this.calcularSuperficie()); /* Calcula la superficie y establece su atributo */
    }

    public double calcularVolumen() {
        double volumen = 4 * Math.PI * Math.pow(this.radio, 3)/3d;
        return volumen;
    }

    public double calcularSuperficie() {
        double superficie = 4 * Math.PI * Math.pow(this.radio, 2);
        return superficie;
    }


}