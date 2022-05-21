package panels;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import org.json.JSONException;
import org.json.JSONObject;

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
	JLabel signInTitle, surname, name, email, createLogin, createPassword, phone, surnameError, nameError, emailError, loginError, passwordError, phoneError;
	JTextField surnameArea, nameArea, emailArea, loginArea, passwordArea, phoneArea;
	boolean sE = false, nE = false, eE = false, lE = false, paE = false, phE = false, isSE = false, isNE = false, isEE = false, isLE = false, isPaE = false, isPhE = false;
	
	public void initGUI() {
		removeAll();
		revalidate();
		validate();
		repaint();
		
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
			
			checkData();
		}
	}
	
	public void checkData() {
		
		if(surnameArea.getText().equals("")) {
			
			surnameError = new JLabel("This area can't be empty.", JLabel.LEFT);
			surnameError.setBackground(Theme.theme.getBG());
			surnameError.setForeground(Color.RED);
			surnameError.setBounds(970, 160, 200, 50);
			
			add(surnameError);
			isSE = true;
		}else {
			if(isSE) {
				remove(surnameError);
				isSE = false;
			}
			sE = true;
		}
		
		if(nameArea.getText().equals("")) {
			
			nameError = new JLabel("This area can't be empty.", JLabel.LEFT);
			nameError.setBackground(Theme.theme.getBG());
			nameError.setForeground(Color.RED);
			nameError.setBounds(970, 220, 200, 50);
			
			add(nameError);
			isNE = true;
		}else {
			if(isNE) {
				remove(nameError);
				isNE = false;
			}
			nE = true;
		}
		
		if(emailArea.getText().equals("")) {
			
			emailError = new JLabel("This area can't be empty.", JLabel.LEFT);
			emailError.setBackground(Theme.theme.getBG());
			emailError.setForeground(Color.RED);
			emailError.setBounds(970, 280, 200, 50);
			
			add(emailError);
			isEE = true;
		}else {
			if(isEE) {
				remove(emailError);
				isEE = false;
			}
			
			if(emailArea.getText().contains("@")) {
				eE = true;
			}else {
				emailError = new JLabel("Invalid e-mail adress.", JLabel.LEFT);
				emailError.setBackground(Theme.theme.getBG());
				emailError.setForeground(Color.RED);
				emailError.setBounds(970, 280, 200, 50);
				
				add(emailError);
				isEE = true;
			}
		}
		
		if(loginArea.getText().equals("")) {
			
			loginError = new JLabel("This area can't be empty.", JLabel.LEFT);
			loginError.setBackground(Theme.theme.getBG());
			loginError.setForeground(Color.RED);
			loginError.setBounds(970, 340, 200, 50);
			
			add(loginError);
			isLE = true;
		}else {
			if(isLE) {
				remove(loginError);
				isEE = false;
			}
			
			
			lE = true;
		}
		
		if(passwordArea.getText().equals("")) {
			
			passwordError = new JLabel("This area can't be empty.", JLabel.LEFT);
			passwordError.setBackground(Theme.theme.getBG());
			passwordError.setForeground(Color.RED);
			passwordError.setBounds(970, 400, 200, 50);
			
			add(passwordError);
			isPaE = true;
		}else {
			if(isPaE) {
				remove(passwordError);
				isPaE = false;
			}
			paE = true;
		}
		
		if(phoneArea.getText().equals("")) {
			phE = true;
		}else {
		
			System.out.println("Check if it is phone number");
		}
		
		if(sE && nE && eE && lE && paE && phE) {
			
			JSONObject jsonObject = new JSONObject();
			try {
				jsonObject.put("surname", surnameArea.getText());
				jsonObject.put("name", nameArea.getText());
				jsonObject.put("email", emailArea.getText());
				jsonObject.put("login", loginArea.getText());
				jsonObject.put("password", passwordArea.getText());
				if(phoneArea.getText() == "") {
					jsonObject.put("phone", "null");
				}else {
					jsonObject.put("phone", phoneArea.getText());
				}
				json.JSON.jsonArray.put(jsonObject);
			} catch (JSONException e1) {
				e1.printStackTrace();
			}
			
			try {
				BufferedWriter addToBase = new BufferedWriter(new FileWriter("C:/ProgramData/ASP/base.json", true));
				addToBase.append(jsonObject.toString());
				addToBase.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		revalidate();
		validate();
		repaint();
	}
}
