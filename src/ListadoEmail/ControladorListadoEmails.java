package src.ListadoEmail;

import src.SQL.SQLConnection;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Miquel on 21/08/2017.
 */
public class ControladorListadoEmails implements ActionListener {

    private ListadoEmailsPanel listadoEmailsPanel;
    private SQLConnection connection;

    public ControladorListadoEmails(ListadoEmailsPanel listadoEmailsPanel, SQLConnection connection){

        this.listadoEmailsPanel = listadoEmailsPanel;
        this.connection = connection;

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
