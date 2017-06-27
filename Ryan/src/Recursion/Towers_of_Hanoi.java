package Recursion;

import java.util.Scanner;

public class Towers_of_Hanoi {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Choose the number of disks for the solution!");
		int n = scan.nextInt();
		System.out.println();
		solve(n, "start", "mid", "end");
	}
	public static void solve(int n, String start, String aux, String end){
		if(n == 1){
			System.out.println(n+" -> "+end);
		}
		else{
		solve(n - 1, start, end, aux);
		System.out.println(n+" -> "+end);
		solve(n - 1, aux, start, end);
		}
	}

}
