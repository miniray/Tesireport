package MAINWINDOW;

import javax.swing.*;
import java.awt.*;

public class MainFrame {

    private JFrame mainFrame;
    private JPanel mainPanel;
    private CardLayout cardLayout;

    MainFrame(){

        mainFrame = new JFrame("TESIREPORTS");
        mainFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        cardLayout = new CardLayout();




        mainPanel = new JPanel(cardLayout);
        mainFrame.setVisible(true);




    }

}
