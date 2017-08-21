package src.ListadoEmail;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Miquel on 21/08/2017.
 */
public class ControladorListadoEmails implements ActionListener {

    ListadoEmailsPanel listadoEmailsPanel;

    public ControladorListadoEmails(ListadoEmailsPanel listadoEmailsPanel){

        this.listadoEmailsPanel = listadoEmailsPanel;

    }


    @Override
    public void actionPerformed(ActionEvent e) {

        String actionCommand = e.getActionCommand();

        switch (actionCommand){

            case "EXCEL":
                break;

            case "PANTALLA":
                break;

        }

    }
}
