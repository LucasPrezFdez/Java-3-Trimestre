package liga;

public class Masajista extends SeleccionFutbol{

    private String titulacion;
    private int aniosExperiencia;

    public Masajista(int id, String nombre, int edad, String apellidos, String titulacion, int aniosExperiencia) {
        super(id, nombre, edad, apellidos);
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
    public void partidoFutbol() {
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
}
