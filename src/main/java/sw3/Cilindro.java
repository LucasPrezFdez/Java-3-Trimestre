package sw3;

public class Cilindro extends FiguraGeometrica {

    private double radio; // Atributo que establece el radio de un cilindro
    private double altura; // Atributo que establece la altura de un cilindro

    public Cilindro(double radio, double altura) {
        this.radio = radio;
        this.altura = altura;
        this.setVolumen(this.calcularVolumen()); /* Calcula el volumen y establece su atributo */
        this.setSuperficie(this.calcularSuperficie()); /* Calcula la superficie y establece su atributo */
    }

    public double calcularVolumen() {
        double volumen = Math.PI * altura * Math.pow(radio, 2);
        return volumen;
    }

    public double calcularSuperficie() {
        double areaLateral = 2 * Math.PI * radio * altura;
        double areaTapa = Math.PI * Math.pow(radio, 2);
        return areaLateral + 2 * areaTapa;
    }

}