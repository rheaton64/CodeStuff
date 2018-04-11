package xtraCredit;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class gradeCalc {
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println(getInput().getLetterGrade());
		getData(getListInput());

	}
	public static Grade getInput(){
		System.out.println("Please enter a number grade");
		Grade temp = new Grade();
		temp.setGrade(scan.nextInt());
		return temp;
	}
	public static ArrayList<Grade> getListInput(){
		ArrayList<Grade> grades = new ArrayList<>();
		boolean run = true;
		while(run == true){
			System.out.println("Please enter a number grade, type -1 to finish");
			int grd = scan.nextInt();
			if(grd == -1){
				run = false;
			}
			else{
				Grade temp = new Grade();
				temp.setGrade(grd);
				grades.add(temp);
			}
		}
		return grades;
	}
	public static void getData(List<Grade> grades){
		Grade avgGrade = new Grade();
		Grade minGrade = new Grade();
		Grade maxGrade = new Grade();
		int sum = 0;
		int avg = 0;
		for(int i = 0; i < grades.size(); i++){
			sum += grades.get(i).getGrade();
		}
		avg = sum/grades.size();
		avgGrade.setGrade(avg);
		ArrayList<Integer> grds = new ArrayList<>();
		for(int i = 0; i < grades.size(); i++){
			grds.add(grades.get(i).getGrade());
		}
		Collections.sort(grds);
		minGrade.setGrade(grds.get(0));;
		maxGrade.setGrade(grds.get(grds.size()-1));
		System.out.println("Your average grade is "+avgGrade.getLetterGrade());
		System.out.println("Your minimum grade is "+minGrade.getLetterGrade());
		System.out.println("Your maximum grade is "+maxGrade.getLetterGrade());

	}
}
