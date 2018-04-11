package chapter6_2;

//Ryan
//Student class for the Address/Student program

public class Student {
	//Instance variables
	private String fName;
	private String lName;
	private Address home;
	private Address school;
	//Constructor
	public Student(String fName, String lName, Address home, Address school) {
		this.fName = fName;
		this.lName = lName;
		this.home = home;
		this.school = school;
	}
	//toString method
	public String toString(){
		return fName+" "+lName+"\nHome Address:\n"+home+"\nSchool Address\n"+school;
	}
}
