package ParaVer.ExamenA.ejercicio3;

public class CasaConjuntoCerrado extends Inmueble {
    private boolean piscina;
    private boolean campoDeportivo;

    public CasaConjuntoCerrado(String dir, int area, int hab, int ban, boolean piscina, boolean campo) {
        super(dir, area, hab, ban);
        this.piscina = piscina;
        this.campoDeportivo = campo;
    }

    public double valorMetroCuadrado() {
        return 2225;
    }

    public double calcularImpuesto() {
        double imp = calcularValorVenta() * 0.02 + habitaciones * 700 + banos * 300;
        if (!piscina)
            imp -= 6000;
        if (!campoDeportivo)
            imp -= 3000;
        return imp;
    }
}
