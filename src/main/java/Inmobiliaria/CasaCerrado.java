package Inmobiliaria;

public class CasaCerrado extends CasaUrbana{


    protected int valorAdmin;
    protected boolean tienePiscina;
    protected boolean tieneCamposDeportivos;

    public CasaCerrado(int idInmo, int area, String direccion, int numeroDeBaños, int numeroHabitaciones, int nPisos, boolean tieneCamposDeportivos, boolean tienePiscina, int valorAdmin) {
        super(idInmo, area, direccion, numeroDeBaños, numeroHabitaciones, nPisos);
        this.tieneCamposDeportivos = tieneCamposDeportivos;
        this.tienePiscina = tienePiscina;
        this.valorAdmin = valorAdmin;
    }

    @Override
    public String toString() {
        return "CasaCerrado{" +
                "tieneCamposDeportivos=" + tieneCamposDeportivos +
                ", valorAdmin=" + valorAdmin +
                ", tienePiscina=" + tienePiscina +
                "} " + super.toString();
    }

    @Override
    void calcularPrecioVenta() {
        this.precioVenta = area * valorUnitario.get("Casa en conjunto cerrado");
    }
}
