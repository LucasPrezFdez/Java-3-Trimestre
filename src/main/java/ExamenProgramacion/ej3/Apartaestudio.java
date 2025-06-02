package ExamenProgramacion.ej3;

public class Apartaestudio extends Apartamento{

    public Apartaestudio(int idInmo, int area, String direccion, int numeroDeBaños, int numeroHabitaciones) {
        super(idInmo, area, direccion, numeroDeBaños, numeroHabitaciones);
    }

    @Override
    void calcularPrecioVenta() {
        this.precioVenta = area * valorUnitario.get("Apartaestudio") + numeroDeBaños * 600+ numeroHabitaciones*700;
    }

}
