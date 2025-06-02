package ExamenProgramacion.ej3;

import java.util.ArrayList;

public class InmoApp {

    public static void main(String[] args) {

        ArrayList<Inmueble> inmo = new ArrayList<Inmueble>();

        CasaRural casa1 = new CasaRural(1, 50, "a 1",
                3, 2, 3, 1, 1);

        CasaCerrado casa2 = new CasaCerrado(2, 100, "b 33", 4,
                2, 1, false, false, 1000);

        CasaIndependiente casa3 = new CasaIndependiente(3, 150, "c 44",
                5, 3, 2);

        inmo.add(casa1);
        inmo.add(casa2);
        inmo.add(casa3);

        for (Inmueble i : inmo)
            System.out.println(i.toString());

        for (Inmueble i : inmo) {
            i.pueblaValores();
            i.calcularPrecioVenta();
            System.out.println(i.toString()+"-->"+i.getPrecioVenta());
        }





    }

}
