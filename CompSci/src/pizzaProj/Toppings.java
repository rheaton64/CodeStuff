package pizzaProj;

//Ryan
//1-2-18
//Toppings class for Pizza project

import java.util.Scanner;

public class Toppings {
	private static Scanner scan = new Scanner(System.in);
	private int count = 0;
	//Instance variables
	private String type;
	private String size;
	private Size s;
	private String[] toppings;
	//Constructor
	public Toppings(String t, String sz){
		type = t;
		size = sz;
		s = new Size();
		s.setSize(t, sz);
		toppings = null;
	}
	//Method to set toppings
	public void setToppings(){
		if(s.getType().equalsIgnoreCase("regular")){
			toppings = new String[4];
			System.out.println("You may enter up to 4 toppings, please enter a topping or type \"done\" to finish");
			while(true){
				String top = scan.nextLine();
				if(top.equalsIgnoreCase("done")){
					break;
				}
				else{
					toppings[count] = top;
					count++;
					if(count == 4){
						break;
					}
					else
						System.out.println("You have "+(4-count)+" toppings left, please enter a topping or type \"done\" to finish");
				}
			}
		}
		else if(s.getType().equalsIgnoreCase("sicilian")){
			toppings = new String[2];
			System.out.println("You may enter up to 2 toppings, please enter a topping or \"done\" to finish");
			while(true){
				String top = scan.nextLine();
				if(top.equalsIgnoreCase("done")){
					break;
				}
				else{
					toppings[count] = top;
					count++;
					if(count == 2){
						break;
					}
					else
						System.out.println("You have "+(2-count)+" toppings left, please enter a topping or \"done\" to finish");
				}
			}
		}
	}
	//Getters
	public String getType(){
		return s.getType();
	}
	public String getSize(){
		return s.getSize();
	}
	public double getPrice(){
		return s.getPrice();
	}
	public String[] getToppings(){
		return toppings;
	}
	public String toString(){
		String str = "$"+s.getPrice()+" - 1 "+s.getSize()+" "+s.getType()+" Pizza - " + "Toppings: ";
		if(count == 0){
			str += "None";
		}
		else{
			for(int i = 0; i < count; i++){
				str += toppings[i]+", ";
			}
			str = str.substring(0, str.length()-2);
		}
		return str;
	}
}
