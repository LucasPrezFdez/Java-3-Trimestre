package Angel.Practicas;

public class Factorial {
    public static int factorial(int num) throws IllegalAccessException {
        if (num < 0) {
            throw new IllegalAccessException("No se puede calcular el factorial de un numero negativo");
        }
        int resultado = 1;
        for (int i = 1; i <= num; i++) {
            resultado *= i;
        }
        return resultado;
    }
}
