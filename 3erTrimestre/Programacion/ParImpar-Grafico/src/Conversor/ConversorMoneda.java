package Conversor;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ConversorMoneda extends JDialog {
    private JPanel contentPane;
    private JButton buttonOK;
    private JTextField textDollar;
    private JTextField textEuro;
    private JTextArea CONVERSORDOLLAREUROTextArea;

    public ConversorMoneda() {
        setContentPane(contentPane);
        setModal(true);
        getRootPane().setDefaultButton(buttonOK);

        buttonOK.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onOK();
            }
        });
    }

    private void onOK()
    {
        Moneda moneda = new Moneda();
        double a_valor = Double.parseDouble(textDollar.getText());

        a_valor = moneda.Calcular(a_valor);
        textEuro.setText(String.valueOf(a_valor));



        //dispose();
    }

    public static void main(String[] args) {
        ConversorMoneda dialog = new ConversorMoneda();
        dialog.pack();
        dialog.setVisible(true);
        System.exit(0);
    }
}
