package chapter4;

//Ryan
//Calculation and input for proj3

import java.util.Scanner;

public class ryanCalc3 {
	private static Scanner scan = new Scanner(System.in);
	public static int getMins(){
		System.out.println("Please enter number of mins for your call");
		return scan.nextInt();
	}
	public static double calculate(int mins){
		if(mins >= 2){
			return 1.15+(0.5*(mins-2));
		}
		else{
			return 1.15;
		}
	}
}
