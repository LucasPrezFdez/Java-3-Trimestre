package sw2;

import sw1.Persona;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.*;
import javax.swing.event.ListSelectionListener;

/**
 * Esta clase denominada VentanaPrincipal define una interfaz gráfica
 * que permitirá crear un array de notas. Luego, se puede calcular el
 * promedio de notas, la desviación, la nota mayor y la nota menor del
 * array.
 * @version 1.2/2020
 */
public class VentanaPrincipal extends JFrame implements ActionListener {
    // Un contenedor de elementos gráficos
    private Container contenedor;

    // Etiquetas estáticas de cada nota
    private JLabel nota1, nota2, nota3, nota4, nota5, promedio, desviacion, mayor, menor;

    // Campos de ingreso de cada nota
    private JTextField campoNota1, campoNota2, campoNota3, campoNota4, campoNota5;

    // Botones para realizar cálculos y para borrar las notas
    private JButton calcular, limpiar, eliminarNota1, eliminarNota2, eliminarNota3, eliminarNota4, eliminarNota5, añadir;

    private JList lista;

    private DefaultListModel<String> modelo;

    private JScrollPane scrollLista; // Barra de desplazamiento vertical


    /**
     * Constructor de la clase VentanaPrincipal
     */
    public VentanaPrincipal() {
        inicio();
        setTitle("Notas"); // Establece el título de la ventana
        setSize(450, 380); // Establece el tamaño de la ventana
        setLocationRelativeTo(null); // La ventana se posiciona en el centro de la pantalla
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Permite salir de la aplicación al cerrar
        setResizable(false); // Establece que el tamaño de la ventana no se puede cambiar
    }

    /**
     * Método que crea la ventana con sus diferentes componentes gráficos
     */

    private void inicio() {
        contenedor = getContentPane();
        contenedor.setLayout(null);

        nota1 = new JLabel("Nota 1:");
        nota1.setBounds(20, 20, 135, 23);
        contenedor.add(nota1);

        campoNota1 = new JTextField();
        campoNota1.setBounds(105, 20, 67, 23);
        contenedor.add(campoNota1);

        eliminarNota1 = new JButton("Borrar");
        eliminarNota1.setBounds(180, 20, 80, 23);
        eliminarNota1.addActionListener(this);
        contenedor.add(eliminarNota1);

        nota2 = new JLabel("Nota 2:");
        nota2.setBounds(20, 50, 135, 23);
        contenedor.add(nota2);

        campoNota2 = new JTextField();
        campoNota2.setBounds(105, 50, 67, 23);
        contenedor.add(campoNota2);

        eliminarNota2 = new JButton("Borrar");
        eliminarNota2.setBounds(180, 50, 80, 23);
        eliminarNota2.addActionListener(this);
        contenedor.add(eliminarNota2);

        nota3 = new JLabel("Nota 3:");
        nota3.setBounds(20, 80, 135, 23);
        contenedor.add(nota3);

        campoNota3 = new JTextField();
        campoNota3.setBounds(105, 80, 67, 23);
        contenedor.add(campoNota3);

        eliminarNota3 = new JButton("Borrar");
        eliminarNota3.setBounds(180, 80, 80, 23);
        eliminarNota3.addActionListener(this);
        contenedor.add(eliminarNota3);

        nota4 = new JLabel("Nota 4:");
        nota4.setBounds(20, 110, 135, 23);
        contenedor.add(nota4);

        campoNota4 = new JTextField();
        campoNota4.setBounds(105, 110, 67, 23);
        contenedor.add(campoNota4);

        eliminarNota4 = new JButton("Borrar");
        eliminarNota4.setBounds(180, 110, 80, 23);
        eliminarNota4.addActionListener(this);
        contenedor.add(eliminarNota4);

        nota5 = new JLabel("Nota 5:");
        nota5.setBounds(20, 140, 135, 23);
        contenedor.add(nota5);

        campoNota5 = new JTextField();
        campoNota5.setBounds(105, 140, 67, 23);
        contenedor.add(campoNota5);

        eliminarNota5 = new JButton("Borrar");
        eliminarNota5.setBounds(180, 140, 80, 23);
        eliminarNota5.addActionListener(this);
        contenedor.add(eliminarNota5);

        calcular = new JButton("Calcular");
        calcular.setBounds(20, 170, 100, 23);
        calcular.addActionListener(this);
        contenedor.add(calcular);

        limpiar = new JButton("Limpiar");
        limpiar.setBounds(125, 170, 80, 23);
        limpiar.addActionListener(this);
        contenedor.add(limpiar);

        promedio = new JLabel("Promedio = ");
        promedio.setBounds(20, 210, 200, 23);
        contenedor.add(promedio);

        desviacion = new JLabel("Desviación = ");
        desviacion.setBounds(20, 240, 200, 23);
        contenedor.add(desviacion);

        mayor = new JLabel("Nota mayor = ");
        mayor.setBounds(20, 270, 200, 23);
        contenedor.add(mayor);

        menor = new JLabel("Nota menor = ");
        menor.setBounds(20, 300, 200, 23);
        contenedor.add(menor);

        añadir = new JButton("Añadir");
        añadir.setBounds(280, 170, 100, 23);
        añadir.addActionListener(this);
        contenedor.add(añadir);


        lista = new JList<>();
        lista.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        modelo = new DefaultListModel<>();
        scrollLista = new JScrollPane(lista);
        scrollLista.setBounds(160, 210, 250, 120);
        scrollLista.setViewportView(lista);
        contenedor.add(scrollLista);
    }

    @Override
    public void actionPerformed(ActionEvent evento) {
        if (evento.getSource() == calcular) {
            Notas notas = new Notas();
            ArrayList<Double> uso = notas.getListaNotas();

            uso.add(Double.parseDouble(campoNota1.getText()));
            uso.add(Double.parseDouble(campoNota2.getText()));
            uso.add(Double.parseDouble(campoNota3.getText()));
            uso.add(Double.parseDouble(campoNota4.getText()));
            uso.add(Double.parseDouble(campoNota5.getText()));

            notas.setListaNotas(uso);

            promedio.setText("Promedio = " + String.format("%.2f", notas.calcularPromedio()));
            desviacion.setText("Desviación = " + String.format("%.2f", notas.calcularDesviacion()));
            mayor.setText("Nota mayor = " + String.valueOf(notas.calcularMayor()));
            menor.setText("Nota menor = " + String.valueOf(notas.calcularMenor()));

        }

        if (evento.getSource() == añadir) {
            String nota = "Nota 1: " + campoNota1.getText() + " | Nota 2: " + campoNota2.getText() + " | Nota 3: " + campoNota3.getText() + " | Nota 4: " + campoNota4.getText() + " | Nota 5: " + campoNota5.getText();
            modelo.addElement(nota);
            lista.setModel(modelo);

        }

        if (evento.getSource() == limpiar) {
            campoNota1.setText("");
            campoNota2.setText("");
            campoNota3.setText("");
            campoNota4.setText("");
            campoNota5.setText("");
            promedio.setText("Promedio = ");
            desviacion.setText("Desviación = ");
            mayor.setText("Nota mayor = ");
            menor.setText("Nota menor = ");
        }

        if (evento.getSource() == eliminarNota1) {
            campoNota1.setText("");
        }

        if (evento.getSource() == eliminarNota2) {
            campoNota2.setText("");
        }

        if (evento.getSource() == eliminarNota3) {
            campoNota3.setText("");
        }

        if (evento.getSource() == eliminarNota4) {
            campoNota4.setText("");
        }

        if (evento.getSource() == eliminarNota5) {
            campoNota5.setText("");
        }


    }


    public static void main(String[] args) {
        VentanaPrincipal ventana = new VentanaPrincipal();
        ventana.setVisible(true);
    }
}