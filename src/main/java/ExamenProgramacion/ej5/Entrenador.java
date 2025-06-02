package ExamenProgramacion.ej5;

public class Entrenador extends SeleccionFutbol implements Remuneracion {

//  NO NECESITO VOLVER A IMPLEMENTAR

//  2 METODOS IMPLEMENTADOS SE HEREDAN -> CONCENTRAR Y VIAJAR YA SE IMPLEMENTARON EN LA CLASE PADRE

    //  TENGO QUE ESCRIBIR LOS DOS QUE NO SE IMPLEMENTARON
    private int idFederacion;

    public Entrenador(int id, String nombre, String apellidos, int edad, int idFederacion) {
        super(id, nombre, apellidos, edad);
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
    public void jugarPartido() {
        System.out.println("Dirige un partido (Clase Entrenador)");
    }

    public void planificarEntrenamiento() {
        System.out.println("Planificar un Entrenamiento");
    }

    @Override
    public double primaPorGanar() {
        double calculoEnPadre = super.primaPorGanar();
        return calculoEnPadre * 2.45 + 3000d;
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

    @Override
    public String toString() {
        return "Entrenador{" +
                "idFederacion=" + idFederacion +
                "} " + super.toString();
    }
}
