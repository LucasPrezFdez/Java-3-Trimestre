package TourCiclista;

public class Prueba {


    public static void main(String[] args) {

        Equipo equipo1 = new Equipo("Movistar", "Colombia");
        Ciclista ciclista1 = new Ciclista("Juan", "Colombia", 1, "Ciclista 1");
        Ciclista ciclista2 = new Ciclista("Pedro", "Colombia", 2, "Ciclista 2");
        Ciclista ciclista3 = new Ciclista("Luis", "Colombia", 3, "Ciclista 3");

        ciclista1.setPosGeneral(1);
        ciclista2.setPosGeneral(2);
        ciclista3.setPosGeneral(3);

        ciclista1.setTiempoAcumulado(365);
        ciclista2.setTiempoAcumulado(370);
        ciclista3.setTiempoAcumulado(380);

        equipo1.calcularTotalTiempo();
        equipo1.listarEquipo();

        equipo1.añadirCiclista(ciclista1);
        equipo1.añadirCiclista(ciclista2);
        equipo1.añadirCiclista(ciclista3);



        System.out.println("Equipo: " + equipo1.getNombre());
        System.out.println("Pais: " + equipo1.getPais());

        for (Ciclista ciclista : equipo1.listaCiclistas) {
            System.out.println("Ciclista: " + ciclista.getNombre());
            System.out.println("ID: " + ciclista.getId());
            System.out.println("Tiempo Acumulado: " + ciclista.getTiempoAcumulado());
            System.out.println("Posicion General: " + ciclista.getPosGeneral());
        }



    }
}
