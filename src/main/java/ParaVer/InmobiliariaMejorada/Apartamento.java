package ParaVer.InmobiliariaMejorada;

public class Apartamento extends Vivienda {
    private int piso;

    public Apartamento(String direccion, double area, double valorBase, int numHabitaciones, int numBanos, int piso) {
        super(direccion, area, valorBase, numHabitaciones, numBanos);
        this.piso = piso;
    }

    @Override
    public double calcularPrecioVenta() {
        return valorBase + (area * 1200) + (piso * 5000);
    }

    @Override
    public String toString() {
        return "Apartamento - " + super.toString() + ", Piso: " + piso;
    }
}
