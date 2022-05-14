package mainPackage;

import javax.swing.JFrame;
import javax.swing.JPanel;

import gettersAndSetters.Theme;
import panels.SearchPanel;

public class ASPFrame extends JFrame{

	/**
	 * FRAME PROPERTIES
	 */
	
	private static final long serialVersionUID = 1L;
	public JPanel mainPanel;
	
	public ASPFrame() {
		
		setTitle("Apartment Search");
		setSize(1440, 810);
		setResizable(true);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		mainPanel = new JPanel();
		mainPanel.setBackground(Theme.theme.getBG());
		
		initGUI();
	}
	
	/*
	 * INITIALIZING GRAPHIC USER INTERFACE
	 */
	
	public void initGUI() {
		mainPanel.removeAll();
		mainPanel.revalidate();
		
		mainPanel.add(SearchPanel.searchPanel);
		
		add(mainPanel);
		validate();
		repaint();
	}
}
