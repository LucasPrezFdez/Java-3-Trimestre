package ExamenProgramacion.ej3;

public class Vivienda extends Inmueble {


    protected int numeroHabitaciones;
    protected int numeroDeBaños;

    public Vivienda(int idInmo, int area, String direccion, int numeroDeBaños, int numeroHabitaciones) {
        super(idInmo, area, direccion);
        this.numeroDeBaños = numeroDeBaños;
        this.numeroHabitaciones = numeroHabitaciones;
    }

    @Override
    public String toString() {
        return "Vivienda{" +
                "numeroDeBaños=" + numeroDeBaños +
                ", numeroHabitaciones=" + numeroHabitaciones +
                ", area=" + area +
                ", direccion='" + direccion + '\'' +
                ", idInmo=" + idInmo +
                ", precioVenta=" + precioVenta +
                ", valorUnitario=" + valorUnitario +
                '}';
    }


}
