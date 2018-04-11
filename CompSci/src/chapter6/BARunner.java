package chapter6;

import java.util.Scanner;

//Ryan
//Runner for BankAccount class

public class BARunner {
	public static void main(String[] args) {
		//Creates and tests BankAccount object
		Scanner scan = new Scanner(System.in);
		BankAccount b;
		System.out.println("What is your name?");
		String name = scan.next();
		System.out.println("What is your initial balance?");
		double bal = scan.nextDouble();
		b = new BankAccount(name, bal);
		System.out.println("Enter amount to deposit");
		b.deposit(scan.nextDouble());
		System.out.println("Enter amount to withdraw");
		b.withdraw(scan.nextDouble());
		System.out.println(b);
	}
	
}
