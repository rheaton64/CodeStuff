package advStrProgProj;

import java.util.Scanner;

//Ryan
//Methods for Project 2

public class proj2Methods {
	private static Scanner scan = new Scanner(System.in);
	public static String sentInput(){
		System.out.println("Please enter a sentence");
		return scan.nextLine();
	}
	public static String wordInput(){
		System.out.println("Please enter a word to remove");
		return scan.nextLine();
	}
	public static String output(String sent, String word){
		word = " "+word+" ";
		sent = " "+sent+" ";
		int begin = 0;
		boolean check = true;
		while(sent.indexOf(word) != -1){
			sent = sent.replaceAll(word, " ");
		}
		return sent;
	}
}
