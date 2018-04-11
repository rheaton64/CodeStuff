package random;

import java.util.Random;

import TurtleGraphics.*;

public class randomStuff {

	public static void main(String[] args) {
		Pen p = new StandardPen();
		drawSq(p, 10, -50, 10);
	}
	static private void drawSq(Pen p, int x, int y, int s){
		p.up();
		p.move(y);
		p.turn(-90);
		p.move(x);
		p.turn(-90);
		p.down();
		for(int i = 1; i <= 4; i++){
			p.move(s);
			p.turn(90);
		}
	}
}
