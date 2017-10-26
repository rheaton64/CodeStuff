package Euler;

public class Challenge6 {
	public static void main(String[] args) {
		int numSum = 0;
		int sqSum = 0;
		for(int i = 1; i <= 100; i++){
			numSum += i;
			sqSum += i*i;
		}
		numSum = numSum*numSum;
		System.out.println(numSum - sqSum);
		
	}
}
