package bankProj;

//Ryan
//Interfact for Bank Account project

public interface Bank {
	public void deposit(double d);
	public void withdraw(double d);
	public void setBalance(double d);
	public void setName(String s);
	public double getBalance();
	public String getName();
	public String toString();
}
