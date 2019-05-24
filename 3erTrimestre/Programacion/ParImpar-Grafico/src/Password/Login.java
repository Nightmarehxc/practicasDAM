package Password;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

public class Login extends JDialog {
    private JPanel contentPane;
    private JButton buttonOK;
    private JPasswordField passwordField1;
    private String pass = "Hola";
    public Login() {
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
        String pass = String.valueOf(passwordField1.getPassword());
        System.out.println(pass);
        Password input = new Password();
        int i = input.CheckPass(pass);
        if(i == 0)
        {
            JOptionPane.showMessageDialog(null,"Contraseña correcta");
            System.out.println("correcto");
            dispose();
        }
        else if (i == 1)
        {
            JOptionPane.showMessageDialog(null, "Contraseña invalida", "Error", JOptionPane.ERROR_MESSAGE);
            dispose();
        }
    }
    public static void main(String[] args) {
        Login dialog = new Login();
        dialog.pack();
        dialog.setVisible(true);
        System.exit(0);
    }
}
