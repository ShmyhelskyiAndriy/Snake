package Lab1;

import java.util.ArrayList;

public class Controller extends Thread {
	 ArrayList<ArrayList<DatBoard>> Squares = new ArrayList<ArrayList<DatBoard>>();
	 Tuple headPos;
	 int sizeSnake = 3 ;
	 long speed = 100;
	 public static int dirSnake ;

	 ArrayList<Tuple> pos = new ArrayList<Tuple>();
	 Tuple apple;

	 Controller(Tuple positionDepart){
		Squares= Window.Grid;

		headPos=new Tuple(positionDepart.x,positionDepart.y);
		dirSnake = 1;

		Tuple headSnakePos = new Tuple(headPos.getX(),headPos.getY());
		pos.add(headSnakePos);

		apple= new Tuple(Window.height-1, Window.width-1);
		spawnFood(apple);

	 }

	 public void run() {
		 while(true){
			 moveIn(dirSnake);
			 checkCollision();
			 moveEx();
			 deleteTail();
			 pauser();
		 }
	 }
	 

	 void pauser(){
		 try {
				sleep(speed);
		 } catch (InterruptedException e) {
				e.printStackTrace();
		 }
	 }
	 

	void checkCollision() {
		 Tuple posCritique = pos.get(pos.size() - 1);
		 for(int i = 0; i <= pos.size() - 2; i++){
			 boolean biteItself = posCritique.getX() == pos.get(i).getX() && posCritique.getY() == pos.get(i).getY();
			 if (biteItself){
				stopTheGame();
			 }
		 }
		 boolean eat = posCritique.getX() == apple.y && posCritique.getY() == apple.x;
		 if (eat){
			 System.out.println("Смаколик!");
			 sizeSnake = sizeSnake + 1;
			 apple = getVal();

			 spawnFood(apple);
		 }
	}
	void stopTheGame(){
		 System.out.println("ДТП! \n");
		 while(true){
			 pauser();
		 }
	}

	void spawnFood(Tuple foodPositionIn){
		 Squares.get(foodPositionIn.x).get(foodPositionIn.y).lightMeUp(1);
	}
	Tuple getVal(){
		 Tuple p;
		 int ranX = (int) (Math.random() * 19);
		 int ranY = (int) (Math.random() * 19);
		 p = new Tuple(ranX,ranY);
		 for(int i = 0; i <= pos.size() - 1; i++){
			 if(p.getY() == pos.get(i).getX() && p.getX() == pos.get(i).getY()){
				 ranX = (int) (Math.random() * 19);
				 ranY = (int) (Math.random() * 19);
				 p = new Tuple(ranX,ranY);
				 i = 0;
			 }
		 }
		 return p;
	}

	void moveIn(int dir){
		 switch(dir){
			 case 4:
				 headPos.СhangeData(headPos.x,(headPos.y + 1) %20);
				 pos.add(new Tuple(headPos.x,headPos.y));
		 		 break;
		 	 case 3:
				 if(headPos.y - 1 < 0){
					 headPos.СhangeData(headPos.x,19);
				 }
		 		 else{
					  headPos.СhangeData(headPos.x,Math.abs(headPos.y - 1) %20);
		 		 }
				 pos.add(new Tuple(headPos.x,headPos.y));
		 		 break;
		 	 case 2:
		 		  if(headPos.x - 1 < 0){
					 headPos.СhangeData(19,headPos.y);
		 		  }
		 		  else{
					 headPos.СhangeData(Math.abs(headPos.x - 1) %20,headPos.y);
		 		  }
		 		  pos.add(new Tuple(headPos.x,headPos.y));
				  break;
		 	 case 1:
				  headPos.СhangeData(Math.abs(headPos.x + 1) %20,headPos.y);
				  pos.add(new Tuple(headPos.x,headPos.y));
		 		  break;
		 }
	}

	void moveEx(){
		for(Tuple t : pos){
			int y = t.getX();
			int x = t.getY();
			Squares.get(x).get(y).lightMeUp(0);
		}
	}

	private void deleteTail(){
		int cmpt = sizeSnake;
		for(int i = pos.size() - 1; i >= 0; i--){
			if(cmpt == 0){
				Tuple t = pos.get(i);
				Squares.get(t.y).get(t.x).lightMeUp(2);
			}
			else{
				cmpt--;
			}
		}
		cmpt = sizeSnake;
		for(int i = pos.size() - 1; i >= 0; i--){
			if(cmpt == 0){
				pos.remove(i);
			}
			else{
				cmpt--;
			}
		}
	}
}
