package Angel.Practicas;

public class CalculadoraIva {
    public static double calcularPrecioConIVA(double precioSinIVA, double porcentajeIVA) {
        return precioSinIVA + (precioSinIVA * porcentajeIVA / 100);
    }
}