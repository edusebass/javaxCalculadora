import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class calculadora extends JDialog {
    private JPanel panel;
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
    private JButton potencia;
    private JButton raiz;
    private JButton sen;
    private JButton cos;
    private JButton tan;
    private JButton borrar;
    private JLabel operaciones;
    private JLabel resultado;


    //variables para operaciones
    double num1 = 0;
    double num2 = 0;
    String operacion;

    //
    public calculadora() {
        //acciones botones
        uno.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(resultado.getText().equals("0") || resultado.getText() == null || resultado.getText().equals("No se puede dividir entre cero")){
                    resultado.setText("");
                }
                resultado.setText(resultado.getText() + "1");
            }
        });

        dos.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(resultado.getText().equals("0") || resultado.getText() == null || resultado.getText().equals("No se puede dividir entre cero")){
                    resultado.setText("");
                }
                resultado.setText(resultado.getText() + "2");
            }
        });

        tres.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(resultado.getText().equals("0") || resultado.getText() == null || resultado.getText().equals("No se puede dividir entre cero")){
                    resultado.setText("");
                }
                resultado.setText(resultado.getText() + "3");
            }
        });

        cuatro.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(resultado.getText().equals("0") || resultado.getText() == null || resultado.getText().equals("No se puede dividir entre cero")){
                    resultado.setText("");
                }
                resultado.setText(resultado.getText() + "4");
            }
        });

        cinco.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(resultado.getText().equals("0") || resultado.getText() == null || resultado.getText().equals("No se puede dividir entre cero")){
                    resultado.setText("");
                }
                resultado.setText(resultado.getText() + "5");
            }
        });

        seis.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(resultado.getText().equals("0") || resultado.getText() == null || resultado.getText().equals("No se puede dividir entre cero")){
                    resultado.setText("");
                }
                resultado.setText(resultado.getText() + "6");
            }
        });

        siete.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(resultado.getText().equals("0") || resultado.getText() == null || resultado.getText().equals("No se puede dividir entre cero")){
                    resultado.setText("");
                }
                resultado.setText(resultado.getText() + "7");
            }
        });

        ocho.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(resultado.getText().equals("0") || resultado.getText() == null || resultado.getText().equals("No se puede dividir entre cero")){
                    resultado.setText("");
                }
                resultado.setText(resultado.getText() + "8");
            }
        });

        nueve.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(resultado.getText().equals("0") || resultado.getText() == null || resultado.getText().equals("No se puede dividir entre cero")){
                    resultado.setText("");
                }
                resultado.setText(resultado.getText() + "9");
            }
        });

        cero.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(resultado.getText().equals("0") || resultado.getText() == null || resultado.getText().equals("No se puede dividir entre cero")){
                    resultado.setText("");
                }
                resultado.setText(resultado.getText() + "0");
            }
        });

        // OPERACIONES BASICAS
        suma.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                operacion = "suma";
                num1 = Double.parseDouble(resultado.getText());
                operaciones.setText(resultado.getText() + " + ");
                resultado.setText("");
            }
        });

        resta.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                operacion = "resta";
                num1 = Double.parseDouble(resultado.getText());
                operaciones.setText(resultado.getText() + " - ");
                resultado.setText("");
            }
        });

        multiplicacion.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                operacion = "multiplicacion";
                num1 = Double.parseDouble(resultado.getText());
                operaciones.setText(resultado.getText() + " x ");
                resultado.setText("");
            }
        });

        division.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                operacion = "division";
                num1 = Double.parseDouble(resultado.getText());
                operaciones.setText(resultado.getText() + " / ");
                resultado.setText("");
            }
        });

        potencia.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                operacion = "potencia";
                num1 = Double.parseDouble(resultado.getText());
                operaciones.setText(resultado.getText() + " ^ ");
                resultado.setText("");
            }
        });

        //OPERACIONES DE UN SOLO VALOR
        raiz.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double num1 = Double.parseDouble(resultado.getText());
                double resultadoRaiz = Math.sqrt(num1);
                operaciones.setText("√" + num1 + " = ");
                resultado.setText(String.valueOf(resultadoRaiz));
            }
        });


        sen.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double num1 = Double.parseDouble(resultado.getText());
                double resultadoSeno = Math.sin(Math.toRadians(num1));
                operaciones.setText("sin(" + num1 + ") = ");
                resultado.setText(String.valueOf(resultadoSeno));
            }
        });


        cos.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num1 = Double.parseDouble(resultado.getText());
                double resultadoCoseno = Math.cos(Math.toRadians(num1));
                operaciones.setText("cos(" + num1 + ") = ");
                resultado.setText(String.valueOf(resultadoCoseno));
            }
        });


        tan.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num1 = Double.parseDouble(resultado.getText());
                double resultadoTangente = Math.tan(Math.toRadians(num1));
                operaciones.setText("tan(" + num1 + ") = ");
                resultado.setText(String.valueOf(resultadoTangente));
            }
        });


        //OPCION IGUAL LOGICA
        igual.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num2 = Double.parseDouble(resultado.getText());
                double resultadoOperacion;
                String operacionTexto;

                switch (operacion) {
                    case "suma":
                        resultadoOperacion = num1 + num2;
                        operacionTexto = "+";
                        break;
                    case "resta":
                        resultadoOperacion = num1 - num2;
                        operacionTexto = "-";
                        break;
                    case "multiplicacion":
                        resultadoOperacion = num1 * num2;
                        operacionTexto = "x";
                        break;
                    case "division":
                        if (num2 == 0.0) {
                            resultado.setText("No se puede dividir entre cero");
                            JOptionPane.showMessageDialog(null, "Ingrese otro número");
                            throw new ArithmeticException("No se puede dividir entre cero");
                        }
                        resultadoOperacion = num1 / num2;
                        operacionTexto = "/";
                        break;
                    case "potencia":
                        resultadoOperacion = Math.pow(num1, num2);
                        operacionTexto = "^";
                        break;
                    default:
                        return;
                }

                operaciones.setText(num1 + " " + operacionTexto + " " + num2);
                resultado.setText(String.valueOf(resultadoOperacion));
                num1 = resultadoOperacion;
            }
        });

        // OPCION BORRAR
        borrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                resultado.setText("0");
                operaciones.setText("0");
                num1 = num2 = 0;
            }
        });
    }

    // MAIN
    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculadora");
        frame.setContentPane(new calculadora().panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setResizable(false);
        frame.setSize (435,630);
        frame.setLocationRelativeTo(null);
    }
}
