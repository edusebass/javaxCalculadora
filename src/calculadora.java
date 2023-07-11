import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class calculadora extends JDialog {
    private JButton siete;
    private JButton cuatro;
    private JButton uno;
    private JButton dos;
    private JButton cinco;
    private JButton ocho;
    private JButton tres;
    private JButton seis;
    private JButton nueve;
    private JButton suma;
    private JButton cero;
    private JButton punto;
    private JButton division;
    private JButton multiplicacion;
    private JButton resta;
    private JButton igual;
    private JTextField entradaOperacion;
    private JButton potencia;
    private JButton raiz;
    private JButton sen;
    private JButton cos;
    private JButton tan;
    private JPanel panel;
    private JButton borrar;
    private double primerNumero;
    private String operacion;
    private boolean realizarOperacion;

    public calculadora(JFrame parent) {
        super(parent);
        setTitle("CALCULADORA");
        setContentPane(panel);
        setMinimumSize(new Dimension(450, 450));
        setModal(true);
        setLocationRelativeTo(parent);

        realizarOperacion = false;

        ActionListener numButtonListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JButton btn = (JButton) e.getSource();
                String digit = btn.getText();
                String currentText = entradaOperacion.getText();
                entradaOperacion.setText(currentText + digit);
            }
        };

        uno.addActionListener(numButtonListener);
        dos.addActionListener(numButtonListener);
        tres.addActionListener(numButtonListener);
        cuatro.addActionListener(numButtonListener);
        cinco.addActionListener(numButtonListener);
        seis.addActionListener(numButtonListener);
        siete.addActionListener(numButtonListener);
        ocho.addActionListener(numButtonListener);
        nueve.addActionListener(numButtonListener);
        cero.addActionListener(numButtonListener);
        punto.addActionListener(numButtonListener);

        suma.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                primerNumero = Double.parseDouble(entradaOperacion.getText());
                operacion = "+";
                entradaOperacion.setText("");
            }
        });

        resta.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                primerNumero = Double.parseDouble(entradaOperacion.getText());
                operacion = "-";
                entradaOperacion.setText("");
            }
        });

        multiplicacion.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                primerNumero = Double.parseDouble(entradaOperacion.getText());
                operacion = "*";
                entradaOperacion.setText("");
            }
        });

        division.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                primerNumero = Double.parseDouble(entradaOperacion.getText());
                operacion = "/";
                entradaOperacion.setText("");
            }
        });

        igual.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double segundoNumero = Double.parseDouble(entradaOperacion.getText());
                double resultado = 0.0;

                switch (operacion) {
                    case "+":
                        resultado = primerNumero + segundoNumero;
                        break;
                    case "-":
                        resultado = primerNumero - segundoNumero;
                        break;
                    case "*":
                        resultado = primerNumero * segundoNumero;
                        break;
                    case "/":
                        resultado = primerNumero / segundoNumero;
                        break;
                }

                entradaOperacion.setText(Double.toString(resultado));
            }
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        calculadora myCalcu = new calculadora(null);
    }
}
