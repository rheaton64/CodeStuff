package chapter6;

//Ryan
//Lottery Programming Project - Enter a number into the lottery

import java.util.Random;
import java.util.Scanner;

public class LotteryRunner {
	//Global variables
	private static Scanner scan = new Scanner(System.in);
	private static Random rand = new Random();
	private static LottoNum user;
	private static LottoNum lotto;
	private static int spent;
	private static int won;
	private static int winnings;
	private static int net;
	//Main method that runs the program
	public static void main(String[] args) {
		System.out.println("Welcome to the Loterry! Your first ticket will cost $2");
		boolean check = true;
		while(check){
			getInputs();
			System.out.println(user);
			lotto = new LottoNum(rand.nextInt(10), rand.nextInt(10), rand.nextInt(10), true);
			System.out.println(lotto);
			check();
			System.out.println("\nYou have won $"+won+"!"+"\n"+
					"Your total spent: $"+spent+"\n"+
					"Your total winnings: $"+winnings+"\n"+
					"Your net winnings: $"+net);
			System.out.println("\nWould you like to play again? A new ticket will cost $2"+"\n"+
					"Type \"yes\" to play, or \"no\" to exit");	
			String input = scan.next();
			while(true){
				if(input.equalsIgnoreCase("yes")){
					break;
				}
				else if(input.equalsIgnoreCase("no")){
					check = false;
					break;
				}
				else{
					System.out.println("That is not a valid input, please try again");
				}
			}
		}
	}
	//Gets user inputs
	public static void getInputs(){
		int[] inputNums = new int[3];
		user = new LottoNum();
		while(true){
			System.out.println("\nPlease enter your first number(0-9)");
			inputNums[0] = scan.nextInt();
			System.out.println("Please enter your second number(0-9)");
			inputNums[1] = scan.nextInt();
			System.out.println("Please enter your third number(0-9)");
			inputNums[2] = scan.nextInt();
			int count = 0;
			for(int i = 0; i < 3; i++){
				if(inputNums[i] >= 0 && inputNums[i] <= 9){
					count++;
				}
			}
			if(count == 3){
				user.setNum(inputNums[0], 0);
				user.setNum(inputNums[1], 1);
				user.setNum(inputNums[2], 2);
				break;
			}
			else{
				System.out.println("There was an error with your input, please try again");
			}
		}
	}
	//Checks the two numbers against each other
	public static void check(){
		if(user.getFullNum() == lotto.getFullNum()){
			spent += 2;
			won = 1000000;
			winnings += 1000000;
			net = winnings-spent;
		}
		else{
			int winCount = 0;
			for(int i = 0; i < 3; i++){
				for(int n = 0; n < 3; n++){
					if(user.getNum(i) == lotto.getNum(n) && user.getIsChecked(i) == false && lotto.getIsChecked(n) == false){
						winCount++;
						user.setIsChecked(true, i);
						lotto.setIsChecked(true, n);
						break;
					}
				}
			}
			if(winCount == 0){
				spent += 2;
				won = 0;
				net = winnings-spent;
			}
			else if(winCount == 1){
				spent += 2;
				won = 10;
				winnings += 10;
				net = winnings-spent;
			}
			else if(winCount == 2){
				spent += 2;
				won = 100;
				winnings += 100;
				net = winnings-spent;
			}
			else if(winCount == 3){
				spent += 2;
				won = 1000;
				winnings += 1000;
				net = winnings-spent;
			}
		}
	}
}
