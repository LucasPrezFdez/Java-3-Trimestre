package Inmobiliaria;

public class CasaUrbana extends Casa{

    public CasaUrbana(int idInmo, int area, String direccion, int numeroDeBaños, int numeroHabitaciones, int nPisos) {
        super(idInmo, area, direccion, numeroDeBaños, numeroHabitaciones, nPisos);
    }

    @Override
    public String toString() {
        return "CasaUrbana{} " + super.toString();
    }
}
