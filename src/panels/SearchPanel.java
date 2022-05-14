package panels;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

import gettersAndSetters.Theme;

public class SearchPanel extends JPanel implements ActionListener{

	/**
	 * CREATING PANEL WITH SEARCH BOX AND BUTTON
	 * ALSO WITH LOG IN/SIGN IN BUTTON
	 */
	
	private static final long serialVersionUID = 1L;

	public static SearchPanel searchPanel = new SearchPanel();
	
	public SearchPanel() {
		
		setLayout(null);
		setPreferredSize(new Dimension(1420, 50));
		setBackground(Theme.theme.getBG());
		setBorder(BorderFactory.createEtchedBorder());
		
		initGUI();
	}
	
	JTextField searchField;
	JButton search, logInSignIn;
	public void initGUI() {
		removeAll();
		revalidate();
		
		searchField = new JTextField();
		search = new JButton("Search");
		logInSignIn = new JButton("Log in/Sign in");
		
		searchField.setBounds(10, 10, 400, 30);
		search.setBounds(420, 10, 100, 30);
		logInSignIn.setBounds(1210, 10, 200, 30);
		
		
		
		add(searchField);
		add(search);
		add(logInSignIn);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		
		Object o = e.getSource();
		
		if(o == search) {
			
		}
		
		if(o == logInSignIn) {
			
		}
	}
}
