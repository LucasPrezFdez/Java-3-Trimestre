package ParaVer.InmobiliariaMejorada;

public abstract class Vivienda extends Inmueble {
    protected int numHabitaciones;
    protected int numBanos;

    public Vivienda(String direccion, double area, double valorBase, int numHabitaciones, int numBanos) {
        super(direccion, area, valorBase);
        this.numHabitaciones = numHabitaciones;
        this.numBanos = numBanos;
    }

    @Override
    public String toString() {
        return super.toString() + ", Habitaciones: " + numHabitaciones + ", Baños: " + numBanos;
    }
}
