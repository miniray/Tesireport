import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControladorMainFrame implements ActionListener {

    private MainFrame mainFrame;


    public ControladorMainFrame(MainFrame mainFrame){

        this.mainFrame = mainFrame;
    }




    public void actionPerformed(ActionEvent e) {

        String actionCommand = e.getActionCommand();

        switch(actionCommand){

            case "LISTADOEMAILS":
                mainFrame.getMainFrame().setSize(500,200);
                mainFrame.getMainPanelCardLayout().show(mainFrame.getMainFramePanel(), "LISTADOEMAILS");

                //mainFrame.getMainPanelCardLayout().next(mainFrame.getMainFramePanel());

        }

    }
}
