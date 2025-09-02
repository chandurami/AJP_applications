package studentmanagement;

import java.util.List;
import java.util.Scanner;

public class StudentView {
    private final Scanner scanner = new Scanner(System.in);

    public void displayStudents(List<Student> students) {
        System.out.println("\n-------- Student List --------");
        for (Student student : students) {
            System.out.println("Name: " + student.getName());
            System.out.println("ID: " + student.getId());
            System.out.println("Age: " + student.getAge());
            System.out.println("--------------------------");
        }
    }

    public Student createStudent() {
        Student student = new Student();
        System.out.println("------- Create Student Details -------");
        System.out.print("Enter Student name: ");
        student.setName(scanner.nextLine());
        System.out.print("Enter id: ");
        student.setId(scanner.nextLine());
        System.out.print("Enter Student age: ");
        student.setAge(scanner.nextInt());
        scanner.nextLine(); 
        return student;
    }
}