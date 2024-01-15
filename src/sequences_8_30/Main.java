package sequences_8_30;

import sequences_8_30.gui.MainFrame;

public class Main {

    public static void main(String[] args) {
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
       
    }
}
