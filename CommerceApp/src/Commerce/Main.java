package Commerce;
import java.util.*;
public class Main {
	public static void main(String[] args) {

	Commercecontroller controller = new Commercecontroller();
	Scanner scanner = new Scanner(System.in);
    while (true) {
        System.out.println("\\n--- E-Commerce Management System ---");
        System.out.println("1. Create Item");
        System.out.println("2. View Items");
        System.out.println("3. Update Item");
        System.out.println("4. Exit");
        System.out.print("Enter your choice: ");

        int choice = scanner.nextInt();
        scanner.nextLine();  // Consume newline

        switch (choice) {
            case 1:
                controller.createcommerce();
                break;
            case 2:
                controller.displayCommerce();
                break;
            case 3:
                controller.updateCommerce();
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
