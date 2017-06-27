package Recursion;

public class Fibonacci {

	public static void main(String[] args) {
		System.out.println(sequence(10));
	}
	public static int sequence(int n){
		if(n < 3){
			return 1;
		}
		return sequence(n-1)+sequence(n-2);
	}

}
