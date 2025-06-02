package Pagos2;



public class MainAgregar {

    public static void main(String[] args) {

        ListaEmpleados listaEmpleados = new ListaEmpleados();
        VentanaAgregarEmpleado vae = new VentanaAgregarEmpleado(listaEmpleados);

        vae.setVisible(true);

    }

}