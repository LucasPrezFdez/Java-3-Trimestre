package ExamenProgramacion.ej4;

public class PruebaEtapa {


    public static void main(String[] args) {

        Etapa etapa = new Etapa(8, "Vigo-Vigo");

        System.out.println(etapa);


        etapa.ordenaParticipantes();
        etapa.ordenarEquipos();

        etapa.listarEquipos();
        etapa.listarParticipantes();


    }


}
