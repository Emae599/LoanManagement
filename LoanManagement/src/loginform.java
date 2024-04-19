import javax.swing.JFrame;
public class loginform extends JFrame{
	
	 public  loginform (String title){
	        //The main gui panel
	        super(title);
	        setSize(800, 500);
	        setDefaultCloseOperation(EXIT_ON_CLOSE);
	        setLayout(null);
	        setLocationRelativeTo(null);
	        setResizable(false);
	        getContentPane().setBackground(CommonConstants.WHITE);	
	    }
	}