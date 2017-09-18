package src.RutaArchivosCierre;

import src.SQL.SQLConnection;
import src.SQL.SQLStatements;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

public class ControladorRutaArchivosCierre implements ActionListener {

    private RutaArchivosCierrePanel rutaArchivosCierrePanel;
    private SQLConnection connection;

    public ControladorRutaArchivosCierre(RutaArchivosCierrePanel rutaArchivosCierrePanel, SQLConnection connection){

        this.rutaArchivosCierrePanel = rutaArchivosCierrePanel;
        this.connection = connection;
    }


    @Override
    public void actionPerformed(ActionEvent e) {

        String actionCommand = e.getActionCommand();


        switch (actionCommand){

            case "COMPROBAR":
                try {
                    rutaArchivosCierrePanel.getRutaTextField().setText(SQLStatements.getRutaArchivosCierre(rutaArchivosCierrePanel.getSeleccionableHoteles().getCadenaHotelCombo().getSelectedIndex(), rutaArchivosCierrePanel.getSeleccionableHoteles().getHotelCodigoHot()).toString());
                } catch (SQLException e1) {
                    e1.printStackTrace();
                }
                break;

            case "CADENACOMBO":
                rutaArchivosCierrePanel.getSeleccionableHoteles().rechargeHotelJCombo();
                System.out.println("RECARGADO");
                break;

            default:
                break;
        }

    }
}
