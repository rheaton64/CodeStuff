package chapter6;

//Ryan
//Credit card object class for Credit Card program

public class CreditCard {
	//Instance variables
	private String name;
	private double balance;
	//Default contructor
	public CreditCard(){
		this.balance = balance;
	}
	//Contructor with parmeters
	public CreditCard(String name, double balance){
		this.name = name;
		this.balance = balance;
	}
	//Getters
	public String getName() {
		return name;
	}
	public double getBalance() {
		return balance;
	}
	//Setters
	public void setName(String name) {
		this.name = name;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	//Method to make a payment and calculate interest
	public void makePayment(double pay){
		double temp = balance;
		temp-= pay;
		temp *= 1.18;
		if(temp != 0)
			balance += temp;
		else
			balance = 0;
	}
	//toString method
	public String toString(){
		String str = "Name: "+name+"\nBalance: "+balance;
		return str;
	}
}
