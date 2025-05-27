package examenA.ejercicio4;

public class Prueba {


    public static void main(String[] args) {

        Equipo equipo1 = new Equipo("Movistar", "Colombia");
        Ciclista ciclista1 = new Ciclista("Juan", "Colombia", 1);
        Ciclista ciclista2 = new Ciclista("Pedro", "Colombia", 2);
        Ciclista ciclista3 = new Ciclista("Luis", "Colombia", 3);

        equipo1.añadirCiclista(ciclista1);
        equipo1.añadirCiclista(ciclista2);
        equipo1.añadirCiclista(ciclista3);

        ciclista1.setPosGeneral(1);
        ciclista2.setPosGeneral(2);
        ciclista3.setPosGeneral(3);

        Equipo equipo2 = new Equipo("Ineos", "Reino Unido");
        Ciclista ciclista4 = new Ciclista("Carlos", "España", 4);
        Ciclista ciclista5 = new Ciclista("Miguel", "México", 5);
        Ciclista ciclista6 = new Ciclista("Andrés", "Argentina", 6);

        equipo2.añadirCiclista(ciclista4);
        equipo2.añadirCiclista(ciclista5);
        equipo2.añadirCiclista(ciclista6);

        ciclista4.setPosGeneral(4);
        ciclista5.setPosGeneral(5);
        ciclista6.setPosGeneral(6);

// Listar los ciclistas del nuevo equipo
        System.out.println("Equipo: " + equipo2.getNombre());
        equipo2.listarEquipo();


//        ciclista1.setTiempoAcumulado(365);
//        ciclista2.setTiempoAcumulado(370);
//        ciclista3.setTiempoAcumulado(380);

        for (Ciclista c : equipo1.getListaCiclistas()) {
            c.correr();
        }

        for (Ciclista c : equipo2.getListaCiclistas()) {
            c.correr();
        }

        System.out.println("SIN ORDENAR");
        // listado antes de ordenar
        equipo1.listarEquipo();
        equipo2.listarEquipo();

        System.out.println("\nORDENAMOS POR TIEMPO");
        // ordenamos por tiempo
        equipo1.ordenarTiempoEquipo();
        equipo2.ordenarTiempoEquipo();

        equipo1.calcularTotalTiempo();
        equipo2.calcularTotalTiempo();


        // sale el total del equipo
        System.out.println("tiempo total del equipo 1");
        System.out.println(equipo1);

        System.out.println("tiempo total del equipo 2");
        System.out.println(equipo2);



//        System.out.println("Equipo: " + equipo1.getNombre());
//        System.out.println("Pais: " + equipo1.getPais());
//
//        for (Ciclista ciclista : equipo1.listaCiclistas) {
//            System.out.println("Ciclista: " + ciclista.getNombre());
//            System.out.println("ID: " + ciclista.getId());
//            System.out.println("Tiempo Acumulado: " + ciclista.getTiempoAcumulado());
//            System.out.println("Posicion General: " + ciclista.getPosGeneral());
//        }


    }
}
