package arrayProj;

import java.util.Scanner;

//Ryan
//Array Programming Project 3 - Input 10 numbers and output them in reverse order

public class proj3 {
	//Main method to run the program
	public static void main(String[] args) {
		int[] nums = new int[10];
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter 10 integer values");
		for(int i = 0; i < nums.length; i++){
			nums[i] = scan.nextInt();
		}
		Arrays3 a = new Arrays3(nums);
		System.out.println(a);
	}
}
