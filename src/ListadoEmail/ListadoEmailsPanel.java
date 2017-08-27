package src.ListadoEmail;

import javax.swing.*;

import src.LayoutGeneral.*;
import com.toedter.calendar.JDateChooser;
import src.MainWindow.ControladorMainFrame;

import java.awt.*;
import java.util.Date;

public class ListadoEmailsPanel {

    private JPanel listado_emails_panel;
    private GeneralLayout generalLayout;
    private JDateChooser jDateChooser_desde;
    private JDateChooser jDateChooser_hasta;
    private JLabel fecha_label;
    private JLabel desde_label;
    private JLabel hasta_label;
    private JCheckBox jCheckBox_incluir_clx;
    private JCheckBox jCheckBox_solo_con_email;
    private JButton jButton_volver;
    private JButton jButton_excel;
    private JButton jButton_pantalla;


    public ListadoEmailsPanel(){

        generalLayout = new GeneralLayout();
        listado_emails_panel = new JPanel(generalLayout.getGridBagLayout());
        listado_emails_panel.setBackground(Color.ORANGE);
        jDateChooser_desde = new JDateChooser();
        jDateChooser_hasta = new JDateChooser();
        jCheckBox_incluir_clx = new JCheckBox("INCLUIR CLX:");
        jCheckBox_solo_con_email = new JCheckBox("SOLO CLIENTES CON @:");
        fecha_label = new JLabel("FECHA DE CHECK IN:");
        desde_label = new JLabel("DESDE:");
        hasta_label = new JLabel("HASTA:");
        jButton_excel = new JButton("EXCEL");
        jButton_pantalla = new JButton("PANTALLA");
        jButton_volver = new JButton("VOLVER");

        fecha_label.setHorizontalAlignment(JLabel.CENTER);
        desde_label.setHorizontalAlignment(JLabel.CENTER);
        hasta_label.setHorizontalAlignment(JLabel.CENTER);

        jDateChooser_desde.setDateFormatString("dd/MM/yyyy");
        jDateChooser_hasta.setDateFormatString("dd/MM/yyyy");

        jDateChooser_desde.setDate(new Date());
        jDateChooser_hasta.setDate(new Date());

        double[] columnWeight = {1.0,1.0,1.0,1.0};
        generalLayout.setColumnWeights(columnWeight);

        generalLayout.setPosition(0,0);
        listado_emails_panel.add(fecha_label, generalLayout.getGridBagConstraints());

        generalLayout.setPosition(0,1);
        listado_emails_panel.add(desde_label, generalLayout.getGridBagConstraints());

        generalLayout.setPosition(0,2);
        listado_emails_panel.add(hasta_label, generalLayout.getGridBagConstraints());

        generalLayout.setPosition(2,1);
        listado_emails_panel.add(jCheckBox_incluir_clx, generalLayout.getGridBagConstraints());

        generalLayout.setPosition(2,2);
        listado_emails_panel.add(jCheckBox_solo_con_email, generalLayout.getGridBagConstraints());

        generalLayout.setPosition(1,1);
        listado_emails_panel.add(jDateChooser_desde, generalLayout.getGridBagConstraints());

        generalLayout.setPosition(1,2);
        listado_emails_panel.add(jDateChooser_hasta,generalLayout.getGridBagConstraints());

        generalLayout.setWeightXY(1,1);
        generalLayout.setPosition(0,3);
        //generalLayout.setSize(2,0);
        listado_emails_panel.add(jButton_volver,generalLayout.getGridBagConstraints());

        generalLayout.resetGeneralLayoutConstraints();
        generalLayout.setPosition(1,3);
        listado_emails_panel.add(jButton_pantalla, generalLayout.getGridBagConstraints());

        generalLayout.setPosition(2,3);
        listado_emails_panel.add(jButton_excel, generalLayout.getGridBagConstraints());


        listado_emails_panel.setVisible(true);


    }

    public JPanel getPanel(){
        return listado_emails_panel;
    }

    public void controlerConnection(ControladorListadoEmails controladorListadoEmails){

        jButton_excel.addActionListener(controladorListadoEmails);
        jButton_pantalla.addActionListener(controladorListadoEmails);


        jButton_excel.setActionCommand("EXCEL");
        jButton_pantalla.setActionCommand("PANTALLA");

    }

    public void controlerConnectionVolver(ControladorMainFrame controladorMainFrame){
        jButton_volver.addActionListener(controladorMainFrame);
        jButton_volver.setActionCommand("VOLVER");
    }
        }
