package Pagos2;


import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JSeparator;

public class VentanaPrincipal extends JFrame implements ActionListener {

    private Container contenedor;
    ListaEmpleados empleados;
    private JMenuBar barraMenu;
    private JMenu menuOpciones;
    private JMenuItem itemMenu1;
    private JMenuItem itemMenu2;
    private JMenuItem itemMenu3;

    public VentanaPrincipal() {
        empleados = new ListaEmpleados();
        inicio();
        setTitle("Nomina");
        setSize(280, 380);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
    }

    public void inicio() {
        contenedor = getContentPane();
        contenedor.setLayout(null);

        barraMenu = new JMenuBar();
        menuOpciones = new JMenu("Menu");
        itemMenu1 = new JMenuItem("Agregar empleado");
        itemMenu2 = new JMenuItem("Calcular nomina");
        itemMenu3 = new JMenuItem("Guardar archivo");

        menuOpciones.add(itemMenu1);
        menuOpciones.add(itemMenu2);
        menuOpciones.add(new JSeparator());
        menuOpciones.add(itemMenu3);

        barraMenu.add(menuOpciones);
        setJMenuBar(barraMenu);

        itemMenu1.addActionListener(this);
        itemMenu2.addActionListener(this);
        itemMenu3.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent evento) {
        if (evento.getSource() == itemMenu1) {
            VentanaAgregarEmpleado ventanaAgregar = new VentanaAgregarEmpleado(empleados);
            ventanaAgregar.setVisible(true);
        }
        if (evento.getSource() == itemMenu2) {
            VentanaNomina ventanaNomina = new VentanaNomina(empleados);
            ventanaNomina.setVisible(true);
        }
        if (evento.getSource() == itemMenu3) {
            JFileChooser fc = new JFileChooser();
            fc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
            int respuesta = fc.showOpenDialog(this);
            if (respuesta == JFileChooser.APPROVE_OPTION) {
                File directorioElegido = fc.getSelectedFile();
                String nombre = directorioElegido.getAbsolutePath();
                try {
                    String contenido = empleados.convertirTexto();
                    File file = new File(nombre + File.separator + "Nomina.txt");
                    file.createNewFile();
                    FileWriter fw = new FileWriter(file);
                    BufferedWriter bw = new BufferedWriter(fw);
                    bw.write(contenido);
                    bw.close();
                    String texto = "El archivo de la nomina Nomina.txt se ha creado en " + nombre;
                    JOptionPane.showMessageDialog(this, texto, "Mensaje", JOptionPane.INFORMATION_MESSAGE, null);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
