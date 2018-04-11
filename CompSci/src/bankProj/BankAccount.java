package bankProj;

//Ryan
//Abstract class for Bank Account

abstract public class BankAccount implements Bank{
	private String name;
	private double balance;
	
	public BankAccount(){
		name = "";
		balance = 0;
	}
	public BankAccount(String name, double balance){
		this.name = name;
		this.balance = balance;
	}
	
	public void deposit(double d){
		balance += d;
	}
	
	abstract public void withdraw(double d);
	
	public void setBalance(double d){
		balance = d;
	}
	
	public void setName(String s){
		name = s;
	}
	
	public double getBalance(){
		return balance;
	}
	
	public String getName(){
		return name;
	}
	
	public String toString(){
		String str = "Account Name: "+name+"\nBalance: "+balance;
		return str;
	}
}
