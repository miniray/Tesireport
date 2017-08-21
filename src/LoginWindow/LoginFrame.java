package src.LoginWindow;

import src.LayoutGeneral.GeneralLayout;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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

    public LoginFrame(){
        loginFrame = new JFrame("INICIAR SESION");
        loginFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        loginFrame.setSize(200,200);
        loginFrame.setVisible(true);

        generalLayout = new GeneralLayout();
        loginPanel = new JPanel();

        loginFrame.add(loginPanel);

        userLabel = new JLabel("USER");
        passwordLabel = new JLabel("PASSWORD");
        userText = new JTextField();
        passwordText = new JTextField();
        aceptar_button = new JButton("ACEPTAR");

        generalLayout.setPosition(0,0);
        loginPanel.add(userLabel, generalLayout.getGridBagConstraints());
        generalLayout.setPosition(0,1);
        loginPanel.add(passwordLabel,generalLayout.getGridBagConstraints());

        generalLayout.setPosition(1,0);
        loginPanel.add(userText, generalLayout.getGridBagConstraints());
        generalLayout.setPosition(1,1);
        loginPanel.add(passwordText,generalLayout.getGridBagConstraints());


        generalLayout.setPosition(2,0);
        generalLayout.setSize(1,2);
        loginPanel.add(aceptar_button, generalLayout.getGridBagConstraints());

        aceptar_button.addActionListener(this);
        aceptar_button.setActionCommand("ACEPTAR");

        }

    @Override
    public void actionPerformed(ActionEvent e) {

        String actionCommand = e.getActionCommand();

        switch(actionCommand){

            case "ACEPTAR":

                break;

            default:
                System.out.println("LOGIN FRAME NO TIENE ESTE ACTION COMMAND");
                break;
        }

    }
}
