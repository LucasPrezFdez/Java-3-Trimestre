package ExamenProgramacion.ej3;

public class Local extends Inmueble implements Impuesto {

    enum tipo {
        INTERNO, CALLE
    }

    protected tipo tipoLocal;

    public Local(int idInmo, int area, String direccion, tipo tipoLocal) {
        super(idInmo, area, direccion);
        this.tipoLocal = tipoLocal;
    }

    @Override
    public String toString() {
        return "Local{" +
                "tipoLocal=" + tipoLocal +
                "} " + super.toString();
    }

    @Override
    public double impuesto() {
        return precioVenta += precioVenta * 0.03;
    }


}
