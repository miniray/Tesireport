package src.MainWindow;

import src.ListadoEmail.ControladorListadoEmails;
import src.SQL.SQLConnection;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControladorMainFrame implements ActionListener {

    private MainFrame mainFrame;
    private ControladorListadoEmails controladorListadoEmails;
    private SQLConnection connection;


    public ControladorMainFrame(MainFrame mainFrame){

        this.mainFrame = mainFrame;
        SQLConnection connection = new SQLConnection("","","","","");
        controladorListadoEmails = new ControladorListadoEmails(mainFrame.getListadoEmailsPanel(), connection);
    }




    public void actionPerformed(ActionEvent e) {

        String actionCommand = e.getActionCommand();

        switch(actionCommand){

            case "LISTADOEMAILS":
                mainFrame.getMainFrame().setSize(500,200);
                mainFrame.getMainPanelCardLayout().show(mainFrame.getMainFramePanel(), "LISTADOEMAILS");

                mainFrame.getListadoEmailsPanel().controlerConnectionVolver(this);
                mainFrame.getListadoEmailsPanel().controlerConnection(controladorListadoEmails);

                //mainFrame.getMainPanelCardLayout().next(mainFrame.getMainFramePanel());
                break;

            case "VOLVER":
                mainFrame.getMainPanelCardLayout().show(mainFrame.getMainFramePanel(), "BUTTONPANEL");
                break;

            default:
                System.out.println("NO HAY OPCION EN CONTROLADOR MAIN FRAME!");
                break;
        }

    }
}
