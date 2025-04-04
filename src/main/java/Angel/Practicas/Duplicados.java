package Angel.Practicas;

import java.util.HashSet;

public class Duplicados {

    public static boolean hayDuplicados(int[] numeros) {
        HashSet<Integer> vistos = new HashSet<Integer>();

        for (int numero: numeros){
            if (vistos.add((numero)))
                return true;
        }
        return false;
    }
}



    /*      O(n^2)
    public static boolean hayDuplicados(int[] numeros) {
        for (int i = 0; i < numeros.length; i++) {
            for (int j = i + 1; j < numeros.length; j++) {
                if (numeros[i] == numeros[j]) {
                    return true;
                }
            }
        }
        return false;
    }
     */


