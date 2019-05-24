package TratamientoTexto;

import jdk.net.SocketFlow;
import sun.plugin2.message.ShowStatusMessage;

import javax.swing.*;
import java.awt.*;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Tratamiento extends JDialog {
    private JPanel contentPane;
    private JButton buttonOK;
    private JTextField inputText;
    private JRadioButton leftRB;
    private JRadioButton centerRB;
    private JRadioButton rightRB;
    private JCheckBox italicsCB;
    private  JCheckBox negritaCheckBox;
    private JTextField textFieldRed;
    private JTextField textFieldGreen;
    private JTextField textFieldBlue;
    private JLabel Green;
    public Font font;


    public Tratamiento() {
        setContentPane(contentPane);
        setModal(true);
        getRootPane().setDefaultButton(buttonOK);
///EVENTO ALINEAR IZQUIERDA
        textFieldRed.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent redLisent)
            {

                OnColor();

            }
        });
        textFieldGreen.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent greenLisent)
            {
                OnColor();
            }
        });
        textFieldBlue.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent blueLisent)
            {
                OnColor();
            }
        });

        leftRB.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent leftAlign)
            {

                rightRB.setSelected(false);
                centerRB.setSelected(false);
                OnLeftAlign();
            }
        });
        negritaCheckBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent boldCheck)
            {
                setBold();
            }
        });

        italicsCB.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent italicCB) {
                setItalic();
            }
        });
        centerRB.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent centerAlign)
            {
                rightRB.setSelected(false);
                leftRB.setSelected(false);
                OnCenterAlign();
            }
        });
        rightRB.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent RightAlign)
            {
                centerRB.setSelected(false);
                leftRB.setSelected(false);
                OnRightAlign();
            }
        });
        buttonOK.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                onOK();
            }
        });
    }
    private void OnLeftAlign()
    {
        inputText.setHorizontalAlignment(SwingConstants.LEFT);
        System.out.println("Left");
    }
    private void OnCenterAlign()
    {
        System.out.println("Center");
        inputText.setHorizontalAlignment(0);
    }
    private void OnRightAlign()
    {
        System.out.println("Right");
        inputText.setHorizontalAlignment(SwingConstants.RIGHT);
    }
    private void OnColor()
    {
        inputText.setForeground(Color.getHSBColor(Float.parseFloat(textFieldRed.getText()),Float.parseFloat(textFieldGreen.getText()),Float.parseFloat(textFieldBlue.getText())));
        System.out.println(textFieldRed.getText()+" "+textFieldGreen.getText()+" "+textFieldBlue.getText());
        update(getGraphics());


    }

    private void onOK() {
        Autor();
        //dispose();
    }
    private void setBold()
    {
        boolean b = negritaCheckBox.isSelected();


        if(b == true)
        {
            font = new Font("Courrier",font.BOLD,12);
            inputText.setFont(font);
            //font.isBold();
            //inputText.setFont(font);

        }
        else
            {
                inputText.setFont(new Font("Courrier",0,12));
                font.isBold();
                ///System.out.println("sin negrita");
            }
    }
    private void setItalic()
    {
        boolean i = italicsCB.isSelected();


        if(i == true)
        {
            font = new Font("Courrier",font.ITALIC,12);
            inputText.setFont(font);
            //font.isBold();
            //inputText.setFont(font);

        }
        else
            {
                inputText.setFont(new Font("Courrier",0,12));
                font.isBold();
                ///System.out.println("sin negrita");
            }
    }
    private void Autor()
    {

        JOptionPane.showMessageDialog(null,"Daniel Camarero");
    }



    public static void main(String[] args) {
        Tratamiento dialog = new Tratamiento();
        dialog.pack();
        dialog.setVisible(true);
        System.exit(0);
    }
}
