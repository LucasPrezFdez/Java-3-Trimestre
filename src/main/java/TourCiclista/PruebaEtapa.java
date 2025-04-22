package TourCiclista;

public class PruebaEtapa {


    public static void main(String[] args) {

        Etapa etapa = new Etapa(8, "Vigo-Vigo");

        System.out.println(etapa);

        etapa.disputarEtapa();

        etapa.ordenaParticipantes();
        etapa.ordenarEquipos();

        etapa.listarEquipos();
        etapa.listarParticipantes();


    }


}
