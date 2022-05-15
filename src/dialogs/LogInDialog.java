package dialogs;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;

import gettersAndSetters.Theme;
import mainPackage.RunASP;
import panels.SignInPanel;

public class LogInDialog extends JDialog implements ActionListener{

	/**
	 * CREATING LOG IN DIALOG WITH SIGN IN REDIRECTION 
	 */
	
	private static final long serialVersionUID = 1L;

	public static LogInDialog logInDialog = new LogInDialog();
	
	public LogInDialog() {
		
		setLayout(null);
		setSize(480, 270);
		setBackground(Theme.theme.getBG());
		setResizable(false);
		setLocationRelativeTo(null);
		setModalityType(ModalityType.APPLICATION_MODAL);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		
		initGUI();
	}
	
	JLabel label, loginLabel, passwordLabel, signinLabel;
	JTextField login, password;
	JButton logIn, signIn;
	public void initGUI() {
		
		label = new JLabel("Log In", JLabel.CENTER);
		loginLabel = new JLabel("Login:", JLabel.CENTER);
		passwordLabel = new JLabel("Password:", JLabel.CENTER);
		signinLabel = new JLabel("Don't have an account yet?", JLabel.RIGHT);
		
		login = new JTextField();
		password = new JTextField();
		
		logIn = new JButton("Log In");
		signIn = new JButton("Sign In");
		
		logIn.addActionListener(this);
		signIn.addActionListener(this);
		
		label.setBounds(5, 5, 470, 30);
		loginLabel.setBounds(25, 40, 50, 30);
		login.setBounds(90, 40, 350, 30);
		passwordLabel.setBounds(20, 75, 60, 30);
		password.setBounds(90, 75, 350, 30);
		logIn.setBounds(190, 110, 100, 30);
		signinLabel.setBounds(40, 180, 300, 30);
		signIn.setBounds(350, 180, 90, 30);
		
		add(label);
		add(loginLabel);
		add(login);
		add(passwordLabel);
		add(password);
		add(logIn);
		add(signinLabel);
		add(signIn);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		Object o =e.getSource();
		
		if(o == logIn) {
			
			System.out.println("Logged in");
			dispose();
		}
		
		if(o == signIn) {
			
			RunASP.frame.mainPanel.removeAll();
			RunASP.frame.mainPanel.revalidate();
			RunASP.frame.validate();
			RunASP.frame.repaint();
			
			RunASP.frame.mainPanel.add(SignInPanel.signInPanel);
			
			dispose();
		}
	}
}
