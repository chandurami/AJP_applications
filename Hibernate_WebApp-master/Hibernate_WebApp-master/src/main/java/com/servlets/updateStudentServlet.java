package com.servlets;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.hibernate.Session;
import com.helper.FactoryProvider;
import com.vignan.Student;

@WebServlet("/updateStudentServlet")
public class updateStudentServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int studentId = Integer.parseInt(request.getParameter("id"));
        String studentName = request.getParameter("studentName");
        String studentAddress = request.getParameter("studentAddress");

        Session session = FactoryProvider.getFactory().openSession();

        try {
            session.beginTransaction();
            Student student = session.get(Student.class, studentId);

            if (student != null) {
                student.setStudentName(studentName);
                student.setStudentAddress(studentAddress);
                session.merge(student);
            } else {
            	response.setContentType("text/html");
        		PrintWriter out = response.getWriter();
            	out.println("<h1 style='text-align:center;'>Student Not Found</h1>");
        		out.println("<h1 style='text-align:center;'><a href='listStudents.jsp'>View all Students</a></h1>");
            }

            session.getTransaction().commit();
        } finally {
            session.close();
        }

        response.sendRedirect("listStudents.jsp");
    }
}