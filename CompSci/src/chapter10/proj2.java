package chapter10;

//Ryan
//Project 10.2 - Entering 10 doubles and printing the average and an array of numbers greater than the average

import java.util.Scanner;

public class proj2 {
	//Main method to run the program
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double[] nums = new double[10];
		Arrays2 a = new Arrays2();
		System.out.println("Please enter 10 floating-point values");
		for(int i = 0; i < nums.length; i++){
			nums[i] = scan.nextInt();
		}
		a.setAvg(nums);
		System.out.println(a);
	}
}
