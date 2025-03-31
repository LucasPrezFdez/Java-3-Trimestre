package Inmobiliaria;

public class Casa extends Vivienda{

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
}
