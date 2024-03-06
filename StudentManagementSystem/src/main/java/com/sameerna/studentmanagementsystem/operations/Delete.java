package com.sameerna.studentmanagementsystem.operations;

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
@WebServlet("/delete")
public class Delete  extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int studentId = Integer.parseInt(req.getParameter("studentNumber"));
		Session sc = new Configuration().configure().addAnnotatedClass(Student.class).buildSessionFactory().openSession();
		Transaction t = sc.beginTransaction();
		NativeQuery cnq = sc.createNativeQuery("delete from student where studentId =:stdId");
		cnq.setParameter("stdId", studentId);
		int ans = cnq.executeUpdate();
		if(ans==1)
		{
			PrintWriter writer = resp.getWriter();
			writer.print("Deletion Successfull");
			
			
		}
		else
		{
			PrintWriter writer = resp.getWriter();
			writer.print("Deletion Failed :-  This happens when you enters wrong student Id");
			
		}
		
		t.commit();
		sc.close();
	}

}
