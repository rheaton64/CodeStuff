package Recursion;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Blink extends JFrame{

	public static void main(String[] args) {
		Blink blink = new Blink();
	}
	public static Color c = Color.red;
	public static boolean draw = false;
	public Blink(){
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(0, 0, 1920, 1080);
		JPanel panel = new JPanel(){
			public void paint(Graphics g){
				if(c.equals(Color.red)){
					c = Color.blue;
				}
				else{
					c = Color.red;
				}
				try {
					Thread.sleep(1);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				g.setColor(c);
				g.fillRect(0, 0, 1920, 1080);
			}
		};
		add(panel);
		while(true){
			repaint();
		}
	}
}


