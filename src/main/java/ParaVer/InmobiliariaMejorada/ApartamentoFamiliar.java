package ParaVer.InmobiliariaMejorada;

public class ApartamentoFamiliar extends Apartamento {
    public ApartamentoFamiliar(String direccion, double area, double valorBase, int piso) {
        super(direccion, area, valorBase, 3, 2, piso);
    }

    @Override
    public String toString() {
        return "Apartamento Familiar - " + super.toString();
    }
}
