package panels;

import java.awt.Dimension;

import javax.swing.BorderFactory;
import javax.swing.JPanel;

import gettersAndSetters.Theme;

public class DetailsPanel extends JPanel{

	/**
	 * CREATING PANEL WITH DETAILS
	 */
	
	public static DetailsPanel detailsPanel = new DetailsPanel();
	
	private static final long serialVersionUID = 1L;

	public DetailsPanel() {
		
		setLayout(null);
		setPreferredSize(new Dimension(865, 710));
		setBackground(Theme.theme.getBG());
		setBorder(BorderFactory.createEtchedBorder());
		
		initGUI();
	}
	
	public void initGUI() {
		
		
	}
}
