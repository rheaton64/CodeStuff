package advStrProgProj;

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
}

