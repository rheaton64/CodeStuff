package Minesweeper;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

//Ryan Heaton
//Minesweeper
//Board class made up of cells that runs the game

public class Board extends JFrame{

	//Boolean to reset game
	private static boolean isReset;

	//Main method to run the program
	public static void main(String[] args) {
		isReset = false;
		while(true){
			isReset = false;
			//Creates the board (size, number of mines)
			Board board = new Board(9, 10);
			while(!isReset){

			}
		}
	}

	//Instance variables

	//2D-Array to store grid of cells
	private MineCell[][] panel;
	//Length of one side of the grid, should be 9 until changes are made to images
	private int size;
	//Number of mines in the grid, recommened 10 until above changes are made, can't be more than size^2
	private int numMines;
	//Counter for flags on the board
	private int flagCounter;

	//Constructor for the board
	public Board(int size, int numMines){
		//Initialize instance variables
		this.size = size;
		panel = new MineCell[size][size];
		this.numMines = numMines;
		flagCounter = 0;

		//Initialize Frame
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(0,0,603,603+154);
		setResizable(false);

		//Create grid panel
		JPanel grid = new JPanel();
		grid.setLayout(new GridLayout(size,size));
		grid.setBounds(0, 134, 603, 603);

		//Fill panel array with cells
		for(int r = 0;r < size;r++){
			for(int c = 0;c < size;c++){ 
				panel[r][c] = new MineCell(size);
				panel[r][c].repaint();
			}
		}

		//Fill grid with cells
		for(int r = 0;r < size;r++){
			for(int c = 0;c < size;c++){
				grid.add(panel[r][c]);
			}
		}

		//Add menu panel
		JPanel menu = new JPanel();
		menu.setBackground(Color.gray);
		menu.setBounds(0, 0, 603, 67);
		menu.setLayout(null);

		//Label for remaining mines
		JLabel mines = new JLabel("Mines Left: "+(numMines-flagCounter));
		mines.setFont(new Font("Comic Sans", 0, 25));
		mines.setBounds(0, 105, 200, 20);
		menu.add(mines);

		//Button to reset game
		JButton reset = new JButton();
		reset.setBounds(268, 0, 67, 67);
		reset.setBackground(Color.white);
		reset.setText("Reset");
		reset.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				//Resets and reassigns all the cells
				for(int r = 0;r < size;r++){
					for(int c = 0;c < size;c++){
						panel[r][c].reset();
					}
				}
				setMines(numMines);
				for(int r = 0;r < size;r++){
					for(int c = 0;c < size;c++){
						panel[r][c].setLabel(getAdjMines(r,c), r, c);
					}
				}
			}
		});

		menu.add(reset);

		//Adds panels to the frame
		add(grid);
		add(menu);

		//Generates mines and gives each cell a label
		setMines(this.numMines);
		for(int r = 0;r < size;r++){
			for(int c = 0;c < size;c++){
				panel[r][c].setLabel(getAdjMines(r,c), r, c);
			}
		}

		//Game loop to test for certain events
		while(true){
			//Boolean if clearing cells should start
			boolean clearing = true;
			System.out.print("");
			//Clears groups of cells
			if(!MineCell.clear.equals("") && clearing){
				System.out.println("hi");
				int r = Integer.parseInt(MineCell.clear.substring(0,1));
				int c = Integer.parseInt(MineCell.clear.substring(1));
				MineCell.clear = "";
				clearTiles(r,c);
				for(int nR = 0;nR < size;nR++){
					for(int nC = 0;nC < size;nC++){
						panel[nR][nC].hasBeenCleared = false;
						//panel[nR][nC].fixCleared();
					}
				}
				clearing = false;
				MineCell.clear = "";
			}	

			//Win condition
			if(MineCell.spacesCleared == size*size-this.numMines){
				System.out.println("You did it");
				MineCell.spacesCleared++;
			}

			//Loss Condition
			if(MineCell.lost){
				for(int r = 0;r < size;r++){
					for(int c = 0;c < size;c++){
						if(panel[r][c].isMine()){
							panel[r][c].setImage();
						}
					}
				}
				System.out.println("You lost!");
				MineCell.lost = false;
			}

			//Keeps track of the number of flags and displays remaining mines
			if(MineCell.numFlags != flagCounter){
				flagCounter = MineCell.numFlags;
				mines.setText("Mines Left: "+(numMines-flagCounter));
			}
			
			//Counts number of spaces cleared
			if(MineCell.shouldCount){
				MineCell.spacesCleared = 0;
				for(int r = 0;r < size;r++){
					for(int c = 0;c < size;c++){
							if(panel[r][c].isClear())
								MineCell.spacesCleared++;
					}
				}
				System.out.println("Spaces Cleared: "+MineCell.spacesCleared);
				MineCell.shouldCount = false;
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

	//Resets the game
	public void resetGame(){

	}

	//Gets number of adjacent mines, could probably be improved
	//r = row of cell, c = column of cell
	public int getAdjMines(int r, int c){
		int testR = 0;
		int testC = 0;
		boolean check = true;
		int mines = 0;
		for(int i = 0; i < 8; i++){
			check = true;
			switch(i){
			case 0: testR=r+1;testC=c+1;break;
			case 1: testR=r;testC=c+1;break;
			case 2: testR=r-1;testC=c+1;break;
			case 3: testR=r-1;testC=c;break;
			case 4: testR=r-1;testC=c-1;break;
			case 5: testR=r;testC=c-1;break;
			case 6: testR=r+1;testC=c-1;break;
			case 7: testR=r+1;testC=c;break;
			}
			if(testR < 0 || testR > size-1 || testC < 0 || testC > size-1){
				check = false;
			}
			if(check){
				if(panel[testR][testC].isMine())
					mines++;
			}
		}
		return mines;
	}
	
	//Clears groups of empty cells
	//r = row of cell, c = column of cell
	public void clearTiles(int r, int c){
		panel[r][c].hasBeenCleared = true;
		int testR = 0;
		int testC = 0;
		boolean check = true;
		int mines = 0;
		for(int i = 0; i < 8; i++){
			check = true;
			switch(i){
			case 0: testR=r+1;testC=c+1;break;
			case 1: testR=r;testC=c+1;break;
			case 2: testR=r-1;testC=c+1;break;
			case 3: testR=r-1;testC=c;break;
			case 4: testR=r-1;testC=c-1;break;
			case 5: testR=r;testC=c-1;break;
			case 6: testR=r+1;testC=c-1;break;
			case 7: testR=r+1;testC=c;break;
			}
			if(testR < 0 || testR > size-1 || testC < 0 || testC > size-1){
				check = false;
			}
			if(check){
				if(!panel[testR][testC].hasBeenCleared){
					panel[testR][testC].setImage();
					if(panel[testR][testC].getLabel() == 0){
						panel[testR][testC].hasBeenCleared = true;
						clearTiles(testR, testC);
					}
				}
			}
		}
	}
}
