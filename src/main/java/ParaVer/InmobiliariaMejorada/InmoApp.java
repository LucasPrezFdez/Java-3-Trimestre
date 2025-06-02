package ParaVer.InmobiliariaMejorada;

public class InmoApp {
    public static void main(String[] args) {
        Inmobiliaria inmobiliaria = new Inmobiliaria();

        inmobiliaria.agregarInmueble(new Apartaestudio("Calle 1", 30, 50000));
        inmobiliaria.agregarInmueble(new Apartamento("Calle 2", 70, 80000, 2, 2, 3));
        inmobiliaria.agregarInmueble(new ApartamentoFamiliar("Calle 3", 90, 100000, 5));
        inmobiliaria.agregarInmueble(new Casa("Calle 4", 120, 150000, 4, 3, Casa.TipoCasa.CERRADO));

        System.out.println("=== Lista de inmuebles ===");
        inmobiliaria.mostrarInmuebles();

        System.out.println("\n=== Inmuebles entre $100000 y $200000 ===");
        inmobiliaria.buscarPorRango(100000, 200000);
    }
}
