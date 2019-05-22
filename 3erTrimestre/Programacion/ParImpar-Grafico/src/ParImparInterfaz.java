import javax.swing.*;
import java.awt.event.*;

public class ParImparInterfaz extends JDialog {
    private JPanel contentPane;
    private JButton buttonOK;
    private JTextArea textArea1;
    private JButton buttonCancel;

    public ParImparInterfaz() {
        setContentPane(contentPane);
        setModal(true);
        getRootPane().setDefaultButton(buttonOK);

        buttonOK.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onOK();
            }
        });



        // call onCancel() when cross is clicked
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                onCancel();
            }
        });

        // call onCancel() on ESCAPE
        contentPane.registerKeyboardAction(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onCancel();
            }
        }, KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0), JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT);
    }

    private void onOK() {
        // add your code here
        String p = textArea1.getText();
        ParImpar calc = new ParImpar();
        int a = calc.Calcular(Integer.parseInt(p));
        if (a==0)
        {
            textArea1.setText("Es Par");

        }
        else
            {
                textArea1.setText("Es impar");
            }

        //dispose();///Al comentar esta linea evitamos que no se cierre la ventana al terminar el proceso
    }

    private void onCancel() {
        textArea1.setText("");
        dispose();
    }

    public static void main(String[] args) {
        ParImparInterfaz dialog = new ParImparInterfaz();
        dialog.pack();
        dialog.setVisible(true);
        System.exit(0);
    }
}
