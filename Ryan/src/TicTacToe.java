import java.util.Scanner;

public class TicTacToe {

	public static void main(String[] args) {
		String[][] board = new String[3][3];
		Scanner xScan = new Scanner(System.in);
		Scanner oScan = new Scanner(System.in);
		boolean Game = true;
		boolean xTurn = true;
		boolean oTurn = true;


		for(int c = 0;c < 3;c++){
			for(int r= 0;r < 3;r++){
				board[c][r] = "-";
			}
		}
		boardPrint(board);

		while(Game == true){
			while(xTurn == true){
				oTurn = true;
				System.out.println("X, what column do you want to enter?");
				int xRow = xScan.nextInt();
				System.out.println("What row?");
				int xCol = xScan.nextInt();
				if(board[xCol][xRow] != "-"){
					System.out.println("You can't put that there!");
					oTurn = false;
				}
				else{
					board[xCol][xRow] = "x";
					boardPrint(board);
					xTurn = false;
					if(xWinCheck(board) == 1){
						oTurn = false;
						Game = false;
						System.out.println("Congratulations X, you win!");
					}
				}

			}
			while(oTurn == true){
				xTurn = true;
				System.out.println("O, what column do you want to enter?");
				int oRow = oScan.nextInt();
				System.out.println("What row?");
				int oCol = oScan.nextInt();
				if(board[oCol][oRow] != "-"){
					System.out.println("You can't put that there!");
					xTurn = false;
				}
				else{
					board[oCol][oRow] = "o";
					boardPrint(board);
					oTurn = false;
				}
				if(oWinCheck(board) == 1){
					Game = false;
					System.out.println("Congratulations O, you win!");
				}
			}
		}
	}

	public static void boardPrint(String[][] board){
		for(int c = 0;c < 3;c++){
			for(int r = 0;r < 3;r++){
				System.out.print(board[c][r]);
			}
			System.out.println();
		}

	}
	public static int xWinCheck(String[][] board){
		int xWinc0 = 0;
		int xWinc1 = 0;
		int xWinc2 = 0;
		int xWinr0 = 0;
		int xWinr1 = 0;
		int xWinr2 = 0;
		int xWindd = 0;
		int xWindu = 0;
		int Win = 0;
		for(int w = 0;w < 3;w++){
			if(board[0][w] == "x"){
				xWinc0++;
			}
			if(board[1][w] == "x"){
				xWinc1++;
			}
			if(board[2][w] == "x"){
				xWinc2++;
			}
			if(board[w][0] == "x"){
				xWinr0++;
			}
			if(board[w][1] == "x"){
				xWinr1++;
			}
			if(board[w][2] == "x"){
				xWinr2++;
			}

		}
		if(board[0][0] == "x"){
			xWindd++;
		}
		if(board[1][1] == "x"){
			xWindd++;
			xWindu++;
		}
		if(board[2][2] == "x"){
			xWindd++;
		}
		if(board[2][0] == "x"){
			xWindu++;
		}
		if(board[0][2] == "x"){
			xWindu++;
		}
		if(xWinc0 == 3 || xWinc1 == 3 || xWinc2 == 3 || xWinr0 == 3 || xWinr1 == 3 || xWinr2 == 3 || xWindd == 3 || xWindu == 3){
			Win = 1;
		}

		xWinc0 = 0;
		xWinc1 = 0;
		xWinc2 = 0;
		xWinr0 = 0;
		xWinr1 = 0;
		xWinr2 = 0;
		xWindd = 0;
		xWindu = 0;
		return Win;
	}

	public static int oWinCheck(String[][] board){
		int oWinc0 = 0;
		int oWinc1 = 0;
		int oWinc2 = 0;
		int oWinr0 = 0;
		int oWinr1 = 0;
		int oWinr2 = 0;
		int oWindd = 0;
		int oWindu = 0;
		int Win = 0;
		for(int w = 0;w < 3;w++){
			if(board[0][w] == "o"){
				oWinc0++;
			}
			if(board[1][w] == "o"){
				oWinc1++;
			}
			if(board[2][w] == "o"){
				oWinc2++;
			}
			if(board[w][0] == "o"){
				oWinr0++;
			}
			if(board[w][1] == "o"){
				oWinr1++;
			}
			if(board[w][2] == "o"){
				oWinr2++;
			}

		}
		if(board[0][0] == "o"){
			oWindd++;
		}
		if(board[1][1] == "o"){
			oWindd++;
			oWindu++;
		}
		if(board[2][2] == "o"){
			oWindd++;
		}
		if(board[2][0] == "o"){
			oWindu++;
		}
		if(board[0][2] == "o"){
			oWindu++;
		}
		if(oWinc0 == 3 || oWinc1 == 3 || oWinc2 == 3 || oWinr0 == 3 || oWinr1 == 3 || oWinr2 == 3 || oWindd == 3 || oWindu == 3){
			Win = 1;
		}

		oWinc0 = 0;
		oWinc1 = 0;
		oWinc2 = 0;
		oWinr0 = 0;
		oWinr1 = 0;
		oWinr2 = 0;
		oWindd = 0;
		oWindu = 0;
		return Win;
	}
}
