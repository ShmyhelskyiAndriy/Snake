package Lab1;

import javax.swing.JFrame;

public class Main {

	public static void main(String[] args) {

		Window g1= new Window();

		g1.setTitle("Snake");
		g1.setSize(400,400);
		g1.setVisible(true);
		g1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
