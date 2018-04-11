package xtraCredit;

public class Grade {
	private int grade;
	public Grade(){
		this.grade = grade;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public String getLetterGrade(){
		if(grade >= 0 && grade <= 59){
			return "F";
		}
		if(grade >= 60 && grade <= 61){
			return "D-";
		}
		if(grade >= 62 && grade <= 65){
			return "D";
		}
		if(grade >= 66 && grade <= 69){
			return "D+";
		}
		if(grade >= 70 && grade <= 71){
			return "C-";
		}
		if(grade >= 72 && grade <= 75){
			return "C";
		}
		if(grade >= 76 && grade <= 79){
			return "C+";
		}
		if(grade >= 80 && grade <= 81){
			return "B-";
		}
		if(grade >= 82 && grade <= 85){
			return "B";
		}
		if(grade >= 86 && grade <= 89){
			return "B+";
		}
		if(grade >= 90 && grade <= 91){
			return "A-";
		}
		if(grade >= 92 && grade <= 95){
			return "A";
		}
		if(grade >= 96 && grade <= 100){
			return "A+";
		}
		else
			return "N/A";
	}
}
