package panels;

import java.awt.Dimension;

import javax.swing.BorderFactory;
import javax.swing.JPanel;

import gettersAndSetters.Theme;

public class ResultsPanel extends JPanel{

	/**
	 * CREATING PANEL ON WHICH THE SEARCHING RESULTS WILL BE SHOWN
	 */
	
	private static final long serialVersionUID = 1L;

	public static ResultsPanel resultsPanel = new ResultsPanel();
	
	public ResultsPanel() {
		
		setLayout(null);
		setPreferredSize(new Dimension(550, 710));
		setBackground(Theme.theme.getBG());
		setBorder(BorderFactory.createEtchedBorder());
		
		initGUI();
	}
	
	public void initGUI() {
		
		
	}
}
