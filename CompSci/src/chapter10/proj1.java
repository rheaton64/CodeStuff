package chapter10;

//Ryan
//Project 10.1 - Entering an array of int and sorting them

import java.util.Scanner;

public class proj1 {
	//Main method to run the program
	public static void main(String[] args) {
		int[] nums = new int[10];
		Arrays1 a = new Arrays1();
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter 10 integer values");
		for(int i = 0; i < nums.length; i++){
			nums[i] = scan.nextInt();
		}
		a.setArrays(nums);
		System.out.println(a);
	}
}
