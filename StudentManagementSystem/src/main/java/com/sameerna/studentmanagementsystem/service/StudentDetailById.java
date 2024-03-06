package com.sameerna.studentmanagementsystem.service;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.NativeQuery;

import com.sameerna.studentmanagementsystem.operations.Student;
@WebServlet("/fetch")
public class StudentDetailById  extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int studentId = Integer.parseInt(req.getParameter("studentId"));
		
		Session sc = new Configuration().configure().addAnnotatedClass(Student.class).buildSessionFactory().openSession();
		Transaction t = sc.beginTransaction();
		NativeQuery cnq = sc.createNativeQuery("select studentId from student where studentId=:sid");
		cnq.setParameter("sid", studentId);
		Integer singleResult =(Integer) cnq.getSingleResult();
		if(studentId == singleResult)
		{
			Student student = sc.get(Student.class, studentId);
			PrintWriter writer = resp.getWriter();
			writer.println(student);
			
		}
		else
		{
			PrintWriter writer = resp.getWriter();
			writer.println("StudentId Does Not Exist in Database");
		}
		
		
		t.commit();
		sc.close();
	}
 
}
