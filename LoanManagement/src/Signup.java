import custom.ErrorLabel;
import custom.PasswordFieldCustom;
import custom.TextFieldCustom;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Signup extends signupform implements ActionListener, FocusListener{
	private ErrorLabel firstnameErrorLabel, lastnameErrorLabel, NumberErrorLabel, passwordErrorLabel, confirmPasswordErrorLabel, emailErrorLabel;
	private TextFieldCustom firstnameField, lastnameField, emailField, numberField;
	private PasswordFieldCustom passwordField, confirmPasswordField;
	private Font customFont;
	 public Signup(){
	        super("");
	        addGuiComponents();
	        // create custom font
	        customFont = CustomTools.createFont(CommonConstants.FONT_PATH);

	    }
	    private void addGuiComponents() {
	    	
	    	JLabel SIGNUP = new JLabel("SIGN UP");
	    	SIGNUP.setBounds(521, 10, 150, 50);
	    	SIGNUP.setForeground(Color.WHITE);
	    	SIGNUP.setFont(new Font("Segoe UI", Font.BOLD, 30));
	    	SIGNUP.setHorizontalAlignment(SwingConstants.CENTER);
	        add(SIGNUP);
	        
	        // First Name
	        JLabel firstname = new JLabel("First Name");
	        firstname.setBounds(353,60, 200, 15);
	        firstname.setForeground(Color.WHITE);
	        firstname.setFont(new Font("Segoe UI", Font.PLAIN, 14));
	        firstname.setHorizontalAlignment(SwingConstants.CENTER);
	        add(firstname);
	        // First Name Field
	        TextFieldCustom firstnameField = new TextFieldCustom("", 14);
	        firstnameField.setFont(new Font("Segoe UI", Font.PLAIN, 14));
	        firstnameField.setBackground(Color.WHITE);
	        firstnameField.setForeground(Color.BLACK);
	        firstnameField.setBorder(null);
	        firstnameField.setBounds(420, 80,350, 30);
	        firstnameField.addFocusListener(this);
	        add(firstnameField);

	        // first name error label
	        ErrorLabel firstnameErrorLabel = new ErrorLabel("*Invalid: Enter First Name");
	        firstnameErrorLabel.setBounds(353,100, 500, 15);
	        
	        
	        // Last Name
	        JLabel phonenumber = new JLabel("Last Name");
	        phonenumber.setBounds(353,115, 200, 15);
	        phonenumber.setForeground(Color.WHITE);
	        phonenumber.setFont(new Font("Segoe UI", Font.PLAIN, 14));
	        phonenumber.setHorizontalAlignment(SwingConstants.CENTER);
	        add(phonenumber);
	        // Last Name Field
	        TextFieldCustom lastnameField = new TextFieldCustom("Enter Last Name", 14);
	        lastnameField.setFont(new Font("Segoe UI", Font.PLAIN, 14));
	        lastnameField.setBackground(Color.WHITE);
	        lastnameField.setForeground(Color.BLACK);
	        lastnameField.setBorder(null);
	        lastnameField.setBounds(420, 135,350, 30);
	        lastnameField.addFocusListener(this);
	        add(lastnameField);

	        // last name error label
	        ErrorLabel lastnameErrorLabel = new ErrorLabel("*Invalid: Enter Last Name");
	        lastnameErrorLabel.setBounds(353,160, 200, 15);
	        
	        // Phone Number
	        JLabel phoneNumber = new JLabel("Phone Number");
	        phoneNumber.setBounds(367,170, 200, 15);
	        phoneNumber.setForeground(Color.WHITE);
	        phoneNumber.setFont(new Font("Segoe UI", Font.PLAIN, 14));
	        phoneNumber.setHorizontalAlignment(SwingConstants.CENTER);
	        add(phoneNumber);
	        // phone number field
	        TextFieldCustom numberField = new TextFieldCustom("Enter Phone Number", 14);
	        numberField.setFont(new Font("Segoe UI", Font.PLAIN, 14));
	        numberField.setBackground(Color.WHITE);
	        numberField.setForeground(Color.BLACK);
	        numberField.setBorder(null);
	        numberField.setBounds(420, 190,350, 30);
	        numberField.addFocusListener(this);
	        add(numberField);

	        // phone number error label
	        ErrorLabel NumberErrorLabel = new ErrorLabel("*Invalid: Enter your Phone number");
	        NumberErrorLabel.setBounds(420, 230,350, 30);
	        
	        // Password
	        JLabel password = new JLabel("Password");
	        password.setBounds(275, 215,350, 30);
	        password.setForeground(Color.WHITE);
	        password.setFont(new Font("Segoe UI", Font.PLAIN, 14));
	        password.setHorizontalAlignment(SwingConstants.CENTER);
	        add(password);
	        //password field
	        PasswordFieldCustom passwordField = new PasswordFieldCustom("", 14);
	        passwordField.setFont(new Font("Segoe UI", Font.PLAIN, 14));
	        passwordField.setBackground(Color.WHITE);
	        passwordField.setForeground(Color.BLACK);
	        passwordField.setBorder(null);
	        passwordField.setBounds(420, 240,350, 30);
	        passwordField.addFocusListener(this);
	        add(passwordField);

	        // password error label
	        ErrorLabel passwordErrorLabel = new ErrorLabel("*Invalid: More than 6, 1 Upper and Lower, and Number/s");
	        passwordErrorLabel.setBounds(275, 270,350, 30);
	        
	        // Confirm Password
	        JLabel confirmPassword = new JLabel("Confirm Password");
	        confirmPassword.setBounds(404,272, 150, 15);
	        confirmPassword.setForeground(Color.WHITE);
	        confirmPassword.setFont(new Font("Segoe UI", Font.PLAIN, 14));
	        confirmPassword.setHorizontalAlignment(SwingConstants.CENTER);
	        add(confirmPassword);
	        // confirm password field
	        PasswordFieldCustom confirmPasswordField = new PasswordFieldCustom("", 14);
	        confirmPasswordField.setFont(new Font("Segoe UI", Font.PLAIN, 14));
	        confirmPasswordField.setBackground(Color.WHITE);
	        confirmPasswordField.setForeground(Color.BLACK);
	        confirmPasswordField.setBorder(null);
	        confirmPasswordField.setBounds(420, 288,350, 30);
	        confirmPasswordField.addFocusListener(this);
	        add(confirmPasswordField);

	        // confirm password error label
	        ErrorLabel confirmPasswordErrorLabel = new ErrorLabel("*Invalid: Passwords are not the same");
	        confirmPasswordErrorLabel.setBounds(405,310, 150, 15);
	        
	        // Email
	        JLabel Email = new JLabel("Email");
	        Email.setBounds(363,320, 150, 15);
	        Email.setForeground(Color.WHITE);
	        Email.setFont(new Font("Segoe UI", Font.PLAIN, 14));
	        Email.setHorizontalAlignment(SwingConstants.CENTER);
	        add(Email);
	        // email field
	        TextFieldCustom emailField = new TextFieldCustom("", 14);
	        emailField.setFont(new Font("Segoe UI", Font.PLAIN, 14));
	        emailField.setBackground(Color.WHITE);
	        emailField.setForeground(Color.BLACK);
	        emailField.setBorder(null);
	        emailField.setBounds(420, 340,350, 30);
	        emailField.addFocusListener(this);
	        add(emailField);
	        // email error label
	        ErrorLabel emailErrorLabel = new ErrorLabel("*Invalid: Not a valid format");
	        emailErrorLabel.setBounds(0,0,0,0);
	        
	        
	        // login button
	        JButton loginButton = new JButton("Sign Up");
	        loginButton.setFont(new Font("Segoe UI", Font.PLAIN, 14));
	        loginButton.setBackground(CommonConstants.BUTTON_COLOR);
	        loginButton.setForeground(Color.WHITE);
	        loginButton.setBounds(420, 380,350, 30);
	        loginButton.addActionListener(this);
	        add(loginButton);
	        // login label
	        JLabel registerLabel = new JLabel("I have an account");
	        registerLabel.setFont(new Font("Segoe UI", Font.PLAIN, 14));
	        registerLabel.setForeground(Color.WHITE);
	        registerLabel.setBounds(425, 380,300,100);
	        add(registerLabel);
	        // register -> login label
	        JButton login = new JButton("Login");
	        login.setFont(new Font("Segoe UI", Font.PLAIN, 12));
	        login.setBackground(CommonConstants.WHITE);
	        login.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
	        login.setForeground(new Color(57,155,40));
	        login.setBounds(550, 415,80, 30);
	        login.addActionListener(this);
	        add(login);
	        
	        login.addMouseListener(new MouseAdapter() {
	            @Override
	            public void mouseClicked(MouseEvent e) {
	                dispose();
	                new Login().setVisible(true);
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
	    @Override
        public void focusGained(FocusEvent e) {

        }
	        @Override
	        public void focusLost(FocusEvent e) {
	            Object fieldSource = e.getSource();
	            if(fieldSource == firstnameField){
	                // valid first name has to be greater or equal to 0
	                if(firstnameField.getText().length() < 0 || firstnameField.isHasPlaceHolder()){
	                    firstnameErrorLabel.setVisible(true);
	                }else{
	                    firstnameErrorLabel.setVisible(false);}
	            }else if(fieldSource == lastnameField){
	                    // valid last name has to be greater or equal to 0
	                    if(lastnameField.getText().length() < 0 || lastnameField.isHasPlaceHolder()){
	                        lastnameErrorLabel.setVisible(true);
	                    }else{
	                        lastnameErrorLabel.setVisible(false);}
	            }else if(fieldSource == numberField){
	                // valid number has to be greater or equal to 11
	                if(numberField.getText().length() < 11 || numberField.isHasPlaceHolder()){
	                    NumberErrorLabel.setVisible(true);
	                }else{
	                    NumberErrorLabel.setVisible(false);}
	            }else if(fieldSource == passwordField){
	                // if password isn't 6 characters long, has 1 uppercase and 1 lowercase, it is invalid
	                String passwordRegex = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z]).{6,30}$";
	                Pattern p = Pattern.compile(passwordRegex);
	                Matcher m = p.matcher(passwordField.getText());
	                if(!m.find()) passwordErrorLabel.setVisible(true);
	                else passwordErrorLabel.setVisible(false);
	            }else if(fieldSource == confirmPasswordField){
	                // if passwords don't match it is invalid
	                if(!passwordField.getText().equals(confirmPasswordField.getText())){
	                   confirmPasswordErrorLabel.setVisible(true);
	                }else{
	                    confirmPasswordErrorLabel.setVisible(false);
	                }
	            }else if(fieldSource == emailField){
	                // checks email if it is in valid format
	                String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
	                Pattern p = Pattern.compile(emailRegex);
	                Matcher m = p.matcher(emailField.getText());
	                if(!m.find()) emailErrorLabel.setVisible(true);
	                else emailErrorLabel.setVisible(false);
	            }
	        }
	        
	        @Override
	        public void actionPerformed(ActionEvent e) {
	            String command = e.getActionCommand();
	            if(command.equals("Register")){
	                // validate that no error labels are present and that they aren't left in placeholder state
	       boolean isValid = !firstnameErrorLabel.isVisible() && !lastnameErrorLabel.isVisible() && !NumberErrorLabel.isVisible() && !confirmPasswordErrorLabel.isVisible()
	       && !emailErrorLabel.isVisible() && !firstnameField.isHasPlaceHolder() && !lastnameField.isHasPlaceHolder() &&!numberField.isHasPlaceHolder() &&!passwordField.isHasPlaceHolder()
	       && !confirmPasswordField.isHasPlaceHolder() && !emailField.isHasPlaceHolder();

	                // result dialog
	                JDialog resultDialog = new JDialog();
	                resultDialog.setSize(CommonConstants.RESULT_DIALOG_SIZE);
	                resultDialog.setLocationRelativeTo(this);
	                resultDialog.setModal(true);
	                resultDialog.getContentPane().setBackground(CommonConstants.PRIMARY_COLOR);

	                // result label
	                JLabel resultLabel = new JLabel();
	                resultLabel.setFont(customFont.deriveFont(22f));
	                resultLabel.setPreferredSize(CommonConstants.RESULT_DIALOG_SIZE);
	                resultLabel.setHorizontalAlignment(SwingConstants.CENTER);
	                add(resultLabel);
	                resultLabel.setForeground(CommonConstants.SECONDARY_COLOR);

	                if(isValid){
	                    // store the user info into the UserDB
	                    String number = numberField.getText();
	                    String email = emailField.getText();
	                    String password = passwordField.getText();
	                    UserDB.addUser1(number, password);
	                    UserDB.addUser2(email, password);

	                    // show a dialog that shows that the user has been added to the UserDB
	                    resultLabel.setText("Account Registered!");

	                    // take user back to the login gui (after closing dialog window)
	                    resultDialog.addWindowListener(new WindowAdapter() {
	                        @Override
	                        public void windowClosing(WindowEvent e) {
	                            dispose();
	                            new Login().setVisible(true);
	                        }
	                    });
	                }else{
	                    // show an error label
	                    resultLabel.setText("Invalid Credentials");
	                }

	                resultDialog.setVisible(true);
	                
	            }
	        }
			
	    }