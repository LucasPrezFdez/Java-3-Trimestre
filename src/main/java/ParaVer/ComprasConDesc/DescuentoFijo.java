package ParaVer.ComprasConDesc;

public class DescuentoFijo implements Descuento {

    private double montoDescuento;

    public DescuentoFijo(double montoDescuento) {
        this.montoDescuento = montoDescuento;
    }

    @Override
    public double aplicarDescuento(LineaPedido linea) {
        return montoDescuento;
    }
}
