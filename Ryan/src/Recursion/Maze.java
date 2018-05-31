package Recursion;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Maze extends JFrame{
	public static int size = 0;
	public static void main(String[] args) {
		String sizeString = JOptionPane.showInputDialog("Enter side length for maze");
		size  = Integer.parseInt(sizeString);
		System.out.println(size);
		Maze maze = new Maze();
	}
	//IF GRID SIZE IS CHANGED:
	//change out of bounds test + starting position test + clear inCell for loop
	Image mCat;
	public static int mPosX = 0;
	public static int mPosY;
	public static int i = 0;
	public static int x = 0;
	public static int y = 0;
	public static int i2 = 0;
	public static int d = 3;
	public static boolean inCell = false;
	public static Cell[][] panel;
	public static int[][] wasNum;
	public static boolean[][] wasThere;
	public Maze(){
		panel = new Cell[size][size];
		wasNum = new int[size][size];
		wasThere = new boolean[size][size];
		mPosY = size-1;
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(0, 0, 999, 999);
		JPanel grid = new JPanel();
		grid.setLayout(new GridLayout(size, size));
		for(x = 0;x < size;x++){
			for(y = 0;y < size;y++){
				System.out.println(x+" "+y);
				System.out.println(panel.length);
				panel[x][y] = new Cell(inCell);
				panel[x][y].repaint();
			}
		}

		for(int n3 = 0;n3 < size;n3++){
			for(int n4 = 0;n4 < size;n4++){
				grid.add(panel[n3][n4]);
			}
		}
		panel[size-1][0].setInCell(true);



		add(grid);
		setBounds(0, 0, 1000, 1000);

		boolean startPF = false;
		while(startPF == false){
			System.out.print("");
			if(panel[size-1][0].getStart() == true){
				startPF = true;
				while(scan == true){
					pathfinder(d);
					setBounds(0,0,999,999);
					setBounds(0,0,1000,1000);
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		}
	}
	public static boolean scan = true;
	public static int prio = 0;
	public static int pStart = 1;
	public static int pCycle= 0;
	public static int fFound = 0;
	public static boolean[] dTest = new boolean[4];
	public static boolean[] dFin = new boolean[4];
	public static void pathfinder(int d){
		if(panel[0][mPosX].getInCell() == true && d == 3){
			dTest[d] = false;
			d--;
		}
		if(d == 3){
			if(panel[mPosY-1][mPosX].getColor() == 1){
				dTest[d] = true;
			}
			if(panel[mPosY-1][mPosX].getColor() == 2){
				dTest[d] = false;
			}
			if(panel[mPosY-1][mPosX].getColor() == 3){
				dFin[d] = true;
			}
			System.out.println(dTest[d]+" "+d);
			pathfinder(d-1);
		}
		if(panel[mPosY][size-1].getInCell() == true && d == 2){
			dTest[d] = false;
			d--;
		}
		if(d == 2){
			if(panel[mPosY][mPosX+1].getColor() == 1){
				dTest[d] = true;
			}
			if(panel[mPosY][mPosX+1].getColor() == 2){
				dTest[d] = false;
			}
			if(panel[mPosY][mPosX+1].getColor() == 3){
				dFin[d] = true;
			}
			System.out.println(dTest[d]+" "+d);
			pathfinder(d-1);
		}
		if(panel[size-1][mPosX].getInCell() == true && d == 1){
			dTest[d] = false;
			d--;
		}
		if(d == 1){
			if(panel[mPosY+1][mPosX].getColor() == 1){
				dTest[d] = true;
			}
			if(panel[mPosY+1][mPosX].getColor() == 2){
				dTest[d] = false;
			}
			if(panel[mPosY+1][mPosX].getColor() == 3){
				dFin[d] = true;
			}
			System.out.println(dTest[d]+" "+d);
			pathfinder(d-1);
		}
		if(panel[mPosY][0].getInCell() == true && d == 0){
			dTest[d] = false;
			d--;
		}
		if(d == 0){
			if(panel[mPosY][mPosX-1].getColor() == 1){
				dTest[d] = true;
			}
			if(panel[mPosY][mPosX-1].getColor() == 2){
				dTest[d] = false;
			}
			if(panel[mPosY][mPosX-1].getColor() == 3){
				dFin[d] = true;
			}
			System.out.println(dTest[d]+" "+d);
			pathfinder(d-1);
		}
		if(d < 0){
			fFound = 0;
			for(int i = 0;i < 4;i++){
				if(dFin[i] == true){
					prio = i;
					fFound = 1;
				}
			}
			if(fFound == 0){
				for(int i = 0;i < 4;i++){
					if(dTest[i] == false){
						pCycle = pCycle + 1;
					}
					if(pCycle == 3){
						pStart = pStart - 1;
					}
					if(pStart < 0){
						pStart = 3;
					}
				}
				if(pStart == 3){
					if(dTest[3] == true && wasThere[mPosY-1][mPosX] != true){
						prio = 3;
					}
					else if(dTest[2] == true && wasThere[mPosY][mPosX+1] != true){
						prio = 2;
					}
					else if(dTest[1] == true && wasThere[mPosY+1][mPosX] != true){
						prio = 1;
					}
					else if(dTest[0] == true && wasThere[mPosY][mPosX-1] != true){
						prio = 0;
					}
					else{
						if(dTest[3] == true && wasThere[mPosY-1][mPosX] == true){
							prio = 3;
						}
						else if(dTest[2] == true && wasThere[mPosY][mPosX+1] == true){
							prio = 2;
						}
						else if(dTest[1] == true && wasThere[mPosY+1][mPosX] == true){
							prio = 1;
						}
						else if(dTest[0] == true && wasThere[mPosY][mPosX-1] == true){
							prio = 0;
						}
						else{
							prio = 4;
						}
					}
				}
				else if(pStart == 2){
					if(dTest[2] == true && wasThere[mPosY][mPosX+1] != true){
						prio = 2;
					}
					else if(dTest[1] == true && wasThere[mPosY+1][mPosX] != true){
						prio = 1;
					}
					else if(dTest[0] == true && wasThere[mPosY][mPosX-1] != true){
						prio = 0;
					}
					else if(dTest[3] == true && wasThere[mPosY-1][mPosX] != true){
						prio = 3;
					}
					else{
						if(dTest[2] == true && wasThere[mPosY][mPosX+1] == true){
							prio = 2;
						}
						else if(dTest[1] == true && wasThere[mPosY+1][mPosX] == true){
							prio = 1;
						}
						else if(dTest[0] == true && wasThere[mPosY][mPosX-1] == true){
							prio = 0;
						}
						else if(dTest[3] == true && wasThere[mPosY-1][mPosX] == true){
							prio = 3;
						}
						else{
							prio = 4;
						}
					}
				}
				else if(pStart == 1){
					if(dTest[1] == true && wasThere[mPosY+1][mPosX] != true){
						prio = 1;
					}
					else if(dTest[0] == true && wasThere[mPosY][mPosX-1] != true){
						prio = 0;
					}
					else if(dTest[3] == true && wasThere[mPosY-1][mPosX] != true){
						prio = 3;
					}
					else if(dTest[2] == true && wasThere[mPosY][mPosX+1] != true){
						prio = 2;
					}
					else{
						if(dTest[1] == true && wasThere[mPosY+1][mPosX] == true){
							prio = 1;
						}
						else if(dTest[0] == true && wasThere[mPosY][mPosX-1] == true){
							prio = 0;
						}
						else if(dTest[3] == true && wasThere[mPosY-1][mPosX] == true){
							prio = 3;
						}
						else if(dTest[2] == true && wasThere[mPosY][mPosX+1] == true){
							prio = 2;
						}
						else{
							prio = 4;
						}
					}
				}
				else if(pStart == 0){
					if(dTest[0] == true && wasThere[mPosY][mPosX-1] != true){
						prio = 0;
					}
					else if(dTest[3] == true && wasThere[mPosY-1][mPosX] != true){
						prio = 3;
					}
					else if(dTest[2] == true && wasThere[mPosY][mPosX+1] != true){
						prio = 2;
					}
					else if(dTest[1] == true && wasThere[mPosY+1][mPosX] != true){
						prio = 1;
					}
					else{
						if(dTest[0] == true && wasThere[mPosY][mPosX-1] == true){
							prio = 0;
						}
						else if(dTest[3] == true && wasThere[mPosY-1][mPosX] == true){
							prio = 3;
						}
						else if(dTest[2] == true && wasThere[mPosY][mPosX+1] == true){
							prio = 2;
						}
						else if(dTest[1] == true && wasThere[mPosY+1][mPosX] == true){
							prio = 1;
						}
						else{
							prio = 4;
						}
					}
				}
			}
			System.out.println("Prio = "+prio);
			System.out.println("pStart = "+pStart);
			wasThere[mPosY][mPosX] = true;
			wasNum[mPosY][mPosX]++;
			for(int n = 0; n < size;n++){
				for(int n2 = 0;n2 < size;n2++){
					panel[n][n2].setInCell(false);
				}
			}
			if(prio == 3){
				mPosY--;
				panel[mPosY][mPosX].setInCell(true);
				if(wasNum[mPosY+1][mPosX] >= 5){
					pStart = pStart - 1;
					if(pStart < 0){
						pStart = 3;
					}
				}
			}
			if(prio == 2){
				mPosX++;
				panel[mPosY][mPosX].setInCell(true);
				if(wasNum[mPosY][mPosX-1] >= 5){
					pStart = pStart - 1;
					if(pStart < 0){
						pStart = 3;
					}
				}
			}
		
		if(prio == 1){
			mPosY++;
			panel[mPosY][mPosX].setInCell(true);
			if(wasNum[mPosY-1][mPosX] >= 5){
				pStart = pStart - 1;
				if(pStart < 0){
					pStart = 3;
				}
			}
		}
		if(prio == 0){
			mPosX--;
			panel[mPosY][mPosX].setInCell(true);
			if(wasNum[mPosY][mPosX+1] >= 5){
				pStart = pStart - 1;
				if(pStart < 0){
					pStart = 3;
				}
			}
		}
		if(fFound == 1){
			scan =  false;
		}
		pCycle = 0;
		}
	}
}





