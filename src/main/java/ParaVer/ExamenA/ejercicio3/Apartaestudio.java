package ParaVer.ExamenA.ejercicio3;

public class Apartaestudio extends Inmueble {
    public Apartaestudio(String dir, int area, int hab, int ban) {
        super(dir, area, hab, ban);
    }

    public double valorMetroCuadrado() {
        return 1875;
    }

    public double calcularImpuesto() {
        return calcularValorVenta() * 0.04 + habitaciones * 700 + banos * 300;
    }
}
