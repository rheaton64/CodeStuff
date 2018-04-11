package chapter11;

//Ryan
//1 - 18 - 18
//ForeignStudent subclass for Demographics Project

public class ForeignStudent extends Student{
	private String nation;
	public ForeignStudent(int age, String location, String university, String nation){
		super(age, location, university);
		this.nation = nation;
	}
	public String toString(){
		String str = "Age: "+age+"\n"+"Location: "+location+"\nUniverstiy"+university+"\nNationality: "+nation;
		return str;
	}
}
