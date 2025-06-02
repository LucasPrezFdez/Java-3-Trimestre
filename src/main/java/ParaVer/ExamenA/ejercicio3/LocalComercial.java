package ParaVer.ExamenA.ejercicio3;

public class LocalComercial extends Inmueble {
    public LocalComercial(String dir, int area, int hab, int ban) {
        super(dir, area, hab, ban);
    }

    public double valorMetroCuadrado() {
        return 3575;
    }

    public double calcularImpuesto() {
        return calcularValorVenta() * 0.06;
    }
}
