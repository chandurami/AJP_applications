package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.hibernate.Session;
import org.hibernate.Transaction;
import com.helper.FactoryProvider;
import com.vignan.Student;

@WebServlet("/createStudentServlet")
public class createStudentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public createStudentServlet() {
		super();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String studentName = request.getParameter("studentName");
		String studentAddress = request.getParameter("studentAddress");

		Student student = new Student();
		student.setStudentName(studentName);
		student.setStudentAddress(studentAddress);
		Session session = FactoryProvider.getFactory().openSession();
		Transaction tx = session.beginTransaction();
		session.persist(student);
		tx.commit();
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<h1 style='text-align:center;'>Student is added successfully</h1>");
		out.println("<h1 style='text-align:center;'><a href='listStudents.jsp'>View all Students</a></h1>");
	}
}