package PracticeAbstraction;

import java.util.Scanner;

//Ryan
//Calculations

public class calculation {

	static Scanner scan = new Scanner(System.in);
	
	//Gets an input
	public static double getInput(){
		System.out.println("Input a number");
		return scan.nextDouble();
	}
	
	//Calculates average from inputs
	public static double calculate(double num1, double num2, double num3){
		return (num1+num2+num3)/3;
	}
}
