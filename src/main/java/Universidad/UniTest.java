package Universidad;

import java.util.ArrayList;

public class UniTest {

    public static void main(String[] args) {

        Persona p1 = new Persona("Juan", "Calle 123");
        Persona p2 = new Persona("Maria", "Calle 456");
        ProfesorTitular p3 = new ProfesorTitular("Pedro", "Calle 789", "Matematicas", "Titular", "Calculo");

        ArrayList<Persona> col = new ArrayList<Persona>();
        col.add(p1);
        col.add(p2);
        col.add(p3);

        for (Persona p : col) {
            if (p instanceof ProfesorTitular)
                System.out.println(p);
            else
                System.out.println("NO ES UN OBJETO PROFESOR TITULAR");
        }


    }
}
