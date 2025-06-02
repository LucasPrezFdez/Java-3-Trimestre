package ParaVer.InmobiliariaMejorada;

public class Apartaestudio extends Vivienda {
    public Apartaestudio(String direccion, double area, double valorBase) {
        super(direccion, area, valorBase, 1, 1);
    }

    @Override
    public double calcularPrecioVenta() {
        return valorBase + (area * 1000);
    }

    @Override
    public String toString() {
        return "Apartaestudio - " + super.toString();
    }
}
