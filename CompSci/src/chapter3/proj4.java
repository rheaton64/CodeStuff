package chapter3;

import java.util.Scanner;

//Ryan
//Project 3.4

public class proj4 {
		static Employee e = new Employee();
		static Scanner scan = new Scanner(System.in);
		public static void main(String[] args){
			getInputs();
			System.out.println("Your employee's weekly pay is $"+calculate());
		}
		public static void getInputs(){
			System.out.println("Please enter employee's hourly wage");
			e.setWage(scan.nextDouble());
			System.out.println("Please enter employee's regular hours");
			e.setrHours(scan.nextDouble());
			System.out.println("Please enter employee's overtime hours");
			e.setoHours(scan.nextDouble());
		}
		public static double calculate(){
			return (e.getWage()*e.getrHours())+((e.getWage()*1.5)*e.getoHours());
		}
}
