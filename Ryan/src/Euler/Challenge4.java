package Euler;

import java.util.ArrayList;

public class Challenge4 {

	public static void main(String[] args) {
		ArrayList<Integer> nums = new ArrayList<>();
		for(int n1 = 900; n1 <= 999; n1++){
			for(int n2 = 900; n2 <= 999; n2++){
				int temp = n1*n2;
				if(temp == reverse(temp)){
					nums.add(temp);
				}
			}
		}
		System.out.println(nums.get(nums.size()-1));
	}
	public static int reverse(int n){
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

}
