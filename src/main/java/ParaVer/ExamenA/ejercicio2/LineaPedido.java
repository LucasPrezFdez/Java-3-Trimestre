package ParaVer.ExamenA.ejercicio2;

public class LineaPedido {
    private Producto producto;
    private int cantidad;

    public LineaPedido(Producto producto, int cantidad) {
        this.producto = producto;
        this.cantidad = cantidad;
    }

    public float getTotal() {
        return cantidad * producto.getPrecio();
    }

    public String toString() {
        return cantidad + " x " + producto.getNombre() + " ($" + producto.getPrecio() + ") = $" + getTotal();
    }
}
