package chapter6;

public class LibraryTester2 {
	public static void main(String[] args) {
		Patron p = new Patron("John Bob");
		Book b1 = new Book("John Steinbeck", "Of Mice and Men");
		Book b2 = new Book("Cider House Rules", "John Irving");
		Book b3 = new Book("Hamlet", "Shakespeare");
		Book b4 = new Book("The Great Gatsby", "F. Scott Fitzgerald");
		
		System.out.println(p.addBook(b1));
		System.out.println(p.addBook(b2));
		System.out.println(p.addBook(b3));
		System.out.println(p.addBook(b4));
		System.out.println(p);
		System.out.println(p.returnBookBool("Of Mice and Men"));
		System.out.println(p);
		System.out.println(p.hasBook("The Perfect Storm"));
		System.out.println(p.hasBook("Hamlet"));
		
		
	}
}
