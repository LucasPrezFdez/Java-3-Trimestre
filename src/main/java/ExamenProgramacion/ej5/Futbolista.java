package ExamenProgramacion.ej5;

public class Futbolista extends SeleccionFutbol implements Remuneracion{

    private int dorsal;
    private String demarcacion;

    public Futbolista(int id, String nombre, String apellidos, int edad, int dorsal, String demarcacion) {
        super(id, nombre, apellidos, edad);
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
    public void jugarPartido() {
        System.out.println("Juega un partido (Clase Futbolista)");
    }

    public void entrevista() {
        System.out.println("Da una entrevista");
    }

    @Override
    public String toString() {
        return "Futbolista{" +
                "dorsal=" + dorsal +
                ", demarcacion='" + demarcacion + '\'' +
                "} " + super.toString();
    }

    @Override
    public double primaPorGanar() {
        double aux = super.primaPorGanar();
        return aux* 4 + 4200d;
    }
    @Override
    public String aumentar(double cuanto) {
        if (cuanto < PRIMA_MAXIMA) {
            return "Por ganar aumenta su salario en " + cuanto;
        }
        return "No puedes añadir mas de " +PRIMA_MAXIMA;
    }

    @Override
    public String disminuir(double cuanto) {
        if (cuanto < PRIMA_MAXIMA){
            return "Por perder le disminuimos su salario en "+cuanto;
        }
        return "No puedes añadir mas de "+PRIMA_MAXIMA;
    }
}
