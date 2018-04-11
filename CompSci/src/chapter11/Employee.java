package chapter11;

//Ryan
//1 - 18 - 18
//Employee subclass for Demographics Project

public class Employee extends Person{
	private String job;
	private double income;
	public Employee(int age, String location, String job, double income){
		super(age, location);
		this.job = job;
		this.income = income;
	}
	public String toString(){
		String str = "Age: "+age+"\n"+"Location: "+location+"\nOccupation: "+job+"\nIncome: $"+income;
		return str;
	}
}
