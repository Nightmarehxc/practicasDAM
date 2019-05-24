package CalculadoraCutre;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculadoraGrafica extends JDialog {
    private JPanel contentPane;
    private JButton buttonSum;
    private JTextField num1;
    private JTextField num2;
    private JTextField resultado;
    private JButton buttonResta;
    private JButton buttonMult;
    private JButton buttonDiv;
    private Calculadora calc = new Calculadora();

    public CalculadoraGrafica() {
        setContentPane(contentPane);
        setModal(true);
        getRootPane().setDefaultButton(buttonSum);

        buttonSum.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                onSum();
            }
        });
        buttonResta.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onResta();
            }
        });
        buttonMult.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                onMultiplicar();
            }
        });
        buttonDiv.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                onDividir();
            }
        });
    }
    public void onSum()
    {
        int a,b;
        a= Integer.parseInt(num1.getText());
        b= Integer.parseInt(num2.getText());


        resultado.setText(String.valueOf(calc.Sumar(a,b)));
    }
    private void onResta()
    {
        int a,b;
        a= Integer.parseInt(num1.getText());
        b= Integer.parseInt(num2.getText());


        resultado.setText(String.valueOf(calc.Restar(a,b)));
    }
    private void onMultiplicar()
    {
        int a,b;

        a= Integer.parseInt(num1.getText());
        b= Integer.parseInt(num2.getText());

        resultado.setText(String.valueOf(calc.Multiplicar(a,b)));

    }
    private void onDividir()
    {
        int a,b;
        a= Integer.parseInt(num1.getText());
        b= Integer.parseInt(num2.getText());


        resultado.setText(String.valueOf(calc.Dividir(a,b)));
    }

    public static void main(String[] args) {
        CalculadoraGrafica dialog = new CalculadoraGrafica();
        dialog.pack();
        dialog.setVisible(true);
        System.exit(0);
    }
}
