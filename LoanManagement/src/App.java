import javax.swing.SwingUtilities;

public class App {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
            	//new Signup().setVisible(true);
                new Login().setVisible(true);
                //new homepage().setVisible(true);
            }
        });
    }
}