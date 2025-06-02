package ParaVer.ExamenA.ejercicio2;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class PedidoTest {
    
    public static void main(String[] args) {
        Random rand = new Random();
        LineaPedido[] pedido = new LineaPedido[6];
        Producto[] productos = {
                new ProductoA(rand.nextInt(200) + 1),
                new ProductoB(rand.nextInt(200) + 1),
                new ProductoC(rand.nextInt(200) + 1),
                new ProductoD(rand.nextInt(200) + 1),
                new ProductoE(rand.nextInt(200) + 1),
                new ProductoF(rand.nextInt(200) + 1)
        };

        float totalSinIVA = 0;
        StringBuilder ticket = new StringBuilder("TICKET DE COMPRA\n\n");

        for (int i = 0; i < pedido.length; i++) {
            int cantidad = rand.nextInt(6) + 1;
            pedido[i] = new LineaPedido(productos[i], cantidad);
            totalSinIVA += pedido[i].getTotal();
            ticket.append(pedido[i].toString()).append("\n");
        }

        float totalConIVA = totalSinIVA * 1.17f;
        ticket.append(String.format("\nTOTAL con IVA (17%%): $%.2f", totalConIVA));

        System.out.println(ticket);

        try (FileWriter fw = new FileWriter("gabriel.txt")) {
            fw.write(ticket.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
