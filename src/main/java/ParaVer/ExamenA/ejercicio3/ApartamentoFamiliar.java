package ParaVer.ExamenA.ejercicio3;

public class ApartamentoFamiliar extends Inmueble {
    private double administracion;

    public ApartamentoFamiliar(String dir, int area, int hab, int ban, double adm) {
        super(dir, area, hab, ban);
        this.administracion = adm;
    }

    public double valorMetroCuadrado() {
        return 2500;
    }

    public double calcularImpuesto() {
        return calcularValorVenta() * 0.04 + habitaciones * 700 + banos * 300 + 3 * administracion;
    }
}
