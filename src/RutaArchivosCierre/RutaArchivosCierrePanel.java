package src.RutaArchivosCierre;

import src.Interfaces.Constants;
import src.Interfaces.SeleccionableHoteles;
import src.LayoutGeneral.GeneralLayout;
import src.MainWindow.ControladorMainFrame;

import javax.swing.*;

public class RutaArchivosCierrePanel implements Constants {

    private GeneralLayout generalLayout;
    private JPanel rutaArchivosCierrePanel;
    private JLabel cadenaHotelLabel;
    private JLabel codigohotLabel;
    private JButton jButton_volver;
    private JButton jButton_comprobar;
    private JTextField codigohot_textField;
    private JTextField rutaTextField;
    private SeleccionableHoteles seleccionableHoteles;

    public RutaArchivosCierrePanel() {

        generalLayout = new GeneralLayout();
        rutaArchivosCierrePanel = new JPanel(generalLayout.getGridBagLayout());
        cadenaHotelLabel = new JLabel("CADENA");
        codigohotLabel = new JLabel("HOTEL");
        jButton_volver = new JButton("VOLVER");
        jButton_comprobar = new JButton("COMPROBAR");
        seleccionableHoteles = new SeleccionableHoteles();
        rutaTextField = new JTextField();

/*
        double[] columnWeight = {0.5,1.0,0.5,1.0};
        generalLayout.setColumnWeights(columnWeight);

        int[] columnWidth = {1,4,1,4};
        generalLayout.setColumnWidth(columnWidth);*/

        generalLayout.setPosition(0,0);
        rutaArchivosCierrePanel.add(cadenaHotelLabel, generalLayout.getGridBagConstraints());

        generalLayout.setPosition(2,0);
        codigohotLabel.setHorizontalAlignment(JLabel.CENTER);
        rutaArchivosCierrePanel.add(codigohotLabel, generalLayout.getGridBagConstraints());

        generalLayout.setPosition(1,0);
        generalLayout.setWeightXY(2,0);
        rutaArchivosCierrePanel.add(seleccionableHoteles.getCadenaHotelCombo(), generalLayout.getGridBagConstraints());


        generalLayout.setPosition(3,0);
        generalLayout.setWeightXY(12,0);
        rutaArchivosCierrePanel.add(seleccionableHoteles.getCodigohotCombo(), generalLayout.getGridBagConstraints());

        generalLayout.setPosition(0,1);
        generalLayout.setWeightXY(0,1);
        generalLayout.setSize(4, 1);
        rutaArchivosCierrePanel.add(rutaTextField, generalLayout.getGridBagConstraints());

        generalLayout.resetGeneralLayoutConstraints();
        generalLayout.setPosition(2,2);
        generalLayout.setWeightXY(0,0);
        rutaArchivosCierrePanel.add(jButton_volver, generalLayout.getGridBagConstraints());

        generalLayout.setPosition(3,2);
        rutaArchivosCierrePanel.add(jButton_comprobar, generalLayout.getGridBagConstraints());



        rutaArchivosCierrePanel.setVisible(true);

    }

    public void controlerConnection(ControladorRutaArchivosCierre controladorRutaArchivosCierre){

        jButton_comprobar.addActionListener(controladorRutaArchivosCierre);
        jButton_comprobar.setActionCommand("COMPROBAR");
        seleccionableHoteles.getCadenaHotelCombo().addActionListener(controladorRutaArchivosCierre);
        seleccionableHoteles.getCadenaHotelCombo().setActionCommand("CADENACOMBO");
        seleccionableHoteles.getCodigohotCombo().addActionListener(controladorRutaArchivosCierre);


    }

    public void controlerConnectionVolver(ControladorMainFrame controladorMainFrame){
        jButton_volver.addActionListener(controladorMainFrame);
        jButton_volver.setActionCommand("VOLVER");
    }

    public JPanel getRutaArchivosCierrePanel(){
        return rutaArchivosCierrePanel;
    }

    public SeleccionableHoteles getSeleccionableHoteles() {
        return seleccionableHoteles;
    }

    public JTextField getRutaTextField(){
        return rutaTextField;
    }
}
