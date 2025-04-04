package Angel.Practicas;

public class refactorizacion {

    public class SumaPares {
        private static boolean isEven(int number) {
            return number % 2 == 0;
        }

        public static int addEvens(int[] numbers) {
            int acumulator = 0;
            for (int number : numbers) {
                if (isEven(number)) {
                    acumulator += number;
                }
            }
            return acumulator;
        }

    }

    public class ContarCaracter {
        public static int cuentaCaracteres(String texto, char buscar) {
            int cont = 0;
            for (int i = 0; i < texto.length(); i++) {
                if (texto.charAt(i) ==  buscar) {
                    cont ++;
                }
            }
            return cont;
        }
    }



}
