package chapter6_2;

//Ryan
//Runner class for Address/Student program - creats Student objs and Address objs and prints them

public class StudentBody {
	//Main method to create and print the 2 objs
	public static void main(String[] args) {
		Address school = new Address("1450 Newfield Ave.", "Stamford", "CT", "06905");
		Address home1 = new Address("101 Dann Farm Rd", "Pound Ridge", "NY", "10576");
		Student s1 = new Student("Ryan", "Heaton", home1, school);
		Address home2 = new Address("712 Real Str", "Cityville", "CA", "71264");
		Student s2 = new Student("Bob", "Jones", home2, school);
		System.out.println(s1);
		System.out.println("\n"+s2);
	}
}
