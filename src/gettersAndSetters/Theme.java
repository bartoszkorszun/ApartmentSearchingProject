package gettersAndSetters;

import java.awt.Color;

public class Theme {

	Color background = Color.WHITE, foreground = Color.BLACK;
	
	public void setBG(Color bg) {
		
		background = bg;
	}
	
	public void setFG(Color fg) {
		
		foreground = fg;
	}
	
	public Color getBG() {
		
		return background;
	}
	
	public Color getFG() {
		
		return foreground;
	}
	
	public static Theme theme = new Theme();
}
