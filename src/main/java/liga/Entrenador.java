package liga;

public class Entrenador extends SeleccionFutbol {

    private int idFederacion;

    public Entrenador(int id, String nombre, int edad, String apellidos, int idFederacion) {
        super(id, nombre, edad, apellidos);
        this.idFederacion = idFederacion;
    }

    public int getIdFederacion() {
        return idFederacion;
    }

    public void setIdFederacion(int idFederacion) {
        this.idFederacion = idFederacion;
    }

    @Override
    public void entrenar() {
        System.out.println("Dirige un entrenamiento (Clase Entrenador)");
    }

    @Override
    public void partidoFutbol() {
        System.out.println("Planifica un partido (Clase Entrenador)");
    }

    public void planificarEntrenamiento() {
        System.out.println("Planifica un entrenamiento");
    }

    public void prepararTacticas() {
        System.out.println("Prepara las tácticas del partido");
    }

    @Override
    public String toString() {
        return "Entrenador{" +
                "idFederacion=" + idFederacion +
                "} " + super.toString();
    }
}
