package src.LoginWindow;

import src.LayoutGeneral.GeneralLayout;
import src.MainWindow.MainFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static src.Interfaces.Users.users;

/**
 * Created by Miquel on 21/08/2017.
 */
public class LoginFrame implements ActionListener {

    private JFrame loginFrame;
    private JPanel loginPanel;
    private GeneralLayout generalLayout;
    private JLabel userLabel;
    private JLabel passwordLabel;
    private JTextField userText;
    private JTextField passwordText;
    private JButton aceptar_button;
    private boolean user_validado = false;
    MainFrame mainFrame;

    public LoginFrame(MainFrame mainFrame) {
        this.mainFrame = mainFrame;
        loginFrame = new JFrame("INICIAR SESION");
        loginFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        loginFrame.setLocationRelativeTo(null);
        loginFrame.setSize(480, 120);



        loginFrame.setVisible(true);

        generalLayout = new GeneralLayout();
        loginPanel = new JPanel(generalLayout.getGridBagLayout());

        //loginPanel.setMinimumSize(new Dimension(370,90));

        loginFrame.add(loginPanel);

        userLabel = new JLabel("USER");
        passwordLabel = new JLabel("PASSWORD");
        userText = new JTextField();
        passwordText = new JTextField();
        aceptar_button = new JButton("ACEPTAR");

        /*
        passwordLabel.setMinimumSize(new Dimension(30,10));
        userLabel.setMinimumSize(new Dimension(30,10));
        userText.setMinimumSize(new Dimension(30,10));
        passwordText.setMinimumSize(new Dimension(30,10));
        aceptar_button.setMinimumSize(new Dimension (30, 60));
*/

        double[] columnWeight = {0.2, 1.0, 0.5};
        generalLayout.setColumnWeights(columnWeight);
        //generalLayout.setRowWeights(rowWeight);
        generalLayout.setPosition(0, 0);
        loginPanel.add(userLabel, generalLayout.getGridBagConstraints());
        generalLayout.setPosition(0, 1);
        loginPanel.add(passwordLabel, generalLayout.getGridBagConstraints());

        generalLayout.setPosition(1, 0);
        generalLayout.setWeightXY(2,1);
        loginPanel.add(userText, generalLayout.getGridBagConstraints());
        generalLayout.setPosition(1, 1);
        loginPanel.add(passwordText, generalLayout.getGridBagConstraints());

        generalLayout.resetGeneralLayoutConstraints();
        generalLayout.setPosition(2, 0);
        generalLayout.setSize(1, 2);
        loginPanel.add(aceptar_button, generalLayout.getGridBagConstraints());

        aceptar_button.addActionListener(this);
        aceptar_button.setActionCommand("ACEPTAR");

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        String actionCommand = e.getActionCommand();

        switch (actionCommand) {

            case "ACEPTAR":

                if (checkUser()) {
                    mainFrame.getMainFrame().setVisible(true);
                    loginFrame.setVisible(false);
                }
                break;

            default:
                System.out.println("LOGIN FRAME NO TIENE ESTE ACTION COMMAND");
                System.exit(0);
                break;
        }
    }

    private boolean checkUserExists() {
        return true;
    }

    private boolean checkUser() {

        for (String[] aUser : users) {
            if (aUser[0].equals(userText.getText()) && aUser[1].equals(passwordText.getText())) {
                return true;
            }
        }
        JOptionPane.showMessageDialog(null, "USUARIO O CONTRASEÑA INCORRECTA");
        return false;
    }
}

