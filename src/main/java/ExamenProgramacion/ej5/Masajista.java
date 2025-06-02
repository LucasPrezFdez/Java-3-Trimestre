package ExamenProgramacion.ej5;

public class Masajista extends SeleccionFutbol implements Remuneracion{

    private String titulacion;
    private int aniosExperiencia;

    public Masajista(int id, String nombre, String apellidos, int edad, String titulacion, int aniosExperiencia) {
        super(id, nombre, apellidos, edad);
        this.titulacion = titulacion;
        this.aniosExperiencia = aniosExperiencia;
    }

    public String getTitulacion() {
        return titulacion;
    }

    public void setTitulacion(String titulacion) {
        this.titulacion = titulacion;
    }

    public int getAniosExperiencia() {
        return aniosExperiencia;
    }

    public void setAniosExperiencia(int aniosExperiencia) {
        this.aniosExperiencia = aniosExperiencia;
    }

    @Override
    public void entrenar() {
        System.out.println("Da asistencia en el entrenamiento (Clase Masajista)");
    }

    @Override
    public void jugarPartido() {
        System.out.println("Dormita en el partido (Clase Masajista)");
    }

    public void darMasaje() {
        System.out.println("Da un masaje (Clase Masajista)");
    }

    @Override
    public String toString() {
        return "Masajista{" +
                "titulacion='" + titulacion + '\'' +
                ", aniosExperiencia=" + aniosExperiencia +
                "} " + super.toString();
    }

    @Override
    public double primaPorGanar() {
        return super.primaPorGanar() + 1000d;
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
