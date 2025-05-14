package liga;

public class Futbolista extends SeleccionFutbol{

    private int dorsal;
    private String demarcacion;

    public Futbolista(int id, String nombre, int edad, String apellidos, int dorsal, String demarcacion) {
        super(id, nombre, edad, apellidos);
        this.dorsal = dorsal;
        this.demarcacion = demarcacion;
    }

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public String getDemarcacion() {
        return demarcacion;
    }

    public void setDemarcacion(String demarcacion) {
        this.demarcacion = demarcacion;
    }

    @Override
    public void entrenar() {
        System.out.println("Realiza un entrenamiento (Clase Futbolista)");
    }

    @Override
    public void partidoFutbol() {
        System.out.println("Juega un partido (Clase Futbolista)");
    }

    public void entrevista() {
        System.out.println("Da una entrevista");
    }


}
