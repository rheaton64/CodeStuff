package chapter2;

import java.util.Scanner;

public class getMass {
	static Scanner scan = new Scanner(System.in);
	//gets mass input for proj5
		public static double get(){
			System.out.println("Please enter mass of object (kg)");
			return scan.nextDouble();
		}
}
