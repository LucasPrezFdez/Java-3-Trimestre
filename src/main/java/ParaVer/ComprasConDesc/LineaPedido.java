package ParaVer.ComprasConDesc;

public class LineaPedido {

    private int identificador;
    private int cantidad;
    private Producto producto;
    private Descuento descuento; // NUEVO

    public LineaPedido(int identificador, int cantidad, Producto producto) {
        this.identificador = identificador;
        this.cantidad = cantidad;
        this.producto = producto;
        this.descuento = null;
    }

    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public Descuento getDescuento() {
        return descuento;
    }

    public void setDescuento(Descuento descuento) {
        this.descuento = descuento;
    }

    public double calcularDescuento() {
        return (descuento != null) ? descuento.aplicarDescuento(this) : 0;
    }

    public double precioTotal() {
        double subtotal = cantidad * producto.getPrecio();
        return subtotal - calcularDescuento();
    }

    @Override
    public String toString() {
        return "LineaPedido{" +
                "identificador=" + identificador +
                ", cantidad=" + cantidad +
                ", producto=" + producto +
                ", descuento=" + (descuento != null ? calcularDescuento() : "Sin descuento") +
                '}';
    }
}
