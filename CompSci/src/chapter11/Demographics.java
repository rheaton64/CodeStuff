package chapter11;

//Ryan
//1 - 18 - 18
//Demographics Project - show inheritance between super and subclasses

public class Demographics {
	public static void main(String[] args) {
		Person bob = new Person(8, "Utah");
		Student fred = new Student(25, "New Mexico", "University of New Mexico");
		ForeignStudent joe = new ForeignStudent(19, "Ohio", "Ohio State", "India");
		Employee ryan = new Employee(38, "Delaware", "Tile Setter", 50000);
		
		System.out.println(bob+"\n----------\n\n"+fred+"\n----------\n\n"+joe+"\n----------\n\n"+ryan);
	}
	
}
