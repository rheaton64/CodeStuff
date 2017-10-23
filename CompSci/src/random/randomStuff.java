package random;

import java.util.Random;

public class randomStuff {

	public static void main(String[] args) {
		Random rand = new Random();
		boolean check = false;
		int count = 0;
		while(check == true){
			double i = rand.nextDouble()*500.0;
			if(i >= 64 && i < 65){
				count++;
			}
			if(i >= 64.646464 && i < 64.646465){
				check = false;
			}
			System.out.println(i);
			
		}
		int x = 10, y = 0;
		while(x > 5){
			y = 3;
			System.out.println(x + " " + y);
			while(y < x){
				y *= 2;
				System.out.println(x + " " + y);
				if(y % x == 1){
					y +=x;
					System.out.println(x + " " + y + "hi");
				}
			}
			x -= 3;
		}
		System.out.println(x + " " + y); 
		
	}

}
