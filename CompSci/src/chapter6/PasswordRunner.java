package chapter6;

//Ryan
//Programming Project to get a password from an inputted website name

import java.util.Scanner;

public class PasswordRunner {
	//main method to run the object class
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Welcome to the Password Generator. Please enter the website name");
		boolean check = true;
		while(check){
		String siteName = scan.next();
		if(siteName.length() >= 3){
		Password p1 = new Password(siteName);
		System.out.println(p1);
		check = false;
		}
		else{
			System.out.println("Please enter a name with more than 3 letters");
		}
		check = true;
		}
		while(true){
			System.out.println("\nPlease enter another website name, or type \"exit\" to exit");
			while(check){
			String input = scan.next();
			if(input.equals("exit")){
				break;
			}
			else if(input.length() < 3){
				System.out.println("Please enter a name with more than 3 letters");
			}
			else{
				Password p2 = new Password();
				p2.setSite(input);
				System.out.println(p2);
			}
		}
		}
	}
}
