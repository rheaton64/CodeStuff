package chapter7;

//Ryan
//Getting the reverse of a number, two different ways

public class ryanNumReverse {
	public static void main(String[] args){
		System.out.println("You number reversed is "+reverse2(123456789));
	}
	public static int reverse1(int n){
		int l = 0;
		String num = Integer.toString(n);
		l = num.length();
		String output = "";
		for(int i = l; i > 0; i--){
			String temp = num.substring(i-1, i);
			output = output+temp;
		}
		return Integer.parseInt(output);
	}
	public static int reverse2(int n){
		int revNum = 0;	
		for (;n !=0;){
			revNum *=10;
			revNum += n%10;
			n/=10;
		}
		return revNum;
	}
}
