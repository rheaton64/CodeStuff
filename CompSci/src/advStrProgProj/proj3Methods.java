package advStrProgProj;

import java.util.Scanner;

//Ryan
//Methods for Project 3

public class proj3Methods {
	private static Scanner scan = new Scanner(System.in);
	public static String sentInput(){
		System.out.println("Please enter a sentence");
		return scan.nextLine();
	}
	public static int countVowels(String sent){
		int count = 0;
		for(int i = 0; i < sent.length(); i++){
			String temp = sent.substring(i, i+1);
			if(temp.equalsIgnoreCase("a") || temp.equalsIgnoreCase("e") || temp.equalsIgnoreCase("i") || temp.equalsIgnoreCase("o") || temp.equalsIgnoreCase("u") || temp.equalsIgnoreCase("y")){
				count++;
			}
		}
		return count;
	}
	public static String removeVowels(String sent){
		sent = " "+sent+" ";
		for(int i = 0; i < sent.length(); i++){
			String temp = sent.substring(i, i+1);
			if(temp.equalsIgnoreCase("a") || temp.equalsIgnoreCase("e") || temp.equalsIgnoreCase("i") || temp.equalsIgnoreCase("o") || temp.equalsIgnoreCase("u") || temp.equalsIgnoreCase("y")){
				sent = sent.substring(0, i)+sent.substring(i+1);
				i--;
			}
		}
		return sent;
	}
}
