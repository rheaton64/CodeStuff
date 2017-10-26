package advStrProgProj;

import java.util.ArrayList;

//Ryan
//Project 1 methods

import java.util.Scanner;

public class proj1Methods {
	static Scanner scan = new Scanner(System.in);
	public static String getInput(){
		System.out.println("Please enter a sentence");
		return scan.nextLine();
	}
	public static int wordsInSentence(String str){
		int count = 0;
		for(int i = 0; i < str.length(); i++){
			if(str.substring(i, i+1).equals(" ")){
				count++;
			}
		}
		return count+1;
	}
	public static double avgWords(String str){
		ArrayList<Integer> nums = new ArrayList<>();
		int begin = 0;
		int count = 0;
		while(begin < str.length()){
			int end = str.indexOf(' ', begin);
			if(end == -1){
				end = str.length();
			}
			String word = str.substring(begin, end);
			nums.add(word.length());
			begin = end + 1;
		}
		double sum = 0;
		for(int i = 0; i < nums.size(); i++){
			sum += nums.get(i);
		}
		return sum/nums.size();
	}
}

