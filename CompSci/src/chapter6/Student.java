package chapter6;

//Ryan
//Student class - TB Ch6

public class Student {
	private String name;
	private int test1, test2, test3;
	//default
	public Student() {
		this.name = name;
		this.test1 = test1;
		this.test2 = test2;
		this.test3 = test3;
	}
	//constructor w/ parameters
	public Student(String name, int test1, int test2, int test3){
		this.name = name;
		this.test1 = test1;
		this.test2 = test2;
		this.test3 = test3;
	}
	//constructor w/ just name
	public Student(String name){
		this.name = name;
		this.test1 = test1;
		this.test2 = test2;
		this.test3 = test3;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setScore(int num, int score){
		if(num == 1){
			this.test1 = score;
		}
		else if(num == 2){
			this.test2 = score;
		}
		else if(num == 3){
			this.test3 = score;
		}
		else{
			System.out.println("Test "+num+" is not a valid test number");
		}
	}
	public int getScore(int num){
		if(num == 1){
			return test1;
		}
		else if(num == 2){
			return test2;
		}
		else if(num == 3){
			return test3;
		}
		else{
			System.out.println("Test "+num+" is not a valid test number");
			return 0;
		}
	}
	public int getAverage(){
		return (test1+test2+test3)/3;
	}
	public int getHighScore(){
		if(test1 > test2 && test1 > test3){
			return test1;
		}
		if(test2 > test1 && test2 > test3){
			return test2;
		}
		if(test3 > test2 && test3 > test1){
			return test3;
		}
		else
			return 0;
	}
	public String toString() {
		return "Name: "+name+"\n"+"Test 1: "+test1+"\n"+"Test 2: "+test2+"\n"+"Test 3: "+test3+"\n"+"Average: "+getAverage()+"\n"+"High Score: "+getHighScore();
	}
}
