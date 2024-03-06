package com.sameerna.studentmanagementsystem.operations;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
@WebServlet("/Display")
public class Display extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Session sc = new Configuration().configure().addAnnotatedClass(Student.class).buildSessionFactory().openSession();
		Transaction t = sc.beginTransaction();
		
		Query<Student> createQuery = sc.createQuery("FROM Student");
		List<Student> list = createQuery.list();
		req.setAttribute("Student", list);
		RequestDispatcher rd = req.getRequestDispatcher("Display.jsp");
		rd.forward(req, resp);
		
		
		t.commit();
		sc.close();
	}

}
