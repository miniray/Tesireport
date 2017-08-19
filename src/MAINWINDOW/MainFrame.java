import javax.swing.*;
import java.awt.*;

public class MainFrame {

    private JFrame Main_frame;
    private JPanel Main_frame_panel;
    private JPanel Main_frame_panel_menu;
    private GridBagLayout Main_frame_gridBagLayout;
    private GridBagConstraints Main_frame_constraints;
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
        Main_frame_gridBagLayout = new GridBagLayout();

        Main_frame_panel = new JPanel(Main_panel_card_layout);
        Main_frame_panel_menu = new JPanel(Main_frame_gridBagLayout);

        button_emails = new JButton("EMAILS");





        Main_frame_constraints.gridx = 0; // El área de texto empieza en la columna cero.
        Main_frame_constraints.gridy = 0; // El área de texto empieza en la fila cero
        Main_frame_constraints.gridwidth = 1; // El área de texto ocupa dos columnas.
        Main_frame_constraints.gridheight = 1; // El área de texto ocupa 2 filas.


        Main_frame_panel_menu.add(button_emails, Main_frame_constraints);


        Main_frame_panel.setBackground(Color.CYAN);
        Main_frame_panel.add(Main_frame_panel_menu);


        Main_frame.add(Main_frame_panel);
        Main_frame.setVisible(true);




    }




}
