package Euler;

import java.util.ArrayList;

public class Challenge3 {

	public static void main(String[] args) {
		long num = 600851475143L;
		ArrayList<Integer> factors = new ArrayList<Integer>();
		ArrayList<Boolean> check = new ArrayList<Boolean>();
		int checkint = 0;
		for(int i = 2; i < 716151938; i++){
			if(num % i == 0){
				factors.add(i);
				System.out.println(i);
			}
		}
		System.out.println(factors.toString());
		for(int i = 0; i < factors.size(); i++){
			for(int n = 2; n < factors.get(i); n++){
				check.add(true);
				if(factors.get(i) % n == 0){
					checkint++;
					check.set(i, false);
				}
			}
			if(check.get(i) == true){
				System.out.println(factors.get(i));
			}
		}
	}

}
