package ParaVer.ComprasConDesc;

import java.util.ArrayList;

public class Factura {

    private int identificador;
    private ArrayList<LineaPedido> itemsFactura;

    public Factura(int identificador) {
        this.identificador = identificador;
        itemsFactura = new ArrayList<>();
    }

    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public ArrayList<LineaPedido> getItemsFactura() {
        return itemsFactura;
    }

    public void setItemsFactura(ArrayList<LineaPedido> itemsFactura) {
        this.itemsFactura = itemsFactura;
    }

    public void anadirLinea(int identificador, int cantidad, Producto producto) {
        LineaPedido linea = new LineaPedido(identificador, cantidad, producto);
        itemsFactura.add(linea);
    }

    public double calcularTotalFactura() {
        double total = 0;
        for (LineaPedido linea : itemsFactura) {
            total += linea.precioTotal();
        }
        return total;
    }

    public void imprimir() {
        System.out.println("Factura [id = " + identificador + "]\n");
        for (LineaPedido l : itemsFactura) {
            System.out.println(identificador + ", cantidad= " + l.getCantidad() +
                    ", nombre= " + l.getProducto().getNombre() +
                    ", precio= €" + l.getProducto().getPrecio() +
                    ", subtotal= €" + l.precioTotal() +
                    (l.getDescuento() != null ? " (descuento aplicado: €" + l.calcularDescuento() + ")" : ""));
        }
        System.out.println("--------------------------------------------------");
        System.out.println("Total factura = € " + calcularTotalFactura());
    }
}
