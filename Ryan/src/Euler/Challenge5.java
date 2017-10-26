package Euler;

public class Challenge5 {
	public static void main(String[] args) {
		boolean check = true;
		int i = 1;
		while(check = true){
			int count = 0;
			for(int n = 1; n <= 20; n++){
				if(i % n == 0){
					count++;
				}
			}
			if(count == 20){
				System.out.println(i);
				check = false;
			}
			else{
				i++;
			}
		}
	}
}
