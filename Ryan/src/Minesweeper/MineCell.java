package Minesweeper;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

//Ryan Heaton
//Cell class that makes up grid on the Board


public class MineCell extends JPanel implements MouseListener{
	//Instace variables
	private int boardSize;
	private int cellSize;
	private Color color;
	private boolean isMine;
	private Image i;
	private boolean init;
	private int label;
	private String coord;
	public static String clear = "";
	
	public MineCell(int size){
		boardSize = size;
		//Side length of board / Number of 
		cellSize = 603/boardSize;
		isMine = false;
		color = Color.gray;
		init = true;
		label = 3;
		addMouseListener(this);
	}
	
	//Paint method to deal with setting the images
	public void paint(Graphics g){
		if(init){
			setSpaces();
			init = false;
		}
		g.drawImage(i, 0, 0, null);
	}
	
	public void setMine(){
		isMine = true;
	}
	
	public boolean isMine(){
		return isMine;
	}
	
	public void setLabel(int label, int r, int c){
		this.label = label;
		coord = "" + r + c;
	}
	
	public int getLabel(){
		return label;
	}
	
	private void setSpaces(){
		try {
			if(!isMine)
				i = ImageIO.read(new File("src/Minesweeper/Blank.png"));
			else
				i = ImageIO.read(new File("src/Minesweeper/BlankMine.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void setImage(){
		try {
				if(!isMine)
					switch(label){
					case 0: i = ImageIO.read(new File("src/Minesweeper/BlankSpace.png"));
					clear = coord;
					break;
					case 1: i = ImageIO.read(new File("src/Minesweeper/One.png"));
					break;
					case 2: i = ImageIO.read(new File("src/Minesweeper/Two.png"));
					break;
					case 3: i = ImageIO.read(new File("src/Minesweeper/Three.png"));
					break;
					case 4: i = ImageIO.read(new File("src/Minesweeper/Four.png"));
					break;
					case 5: i = ImageIO.read(new File("src/Minesweeper/Five.png"));
					break;
					case 6: i = ImageIO.read(new File("src/Minesweeper/Six.png"));
					break;
					case 7: i = ImageIO.read(new File("src/Minesweeper/Seven.png"));
					break;
					case 8: i = ImageIO.read(new File("src/Minesweeper/Eight.png"));
					break;
				}
				//Hit a mine
				else{
					i = ImageIO.read(new File("src/Minesweeper/HitMine.png"));
				}
			}
			catch (IOException e) {
				e.printStackTrace();
		}
		repaint();
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		try {
			//Places flag
			if(e.isControlDown()){
				i = ImageIO.read(new File("src/Minesweeper/Flag.png"));
			}
			else{
				//Tests for label to create number
				if(!isMine)
					switch(label){
					case 0: i = ImageIO.read(new File("src/Minesweeper/BlankSpace.png"));
					clear = coord;
					break;
					case 1: i = ImageIO.read(new File("src/Minesweeper/One.png"));
					break;
					case 2: i = ImageIO.read(new File("src/Minesweeper/Two.png"));
					break;
					case 3: i = ImageIO.read(new File("src/Minesweeper/Three.png"));
					break;
					case 4: i = ImageIO.read(new File("src/Minesweeper/Four.png"));
					break;
					case 5: i = ImageIO.read(new File("src/Minesweeper/Five.png"));
					break;
					case 6: i = ImageIO.read(new File("src/Minesweeper/Six.png"));
					break;
					case 7: i = ImageIO.read(new File("src/Minesweeper/Seven.png"));
					break;
					case 8: i = ImageIO.read(new File("src/Minesweeper/Eight.png"));
					break;
				}
				//Hit a mine
				else{
					i = ImageIO.read(new File("src/Minesweeper/HitMine.png"));
				}
			}
		} catch (IOException ex) {
			ex.printStackTrace();
		}
		repaint();
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}
