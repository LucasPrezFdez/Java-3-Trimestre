package ParaVer.ExamenA.ejercicio3;

public class CasaRural extends Inmueble {
    private int altitud;

    public CasaRural(String dir, int area, int hab, int ban, int altitud) {
        super(dir, area, hab, ban);
        this.altitud = altitud;
    }

    public double valorMetroCuadrado() {
        return 1525;
    }

    public double calcularImpuesto() {
        double base = calcularValorVenta() * 0.02 + habitaciones * 700 + banos * 300;
        return base + 4 * altitud;
    }
}
