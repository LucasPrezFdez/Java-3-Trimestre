package Angel.Practicas;

public class Hechicero {

    String nombreHechizero;
    int nivelHechizero;
    float destrezaHechizero;
    float manaHechizero;

}

abstract class Hechizo extends Hechicero {
    String nombre = "default";
    String descripcion;
    private boolean preparado = true;


    boolean puedeLanzarHechizo() {
        if (preparado && manaHechizero > 0)
            return true;

        return false;
    }

    abstract float calcularDanho();
}

class Encantamiento extends Hechizo {
    @Override
    float calcularDanho() {
        return nivelHechizero + destrezaHechizero;
    }
}

class Transformacion extends Hechizo {
    @Override
    float calcularDanho() {
        return nivelHechizero * 2 + destrezaHechizero;
    }
}

class Embrujo extends Hechizo {
    @Override
    float calcularDanho() {
        return nivelHechizero / 2 + destrezaHechizero;
    }
}

class Malefico extends Hechizo {
    @Override
    float calcularDanho() {
        return nivelHechizero * 2;
    }
}

/*case Transformacion:
                return nivelHechizero * 2 + destrezaHechizero;
            case Encantamiente:
                return nivelHechizero * 1 + destrezaHechizero;
            case Embrujo:
                return nivelHechizero / 2 + destrezaHechizero;
            case Malefico:
                return nivelHechizero * 2;
            default:
                return 0;

 */
class Principal {
    public static void main(String[] args) {
        Embrujo c = new Embrujo();
        c.nivelHechizero = 2;
        c.destrezaHechizero = 3;
        c.manaHechizero = 10;
        System.out.println(c.calcularDanho());
    }
}