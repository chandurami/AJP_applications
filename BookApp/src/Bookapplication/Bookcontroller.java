package Bookapplication;
import java.util.*;
public class Bookcontroller {
	private final List<Book> books;
	private final Bookview bookView;
	
	public Bookcontroller() {
	    books = new ArrayList<>();
	    bookView = new Bookview();
	}

	public void addBook(Book book) {
	    books.add(book);
	}

	public void displayBooks() {
	    bookView.displayBooks(books);
	}

	public void createBook() {
	    Book book = bookView.createBook();
	    addBook(book);
	    System.out.println("Book entry added successfully!");
	}

	public void updateBook() {
	    if (books.isEmpty()) {
	        System.out.println("No entries available to update.");
	        return;
	    }
	    bookView.updateBook(books);
	}

}
