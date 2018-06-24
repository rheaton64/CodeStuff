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
//Minesweeper
//Cell class that makes up grid on the Board


public class MineCell extends JPanel implements MouseListener{
	//Instace variables

	//length of board in cells, parameter of constructor
	private int boardSize;
	//Size of each cell in pixels
	private int cellSize;
	//Is the cell a mine?
	private boolean isMine;
	//Image to be shown on cell
	private Image i;
	//Is this cell being initialized?
	private boolean init;
	//Label of the cell, number of adj mines
	private int label;
	//Coordinates of the cell on the board
	private String coord;
	//Has this cell been cleared?
	private boolean isClear;
	//Has the cell been flagged?
	private boolean isFlagged;
	//Has this cell been revealed?
	private boolean isRevealed;
	//WIP String for clearing tiles
	public static String clear = "";
	//How many spaces have been cleared on the board?
	public static int spacesCleared;
	//Did you lose the game?
	public static boolean lost;
	//Number of flags on the board
	public static int numFlags;
	//Checks if this has been cleared - used during clears
	public boolean hasBeenCleared;
	//Should the cleared spaces be counted?
	public static boolean shouldCount;

	//Constructor for the cell
	public MineCell(int size){
		boardSize = size;
		//Pixel length of board / Cell length of board 
		cellSize = 603/boardSize;
		isMine = false;
		init = true;
		label = 0;
		spacesCleared = 0;
		isClear = false;
		isFlagged = false;
		lost = false;
		isRevealed = false;
		shouldCount = false;
		addMouseListener(this);
	}

	//Paint method to set the images
	public void paint(Graphics g){
		//If the cells are being initiated
		if(init){
			setSpace();
			init = false;
		}
		//Draws the correct image
		g.drawImage(i, 0, 0, null);
	}

	//Sets this cell as a mine
	public void setMine(){
		isMine = true;
	}

	//Is the cell a mine?
	public boolean isMine(){
		return isMine;
	}

	//Sets the label and coords of the cell
	public void setLabel(int label, int r, int c){
		this.label = label;
		coord = "" + r + c;
	}

	//Gets the cell's label
	public int getLabel(){
		return label;
	}
	
	//Has this cell been counted as clear?
	public boolean isClear(){
		return isClear;
	}
	
	//Fixes the count of cleared cells
	public void fixCleared(){
		if(isRevealed){
			spacesCleared++;
			System.out.println("Spaces cleared: "+spacesCleared);
			isRevealed = false;
			isClear = true;
		}
	}
	
	//Resets the cell
	public void reset(){
		isMine = false;
		init = true;
		label = 0;
		spacesCleared = 0;
		isClear = false;
		isFlagged = false;
		lost = false;
		numFlags = 0;
		repaint();
		
	}

	//Sets this cell as an unrevealed space
	private void setSpace(){
		try {
			i = ImageIO.read(new File("src/Minesweeper/Blank.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	//Sets the image of the cell based on the label
	public void setImage(){
		try {
			//Didn't hit a mine
			if(!isMine){
				//Hasn't been flagged
				if(!isFlagged){
					isClear = true;
					isRevealed = true;
					//Reveals number based on label
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
				}
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

	//Called if you clicked on this cell
	@Override
	public void mousePressed(MouseEvent e) {
		try {
			//Toggles flag when control-clicked
			if(e.isControlDown() && !isClear){
				if(!isFlagged){
					i = ImageIO.read(new File("src/Minesweeper/Flag.png"));
					isFlagged = true;
					numFlags++;
				}
				else{
					i = ImageIO.read(new File("src/Minesweeper/Blank.png"));
					isFlagged = false;
					numFlags--;
				}
			}
			else{
				//Didn't hit a mine
				if(!isMine){
					//Increments spaces cleared if this space is being revealed
					if(!isClear){
						//spacesCleared++;
						//System.out.println("Spaces cleared: "+spacesCleared);
						isClear = true;
						//Stars clearing cells
						if(label == 0)
							clear = coord;
					}
					//Reveals number based on label
					switch(label){
					case 0: i = ImageIO.read(new File("src/Minesweeper/BlankSpace.png"));
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
					}}
				//Hit a mine
				else{
					i = ImageIO.read(new File("src/Minesweeper/HitMine.png"));
					//Sets the game to lost
					lost = true;
				}
			}
		} catch (IOException ex) {
			ex.printStackTrace();
		}
		repaint();
		shouldCount = true;
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
