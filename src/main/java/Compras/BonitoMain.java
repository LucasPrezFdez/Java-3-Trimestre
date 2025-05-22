package Compras;

public class BonitoMain {

    public static void main(String[] args) {


        Producto producto1 = new Producto(1,"Carpeta", "Carpeta anillada metalica", 10.25);
        Producto producto2 = new Producto(2,"Lapiz", "Lapiz de grafito", 1.25);
        Producto producto3 = new Producto(3,"Boligrafo", "Boligrafo azul", 2.50);
        Producto producto4 = new Producto(4,"Goma", "Goma de borrar", 0.75);

        Factura factura1 = new Factura(123);

        factura1.añadirLinea(1,1, producto1);
        factura1.añadirLinea(2,2, producto2);
        factura1.añadirLinea(3,3, producto3);
        factura1.añadirLinea(4,4, producto4);
        factura1.calcularTotalFactura();






    }



}
