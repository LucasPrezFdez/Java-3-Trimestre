package ParaVer.ExamenA.ejercicio4;

import java.util.*;

public class Competicion {
    public static void main(String[] args) {
        Equipo[] equipos = new Equipo[3];
        equipos[0] = new Equipo("Equipo A", new Ciclista[] {
                new Velocista("Velocista A1", 4, 3),
                new Escalador("Escalador A2", 3, 2),
                new Contrarrelojista("Contra A3", 5)
        });
        equipos[1] = new Equipo("Equipo B", new Ciclista[] {
                new Velocista("Velocista B1", 3, 2),
                new Escalador("Escalador B2", 2, 1),
                new Contrarrelojista("Contra B3", 4)
        });
        equipos[2] = new Equipo("Equipo C", new Ciclista[] {
                new Velocista("Velocista C1", 5, 4),
                new Escalador("Escalador C2", 4, 3),
                new Contrarrelojista("Contra C3", 6)
        });

        for (int etapa = 1; etapa <= 3; etapa++) {
            System.out.println("ETAPA " + etapa);
            for (Equipo eq : equipos) {
                for (Ciclista c : eq.getCiclistas()) {
                    c.calcularTiempoParcial();
                    System.out.printf("%s: %.2f\n", c.getNombre(), c.getTiempoAcumulado());
                }
            }
            mostrarClasificacion(equipos);
            System.out.println();
        }

        System.out.println("CLASIFICACIÓN FINAL POR EQUIPOS:");
        Arrays.sort(equipos, Comparator.comparingDouble(Equipo::getTiempoTotalEquipo));
        for (Equipo e : equipos) {
            System.out.printf("%s - Total: %.2f\n", e.getNombre(), e.getTiempoTotalEquipo());
        }

        System.out.println("\nCLASIFICACIÓN FINAL INDIVIDUAL:");
        List<Ciclista> todos = new ArrayList<>();
        for (Equipo e : equipos) {
            todos.addAll(Arrays.asList(e.getCiclistas()));
        }
        todos.sort(Comparator.comparingDouble(Ciclista::getTiempoAcumulado));
        for (Ciclista c : todos) {
            System.out.printf("%s - %.2f\n", c.getNombre(), c.getTiempoAcumulado());
        }
    }

    public static void mostrarClasificacion(Equipo[] equipos) {
        System.out.println("CLASIFICACIÓN POR EQUIPOS:");
        for (Equipo e : equipos) {
            System.out.printf("%s: %.2f\n", e.getNombre(), e.getTiempoTotalEquipo());
        }
    }
}
