package chapter6;

//Ryan
//Password object class for password programming project

import java.util.Scanner;

public class Password {
	//Instance variable
	private String site;
	//Default constuctor
	public Password(){
		this.site = site;
	}
	//Contructor with a parameter
	public Password(String site){
		this.site = site;
	}
	//Getter and Setter
	public void setSite(String site){
		this.site = site;
	}
	public String getSite(){
		return site;
	}
	//Generates and returns the password
	public String getPassword(){
		int vowelCount = 0;
		String vowels = "";
		for(int i = 0; i < site.length(); i++){
			String temp = site.substring(i, i+1);
			if(temp.equalsIgnoreCase("a") || temp.equalsIgnoreCase("e") || temp.equalsIgnoreCase("i") || temp.equalsIgnoreCase("o") || temp.equalsIgnoreCase("u") || temp.equalsIgnoreCase("y")){
				vowelCount++;
				vowels = vowels+temp+i;
			}
		}
		int dotNum = site.indexOf('.');
		vowelCount = (vowelCount+16+site.length()+dotNum)<<20;
		dotNum *=3;
		String dot = ""+dotNum;
		if(site.substring(0,1).compareTo("m") > 0){
			return "@"+dot+vowels+vowelCount;
		}
		else if(site.substring(0,1).compareTo("m") < 0){
			return "$"+dot+vowels+vowelCount;
		}
		else if(site.substring(0,1).compareTo("m") == 0){
			return "#"+dot+vowels+vowelCount;
		}
		else{
			return "#"+dot+vowels+vowelCount;
		}
	}
	//toString Method
	public String toString(){
		return "Website Name: "+site+"\nPassword: "+getPassword();
	}
}
