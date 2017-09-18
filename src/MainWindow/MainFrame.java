package src.MainWindow;
import src.LayoutGeneral.GeneralLayout;
import src.ListadoEmail.ListadoEmailsPanel;
import src.RutaArchivosCierre.RutaArchivosCierrePanel;

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
    final static String RUTAARCHIVOSCIERRE = "RUTAARCHIVOSCIERRE";

    private ListadoEmailsPanel listadoEmailsPanel;
    private RutaArchivosCierrePanel rutaArchivosCierrePanel;

    private JButton button_emails;
    private JButton button_ruta_archivos_cierre;
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
        button_emails = new JButton("LISTADOEMAILS");
        button_ruta_archivos_cierre = new JButton("RUTA ARCHIVOS CIERRE");
        mainFramePanel = new JPanel(mainPanelCardLayout);
        mainFrameButtonsPanel = new JPanel(mainFrameGridBagLayout.getGridBagLayout());
        mainFrameButtonsPanel.setBackground(Color.BLUE);
        mainFramePanel.add(mainFrameButtonsPanel, BUTTONPANEL);



        //BOTON EMAILS
        listadoEmailsPanel = new ListadoEmailsPanel();
        mainFrameGridBagLayout.setPosition(0,1);
        mainFrameButtonsPanel.add(button_emails, mainFrameGridBagLayout.getGridBagConstraints());
        mainFramePanel.add(listadoEmailsPanel.getPanel(), LISTADOEMAILS);

        //BOTON RUTA ARCHIVOS CIERRE HOTEL
        rutaArchivosCierrePanel= new RutaArchivosCierrePanel();
        mainFrameGridBagLayout.setPosition(0,2);
        mainFrameButtonsPanel.add(button_ruta_archivos_cierre, mainFrameGridBagLayout.getGridBagConstraints());
        mainFramePanel.add(rutaArchivosCierrePanel.getRutaArchivosCierrePanel(),RUTAARCHIVOSCIERRE);


        mainFrame.add(mainFramePanel);
        mainFrame.setVisible(false);




    }

    public void controllerConection(ControladorMainFrame controladorMainFrame){

        button_emails.addActionListener(controladorMainFrame);
        button_emails.setActionCommand("LISTADOEMAILS");
        button_ruta_archivos_cierre.addActionListener(controladorMainFrame);
        button_ruta_archivos_cierre.setActionCommand("RUTAARCHIVOSCIERRE");

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

    public ListadoEmailsPanel getListadoEmailsPanel(){
        return listadoEmailsPanel;
    }

    public RutaArchivosCierrePanel getRutaArchivosCierrePanel() {
        return rutaArchivosCierrePanel;
    }
}
