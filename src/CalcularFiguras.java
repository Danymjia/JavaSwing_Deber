import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalcularFiguras {
    public JPanel mainPanel;
    private JTextField ingreso2;
    private JTextField ingreso1;
    private JButton cuadradoBtn;
    private JButton pentagonoBtn;
    private JButton trianguloBtn;
    private JButton circuloBtn;
    private JButton rectanguloBtn;
    private JLabel textoCalcular;
    private JLabel textoResultado;
    private JLabel resultado;
    private JLabel dato1;
    private JLabel dato2;

    public CalcularFiguras() {
        cuadradoBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double lado = Double.parseDouble(ingreso1.getText());
                    double area = lado * lado;
                    double perimetro = 4 * lado;
                    resultado.setText("Área del Cuadrado: " + area + ", Perímetro del Cuadrado: " + perimetro);
                } catch (NumberFormatException ex) {
                    resultado.setText("Entrada inválida");
                }
            }
        });
        rectanguloBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double largo = Double.parseDouble(ingreso1.getText());
                    double ancho = Double.parseDouble(ingreso2.getText());
                    double area = largo * ancho;
                    double perimetro = 2 * (largo + ancho);
                    resultado.setText("Área del Rectangulo: " + area + ", Perímetro del Rectangulo: " + perimetro);
                } catch (NumberFormatException ex) {
                    resultado.setText("Entrada inválida");
                }
            }
        });
        circuloBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double radio = Double.parseDouble(ingreso1.getText());
                    double area = Math.PI * radio * radio;
                    double perimetro = 2 * Math.PI * radio;
                    resultado.setText(String.format("Área del Círculo: %.2f, Perímetro del Círculo: %.2f", area, perimetro));
                } catch (NumberFormatException ex) {
                    resultado.setText("Entrada inválida");
                }
            }
        });
        trianguloBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double base = Double.parseDouble(ingreso1.getText());
                    double altura = Double.parseDouble(ingreso2.getText());
                    double area = (base * altura) / 2;
                    double perimetro = base * 3; // Suponiendo un triángulo equilátero
                    resultado.setText("Área del Triangulo: " + area + ", Perímetro del Triangulo: " + perimetro);
                } catch (NumberFormatException ex) {
                    resultado.setText("Entrada inválida");
                }
            }
        });
        pentagonoBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double lado = Double.parseDouble(ingreso1.getText());
                    double apotema = Double.parseDouble(ingreso2.getText());
                    double perimetro = 5 * lado;
                    double area = (perimetro * apotema) / 2;
                    resultado.setText("Área del Pentagono: " + area + ", Perímetro del Pentagono: " + perimetro);
                } catch (NumberFormatException ex) {
                    resultado.setText("Entrada inválida");
                }
            }
        });
    }
}
