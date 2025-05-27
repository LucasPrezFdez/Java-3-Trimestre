package examenA;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ejercicio1A extends JFrame implements ActionListener {
    private JTextField campoStones, campoLibras;
    private JLabel resultado;
    private JButton convertir;

    public ejercicio1A() {
        setTitle("Conversión Stones y Libras a Kg");
        setSize(400, 250);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        iniciarComponentes();
    }

    private void iniciarComponentes() {
        Container contenedor = getContentPane();
        contenedor.setLayout(null);

        JLabel labelStones = new JLabel("Stones:");
        labelStones.setBounds(20, 20, 100, 25);
        contenedor.add(labelStones);

        campoStones = new JTextField();
        campoStones.setBounds(120, 20, 100, 25);
        contenedor.add(campoStones);

        JLabel labelLibras = new JLabel("Libras:");
        labelLibras.setBounds(20, 60, 100, 25);
        contenedor.add(labelLibras);

        campoLibras = new JTextField();
        campoLibras.setBounds(120, 60, 100, 25);
        contenedor.add(campoLibras);

        convertir = new JButton("CONVERTIR");
        convertir.setBounds(20, 100, 200, 30);
        convertir.addActionListener(this);
        contenedor.add(convertir);

        resultado = new JLabel("Resultado: ");
        resultado.setBounds(20, 150, 350, 25);
        contenedor.add(resultado);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == convertir) {
            try {
                int stones = Integer.parseInt(campoStones.getText());
                int libras = Integer.parseInt(campoLibras.getText());

                if (libras < 0 || libras > 13) {
                    JOptionPane.showMessageDialog(this, "Las libras deben estar entre 0 y 13.", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }

                double kg = (stones * 6.35) + (libras * 0.453);
                resultado.setText(String.format("Resultado: %.3f Kg", kg));
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Por favor, ingrese números enteros válidos.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    public static void main(String[] args) {
        ejercicio1A ventana = new ejercicio1A();
        ventana.setVisible(true);
    }
}