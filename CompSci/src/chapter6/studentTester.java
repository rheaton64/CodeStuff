package chapter6;

//Ryan
//Student Tester

public class studentTester {

	public static void main(String[] args) {
		Student s1 = new Student();
		Student s2 = new Student("Mary", 100, 97, 50);
		Student s3 = new Student("Joe");
		s1.setName("Bob");
		System.out.println(s1.getName());
		s1.setScore(1, 60);
		s1.setScore(2, 100);
		s1.setScore(3, 95);
		s3.setScore(1, 90);
		s3.setScore(2, 100);
		s3.setScore(3, 95);
		System.out.println(s1.getAverage());
		System.out.println(s1.getHighScore());
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
	}

}
