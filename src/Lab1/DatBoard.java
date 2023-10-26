package Lab1;

import Lab1.Board;

import java.util.ArrayList;
import java.awt.Color;

public class DatBoard {

	ArrayList<Color> C =  new ArrayList<Color>();
	int color;
	Board square;
	public DatBoard(int col){

		C.add(Color.green);
		C.add(Color.red);
		C.add(Color.gray);
		color=col;
		square = new Board(C.get(color));
	}
	public void lightMeUp(int c){
		square.ChangeColor(C.get(c));
	}
}
