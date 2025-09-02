import Controller.StudentController;
import Model.Student;
import View.StudentView;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student Model  = new Student(34,"Pratap","Valley");
		StudentView view= new StudentView();
		StudentController controller = new StudentController(Model,view);
		controller.displayStudent();
		


	}

}
