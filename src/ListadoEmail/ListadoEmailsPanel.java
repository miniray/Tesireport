package ListadoEmail;

import javax.swing.*;

import LayoutGeneral.GeneralLayout;
import com.toedter.calendar.JDateChooser;

public class ListadoEmailsPanel {

    private JPanel listado_emails_panel;
    private GeneralLayout generalLayout;
    private JDateChooser jDateChooser_desde;
    private JDateChooser jDateChooser_hasta;
    private JLabel fecha_label;
    private JCheckBox jCheckBox_incluir_clx;
    private JCheckBox jCheckBox_solo_con_email;


    public ListadoEmailsPanel(){

        generalLayout = new GeneralLayout();
        listado_emails_panel = new JPanel(generalLayout.getGridBagLayout());
        jDateChooser_desde = new JDateChooser();
        jDateChooser_hasta = new JDateChooser();
        jCheckBox_incluir_clx = new JCheckBox("INCLUIR CLX:");
        jCheckBox_solo_con_email = new JCheckBox("SOLO CLIENTES CON @:");
        fecha_label = new JLabel("FECHA DE CHECK IN:");

        generalLayout.setPosition(0,0);
        listado_emails_panel.add(fecha_label, generalLayout.getGridBagConstraints());
        generalLayout.setPosition(0,1);
        listado_emails_panel.add(jDateChooser_desde, generalLayout.getGridBagConstraints());
        generalLayout.setPosition(0,2);
        listado_emails_panel.add(jDateChooser_hasta,generalLayout.getGridBagConstraints());
        generalLayout.setPosition(1,0);
        listado_emails_panel.add(jCheckBox_incluir_clx, generalLayout.getGridBagConstraints());
        generalLayout.setPosition(2,0);
        listado_emails_panel.add(jCheckBox_solo_con_email, generalLayout.getGridBagConstraints());

    }

    public JPanel getPanel(){
        return listado_emails_panel;
    }
}
