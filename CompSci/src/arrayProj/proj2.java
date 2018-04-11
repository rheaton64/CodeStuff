package arrayProj;

import java.util.Scanner;

//Ryan
//Array Programming Project 2 - Input 10 numbers and get the mode of them

public class proj2 {
	//Main method that runs the program
	public static void main(String[] args) {
		int[] nums = new int[10];
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter 10 integer values");
		for(int i = 0; i < nums.length; i++){
			nums[i] = scan.nextInt();
		}
		Arrays2 a = new Arrays2(nums);
		System.out.println(a);
	}
}
