package examenA.Ejercicio2;


import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class BonitoMain {

    public static void main(String[] args) {


        Random random = new Random();

        Producto producto1 = new Producto("Carpeta",1, "Carpeta anillada metalica", 1 + random.nextFloat(200-1));
        Producto producto2 = new Producto("Lapiz",2, "Lapiz de grafito", 1 + random.nextFloat(200-1));
        Producto producto3 = new Producto("Boligrafo",3, "Boligrafo azul", 1 + random.nextFloat(200-1));
        Producto producto4 = new Producto("Goma",4, "Goma de borrar", 1 + random.nextFloat(200-1));

        Orden factura1 = new Orden(123);

        factura1.añadirLinea(1, random.nextInt(6) + 1, producto1);
        factura1.añadirLinea(2, random.nextInt(6) + 1, producto2);
        factura1.añadirLinea(3, random.nextInt(6) + 1, producto3);
        factura1.añadirLinea(4, random.nextInt(6) + 1, producto4);

        factura1.calcularTotalFacturaConIVA();

        factura1.imprimirConIVA();

        try (FileWriter writer = new FileWriter("LucasPerez.txt")) {
            writer.write(factura1.toString());
            writer.write("\n--------------------------------------------------\n");
            writer.write("Total factura con IVA (17%): €" + factura1.calcularTotalFacturaConIVA());
            System.out.println("El ticket se ha guardado en el fichero LucasPerez.txt");
        } catch (IOException e) {
            System.err.println("Error al guardar el ticket: " + e.getMessage());
        }




    }

}
