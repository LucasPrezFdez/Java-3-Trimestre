package ExamenProgramacion.ej3;

public class CasaIndependiente extends CasaUrbana{


    public CasaIndependiente(int idInmo, int area, String direccion, int numeroDeBaños, int numeroHabitaciones, int nPisos) {
        super(idInmo, area, direccion, numeroDeBaños, numeroHabitaciones, nPisos);

    }

    @Override
    public String toString() {
        return "CasaIndependiente{} " + super.toString();
    }

    @Override
    void calcularPrecioVenta() {
        this.precioVenta = area * valorUnitario.get("Casa independiente") + numeroDeBaños * 600+ numeroHabitaciones*700;
    }


}
