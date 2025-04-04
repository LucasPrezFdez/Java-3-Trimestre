package Angel.Practicas;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraIvaTest {

    @Test
    void calcularPrecioConIVA() {

        CalculadoraIva calcu = new CalculadoraIva();
        double r = calcu.calcularPrecioConIVA(2, 10);
        assertEquals(2.2, r, 0.01);
    }

    @Test
    void testCalcularConCero() {
        double r = CalculadoraIva.calcularPrecioConIVA(0,10);
        assertEquals(0,r,0.01);
    }

    @Test
    void testCalcularConDecimal() {
        double r = CalculadoraIva.calcularPrecioConIVA(5.7,10);
        assertEquals(6.27,r,0.01);
    }

}