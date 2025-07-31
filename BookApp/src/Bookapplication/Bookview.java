package Bookapplication;
import java.util.*;
public class Bookview {
	
	private final Scanner scanner = new Scanner(System.in);
	public void displayBooks(List<Book> books) {
	    System.out.println("==== Book List ====");
	    for (Book b : books) {
	        System.out.println("Name: " + b.getName());
	        System.out.println("Phone: " + b.getPhone());
	        System.out.println("Email: " + b.getEmail());
	        System.out.println("-------------------------");
	    }
	}

	public Book createBook() {
	    Book b = new Book();
	    System.out.println("----Create Book Entry-----");
	    System.out.print("Enter Name: ");
	    b.setName(scanner.nextLine());
	    System.out.print("Enter Phone: ");
	    b.setPhone(scanner.nextLine());  // use String to preserve leading zeros
	    System.out.print("Enter Email: ");
	    b.setEmail(scanner.nextLine());
	    return b;
	}

	public void updateBook(List<Book> books) {
	    System.out.print("Enter the phone number of the person to update: ");
	    String phone = scanner.nextLine();

	    boolean found = false;
	    for (Book b : books) {
	        if (b.getPhone().equals(phone)) {
	            System.out.println("Entry found. Enter new details:");

	            System.out.print("Enter new name: ");
	            b.setName(scanner.nextLine());

	            System.out.print("Enter new email: ");
	            b.setEmail(scanner.nextLine());

	            System.out.println("Entry updated successfully!");
	            found = true;
	            break;
	        }
	    }

	    if (!found) {
	        System.out.println("Entry with phone number " + phone + " not found.");
	    }
	}

}
