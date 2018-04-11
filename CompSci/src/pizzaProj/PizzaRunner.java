package pizzaProj;

import java.util.ArrayList;

//Ryan
//1-2-18
//Pizza project Runner class - a program that runs online ordering for a pizza shop

import java.util.Scanner;

public class PizzaRunner {
	//Main method to run the program
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<Toppings> pizzas = new ArrayList<Toppings>();
		double total = 0;
		System.out.println("Welcome to \"The Pizza Shop!\" We sell both Regular and Sicilian Pizzas. What kind of pizza would you like to order?");
		boolean check = true;
		while(check){
			String type = scan.next();
			System.out.println("What size would you like? For Regular we offer from Small to Xlarge, while Sicilians only come in Large and Xlarge");
			String size = scan.next();
			Toppings t = new Toppings(type, size);
			t.setToppings();
			total += t.getPrice();
			pizzas.add(t);
			System.out.println("\nHere is your order: \n");
			for(int i = 0; i < pizzas.size(); i++){
				System.out.println(pizzas.get(i));
			}
			System.out.println("\nTotal: $"+total);
			System.out.println("\nIf you would like to add another pizza, type \"next\", otherwise, type \"done\"");
			String input = scan.next();
			if(input.equalsIgnoreCase("done")){
				System.out.println("\nYour grand total is $"+total+". Thank you for choosing \"The Pizza Shop!\"");
				break;
			}
			else{
				System.out.println("Please enter what kind of pizza you would like to add to your order");
			}
		}
	}
}
