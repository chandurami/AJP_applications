package Bookapplication;
import java.util.*;
public class Main {
	public static void main(String[] args) {
		Bookcontroller controller = new Bookcontroller();
		Scanner scanner = new Scanner(System.in);
	    while (true) {
	        System.out.println("\\n--- Book Management System ---");
	        System.out.println("1. Create Book Entry");
	        System.out.println("2. View Book Entries");
	        System.out.println("3. Update Book Entry");
	        System.out.println("4. Exit");
	        System.out.print("Enter your choice: ");

	        int choice = scanner.nextInt();
	        scanner.nextLine();  // Consume newline

	        switch (choice) {
	            case 1:
	                controller.createBook();
	                break;
	            case 2:
	                controller.displayBooks();
	                break;
	            case 3:
	                controller.updateBook();
	                break;
	            case 4:
	                System.out.println("Exiting application...");
	                System.exit(0);
	                break;
	            default:
	                System.out.println("Invalid choice. Please try again.");
	        }
	    }
	}


}
