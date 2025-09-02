package Controller;
import Model.Student;
import View.StudentView;
public class StudentController {
	
	private Student Model;
	private StudentView view;
	public StudentController(Student model,StudentView view){
		this.Model = model;
		this.view = view;
	}
	
	public void displayStudent() {
		// TODO Auto-generated method stub
		view.print(Model.getId(),Model.getName(), Model.getAddress());
	}
	
}
