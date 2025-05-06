package sw1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Container;

/**
 * Esta clase denominada VentanaPrincipal define una interfaz gráfica
 * que permitirá crear una persona y agregarla a un vector de personas.
 * Luego, se puede eliminar una persona seleccionada o borrar todas las
 * personas.
 * @version 1.2/2020
 */
public class VentanaPrincipal extends JFrame implements ActionListener {
    private ListaPersonas lista; // El objeto ListaPersonas de la aplicación
    private Container contenedor; // Un contenedor de elementos gráficos
    // Etiquetas estáticas para los nombres de los atributos
    private JLabel nombre, apellidos, telefono, direccion;
    // Campos de ingreso de texto
    private JTextField campoNombre, campoApellidos, campoTelefono, campoDireccion;
    private JButton anadir, eliminar, borrarLista, guardar, cargar; // Botones
    private JList<String> listaNombres; // Lista de personas
    private DefaultListModel<String> modelo; // Objeto que modela la lista
    private JScrollPane scrollLista; // Barra de desplazamiento vertical

    /**
     * Constructor de la clase VentanaPrincipal
     */
    public VentanaPrincipal() {
        lista = new ListaPersonas(); // Crea la lista de personas
        inicio();
        setTitle("Personas"); // Establece el título de la ventana
        setSize(270, 400); // Establece el tamaño de la ventana
        setLocationRelativeTo(null); // La ventana se posiciona en el centro de la pantalla
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Cerrar la aplicación al cerrar la ventana
        setResizable(false); // Establece que el tamaño de la ventana no se puede cambiar
    }

    /**
     * Método que crea la ventana con sus diferentes componentes gráficos
     */
    private void inicio() {
        contenedor = getContentPane(); // Obtiene el panel de contenidos de la ventana
        contenedor.setLayout(null); // Establece que el panel no tiene asociado ningún layout

        // Establece la etiqueta y el campo nombre
        nombre = new JLabel("Nombre:");
        nombre.setBounds(20, 20, 135, 23);
        campoNombre = new JTextField();
        campoNombre.setBounds(105, 20, 135, 23);

        // Establece la etiqueta y el campo apellidos
        apellidos = new JLabel("Apellidos:");
        apellidos.setBounds(20, 50, 135, 23);
        campoApellidos = new JTextField();
        campoApellidos.setBounds(105, 50, 135, 23);

        // Establece la etiqueta y el campo teléfono
        telefono = new JLabel("Teléfono:");
        telefono.setBounds(20, 80, 135, 23);
        campoTelefono = new JTextField();
        campoTelefono.setBounds(105, 80, 135, 23);

        // Establece la etiqueta y el campo dirección
        direccion = new JLabel("Dirección:");
        direccion.setBounds(20, 110, 135, 23);
        campoDireccion = new JTextField();
        campoDireccion.setBounds(105, 110, 135, 23);

        // Establece el botón Añadir persona
        anadir = new JButton("Añadir");
        anadir.setBounds(105, 150, 80, 23);
        anadir.addActionListener(this);

        // Establece el botón Eliminar persona
        eliminar = new JButton("Eliminar");
        eliminar.setBounds(20, 280, 100, 23);
        eliminar.addActionListener(this);

        // Establece el botón Borrar lista
        borrarLista = new JButton("Borrar Lista");
        borrarLista.setBounds(130, 280, 100, 23);
        borrarLista.addActionListener(this);

        // Boton guardar
        guardar = new JButton("Guardar L");
        guardar.setBounds(20, 320, 100, 23);
        guardar.addActionListener(this);

        // Boton cargar
        cargar = new JButton("CARGAR L");
        cargar.setBounds(130, 320, 120, 23);
        cargar.addActionListener(this);

        // Establece la lista gráfica de personas
        listaNombres = new JList<>();
        listaNombres.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        modelo = new DefaultListModel<>();
        scrollLista = new JScrollPane();
        scrollLista.setBounds(20, 190, 220, 80);
        scrollLista.setViewportView(listaNombres);

        // Se añade cada componente gráfico al contenedor de la ventana
        contenedor.add(nombre);
        contenedor.add(campoNombre);
        contenedor.add(apellidos);
        contenedor.add(campoApellidos);
        contenedor.add(telefono);
        contenedor.add(campoTelefono);
        contenedor.add(direccion);
        contenedor.add(campoDireccion);
        contenedor.add(anadir);
        contenedor.add(eliminar);
        contenedor.add(borrarLista);
        contenedor.add(scrollLista);
        contenedor.add(guardar);
        contenedor.add(cargar);
    }

    @Override
    public void actionPerformed(ActionEvent evento) {
        if (evento.getSource() == anadir) {
            anadirPersona();
        }
        if (evento.getSource() == eliminar) {
            eliminarNombre(listaNombres.getSelectedIndex());
        }
        if (evento.getSource() == borrarLista) {
            borrarLista();
        }
        if (evento.getSource() == guardar) {
            ListaPersonas.guardarArrayList(lista);
        }
        if (evento.getSource() == cargar) {
            lista = ListaPersonas.cargarArrayList();
            actualizarListaCargada();
        }
    }
    private void actualizarListaCargada() {
        modelo.clear();
        for (Persona p : lista.listaPersonas) {
            String elemento = p.getNombre() + "-" + p.getApellidos() + "-" + p.getTelefono() + "-" + p.getDireccion();
            modelo.addElement(elemento);
        }
        listaNombres.setModel(modelo);
    }

    private void anadirPersona() {
        Persona p = new Persona(campoNombre.getText(), campoApellidos.getText(), campoTelefono.getText(), campoDireccion.getText());
        lista.anadirPersona(p);
        String elemento = campoNombre.getText() + "-" + campoApellidos.getText() + "-" + campoTelefono.getText() + "-" + campoDireccion.getText();
        modelo.addElement(elemento);
        listaNombres.setModel(modelo);
        campoNombre.setText("");
        campoApellidos.setText("");
        campoTelefono.setText("");
        campoDireccion.setText("");
    }

    private void eliminarNombre(int indice) {
        if (indice >= 0) {
            modelo.removeElementAt(indice);
            lista.eliminarPersona(indice);
        } else {
            JOptionPane.showMessageDialog(null, "Debe seleccionar un elemento", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void borrarLista() {
        lista.borrarLista();
        modelo.clear();
    }
}