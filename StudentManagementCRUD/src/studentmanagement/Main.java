
package studentmanagement;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StudentView view = new StudentView();
        StudentController controller = new StudentController(view);
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n==== Student Management Menu ====");
            System.out.println("1. Add Student");
            System.out.println("2. View All Students");
            System.out.println("3. Update Student");
            System.out.println("4. Delete Student");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    controller.addStudent();
                    break;
                case 2:
                    controller.showStudents();
                    break;
                case 3:
                    System.out.print("Enter student ID to update: ");
                    String idToUpdate = scanner.nextLine();
                    System.out.print("Enter new name: ");
                    String newName = scanner.nextLine();
                    System.out.print("Enter new age: ");
                    int newAge = scanner.nextInt();
                    scanner.nextLine();
                    controller.updateStudent(idToUpdate, newName, newAge);
                    break;
                case 4:
                    System.out.print("Enter student ID to delete: ");
                    String idToDelete = scanner.nextLine();
                    controller.deleteStudent(idToDelete);
                    break;
                case 5:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice! Try again.");
            }
        }
    }
}