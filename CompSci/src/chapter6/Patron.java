package chapter6;

//Ryan
//Patron object class for project 6.5

public class Patron {
	//Instance variables
	private String name;
	private Book b1;
	private Book b2;
	private Book b3;
	private int books;
	//Constructor
	public Patron(String name){
		this.name = name;
		this.b1 = null;
		this.b2 = null;
		this.b3 = null;
		this.books = 0;
	}
	//Getters
	public String getName(){
		return name;
	}
	public int getBooks(){
		return books;
	}
	//Method to add a book
	public boolean addBook(Book b){
		if(books == 3){
			return false;
		}
		else{
			if(b1 == null){
				b1 = b;
				books++;
			}
			else if(b2 == null){
				b2 = b;
				books++;
			}
			else if(b3 == null){
				b3 = b;
				books++;
			}
			return true;
		}
	}
	//Method to return a book
	public void returnBook(String title){
		if(b1.getTitle().equals(title)){
			b1 = null;
			books--;
		}
		else if(b2.getTitle().equals(title)){
			b2 = null;
			books--;
		}
		else if(b3.getTitle().equals(title)){
			b3 = null;
			books--;
		}
	}
	public boolean returnBookBool(String title){
		if(b1.getTitle().equals(title)){
			b1 = null;
			books--;
			return true;
		}
		else if(b2.getTitle().equals(title)){
			b2 = null;
			books--;
			return true;
		}
		else if(b3.getTitle().equals(title)){
			b3 = null;
			books--;
			return true;
		}
		return false;
	}
	//Method to check if the Patron has a certain book
	public boolean hasBook(String title){
		if(books == 0){
			return false;
		}
		else if(b1 != null && b1.getTitle().equals(title)){
			return true;
		}
		else if(b2 != null && b2.getTitle().equals(title)){
			return true;
		}
		else if(b3 != null && b3.getTitle().equals(title)){
			return true;
		}
		else{
			return false;
		}
	}
	//toString for my program
	public String toString(){
		return name + ": " + books + " books checked out";
	} 
	//toString for new runner
	/*public String toString(){
		String str = "Patron's name: "+name;
		if(b1 != null){
			str = str+"\n"+b1;
		}
		if(b2 != null){
			str = str+"\n"+b2;
		}
		if(b3 != null){
			str = str+"\n"+b3;
		}
		return str;
				
	}*/
}
