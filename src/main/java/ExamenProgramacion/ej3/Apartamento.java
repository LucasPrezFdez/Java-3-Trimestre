package ExamenProgramacion.ej3;

public class Apartamento extends Vivienda implements Impuesto{

    public Apartamento(int idInmo, int area, String direccion, int numeroDeBaños, int numeroHabitaciones) {
        super(idInmo, area, direccion, numeroDeBaños, numeroHabitaciones);
    }

    @Override
    public String toString() {
        return  super.toString() + "\nApartamento { } ";
    }

    @Override
    public double impuesto() {
        return precioVenta += precioVenta*0.06;
    }
}
