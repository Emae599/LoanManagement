import custom.PasswordFieldCustom;
import custom.TextFieldCustom;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Locale;

public class Login extends loginform{
	private TextFieldCustom usernameField;
    private PasswordFieldCustom passwordField;
	public Login(){
	        super("");
	        addGuiComponents();

	    }
	    private void addGuiComponents() {
	    	JLabel LOGIN = new JLabel("LOGIN");
	        LOGIN.setBounds(525, 10, 140, 140);
	        LOGIN.setForeground(Color.WHITE);
	        LOGIN.setFont(new Font("Segoe UI", Font.BOLD, 36));
	        LOGIN.setHorizontalAlignment(SwingConstants.CENTER);
	        add(LOGIN);
	        
	        JLabel NumberMail = new JLabel("Enter Phone Number/E-Mail");
	        NumberMail.setBounds(406,140, 200, 15);
	        NumberMail.setForeground(Color.WHITE);
	        NumberMail.setFont(new Font("Segoe UI", Font.PLAIN, 14));
	        NumberMail.setHorizontalAlignment(SwingConstants.CENTER);
	        add(NumberMail);
	        
	        // Phone Number/Email Account field
	        JTextField usernameField = new JTextField();
	        usernameField.setFont(new Font("Segoe UI", Font.PLAIN, 14));
	        usernameField.setBackground(Color.WHITE);
	        usernameField.setForeground(Color.BLACK);
	        usernameField.setBorder(null);
	        usernameField.setBounds(420, 165,350, 30);
	        add(usernameField);
	        
	        JLabel password = new JLabel("Password");
	        password.setBounds(400,220, 100, 15);
	        password.setForeground(Color.WHITE);
	        password.setFont(new Font("Segoe UI", Font.PLAIN, 14));
	        password.setHorizontalAlignment(SwingConstants.CENTER);
	        add(password);
	        
	        JPasswordField passwordField = new JPasswordField();
	        passwordField.setFont(new Font("Segoe UI", Font.PLAIN, 14));
	        passwordField.setForeground(Color.WHITE);
	        passwordField.setForeground(Color.BLACK);
	        passwordField.setBounds(420, 245,350, 30);
	        passwordField.setBorder(null);
	        
	        add(passwordField);
	        
	        // login button
	        JButton loginButton = new JButton("Login");
	        loginButton.setFont(new Font("Segoe UI", Font.PLAIN, 14));
	        loginButton.setBackground(CommonConstants.BUTTON_COLOR);
	        loginButton.setForeground(Color.WHITE);
	        loginButton.setBounds(417, 320,350, 30);
	      //  loginButton.addActionListener(this);
			loginButton.addActionListener(new ActionListener(){
				@Override
				public void actionPerformed(ActionEvent e) {
					String username = usernameField.getText();
						String password = new String(passwordField.getPassword());
	
	
					/*String command = e.getActionCommand();
					if(command.equalsIgnoreCase("Login")){
						// create dialog box
						JDialog resultDialog = new JDialog();
						resultDialog.setPreferredSize(CommonConstants.RESULT_DIALOG_SIZE);
						resultDialog.pack();
						//resultDialog.setTitle(loginButton);
						resultDialog.setModal(true);
						resultDialog.getContentPane().setBackground(CommonConstants.PRIMARY_COLOR);
	
						// create label (display result)
						JLabel resultLabel = new JLabel();
						resultLabel.setForeground(CommonConstants.SECONDARY_COLOR);
						resultLabel.setFont(new Font("Segoe UI", Font.PLAIN, 26));
						resultLabel.setHorizontalAlignment(SwingConstants.CENTER);
						resultDialog.add(resultLabel);
						
						resultDialog.setVisible(true);
						*/
						// validate 
						if(UserDB.addUser1(username, password)){
							// checks password
						   // String validPass = UserDB.userDB.get(username);
						  //  if(password.equals(validPass)){
								// display a success dialog
								//resultLabel.setText("Login Successful!");
								JOptionPane.showMessageDialog(Login.this,"success");
	
							}else{
								// display an incorrect password dialog
								//resultLabel.setText("Invalid Password");
								//return resultDialog;
							   JOptionPane.showMessageDialog(Login.this,"invalid");
							}
							//add(resultDialog);
							//add(resultLabel);
						}//else{
							// display an incorrect username dialog
						   // resultLabel.setText("Invalid Username");
						//	JOptionPane.showMessageDialog(Login.this, "success")
						
				//}
						});
					
	        add(loginButton);
	        // register Label
	        JLabel registerLabel = new JLabel("I don't have an account");
	        registerLabel.setFont(new Font("Segoe UI", Font.PLAIN, 14));
	        registerLabel.setForeground(Color.white);
	        registerLabel.setBounds(425, 355,300,100);
	        add(registerLabel);
	        // login -> register label
	        JButton signUp = new JButton("Sign Up");
	        signUp.setFont(new Font("Segoe UI", Font.PLAIN, 12));
	        signUp.setBackground(CommonConstants.WHITE);
	        signUp.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
	        signUp.setForeground(new Color(57,155,83));
	        signUp.setBounds(580, 390,80, 30);
	        
	        add(signUp);
	        
	        signUp.addMouseListener(new MouseAdapter() {
	            @Override
	            public void mouseClicked(MouseEvent e) {
	                dispose();
	                new Signup().setVisible(true);
	            }
	        });
	        
	        
	        JLabel copyright = new JLabel("copyright © Effortless Loan Management Solution. All rights reserved");
	        copyright.setBounds(26,300, 400, 140);
	        copyright.setForeground(Color.GRAY);
	        copyright.setFont(new Font("Segoe UI", Font.PLAIN, 11));
	        copyright.setHorizontalAlignment(SwingConstants.LEFT);
	        add(copyright);
	    	
	    	JLabel loginImage = CustomTools.loadImage(CommonConstants.LOGIN_IMAGE_PATH);
	    	loginImage.setBounds(3,30,CommonConstants.LOGIN_IMAGE_SIZE.width, CommonConstants.LOGIN_IMAGE_SIZE.height);
	    	loginImage.setForeground(CommonConstants.BUTTON_COLOR);
	    	loginImage.setHorizontalAlignment(SwingConstants.LEFT);
	        add(loginImage);

	        JLabel RIGHT = CustomTools.loadImage(CommonConstants.RIGHT_PATH);
	        RIGHT.setBounds(400,0,CommonConstants.RIGHT_SIZE.width, CommonConstants.RIGHT_SIZE.height);
	        RIGHT.setForeground(CommonConstants.BUTTON_COLOR);
	        RIGHT.setFont(new Font("Dialog", Font.BOLD, 50));
	        RIGHT.setHorizontalAlignment(SwingConstants.RIGHT);
	        add(RIGHT);
	    }
		
				}
	            	 
	           //}
	        //}
	        
//}