package ParaVer.ComprasConDesc;

public class DescuentoPorCantidad implements Descuento {

    private int cantidadMinima;
    private double porcentaje;

    public DescuentoPorCantidad(int cantidadMinima, double porcentaje) {
        this.cantidadMinima = cantidadMinima;
        this.porcentaje = porcentaje;
    }

    @Override
    public double aplicarDescuento(LineaPedido linea) {
        if (linea.getCantidad() >= cantidadMinima) {
            return linea.getCantidad() * linea.getProducto().getPrecio() * porcentaje;
        }
        return 0;
    }
}
