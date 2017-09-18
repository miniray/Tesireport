package src.MainWindow;

import src.LoginWindow.LoginFrame;

public class Main {

    public static void main (String[] args){

        MainFrame mainFrame = new MainFrame();
        //LoginFrame loginFrame = new LoginFrame(mainFrame);
        mainFrame.getMainFrame().setVisible(true);
        ControladorMainFrame controladorMainFrame = new ControladorMainFrame(mainFrame);
        mainFrame.controllerConection(controladorMainFrame);

    }
}
