package Lab1;

import java.awt.Color;
import javax.swing.JPanel;

public class Board extends JPanel{

	public Board(Color d){
		this.setBackground(d);
	}

	void ChangeColor(Color d){
		this.setBackground(d);
		this.repaint();
	}
	
}

