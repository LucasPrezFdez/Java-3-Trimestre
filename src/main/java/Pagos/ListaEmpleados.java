package Pagos;

import java.util.ArrayList;

public class ListaEmpleados {

    public ArrayList<Empleado> lista; // Atributo que identifica un vector de empleadosInterfaz gráfica de usuario 527
    public double totalNómina = 0; /* Atributo que identifica el total de
		la nómina de la empresa */

    /**
     * Constructor de la clase ListaEmpleados
     */
    public ListaEmpleados() {
        lista = new ArrayList<>(); // Crea el vector de empleados
    }

    /**
     * Método que agrega un empleado a la lista de empleados
     * @param a Parámetro que define un empleado a agregar a la lista
     * de empleados
     */
    public void agregarEmpleado(Empleado a) {
        lista.add(a);
    }

    /**
     * Método que calcula la nómina total mensual de la empresa
     * @return La nómina total mensual de la empresa
     */
    public double calcularTotalNómina() {
        for (int i = 0; i < lista.size(); i++) { /* Recorre el vector de
		empleados */
            // Obtiene un elemento de la lista de empleados
            Empleado e = (Empleado) lista.get(i);
            // Calcula el salario de un empleado y lo totaliza
            totalNómina = totalNómina + e.calcularNómina();
        }
        return totalNómina;
    }

    /**
     * Método que convierte los datos de la lista de empleados en una
     * matriz
     */
    public String[][] obtenerMatriz() {
        String datos[][] = new String[lista.size()][3]; // Se crea la matriz
        for (int i = 0; i < lista.size(); i++) { // Recorre el vector de empleados
            // Obtiene un elemento de la lista de empleados
            Empleado e = (Empleado) lista.get(i);
		/* Coloca el nombre del empleado en la primera columna de
		la matriz */
            datos[i][0] = e.getNombre();
		/* Coloca los apellidos del empleado en la segunda columna
		de la matriz */
            datos[i][1] = e.getApellidos();
		/* Coloca el salario del empleado en la tercera columna de la
		matriz */
            datos[i][2] = Double.toString(e.calcularNómina());
            // Va acumulando el total de nómina mensual de la empresa
            totalNómina = totalNómina + e.calcularNómina();
        }
        return datos;
    }

    /**
     * Método que convierte los datos de la lista de empleados a texto
     */
    public String convertirTexto() {
        String texto = "";
        for (int i = 0; i < lista.size(); i++) { // Recorre el vector de empleados
            // Obtiene un elemento de la lista de empleados
            Empleado e = (Empleado) lista.get(i);
            // Concatena en una variable String los datos de un empleado
            texto = texto + "Nombre = " + e.getNombre() + "\n" +
                    "Apellidos = " + e.getApellidos() + "\n" + "Cargo = " +
                    e.getCargo() + "\n" + "Género = " + e.getGénero() + "\n" +
                    "Salario = $" + e.getSalarioDía() + "\n" + "Días trabajados = " +
                    e.getDíasTrabajados() + "\n" + "Otros ingresos = $" +
                    e.getOtrosIngresos() + "\n" + "Pagos salud = $" +
                    e.getPagosSalud() + "\n" + "Aportes pensiones = $" +
                    e.getAportePensiones() + "\n---------\n";
        }
// Concatena en una variable String el total de la nómina
        texto = texto + "Total nómina = $" + String.format("%.2f", calcularTotalNómina());
        return texto;
    }
}