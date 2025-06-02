package ParaVer.InmobiliariaMejorada;

import java.util.ArrayList;

public class Inmobiliaria {
    private ArrayList<Inmueble> inmuebles;

    public Inmobiliaria() {
        inmuebles = new ArrayList<>();
    }

    public void agregarInmueble(Inmueble i) {
        inmuebles.add(i);
    }

    public void mostrarInmuebles() {
        for (Inmueble i : inmuebles) {
            System.out.println(i + " - Precio venta: $" + i.calcularPrecioVenta());
        }
    }

    public void buscarPorRango(double min, double max) {
        for (Inmueble i : inmuebles) {
            double precio = i.calcularPrecioVenta();
            if (precio >= min && precio <= max) {
                System.out.println(i + " - Precio dentro del rango: $" + precio);
            }
        }
    }
}
