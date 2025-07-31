package Commerce;
import java.util.*;
public class Commerceview {
	private final Scanner scanner = new Scanner(System.in);
	public void displayCommerce(List<Commercemodel> commerces) {
	    System.out.println("====E-Commerce List====");
	    for (Commercemodel s : commerces) {
	        System.out.println("Name: " + s.getName());
	        System.out.println("Id: " + s.getId());
	        System.out.println("Size: " + s.getSize());
	        System.out.println("Cost: " + s.getCost());
	        System.out.println("-------------------------");
	    }
	}

	public Commercemodel createcommerce() {
	    Commercemodel s = new Commercemodel();
	    System.out.println("----Create Item Details-----");
	    System.out.print("Enter Item name: ");
	    s.setName(scanner.nextLine());
	    System.out.print("Enter Item id: ");
	    s.setId(scanner.nextLine());
	    System.out.print("Enter Item size: ");
	    s.setSize(scanner.nextInt());
	    scanner.nextLine(); // consume newline
	    System.out.print("Enter Item cost: ");
	    s.setCost(scanner.nextInt());
	    scanner.nextLine(); // consume newline
	    return s;
	}

	public void updateCommerce(List<Commercemodel> commerces) {
	    System.out.print("Enter the ID of the item to update: ");
	    String id = scanner.nextLine();

	    boolean found = false;
	    for (Commercemodel item : commerces) {
	        if (item.getId().equals(id)) {
	            System.out.println("Item found. Enter new details:");

	            System.out.print("Enter new name: ");
	            item.setName(scanner.nextLine());

	            System.out.print("Enter new size: ");
	            item.setSize(scanner.nextInt());
	            scanner.nextLine();

	            System.out.print("Enter new cost: ");
	            item.setCost(scanner.nextInt());
	            scanner.nextLine();

	            System.out.println("Item updated successfully!");
	            found = true;
	            break;
	        }
	    }

	    if (!found) {
	        System.out.println("Item with ID " + id + " not found.");
	    }
	}

}
