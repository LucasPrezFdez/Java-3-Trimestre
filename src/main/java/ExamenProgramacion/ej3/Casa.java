package ExamenProgramacion.ej3;

public class Casa extends Vivienda implements Impuesto{

    protected int nPisos;

    public Casa(int idInmo, int area, String direccion, int numeroDeBaños, int numeroHabitaciones, int nPisos) {
        super(idInmo, area, direccion, numeroDeBaños, numeroHabitaciones);
        this.nPisos = nPisos;
    }


    @Override
    public String toString() {
        return "Casa{" +
                "nPisos=" + nPisos +
                "} " + super.toString();
    }

    @Override
    public double impuesto() {
      return precioVenta += precioVenta*0.08;
    }


}
