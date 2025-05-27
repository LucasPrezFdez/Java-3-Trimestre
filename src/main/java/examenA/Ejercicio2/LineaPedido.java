package examenA.Ejercicio2;

public class LineaPedido {

    private int identificador;
    private int cantidad;

    Producto producto;

    public LineaPedido(int identificador, int cantidad, Producto producto) {
        this.identificador = identificador;
        this.cantidad = cantidad;
        this.producto = producto;
    }

    public int getIdentificador() {
        return identificador;
    }

    private void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public int getCantidad() {
        return cantidad;
    }

    private void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int calcularSubtotalLineaPedido(){
        return producto.getPrecio()*cantidad;
    }

    @Override
    public String toString() {
        return "LineaPedido{" +
                "identificador=" + identificador +
                ", cantidad=" + cantidad +
                ", producto=" + producto +
                '}';
    }
}
