package chapter4;

//Ryan
//Calculation and input for proj1

import java.util.Scanner;

public class ryanFunc1 {
	static Scanner scan = new Scanner(System.in);
	public int getInput(){
		System.out.println("PLease enter an integer");
		return scan.nextInt();
	}
	public String calculate(int n1, int n2){
		int quo = Math.max(n1, n2) / Math.min(n1, n2);
		int rem = Math.max(n1, n2) % Math.min(n1, n2);
		return quo+"r. "+rem;
	}
}
