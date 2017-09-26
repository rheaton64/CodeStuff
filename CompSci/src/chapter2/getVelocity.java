package chapter2;

import java.util.Scanner;

public class getVelocity {
	static Scanner scan = new Scanner(System.in);
	//gets velocity input for proj5
		public static double get(){
			System.out.println("Please enter velocity of object (m/s)");
			return scan.nextDouble();
		}
}
