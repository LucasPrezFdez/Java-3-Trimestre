package Angel.Practicas;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromoTest {

    @Test
    void testEsPalindromo() {

        Palindromo palin = new Palindromo();
        boolean resultado = palin.esPalindromo("Reconocer");
        assertEquals(true,resultado);

    }

    @Test
    void testNoEsPalindromo(){
        Palindromo palin = new Palindromo();
        boolean resultado = palin.esPalindromo("Cantar");
        assertEquals(false,resultado);
    }
}