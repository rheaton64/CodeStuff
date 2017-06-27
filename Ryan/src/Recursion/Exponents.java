package Recursion;

public class Exponents {

	public static void main(String[] args) {
		
		System.out.println(exponent(52, 5));

	}
	public static int exponent(int n, int p){
		if(p  < 1){
			return 1;
		}
		return n*exponent(n, p-1);
	}
	

}
