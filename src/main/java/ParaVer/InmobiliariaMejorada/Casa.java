package ParaVer.InmobiliariaMejorada;

public class Casa extends Vivienda {
    public enum TipoCasa {
        RURAL, URBANA, CERRADO, INDEPENDIENTE
    }

    private TipoCasa tipo;

    public Casa(String direccion, double area, double valorBase, int numHabitaciones, int numBanos, TipoCasa tipo) {
        super(direccion, area, valorBase, numHabitaciones, numBanos);
        this.tipo = tipo;
    }

    @Override
    public double calcularPrecioVenta() {
        double extra;
        switch (tipo) {
            case RURAL:
                extra = -5000;
                break;
            case URBANA:
                extra = 8000;
                break;
            case CERRADO:
                extra = 15000;
                break;
            case INDEPENDIENTE:
                extra = 10000;
                break;
            default:
                extra = 0;
        }
        return valorBase + (area * 1100) + extra;
    }

    @Override
    public String toString() {
        return "Casa " + tipo + " - " + super.toString();
    }
}
