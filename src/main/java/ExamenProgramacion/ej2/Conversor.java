package ExamenProgramacion.ej2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Conversor extends JFrame implements ActionListener {
    private JTextField campoStones, campo;
    private JLabel resultado;
    private JButton convertirLibras, convertirEuros;

    public Conversor() {
        setTitle("Conversión");
        setSize(400, 250);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        iniciarComponentes();
    }

    private void iniciarComponentes() {
        Container contenedor = getContentPane();
        contenedor.setLayout(null);





        JLabel labelLibras = new JLabel("Conversor :");
        labelLibras.setBounds(20, 60, 100, 25);
        contenedor.add(labelLibras);

        campo = new JTextField();
        campo.setBounds(120, 60, 100, 25);
        contenedor.add(campo);

        convertirLibras = new JButton("Libras");
        convertirLibras.setBounds(20, 100, 100, 30);
        convertirLibras.addActionListener(this);
        contenedor.add(convertirLibras);

        convertirEuros = new JButton("Euros");
        convertirEuros.setBounds(160,100,100,30);
        convertirEuros.addActionListener(this);
        contenedor.add(convertirEuros);

        resultado = new JLabel("Resultado: ");
        resultado.setBounds(20, 150, 350, 25);
        contenedor.add(resultado);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == convertirLibras) {

            double libras = Double.parseDouble(campo.getText());

            double r = libras * 0.86;

            resultado.setText("Euros a libras: " +String.valueOf(r));
        }
        if (e.getSource() == convertirEuros){
            double euros = Double.parseDouble(campo.getText());

            double r = euros / 0.86;
            resultado.setText("Libras a euros: " +String.valueOf(r));

        }
    }

    public static void main(String[] args) {
        Conversor ventana = new Conversor();
        ventana.setVisible(true);
    }
}