package advStrProgProj;

import java.util.Scanner;

//Ryan
//Person object for Project 4

public class Person {
	private String firstName;
	private String lastName;
	private int groupNum;
	public Person(){
		this.firstName = firstName;
		this.lastName = lastName;
		this.groupNum = groupNum;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getGroupNum(){
		if(lastName.compareTo("A")>=0 && lastName.compareTo("J")<0){
			return 1;
		}
		else if(lastName.compareTo("J")>=0 && lastName.compareTo("S")<0){
			return 2;
		}
		else if(lastName.compareTo("T")>=0){
			return 3;
		}
		else
			return 0;
	}
		

}
