package Lab1;

import Lab1.Controller;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

 public class KeyIn extends KeyAdapter{
 	
	 public void keyPressed(KeyEvent e){
		 switch (e.getKeyCode()) {
			 case 39:
				 if(Controller.dirSnake != 2)
					 Controller.dirSnake = 1;
				 break;
		     case 38:
				 if(Controller.dirSnake != 4)
					 Controller.dirSnake = 3;
				 break;
			 case 37:
				 if(Controller.dirSnake != 1)
					 Controller.dirSnake = 2;
				 break;
		     case 40:
				 if(Controller.dirSnake != 3)
					 Controller.dirSnake = 4;
				 break;
			 default:
				break;
		 }
	 }
 }
