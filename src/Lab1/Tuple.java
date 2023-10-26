package Lab1;

public class Tuple {
	public int x;
	public  int y;
	public Tuple(int x, int y) {
		this.x = x;
	    this.y = y; 
	  }
	public void СhangeData(int x, int y){
		this.x = x;
		this.y = y;
	}
	public int getX(){
		return x;
	}
	public int getY(){
		return y;
	}
} 