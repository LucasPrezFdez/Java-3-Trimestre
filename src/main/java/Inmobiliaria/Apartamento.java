package Inmobiliaria;

public class Apartamento extends Vivienda {

    public Apartamento(int idInmo, int area, String direccion, int numeroDeBaños, int numeroHabitaciones) {
        super(idInmo, area, direccion, numeroDeBaños, numeroHabitaciones);
    }

    @Override
    public String toString() {
        return  super.toString() + "\nApartamento { } ";
    }
}
