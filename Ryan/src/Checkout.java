import java.util.Scanner;

public class Checkout {

	public static void main(String[] args) {
		
		Scanner item = new Scanner(System.in);
		Item item1 = new Item("Milk", "Dairy", 3.00);
		System.out.println(item1.getName());
		System.out.println(item1.getCategory());
		System.out.println(item1.getPrice());
		receipt(itemArray(item));
		
	}
	public static Item[] itemArray(Scanner item){
		Item[] Items = new Item[3];
		System.out.println("Name of Item #1");
		String a0n = item.next();
		System.out.println("Category");
		String a0c = item.next();
		System.out.println("Price");
		double a0p = item.nextDouble();
		Items[0]= new Item(a0n, a0c, a0p);
		System.out.println("#2");
		String a1n = item.next();
		String a1c = item.next();
		double a1p = item.nextDouble();
		Items[1] = new Item(a1n, a1c, a1p);
		System.out.println("#3");
		String a2n = item.next();
		String a2c = item.next();
		double a2p = item.nextDouble();
		Items[2] = new Item(a2n, a2c, a2p);
		
		return Items;
	}
	public static void receipt(Item[] items){
		System.out.println("Summertech Groceries");
		System.out.println();
		System.out.println(items[0]);
		System.out.println(items[1]);
		System.out.println(items[2]);
		double totalPrice = items[0].getPrice() + items[1].getPrice() + items[2].getPrice();
		System.out.println("Total = "+totalPrice);
	}
	

}
