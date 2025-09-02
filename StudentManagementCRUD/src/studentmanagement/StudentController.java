package studentmanagement;

import java.util.ArrayList;
import java.util.List;

public class StudentController {
    private List<Student> students = new ArrayList<>();
    private StudentView view;

    public StudentController(StudentView view) {
        this.view = view;
    }

    public void addStudent() {
        Student student = view.createStudent();
        students.add(student);
        System.out.println("Student added successfully!\n");
    }

    public void showStudents() {
        if (students.isEmpty()) {
            System.out.println("\nNo students to display.\n");
        } else {
            view.displayStudents(students);
        }
    }

    public void updateStudent(String id, String newName, int newAge) {
        for (Student student : students) {
            if (student.getId().equals(id)) {
                student.setName(newName);
                student.setAge(newAge);
                System.out.println("Student updated successfully!\n");
                return;
            }
        }
        System.out.println("Student with ID " + id + " not found.\n");
    }

    public void deleteStudent(String id) {
        for (Student student : students) {
            if (student.getId().equals(id)) {
                students.remove(student);
                System.out.println("Student deleted successfully!\n");
                return;
            }
        }
        System.out.println("Student with ID " + id + " not found.\n");
    }
}