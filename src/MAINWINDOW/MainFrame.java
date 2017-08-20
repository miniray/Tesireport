import LayoutGeneral.GeneralLayout;
import ListadoEmail.ListadoEmailsPanel;

import javax.swing.*;
import java.awt.*;

public class MainFrame {

    private JFrame mainFrame;
    private JPanel mainFramePanel;
    private JPanel mainFrameButtonsPanel;
    private GeneralLayout mainFrameGridBagLayout;
    private CardLayout mainPanelCardLayout;

    final static String BUTTONPANEL = "BUTTONPANEL";
    final static String LISTADOEMAILS = "LISTADOEMAILS";

    private ListadoEmailsPanel listadoEmailsPanel;

    private JButton button_emails;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JButton button5;
    private JButton button6;
    private JButton button7;
    private JButton button8;
    private JButton button9;

    public MainFrame(){

        mainFrame = new JFrame("TESIREPORTS");
        mainFrame.setSize(500,300);
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setLocationRelativeTo(null);
        mainPanelCardLayout = new CardLayout();
        mainFrameGridBagLayout = new GeneralLayout();
        mainFramePanel = new JPanel(mainPanelCardLayout);
        mainFrameButtonsPanel = new JPanel(mainFrameGridBagLayout.getGridBagLayout());
        button_emails = new JButton("LISTADOEMAILS");

        listadoEmailsPanel = new ListadoEmailsPanel();


        mainFrameGridBagLayout.setPosition(0,1);
        mainFrameButtonsPanel.setBackground(Color.BLUE);
        mainFrameButtonsPanel.add(button_emails, mainFrameGridBagLayout.getGridBagConstraints());
        mainFramePanel.add(mainFrameButtonsPanel, BUTTONPANEL);
        mainFramePanel.add(listadoEmailsPanel.getPanel(), LISTADOEMAILS);

        mainFrame.add(mainFramePanel);
        mainFrame.setVisible(true);




    }

    public void controllerConection(ControladorMainFrame controladorMainFrame){

        button_emails.addActionListener(controladorMainFrame);
        button_emails.setActionCommand("LISTADOEMAILS");

    }

    public CardLayout getMainPanelCardLayout(){
        return mainPanelCardLayout;
    }
    public JPanel getMainFramePanel(){
        return mainFramePanel;
    }

    public JFrame getMainFrame(){
        return mainFrame;
    }





}
