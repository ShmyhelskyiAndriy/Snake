package Lab1;

import java.awt.GridLayout;
import java.awt.event.KeyListener;
import java.util.ArrayList;

import javax.swing.JFrame;

class Window extends JFrame{
	private static final long serialVersionUID = -2542001418764869760L;
	public static ArrayList<ArrayList<DatBoard>> Grid;
	public static int width = 20;
	public static int height = 20;
	public Window(){

		Grid = new ArrayList<ArrayList<DatBoard>>();
		ArrayList<DatBoard> data;

		for(int i = 0; i < width; i++){
			data = new ArrayList<DatBoard>();
			for(int j = 0; j < height; j++){
				DatBoard c = new DatBoard(2);
				data.add(c);
			}
			Grid.add(data);
		}


		getContentPane().setLayout(new GridLayout(20,20,0,0));

		for(int i = 0; i < width; i++){
			for(int j = 0; j < height; j++){
				getContentPane().add(Grid.get(i).get(j).square);
			}
		}

		Tuple position = new Tuple(10,10);

		Controller c = new Controller(position);

		c.start();

		this.addKeyListener((KeyListener) new KeyIn());
	}
}
