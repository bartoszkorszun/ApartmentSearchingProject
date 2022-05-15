package panels;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import dialogs.LogInDialog;
import gettersAndSetters.Theme;
import mainPackage.RunASP;

public class SignInPanel extends JPanel implements ActionListener{

	/**
	 * CREATING SIGN IN FORM
	 */
	
	private static final long serialVersionUID = 1L;

	public static SignInPanel signInPanel = new SignInPanel();
	
	public SignInPanel() {
		
		setLayout(null);
		setBackground(Theme.theme.getBG());
		setPreferredSize(new Dimension(1420, 765));
		setBorder(BorderFactory.createEtchedBorder());
		
		initGUI();
	}
	
	JButton back, signInButton;
	JLabel signInTitle, surname, name, email, createLogin, createPassword, phone;
	JTextField surnameArea, nameArea, emailArea, loginArea, passwordArea, phoneArea;
	public void initGUI() {
		removeAll();
		revalidate();
		
		back = new JButton("Back");
		signInButton = new JButton("Sign In");
		
		signInTitle = new JLabel("Sign In", JLabel.CENTER);
		surname = new JLabel("Surname:", JLabel.CENTER);
		name = new JLabel("Name:", JLabel.CENTER);
		email = new JLabel("E-mail:", JLabel.CENTER);
		createLogin = new JLabel("Login:", JLabel.CENTER);
		createPassword = new JLabel("Password:", JLabel.CENTER);
		phone = new JLabel("Phone number:", JLabel.CENTER);
		
		surnameArea = new JTextField();
		nameArea = new JTextField();
		emailArea = new JTextField();
		loginArea = new JTextField();
		passwordArea = new JTextField();
		phoneArea = new JTextField();
		
		back.addActionListener(this);
		signInButton.addActionListener(this);
		
		back.setBounds(5, 5, 100, 30);
		signInTitle.setBounds(660, 100, 100, 50);
		surname.setBounds(455, 160, 100, 50);
		surnameArea.setBounds(565, 170, 400, 30);
		name.setBounds(455, 220, 100, 50);
		nameArea.setBounds(565, 230, 400, 30);
		email.setBounds(455, 280, 100, 50);
		emailArea.setBounds(565, 290, 400, 30);
		createLogin.setBounds(455, 340, 100, 50);
		loginArea.setBounds(565, 350, 400, 30);
		createPassword.setBounds(455, 400, 100, 50);
		passwordArea.setBounds(565, 410, 400, 30);
		phone.setBounds(455, 460, 100, 50);
		phoneArea.setBounds(565, 470, 400, 30);
		signInButton.setBounds(865, 530, 100, 30);
		
		add(back);
		add(signInTitle);
		add(surname);
		add(surnameArea);
		add(name);
		add(nameArea);
		add(email);
		add(emailArea);
		add(createLogin);
		add(loginArea);
		add(createPassword);
		add(passwordArea);
		add(phone);
		add(phoneArea);
		add(signInButton);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		Object o = e.getSource();
		
		if(o == back) {
			
			RunASP.frame.initGUI();
			LogInDialog.logInDialog.setVisible(true);
		}
		
		if(o == signInButton) {
			
			System.out.println("Account created");
		}
	}
}
