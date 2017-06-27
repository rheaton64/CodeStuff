
public class Item {
	private String name;
	private String category;
	private double price;
	
	public Item(String name1, String category1, double price1){
		name = name1;
		category = category1;
		price = price1;
	}
	public String getName(){
		return name;
	}
	public String getCategory(){
		return category;
	}
	public double getPrice(){
		return price;
	}
	public String toString(){
		return(category+": "+name+" - "+price);
	}
}
