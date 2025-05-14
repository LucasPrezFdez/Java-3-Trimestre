package sw3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaParalelepipedo extends JFrame implements ActionListener {

    private Container contenedor;
    private JLabel largo, altura, ancho, volumen, superficie;
    private JTextField campoLargo, campoAltura, campoAncho;
    private JButton calcular;

    public VentanaParalelepipedo() {
        inicio();
        setTitle("Pirámide");
        setSize(280, 240);
        setLocationRelativeTo(null);
        setResizable(false);
    }

    private void inicio() {
        contenedor = getContentPane();
        contenedor.setLayout(null);

        largo = new JLabel("Largo (cms):");
        largo.setBounds(20, 20, 135, 23);
        campoLargo = new JTextField();
        campoLargo.setBounds(120, 20, 135, 23);

        altura = new JLabel("Altura (cms):");
        altura.setBounds(20, 50, 135, 23);
        campoAltura = new JTextField();
        campoAltura.setBounds(120, 50, 135, 23);

        ancho = new JLabel("Ancho (cms):");
        ancho.setBounds(20, 80, 135, 23);
        campoAncho = new JTextField();
        campoAncho.setBounds(120, 80, 135, 23);

        calcular = new JButton("Calcular");
        calcular.setBounds(120, 110, 135, 23);
        calcular.addActionListener(this);

        volumen = new JLabel("Volumen (cm3):");
        volumen.setBounds(20, 140, 135, 23);

        superficie = new JLabel("Superficie (cm2):");
        superficie.setBounds(20, 170, 135, 23);

        contenedor.add(largo);
        contenedor.add(campoLargo);
        contenedor.add(altura);
        contenedor.add(campoAltura);
        contenedor.add(ancho);
        contenedor.add(campoAncho);
        contenedor.add(calcular);
        contenedor.add(volumen);
        contenedor.add(superficie);
    }

    public void actionPerformed(ActionEvent event) {
        Paralelepipedo para;
        boolean error = false;
        double largo = 0;
        double altura = 0;
        double ancho = 0;
        try {
            largo = Double.parseDouble(campoLargo.getText());
            altura = Double.parseDouble(campoAltura.getText());
            ancho = Double.parseDouble(campoAncho.getText());
            para = new Paralelepipedo(largo, altura, ancho);
            volumen.setText("Volumen (cm3): " + String.format("%.2f", para.calcularVolumen()));
            superficie.setText("Superficie (cm2): " + String.format("%.2f", para.calcularSuperficie()));
        } catch (Exception e) {
            error = true;
        } finally {
            if (error) {
                JOptionPane.showMessageDialog(null, "Campo nulo o error en formato de número", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
}