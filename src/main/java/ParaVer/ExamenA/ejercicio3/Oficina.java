package ParaVer.ExamenA.ejercicio3;

public class Oficina extends Inmueble {
    private boolean esGobierno;

    public Oficina(String dir, int area, int hab, int ban, boolean gob) {
        super(dir, area, hab, ban);
        this.esGobierno = gob;
    }

    public double valorMetroCuadrado() {
        return 3975;
    }

    public double calcularImpuesto() {
        double imp = calcularValorVenta() * 0.06;
        if (!esGobierno)
            imp -= 3000;
        return imp;
    }
}
