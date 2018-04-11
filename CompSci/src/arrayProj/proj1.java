package arrayProj;

//Ryan
//Array Programming Project 1 - Input 10 numbers and sort them from lowest to highest

import java.util.Scanner;

public class proj1 {
	//Main method to run the program
	public static void main(String[] args) {
		int[] nums = new int[10];
		Scanner scan = new Scanner(System.in);
		Arrays1 a = new Arrays1();
		System.out.println("Please enter 10 integer values");
		for(int i = 0; i < nums.length; i++){
			nums[i] = scan.nextInt();
		}
		a.setArray(nums);
		System.out.println(a);
	}
}
