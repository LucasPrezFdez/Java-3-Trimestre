package ExamenProgramacion.ej3;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Inmueble> casas = new ArrayList<>();

        CasaRural casaRural = new CasaRural(1, 200, "Cadiz", 2,
                5, 2, 50, 10);

        casas.add(casaRural);

        double valorPromedio = 0;
        for (Inmueble manolo : casas) {
            if (manolo instanceof CasaRural){
                ((CasaRural) manolo).pueblaValores();
                ((CasaRural) manolo).calcularPrecioVenta();

                valorPromedio += manolo.getPrecioVenta();
                System.out.println(manolo.toString());
                System.out.println("\n Precio de venta sin impuestos --> " + ((CasaRural) manolo).getPrecioVenta());
                System.out.println("\n Con impuestos --> "+((CasaRural) manolo).impuesto());
            }
        }

        System.out.println("Valor Promedio de todo lo vendido: " +valorPromedio/casas.size() );
    }
}
