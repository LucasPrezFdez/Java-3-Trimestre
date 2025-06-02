package examenA.Ejercicio2;


import java.util.ArrayList;

public class Orden {


    private int identificador;
    private ArrayList<LineaPedido> itemsFactura;

    public Orden(int identificador) {
        this.identificador = identificador;
        itemsFactura = new ArrayList<LineaPedido>();
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

    public void añadirLinea(int identificador, int cantidad, Producto producto) {
        LineaPedido linea = new LineaPedido(identificador, cantidad, producto);
        itemsFactura.add(linea);
    }

    public double calcularTotalFactura() {
        double total = 0;
        for (int i = 0; i < itemsFactura.size(); i++) {
            LineaPedido linea = (LineaPedido) itemsFactura.get(i);
            total += linea.calcularSubtotalLineaPedido();
        }
        return total;
    }

    @Override
    public String toString() {
        return "Orden [id = " + identificador + "]\n" +
                "Items de la factura\n" +
                itemsFactura + "\n" +
                "Total orden = € " + calcularTotalFactura();
    }

    public void imprimir() {
        System.out.println("Factura [id = " + identificador + "]\n");
        for (LineaPedido l : itemsFactura) {
            LineaPedido linea = (LineaPedido) l;
            System.out.println(identificador + ", cantidad= " + l.getCantidad() + ", nombre= "
                    + l.getProducto().getNombre() + ", precio= €" + l.getProducto().getPrecio() + "subtotal= €" + linea.calcularSubtotalLineaPedido() + "  ]");
        }
        System.out.println("--------------------------------------------------");
        System.out.println("Total factura = € " + calcularTotalFactura());
    }

    public double calcularTotalFacturaConIVA() {
        double total = 0;
        for (LineaPedido linea : itemsFactura) {
            total += linea.calcularSubtotalLineaPedido();
        }
        double iva = total * 0.15; // Cálculo del IVA (17%)
        return total + iva;

    }

    public void imprimirConIVA() {
        System.out.println("Factura [id = " + identificador + "]\n");
        for (LineaPedido linea : itemsFactura) {
            System.out.println("Identificador: " + linea.getIdentificador() +
                    ", Cantidad: " + linea.getCantidad() +
                    ", Producto: " + linea.getProducto().getNombre() +
                    ", Precio: €" + linea.getProducto().getPrecio() +
                    ", Subtotal: €" + linea.calcularSubtotalLineaPedido());
        }
        System.out.println("--------------------------------------------------");
        System.out.println("Total factura con IVA (17%): " + String.format("%.2f", calcularTotalFacturaConIVA()) + " €");
    }
}
