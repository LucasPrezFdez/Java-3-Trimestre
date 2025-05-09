package sw3;

public class Piramide extends FiguraGeometrica {

    private double base; /* Atributo que identifica la base de una pirámide */
    private double altura; /* Atributo que identifica la altura de una 	pirámide */
    private double apotema; /* Atributo que identifica la apotema de una pirámide */

    public Piramide(double base, double altura, double apotema) {
        this.base = base;
        this.altura = altura;
        this.apotema = apotema;
        this.setVolumen(this.calcularVolumen()); /* Calcula el volumen y establece su atributo */
        this.setSuperficie(this.calcularSuperficie()); /* Calcula la superficie y establece su atributo */
    }

    public double calcularVolumen() {
        double volumen = (Math.pow(base, 2) * altura) / 3d;
        return volumen;
    }

    public double calcularSuperficie() {
        double areaBase = Math.pow(base, 2);
        double areaLado = base * apotema /2d;
        return areaBase + 4*areaLado;
    }


}