package chapter2;

import java.util.Scanner;

public class getKiloInput {
	static Scanner scan = new Scanner(System.in);
	//Gets proj3 Kilo input
	public static double getInput(){
		System.out.println("Please enter number of kilometers");
		return scan.nextDouble();
	}
}
