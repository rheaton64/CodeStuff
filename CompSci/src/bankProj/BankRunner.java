package bankProj;

//Ryan
//Runner class for BankAccount project

public class BankRunner {
	public static void main(String[] args) {
		//Instatiating the objects
		SavingsAcct s1 = new SavingsAcct();
		SavingsAcct s2 = new SavingsAcct("Ryan", 60);
		CheckingAcct a1 = new CheckingAcct();
		CheckingAcct a2 = new CheckingAcct("Bob", 100);
		IRAAcct i1 = new IRAAcct();
		IRAAcct i2 = new IRAAcct("Joe", 70, 2000);
		//Savings methods
		s1.setName("Fred");
		s1.setBalance(55);
		s2.deposit(20);
		s2.withdraw(60);
		s1.withdraw(60);
		s1.deposit(s1.getBalance());
		s1.addInterest();
		s2.addInterest();
		System.out.println("\n\n"+s1+"\n\n"+s2+"\n\n");
		//Checking Methods
		a1.setName("John");
		a1.setBalance(40);
		a2.deposit(20);
		a2.withdraw(60);
		a1.withdraw(60);
		a1.deposit(a1.getBalance());
		System.out.println("\n\n"+a1+"\n\n"+a2+"\n\n");
		//IRA Methods
		i1.setName("George");
		i1.setBalance(100);
		i1.setAge(20);
		i2.deposit(30);
		i2.withdraw(20);
		i1.withdraw(20);
		i1.deposit(i1.getBalance());
		i1.addInterest();
		i2.addInterest();
		System.out.println("\n\n"+i1+"\n\n"+i2+"\n\n");
	}

	
}
