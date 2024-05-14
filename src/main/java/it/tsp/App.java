package it.tsp;
import it.tsp.gui.WinHome;

public class App {
   
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new WinHome().setVisible(true);
            }
        });
    }
}
