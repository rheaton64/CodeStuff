package bankProj;

//Ryan
//IRA Account for Bank Account

public class IRAAcct extends SavingsAcct{
	private int age;
	
	public IRAAcct(){
		super();
		age = 0;
	}
	public IRAAcct(String name, int age, double balance){
		super(name, balance);
		this.age = age;
	}
	
	public void setAge(int age){
		this.age = age;
	}
	
	public int getAge(){
		return age;
	}
	
	public void withdraw(double d){
		double balance = getBalance();
		if(d > balance){
			System.out.println("You don't have enough money to do that");
		}
		else{
			if(age >= 65){
				balance -= d;
			}
			else{
				System.out.println("You are not old enough to withdraw from this account, you have been charged 30% of your withdraw");
				balance -= d;
				balance -= (d*0.3);
			}
		}
		setBalance(balance);
	}
	
	public void addInterest(){
		setBalance(getBalance()*1.3);
	}
}
