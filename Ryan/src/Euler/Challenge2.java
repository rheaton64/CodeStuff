package Euler;

public class Challenge2 {
	public static void main(String[] args) {
		int num = 0;
		for(int i = 0; i < 4000000; i++){
			if(sequence(i) > 4000000){
				break;
			}
			else if(sequence(i) % 2 == 0){
				num+=sequence(i);
			}
		}
		System.out.println(num);
	}
	public static int sequence(int n){
		if(n < 3){
			return 1;
		}
		return sequence(n-1)+sequence(n-2);
	}
}
