package src.Interfaces;

import javax.swing.*;

public class SeleccionableHoteles implements Constants{

    private JComboBox codigohotCombo;
    private JComboBox cadenaHotelCombo;

    public SeleccionableHoteles(){
        codigohotCombo = new JComboBox();
        cadenaHotelCombo = new JComboBox(cadenasList);
    }

    public void rechargeHotelJCombo(){
        codigohotCombo.removeAllItems();
        int x = cadenaHotelCombo.getSelectedIndex();
        int contador = 0;

        for (String[] aHotel: allCadenas[x]){
            System.out.println(aHotel.toString());
            codigohotCombo.addItem(aHotel[0]);
            contador++;
        }
    }

    public JComboBox getCadenaHotelCombo(){
        return cadenaHotelCombo;
    }
    public JComboBox getCodigohotCombo(){
        return codigohotCombo;
    }

    public String getHotelCodigoHot(){
        String codigohot = allCadenas[cadenaHotelCombo.getSelectedIndex()][codigohotCombo.getSelectedIndex()][1];
        return codigohot;
    }
}
