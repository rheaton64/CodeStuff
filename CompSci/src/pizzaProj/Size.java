package pizzaProj;

//Ryan
//1-2-18
//Size class for Pizza project

import java.util.Scanner;

public class Size {
	private static Scanner scan = new Scanner(System.in);
	//Instace variables
	private String type;
	private String size;
	private double price;
	//Constructor
	public Size(){
		this.type = "";
		this.size = "";
		this.price = 0;
	}
	//Method to set type, size, and price
	public void setSize(String t, String s){
		boolean check1 = true;
		while(check1){
			if(t.equalsIgnoreCase("regular")){
				type = "Regular";
				boolean check2 = true;
				while(check2){
					if(s.equalsIgnoreCase("small")){
						size = "Small";
						price = 10.0;
						check1 = false;
						check2 = false;
					}
					else if(s.equalsIgnoreCase("medium")){
						size = "Medium";
						price = 12.0;
						check1 = false;
						check2 = false;
					}
					else if(s.equalsIgnoreCase("large")){
						size = "Large";
						price = 14.0;
						check1 = false;
						check2 = false;
					}
					else if(s.equalsIgnoreCase("xlarge")){
						size = "Extra-Large";
						price = 16.0;
						check1 = false;
						check2 = false;
					}
					else{
						System.out.println("We do not serve "+s+" "+t+" pizza here, please enter a valid size");
						s = scan.next();
					}
				}
			}
			else if(t.equalsIgnoreCase("sicilian")){
				type = "Sicilian";
				boolean check2 = true;
				while(check2){
					if(s.equalsIgnoreCase("large")){
						size = "Large";
						price = 14.0;
						check1 = false;
						check2 = false;
					}
					else if(s.equalsIgnoreCase("xlarge")){
						size = "Extra-Large";
						price = 16.0;
						check1 = false;
						check2 = false;
					}
					else{
						System.out.println("We do not serve "+s+" "+t+" pizza here, please enter a valid size");
						s = scan.next();
					}
				}
			}
			else{
				System.out.println("We do not serve "+t+" pizza here, please enter either Regular or Sicilian");
				t = scan.next();
			}
		}
	}
	//Getters
	public String getType(){
		return type;
	}
	public String getSize(){
		return size;
	}
	public double getPrice(){
		return price;
	}
}
