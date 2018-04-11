package chapter6;

//Ryan
//Book object class for project 6.5

public class Book {
	//Instance variables
	private String title;
	private String author;
	private boolean isBorrowed;
	//Constructor
	public Book(String title, String author){
		this.title = title;
		this.author = author;
		this.isBorrowed = false;
	}
	//Getters and Setters
	public String getTitle(){
		return title;
	}
	public String getAuthor(){
		return author;
	}
	public void setBorrowed(boolean isBorrowed){
		this.isBorrowed = isBorrowed;
	}
	public boolean isBorrowed(){
		return isBorrowed;
	}
	//toString for my program
	public String toString(){
		if(isBorrowed == true){
			return title + ", by " + author + " --BORROWED--";
		}
		if(isBorrowed == false){
			return title + ", by " + author + " --In Stock--";
		}
		return null;
	}
	//toString for new runner
	/* public String toString(){
		return "Title: "+title+": "+author;
	}*/
}
