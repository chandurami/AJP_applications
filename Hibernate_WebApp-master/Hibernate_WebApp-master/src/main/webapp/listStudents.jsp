<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page import="java.util.List" %>
<%@ page import="org.hibernate.SessionFactory" %>
<%@ page import="org.hibernate.Session" %>
<%@ page import="com.vignan.Student" %>
<%@ page import="com.helper.FactoryProvider" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>List Students</title>
    <style>
        body {
            font-family: Arial, sans-serif;
        }
        h1 {
            color: #333;
        }
        table {
            width: 80%;
            margin: 20px auto;
            border-collapse: collapse;
        }
        th, td {
            border: 1px solid #ccc;
            padding: 8px;
            text-align: left;
        }
        th {
            background-color: #f2f2f2;
        }
    </style>
</head>
<body>
    <h1>List of Students</h1>
    
    <table>
        <tr>
            <th>ID</th>
            <th>Student Name</th>
            <th>Student Address</th>
        </tr>
        
        <% 
            Session session2 = FactoryProvider.getFactory().openSession();
            
            try {
                session2.beginTransaction();
                List<Student> students = session2.createQuery("from Student").getResultList();
                
                for (Student student : students) {
        %>
                <tr>
                    <td><%= student.getId() %></td>
                    <td><%= student.getStudentName() %></td>
                    <td><%= student.getStudentAddress() %></td>
                </tr>
        <%
                }
                session2.getTransaction().commit();
            } finally {
            	session2.close();
            }
        %>
        <div class="container text-center mt-2">
        	<a href="index.jsp" class="btn btn-primary">Home</a>
        </div>
    </table>
</body>
</html>