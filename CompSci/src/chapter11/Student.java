package chapter11;

//Ryan
//1 - 18 - 18
//Student subclass for Demographics Project

public class Student extends Person{
	public String university;
	public Student(int age, String location, String university){
		super(age, location);
		this.university = university;
	}
	public String toString(){
		String str = "Age: "+age+"\nLocation: "+location+"\nUniversity: "+university;
		return str;
	}
}
