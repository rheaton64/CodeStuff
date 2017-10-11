package chapter7;

//Ryan
//Making a box of stars and pluses

public class ryanStarPlusBox {
	public static void main(String[] args){
		for(int h = 0; h < 6; h++){
			for(int p = 0; p <= h; p++){
				System.out.print("+");
			}
			for(int s = 5; s > h; s--){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
