package Jerry;

import java.util.ArrayList;

public class Contractor {
	String name;
	ArrayList<Integer> codes = new ArrayList<Integer>();
	int score;
	
	public Contractor(){
		this.name = name;
		this.codes = codes;
		this.score = score;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<Integer> getCodes() {
		return codes;
	}

	public void addCode(int c) {
		codes.add(c);
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}
	
	public String toString(){
		return this.name+" - "+this.score+"%";
	}
}
