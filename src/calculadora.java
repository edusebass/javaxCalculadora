import javax.swing.*;
import java.awt.*;

public class calculadora extends JDialog{
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
    private JTextField entrada;
    private JButton potencia;
    private JButton raiz;
    private JButton sen;
    private JButton cos;
    private JButton tan;
    private JPanel panel;

    public calculadora(JFrame parent){
        super(parent);
        setTitle("CALCULADORA");
        setContentPane(panel);
        setMinimumSize(new Dimension(450, 450));
        setModal(true);
        setLocationRelativeTo(parent);
        setVisible(true);
    }

    public static void main(String[] args) {
        calculadora mycalcu = new calculadora(null);
    }
}
