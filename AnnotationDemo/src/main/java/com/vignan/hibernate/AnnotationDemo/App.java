package com.vignan.hibernate.AnnotationDemo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
    public static void main(String[] args) {
        // Create a Hibernate configuration object
        Configuration cfg = new Configuration();
        // Configure using the hibernate.cfg.xml file
        cfg.configure("hibernate.cfg.xml");
        // Add the annotated entity class
        cfg.addAnnotatedClass(Employee.class);
        
        // Build the session factory
        SessionFactory factory = cfg.buildSessionFactory();
        
        // Open a new session
        Session session = factory.openSession();
        
        // Begin a transaction
        Transaction tx = session.beginTransaction();
        
        // Create an employee object
        Employee emp = new Employee(3, "Chandu", "R");
        
        // Save the employee to the database
        session.save(emp);
        
        // Commit the transaction
        tx.commit();
        
        // Close the session and factory
        session.close();
        factory.close();
        
        System.out.println("Employee saved successfully!");
    }
}