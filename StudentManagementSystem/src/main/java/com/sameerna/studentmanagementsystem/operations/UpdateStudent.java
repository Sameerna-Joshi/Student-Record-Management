package com.sameerna.studentmanagementsystem.operations;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
@WebServlet("/UpdateStudent")
public class UpdateStudent extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
	int studentId = Integer.parseInt(req.getParameter("rollno"));
  Session sc = new Configuration().configure().addAnnotatedClass(Student.class).buildSessionFactory().openSession();
	Transaction t = sc.beginTransaction();
	Student std = sc.get(Student.class, studentId);
	t.commit();
	sc.close();
	
	
	req.setAttribute("Student",std);
	RequestDispatcher rd = req.getRequestDispatcher("UpdateStudent.jsp");
	rd.forward(req, resp);
	
	
	}

}
