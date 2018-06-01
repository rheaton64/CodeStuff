package Minesweeper;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

//Ryan Heaton
//Board class made up of cells that runs the game

public class Board extends JFrame{
	//Main method to run the program
	public static void main(String[] args) {
		Board board = new Board(9);
	}
	
	//Instance variables
	private MineCell[][] panel;
	private int size;
	
	public Board(int size){
		//Initialize instance variables
		this.size = size;
		panel = new MineCell[size][size];
		
		//Initialize Frame
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(0,0,603,603);
		
		//Create GridLayout
		JPanel grid = new JPanel();
		grid.setLayout(new GridLayout(size,size));
		
		//Fill panel array with cells
		for(int r = 0;r < size;r++){
			for(int c = 0;c < size;c++){ 
				panel[r][c] = new MineCell(size);
				panel[r][c].repaint();
			}
		}
		
		//Fill grid with cells
		for(int x = 0;x < size;x++){
			for(int y = 0;y < size;y++){
				grid.add(panel[x][y]);
			}
		}
		
		add(grid);
		setMines(10);
		for(int r = 0;r < size;r++){
			for(int c = 0;c < size;c++){
				panel[r][c].setLabel(getAdjMines(r,c), r, c);
			}
		}
		repaint();
		while(true){
			System.out.print("");
			if(!MineCell.clear.equals("")){
				System.out.println("hi");
				int r = Integer.parseInt(MineCell.clear.substring(0,1));
				int c = Integer.parseInt(MineCell.clear.substring(1));
				MineCell.clear = "";
				clearTiles(r,c);
			}	
		}
		
	}
	
	//Method to set the mines
	//num = number of mines
	public void setMines(int num){
		int[] coords = new int[2];
		Random rand = new Random();
		boolean set = false;
		for(int i = 0; i < num; i ++){
			while(!set){
				coords[0] = rand.nextInt(size);
				coords[1] = rand.nextInt(size);
				if(!panel[coords[0]][coords[1]].isMine()){
					panel[coords[0]][coords[1]].setMine();
					set = true;
				}
			}
			set = false;
		}
	}
	//Gets number of adjacent mines, could probably be improved
	public int getAdjMines(int r, int c){
		int mines = 0;
		if(r == 0){
			if(c == 0){
				if(panel[0][1].isMine())
					mines++;
				if(panel[1][0].isMine())
					mines++;
				if(panel[1][1].isMine())
					mines++;
			}
			else if(c == size-1){
				if(panel[0][size-2].isMine())
					mines++;
				if(panel[1][size-2].isMine())
					mines++;
				if(panel[1][size-1].isMine())
					mines++;
			}
			else{
				if(panel[0][c-1].isMine())
					mines++;
				if(panel[1][c-1].isMine())
					mines++;
				if(panel[1][c].isMine())
					mines++;
				if(panel[1][c+1].isMine())
					mines++;
				if(panel[0][c+1].isMine())
					mines++;
			}
		}
		else if(c == 0){
			if(r == size-1){
				if(panel[size-2][0].isMine())
					mines++;
				if(panel[size-2][1].isMine())
					mines++;
				if(panel[size-1][1].isMine())
					mines++;
			}
			else{
				if(panel[r-1][0].isMine())
					mines++;
				if(panel[r-1][1].isMine())
					mines++;
				if(panel[r][1].isMine())
					mines++;
				if(panel[r+1][1].isMine())
					mines++;
				if(panel[r+1][0].isMine())
					mines++;
			}
		}
		else if(r == size-1){
			if(c == size-1){
				if(panel[size-2][size-1].isMine())
					mines++;
				if(panel[size-2][size-2].isMine())
					mines++;
				if(panel[size-1][size-2].isMine())
					mines++;
			}
			else{
				if(panel[size-1][c-1].isMine())
					mines++;
				if(panel[size-2][c-1].isMine())
					mines++;
				if(panel[size-2][c].isMine())
					mines++;
				if(panel[size-2][c+1].isMine())
					mines++;
				if(panel[size-1][c+1].isMine())
					mines++;
			}
		}
		else if(c == size-1){
			if(panel[r-1][size-1].isMine())
				mines++;
			if(panel[r-1][size-2].isMine())
				mines++;
			if(panel[r][size-2].isMine())
				mines++;
			if(panel[r+1][size-2].isMine())
				mines++;
			if(panel[r+1][size-1].isMine())
				mines++;
		}
		else{
			if(panel[r-1][c-1].isMine())
				mines++;
			if(panel[r-1][c].isMine())
				mines++;
			if(panel[r-1][c+1].isMine())
				mines++;
			if(panel[r][c-1].isMine())
				mines++;
			if(panel[r][c+1].isMine())
				mines++;
			if(panel[r+1][c-1].isMine())
				mines++;
			if(panel[r+1][c].isMine())
				mines++;
			if(panel[r+1][c+1].isMine())
				mines++;
		}
		return mines;
	}
	
	public void clearTiles(int r, int c){
		if(r == 0){
			if(c == 0){
				if(panel[0][1].getLabel() == 0){
					System.out.print("1");
					panel[0][1].setImage();
					clearTiles(0, 1);
				}if(panel[1][0].getLabel() == 0){
					System.out.print("2");
					panel[1][0].setImage();
					clearTiles(1, 0);
				}if(panel[1][1].getLabel() == 0){
					System.out.print("3");
					panel[1][1].setImage();
					clearTiles(1, 1);
				}}
			else if(c == size-1){
				if(panel[0][size-2].getLabel() == 0){
					System.out.print("found");
					panel[0][size-2].setImage();
					clearTiles(0, size-2);
				}	if(panel[1][size-2].getLabel() == 0){
					System.out.print("found");
					panel[1][size-2].setImage();
					clearTiles(1, size-2);
				}	if(panel[1][size-1].getLabel() == 0){
					System.out.print("found");
					panel[1][size-1].setImage();
					clearTiles(1, size-1);
				}}
			else{
				if(panel[0][c-1].getLabel() == 0){
					System.out.print("found");
					panel[0][c-1].setImage();
					clearTiles(0, c-1);
				}if(panel[1][c-1].getLabel() == 0){
					System.out.print("found");
					panel[1][c-1].setImage();
					clearTiles(1, c-1);
				}if(panel[1][c].getLabel() == 0){
					System.out.println("found");
					panel[1][c].setImage();
					clearTiles(1, c);
				}	if(panel[1][c+1].getLabel() == 0){
					System.out.print("found");
					panel[1][c+1].setImage();
					clearTiles(1, c+1);
				}if(panel[0][c+1].getLabel() == 0){
					System.out.print("found");
					panel[1][c-1].setImage();
					clearTiles(0, c+1);
			}}
		}
		else if(c == 0){
			if(r == size-1){
				if(panel[size-2][0].getLabel() == 0)
					System.out.print("found");
				if(panel[size-2][1].getLabel() == 0)
					System.out.print("found");
				if(panel[size-1][1].getLabel() == 0)
					System.out.print("found");
			}
			else{
				if(panel[r-1][0].getLabel() == 0)
					System.out.print("found");
				if(panel[r-1][1].getLabel() == 0)
					System.out.print("found");
				if(panel[r][1].getLabel() == 0)
					System.out.print("found");
				if(panel[r+1][1].getLabel() == 0)
					System.out.print("found");
				if(panel[r+1][0].getLabel() == 0)
					System.out.print("found");
			}
		}
		else if(r == size-1){
			if(c == size-1){
				if(panel[size-2][size-1].getLabel() == 0)
					System.out.print("found");
				if(panel[size-2][size-2].getLabel() == 0)
					System.out.print("found");
				if(panel[size-1][size-2].getLabel() == 0)
					System.out.print("found");
			}
			else{
				if(panel[size-1][c-1].getLabel() == 0)
					System.out.print("found");
				if(panel[size-2][c-1].getLabel() == 0)
					System.out.print("found");
				if(panel[size-2][c].getLabel() == 0)
					System.out.print("found");
				if(panel[size-2][c+1].getLabel() == 0)
					System.out.print("found");
				if(panel[size-1][c+1].getLabel() == 0)
					System.out.print("found");
			}
		}
		else if(c == size-1){
			if(panel[r-1][size-1].getLabel() == 0)
				System.out.print("found");
			if(panel[r-1][size-2].getLabel() == 0)
				System.out.print("found");
			if(panel[r][size-2].getLabel() == 0)
				System.out.print("found");
			if(panel[r+1][size-2].getLabel() == 0)
				System.out.print("found");
			if(panel[r+1][size-1].getLabel() == 0)
				System.out.print("found");
		}
		else{
			if(panel[r-1][c-1].getLabel() == 0)
				System.out.print("found");
			if(panel[r-1][c].getLabel() == 0)
				System.out.print("found");
			if(panel[r-1][c+1].getLabel() == 0)
				System.out.print("found");
			if(panel[r][c-1].getLabel() == 0)
				System.out.print("found");
			if(panel[r][c+1].getLabel() == 0)
				System.out.print("found");
			if(panel[r+1][c-1].getLabel() == 0)
				System.out.print("found");
			if(panel[r+1][c].getLabel() == 0)
				System.out.print("found");
			if(panel[r+1][c+1].getLabel() == 0)
				System.out.print("found");
		}
	}
	
	public static void clear(){
		
	}
}
