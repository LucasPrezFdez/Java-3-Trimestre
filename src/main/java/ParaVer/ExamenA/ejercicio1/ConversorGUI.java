package ParaVer.ExamenA.ejercicio1;

import javax.swing.*;
import java.awt.event.*;

public class ConversorGUI extends JFrame {
    
    public ConversorGUI() {
        setTitle("Conversor de Stones y Libras a Kg");
        setSize(300, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);

        JLabel lblStones = new JLabel("Stones:");
        lblStones.setBounds(10, 10, 80, 25);
        add(lblStones);

        JTextField txtStones = new JTextField();
        txtStones.setBounds(100, 10, 100, 25);
        add(txtStones);

        JLabel lblLibras = new JLabel("Libras:");
        lblLibras.setBounds(10, 40, 80, 25);
        add(lblLibras);

        JTextField txtLibras = new JTextField();
        txtLibras.setBounds(100, 40, 100, 25);
        add(txtLibras);

        JButton btnConvertir = new JButton("Convertir");
        btnConvertir.setBounds(10, 80, 120, 25);
        add(btnConvertir);

        JLabel lblResultado = new JLabel("Resultado: ");
        lblResultado.setBounds(10, 120, 250, 25);
        add(lblResultado);

        btnConvertir.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    int stones = Integer.parseInt(txtStones.getText());
                    int libras = Integer.parseInt(txtLibras.getText());
                    if (libras > 13) {
                        JOptionPane.showMessageDialog(null, "Las libras no pueden ser mayores de 13");
                        return;
                    }
                    double kg = stones * 6.35 + libras * 0.453;
                    lblResultado.setText(String.format("Resultado: %.3f Kg", kg));
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Introduce valores numéricos válidos.");
                }
            }
        });
    }

    public static void main(String[] args) {
        new ConversorGUI().setVisible(true);
    }
}
