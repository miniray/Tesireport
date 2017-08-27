package src.LayoutGeneral;

import java.awt.*;

public class GeneralLayout {

    private GridBagLayout gridBagLayout;
    private GridBagConstraints gridBagConstraints;

    public GeneralLayout(){

        gridBagLayout = new GridBagLayout();
        gridBagConstraints = new GridBagConstraints();
        //gridBagLayout.columnWeights = new double[] {1.0, 1.0, 1.0, 1.0, 1.0,1.0,1.0,1.0,1.0,1.0,1.0,1.0};
        //gridBagLayout.rowWeights = new double[] {1.0, 1.0, 1.0, 1.0, 1.0,1.0,1.0,1.0,1.0,1.0,1.0,1.0};
        resetGeneralLayoutConstraints();

    }

    public void resetGeneralLayoutConstraints(){

        gridBagConstraints.gridx = 0; // El área de texto empieza en la columna cero.
        gridBagConstraints.gridy = 0; // El área de texto empieza en la fila cero
        gridBagConstraints.gridwidth = 1; // El área de texto ocupa 1 columna.
        gridBagConstraints.gridheight = 1; // El área de texto ocupa 1 filas.
        gridBagConstraints.anchor= GridBagConstraints.NORTHWEST;
        gridBagConstraints.fill = GridBagConstraints.BOTH;
        gridBagConstraints.weighty = 0;
        gridBagConstraints.weightx = 0;

    }

    public void setPosition(int x, int y){

        gridBagConstraints.gridx = x;
        gridBagConstraints.gridy = y;

    }

    public void setSize(int xd, int yd){

        gridBagConstraints.gridheight = yd;
        gridBagConstraints.gridwidth = xd;

    }

    public void setColumnWeights(double[] values){
        gridBagLayout.columnWeights = values;
    }

    public void setRowWeights(double[] values){
        gridBagLayout.rowWeights = values;
    }

    public void setWeightXY(int x, int y){
        gridBagConstraints.weighty = y;
        gridBagConstraints.weightx = x;
    }



    public GridBagLayout getGridBagLayout(){
        return gridBagLayout;
    }

    public GridBagConstraints getGridBagConstraints() {
        return gridBagConstraints;
    }
}
