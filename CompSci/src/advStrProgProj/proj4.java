package advStrProgProj;

import java.util.Scanner;

//Ryan
//Project 4 - Assigns a name a group alphabetically

public class proj4 {
	private static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		Person p = new Person();
		p.setFirstName(getFirstName());
		p.setLastName(getLastName());
		System.out.println(p.getFirstName()+" "+p.getLastName()+" is assigned to group "+p.getGroupNum());
	}
	public static String getFirstName(){
		System.out.println("Enter your first name");
		return scan.nextLine();
	}
	public static String getLastName(){
		System.out.println("Enter your last name");
		return scan.nextLine();
	}
}
