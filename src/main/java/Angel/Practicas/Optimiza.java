package Angel.Practicas;

public class Optimiza {

    public class Concatenador {
        public static StringBuilder unir(String[] palabras) {
            StringBuilder resultado = new StringBuilder();
            for (String palabra : palabras) {
                resultado.append(palabra);
            }
            return resultado;
        }
    }
}

/*
        public static String unir(String[] palabras) {
            String resultado = "";
            for (int i = 0; i < palabras.length; i++) {
                resultado = resultado + palabras[i];
            }
            return resultado;
        }
 */
