package com.sameerna.studentmanagementsystem.operations;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
@WebServlet("/add")
public class AddStudentServlet extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int rollNumber = Integer.parseInt(req.getParameter("rollNo"));
		String studentName = req.getParameter("name");
		String fatherName = req.getParameter("fName");
		int parentNumber = Integer.parseInt(req.getParameter("fNumber"));
		String Gender = req.getParameter("gender");
		int sub1 = Integer.parseInt(req.getParameter("marks1"));
		int sub2 = Integer.parseInt(req.getParameter("marks2"));
		int sub3 = Integer.parseInt(req.getParameter("marks3"));
		int sub4 = Integer.parseInt(req.getParameter("marks4"));
		int sub5 = Integer.parseInt(req.getParameter("marks5"));
		int sub6 = Integer.parseInt(req.getParameter("marks6"));
		int totalMarks = Integer.parseInt(req.getParameter("totalMarks"));
		int marksSecured = Integer.parseInt(req.getParameter("marksSecured"));
		String result = req.getParameter("result");
		int teacherId = Integer.parseInt(req.getParameter("teacherId"));
		
		Student std = new Student();
		std.setStudentId(rollNumber);
		std.setStudentName(studentName);
		std.setFatherName(fatherName);
		std.setGender(Gender);
		std.setMarks1(sub1);
		std.setMarks2(sub2);
		std.setMarks3(sub3);
		std.setMarks4(sub4);
		std.setMarks5(sub5);
		std.setMarks6(sub6);
		std.setTotalMarks(totalMarks);
		std.setMarksSecured(marksSecured);
		std.setResult(result);
		std.setTeacherId(teacherId);
		std.setParentNumber(parentNumber);
		
		
		Session sc  = new Configuration().configure().addAnnotatedClass(Student.class).buildSessionFactory().openSession();
		Transaction t = sc.beginTransaction();
		
		sc.save(std);
		
		t.commit();
		resp.sendRedirect("Operations.jsp");
		sc.close();
		
		
		
		
		
		
	}

}
