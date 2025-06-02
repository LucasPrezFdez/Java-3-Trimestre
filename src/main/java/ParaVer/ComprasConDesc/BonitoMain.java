package ParaVer.ComprasConDesc;

public class BonitoMain {

    public static void main(String[] args) {

        Producto producto1 = new Producto(1, "Carpeta", "Carpeta anillada metalica", 10.25);
        Producto producto2 = new Producto(2, "Lapiz", "Lapiz de grafito", 1.25);
        Producto producto3 = new Producto(3, "Boligrafo", "Boligrafo azul", 2.50);
        Producto producto4 = new Producto(4, "Goma", "Goma de borrar", 0.75);

        // Crear descuentos
        Descuento descuento10porc = new DescuentoPorCantidad(3, 0.10); // 10% si compras 3 o más
        Descuento descuentoFijo = new DescuentoFijo(0.5); // €0.5 de descuento

        Factura factura1 = new Factura(123);

        LineaPedido l1 = new LineaPedido(1, 1, producto1);
        LineaPedido l2 = new LineaPedido(2, 3, producto2); // 3 lápices
        l2.setDescuento(descuento10porc);
        LineaPedido l3 = new LineaPedido(3, 3, producto3);
        l3.setDescuento(descuentoFijo);
        LineaPedido l4 = new LineaPedido(4, 4, producto4);

        factura1.getItemsFactura().add(l1);
        factura1.getItemsFactura().add(l2);
        factura1.getItemsFactura().add(l3);
        factura1.getItemsFactura().add(l4);

        factura1.imprimir();
    }
}
