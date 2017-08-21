package src.MAINWINDOW;

public class Main {

    public static void main (String[] args){

        MainFrame mainFrame = new MainFrame();
        ControladorMainFrame controladorMainFrame = new ControladorMainFrame(mainFrame);
        mainFrame.controllerConection(controladorMainFrame);

    }
}
