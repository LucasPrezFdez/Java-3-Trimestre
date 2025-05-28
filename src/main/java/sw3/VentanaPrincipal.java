package sw3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaPrincipal extends JFrame implements ActionListener {

    private JButton btnCilindro, btnEsfera, btnPiramide, btnParalelepipedo, btnCerrar;

    public VentanaPrincipal() {
        setTitle("Figuras Geométricas");
        setSize(300, 200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        iniciarComponentes();
    }

    private void iniciarComponentes() {
        Container contenedor = getContentPane();
        contenedor.setLayout(new GridLayout(4, 1, 10, 10)); // Ajustar el layout para incluir el botón de cerrar

        btnCilindro = new JButton("Cilindro");
        btnEsfera = new JButton("Esfera");
        btnPiramide = new JButton("Pirámide");
        btnParalelepipedo = new JButton("Paralelepipedo");
        btnCerrar = new JButton("Cerrar"); // Botón para cerrar la ventana

        btnCilindro.addActionListener(this);
        btnEsfera.addActionListener(this);
        btnPiramide.addActionListener(this);
        btnParalelepipedo.addActionListener(this);
        btnCerrar.addActionListener(e -> dispose()); // Cierra la ventana al hacer clic

        contenedor.add(btnCilindro);
        contenedor.add(btnEsfera);
        contenedor.add(btnPiramide);
        contenedor.add(btnParalelepipedo);
        contenedor.add(btnCerrar); // Agregar el botón de cerrar al contenedor
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnCilindro) {
            new VentanaCilindro().setVisible(true);
        } else if (e.getSource() == btnEsfera) {
            new VentanaEsfera().setVisible(true);
        } else if (e.getSource() == btnPiramide) {
            new VentanaPiramide().setVisible(true);
        } else if (e.getSource() == btnParalelepipedo) {
            new VentanaParalelepipedo().setVisible(true);
        }
    }
}