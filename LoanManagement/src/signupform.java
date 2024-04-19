import javax.swing.JFrame;
	public class signupform extends JFrame{
		
		 public  signupform (String title){
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
