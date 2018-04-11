package chapter11;

//Ryan
//1 - 18 - 18
//Person superclass for Demographics Project

public class Person {
	public int age;
	public String location;
	public Person(int age, String location){
		this.age = age;
		this.location = location;
	}
	public String toString(){
		String str = "Age: "+age+"\n"+"Location: "+location;
		return str;
	}
}
