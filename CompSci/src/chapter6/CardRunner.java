package chapter6;

//Ryan
//Runner for Chapter 6 Worksheet Credit Card program - makes a credit card and calculates interest

public class CardRunner {
	//Main method to initialize and test CreditCard class
	 public static void main(String[] args) {
		CreditCard Cust1 = new CreditCard();
		CreditCard Cust2 = new CreditCard("Bob", 100);
		Cust1.setName("Fred");
		Cust1.setBalance(200);
		Cust1.makePayment(25);
		Cust2.makePayment(100);
		System.out.println(Cust1+"\n\n"+Cust2);
	}
}
