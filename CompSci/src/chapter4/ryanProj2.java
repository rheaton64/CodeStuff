package chapter4;

//Ryan
//Project 4.2

import java.util.Scanner;

public class ryanProj2 {
	static ryanTriangle t = new ryanTriangle();
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args){
		getInputs();
		if(t.isRight() == true){
			System.out.println("Your triangle is right");
		}
		if(t.isRight() == false){
			System.out.println("Your triangle is not right");
		}
	}
	
	public static void getInputs(){
		System.out.println("Please enter a side length");
		t.setL1(scan.nextDouble());
		System.out.println("Please enter a side length");
		t.setL2(scan.nextDouble());
		System.out.println("Please enter a side length");
		t.setL3(scan.nextDouble());
	}
}
