import LayoutGeneral.GeneralLayout;

import javax.swing.*;
import java.awt.*;

public class MainFrame {

    private JFrame Main_frame;
    private JPanel Main_frame_panel;
    private JPanel Main_frame_panel_menu;
    private JPanel Listado_emails_panel;
    private GeneralLayout Main_frame_gridBagLayout;
    private CardLayout Main_panel_card_layout;

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

        Main_frame = new JFrame("TESIREPORTS");
        Main_frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Main_panel_card_layout = new CardLayout();
        Main_frame_gridBagLayout = new GeneralLayout();
        Main_frame_panel = new JPanel(Main_panel_card_layout);
        Main_frame_panel_menu = new JPanel(Main_frame_gridBagLayout.getGridBagLayout());
        button_emails = new JButton("LISTADO EMAILS");


        Main_frame_gridBagLayout.setPosition(0,1);
        Main_frame_panel_menu.add(button_emails, Main_frame_gridBagLayout.getGridBagConstraints());
        Main_frame_panel.add(Main_frame_panel_menu);


        Main_frame.add(Main_frame_panel);
        Main_frame.setVisible(true);




    }

    public void controllerConection(ControladorMainFrame controladorMainFrame){


    }



}
