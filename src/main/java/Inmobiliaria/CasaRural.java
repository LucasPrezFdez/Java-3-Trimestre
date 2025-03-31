package Inmobiliaria;

public class CasaRural extends Casa {

    protected int distanciaCabera;
    protected int altitud;

    public CasaRural(int idInmo, int area, String direccion, int numeroDeBaños, int numeroHabitaciones, int nPisos, int altitud, int distanciaCabera) {
        super(idInmo, area, direccion, numeroDeBaños, numeroHabitaciones, nPisos);
        this.altitud = altitud;
        this.distanciaCabera = distanciaCabera;
    }

    @Override
    public String toString() {
        return "CasaRural{" +
                "altitud=" + altitud +
                ", distanciaCabera=" + distanciaCabera +
                "} " + super.toString();
    }

    @Override
    void calcularPrecioVenta() {
        this.precioVenta = area * (valorUnitario.get("Casa rural"));
    }
}
