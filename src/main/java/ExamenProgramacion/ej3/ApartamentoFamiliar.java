package ExamenProgramacion.ej3;

public class ApartamentoFamiliar extends Apartamento{

    protected int valorAdmin;

    public ApartamentoFamiliar(int idInmo, int area, String direccion, int numeroDeBaños, int numeroHabitaciones, int valorAdmin) {
        super(idInmo, area, direccion, numeroDeBaños, numeroHabitaciones);
        this.valorAdmin = valorAdmin;

    }

    @Override
    void calcularPrecioVenta() {
        this.precioVenta = area * valorUnitario.get("Apartamento familiar") + numeroDeBaños * 600+ numeroHabitaciones*700 + valorAdmin*4;
    }


}
