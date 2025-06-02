package ParaVer.ExamenA.ejercicio3;

public class CasaIndependiente extends Inmueble {
    public CasaIndependiente(String dir, int area, int hab, int ban) {
        super(dir, area, hab, ban);
    }

    public double valorMetroCuadrado() {
        return 3400;
    }

    public double calcularImpuesto() {
        return calcularValorVenta() * 0.02 + habitaciones * 700 + banos * 300;
    }
}
