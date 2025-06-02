package ParaVer.ExamenA.ejercicio3;

import java.io.*;
import java.util.*;

public class TestInmobiliaria {

    public static void main(String[] args) {
        List<Inmueble> lista = new ArrayList<>();
        lista.add(new CasaRural("Zona Rural", 120, 3, 2, 250));
        lista.add(new CasaConjuntoCerrado("Conjunto Sol", 100, 4, 2, false, false));
        lista.add(new CasaIndependiente("Av. Central", 150, 5, 3));
        lista.add(new Apartaestudio("Centro", 40, 1, 1));
        lista.add(new ApartamentoFamiliar("Barrio Norte", 80, 3, 2, 150));
        lista.add(new LocalComercial("Mall Plaza", 90, 0, 1));
        lista.add(new Oficina("Torre Ejecutiva", 110, 0, 2, false));

        double totalValor = 0;
        double totalImpuestos = 0;
        double sumaValorM2 = 0;

        for (Inmueble i : lista) {
            System.out.println(i.resumen());
            double impuesto = i.calcularImpuesto();
            totalValor += i.calcularValorVenta();
            totalImpuestos += impuesto;
            sumaValorM2 += i.valorMetroCuadrado();
            System.out.printf("Impuesto: $%.2f\n\n", impuesto);
        }

        System.out.printf("TOTAL valor inmuebles: $%.2f\n", totalValor);
        System.out.printf("PROMEDIO valor metro cuadrado: $%.2f\n", sumaValorM2 / lista.size());
        System.out.printf("TOTAL impuestos: $%.2f\n", totalImpuestos);

        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("inmobiliaria_gabriel.dat"))) {
            out.writeObject(lista);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
