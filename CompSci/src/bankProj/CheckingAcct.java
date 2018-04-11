package bankProj;

public class CheckingAcct extends BankAccount{
	
	public CheckingAcct(){
		super();
	}
	public CheckingAcct(String name, double balance){
		super(name, balance);
	}
	public void withdraw(double d) {
		double balance = getBalance();
		if(balance >= 50){
			if(d > balance){
				System.out.println("You don't have enough money in your account for that");
			}
			else
				balance -= d;
		}
		else
			System.out.println("You may not withdraw money unless you have a balance of at least $50");
		setBalance(balance);
	}

}
