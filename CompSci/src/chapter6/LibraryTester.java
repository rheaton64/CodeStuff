package chapter6;
import java.util.Scanner;
import java.util.Vector;

//Ryan
//Programming Project 6.5 - Library with Patrons and Books

public class LibraryTester {
	//Initializes Scanners, global vars, and vectors
	static Scanner scan = new Scanner(System.in);
	public static boolean run = true;
	public static Vector<Book> bookList = new Vector<>();
	public static Vector<Patron> patronList = new Vector<>();
	public static void main(String[] args) {
		//Creates Books
		bookList.add(new Book("Hamlet", "Shakespeare"));
		bookList.add(new Book("Greek Realities", "Finley Hooper"));
		bookList.add(new Book("The Histories", "Herodotus"));

		//Creates Patrons
		patronList.add(new Patron("Ryan"));
		patronList.add(new Patron("Johnny"));
		
		//Runs the prompt
		System.out.println("Hello there! Welcome to the library!");
		while(run == true){
			initialPrompt();
		}
	}
	//Initial, "Main Menu" Prompt
	public static void initialPrompt(){
		System.out.println("What would you like to do?"+"\n"+
				"1. Browse the books"+"\n"+
				"2. Talk to the Patrons"+"\n"+
				"3. Leave");
		int input = scan.nextInt();
		while(true){
			if(input > 3){
				System.out.println("That is not a valid input");
				input = scan.nextInt();
			}
			else
				break;
		}
		switch(input){
		case 1: bookPrompt(); break;
		case 2: patronPrompt(); break;
		case 3: run = false; break;
		}
	}
	//Prompt when browsing books
	public static void bookPrompt(){
		System.out.println("Here are the available books:");
		for(int i = 0; i < bookList.size(); i++){
			System.out.println(bookList.get(i));
		}
		System.out.println("\nWhat would you like to do?"+"\n"+
				"1. Add a Book"+"\n"+
				"2. Go Back");
		int input = scan.nextInt();
		while(true){
			if(input > 2){
				System.out.println("That is not a valid input");
				input = scan.nextInt();
			}
			else
				break;
		}
		switch(input){
		case 1: addBook(); break;
		case 2: break;
		}
	}
	//Method to add a new book
	public static void addBook(){
		scan.nextLine();
		System.out.println("Please enter the title of the new book");
		String t = scan.nextLine();
		System.out.println("Please enter the author of the new book");
		String a = scan.nextLine();
		bookList.add(new Book(t, a));
		System.out.println(t+", by "+a+" has been added to the library\n");
	}
	//Prompt when talking to the Patrons
	public static void patronPrompt(){
		System.out.println("Here are the patrons in the library right now:");
		for(int i = 0; i < patronList.size(); i++){
			System.out.println(patronList.get(i));
		}
		System.out.println("Which patron would you like to talk to?");
		String input = scan.next();
		int num = -1;
		boolean test = true;
		while(test){
			for(int i = 0; i < patronList.size(); i++){
				if(patronList.get(i).getName().equals(input)){
					num = i;
				}
			}
			if(num != -1){
				test = false;
				System.out.println("\nWhat would you like to talk to "+patronList.get(num).getName()+" about?"+"\n"+
						"1. Ask if they have borrowed a book"+"\n"+
						"2. Tell them to borrow a certain book"+"\n"+
						"3. Tell them to return a certain book"+"\n"+
						"4. Go back");
				int input1 = scan.nextInt();
				while(true){
					if(input1 > 4){
						System.out.println("That is not a valid input");
						input1 = scan.nextInt();
					}
					else
						break;
				}
				switch(input1){
				case 1: askBook(num); break;
				case 2: borrowBook(num); break;
				case 3: returnBook(num); break;
				case 4: break;
				}
			}
			else{
				System.out.println("That patron is not in the library, would you like to add them?");
				String in = scan.next();
				if(in.equalsIgnoreCase("Yes")){
					patronList.add(new Patron(input));
					System.out.println(input+" has now entered the library");
				}		
				else{
					test = false;
				}
			}
		}
	}
	//Method to ask a Patron if they had borrowed a book
	public static void askBook(int num){
		scan.nextLine();
		System.out.println("What book would you like to ask about?");
		String input = scan.nextLine();
		if(patronList.get(num).hasBook(input) == true){
			System.out.println("Yes, "+patronList.get(num).getName()+" has checked out that book\n");
		}
		else{
			System.out.println("No, "+patronList.get(num).getName()+" has not checked out that book\n");
		}


	}
	//Method to tell a Patron to borrow a book
	public static void borrowBook(int num){
		scan.nextLine();
		if(patronList.get(num).getBooks() == 3){
			System.out.println("This patron has already checked out the maximum of 3 books\n");
		}
		else{
			System.out.println("What book would you like to tell "+patronList.get(num).getName()+" to check out?");
			String input = scan.nextLine();
			boolean check = true;
			int book = -1;
			while(check){
				for(int i = 0; i < bookList.size(); i++){
					if(bookList.get(i).getTitle().equals(input)){
						book = i;
					}
				}
				if(book != -1){
					if(bookList.get(book).isBorrowed() == true){
						System.out.println("I'm sorry, that book has already been checked out. Please enter another book or \"exit\" to exit ");
						input = scan.nextLine();
						if(input.equals("exit")){
							check = false;
						}
					}
					else{
						bookList.get(book).setBorrowed(true);
						patronList.get(num).addBook(bookList.get(book));
						System.out.println(patronList.get(num).getName()+" has now checked out "+bookList.get(book).getTitle()+"\n");
						check = false;
					}
				}
				else{
					System.out.println("That book is not available in this library, please enter another book or \"exit\" to exit");
					input = scan.nextLine();
					if(input.equals("exit")){
						check = false;
					}
				}
			}
		}
	}
	//Method to tell a Patron to return a book
	public static void returnBook(int num){
		scan.nextLine();
		if(patronList.get(num).getBooks() == 0){
			System.out.println("This patron has not check out any books\n");
		}
		else{
			System.out.println("Which book would you like "+patronList.get(num).getName()+" to return?");
			String input = scan.nextLine();
			boolean check = true;
			while(check){
				if(patronList.get(num).hasBook(input) == true){
					patronList.get(num).returnBook(input);
					for(int i = 0; i < bookList.size(); i++){
						if(bookList.get(i).getTitle().equals(input)){
							
							bookList.get(i).setBorrowed(false);
						}
					}
					check = false;
					System.out.println(patronList.get(num).getName()+" has now returned "+input+"\n");
				}
				else{
					System.out.println(patronList.get(num).getName()+" has not checked out that book, please enter another book or \"exit\" to exit");
					input = scan.nextLine();
					if(input.equals("exit")){
						check = false;
					}
				}
			}
		}
	}
}
