package src.MAINWINDOW;

import src.ListadoEmail.ControladorListadoEmails;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControladorMainFrame implements ActionListener {

    private MainFrame mainFrame;
    private ControladorListadoEmails controladorListadoEmails;


    public ControladorMainFrame(MainFrame mainFrame){

        this.mainFrame = mainFrame;
        controladorListadoEmails = new ControladorListadoEmails(mainFrame.getListadoEmailsPanel());
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
