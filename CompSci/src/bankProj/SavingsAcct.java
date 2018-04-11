package bankProj;

//Ryan
//Savings account method for BankAccount

public class SavingsAcct extends BankAccount{
	
	public SavingsAcct(){
		super();
	}
	public SavingsAcct(String name, double balance){
		super(name, balance);
	}
	public void withdraw(double d) {
		double balance = getBalance();
		if(balance >= 50){
			if(d > balance){
				System.out.println("You don't have enough money in your account for that, you have been charged $20");
				balance -= 20;
			}
			else
				balance -= d;
		}
		else
			System.out.println("You may not withdraw money unless you have a balance of at least $50");
		setBalance(balance);
	}
	
	public void addInterest(){
		setBalance(getBalance()*1.05);
	}

}
