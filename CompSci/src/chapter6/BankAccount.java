package chapter6;

//Ryan
//Object class for a Bank Account

public class BankAccount {
	//instance variables
	private String name;
	private double balance;
	//constructors
	public BankAccount(String name, double balance) {
		this.name = name;
		this.balance = balance;
	}
	//Getters and Setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	//Method to deposit money
	public void deposit(double d){
		balance += d;
	}
	//Method to withdraw money
	public void withdraw(double w){
		if(w > balance){
			System.out.println("You don't have enough money for that");
		}
		else
			balance -= w;
	}
	public String toString(){
		return "Account Name: "+name+"\nAccount Balance: "+balance;
	}
}
