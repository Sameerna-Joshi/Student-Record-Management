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
@WebServlet("/update")
public class Update extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		int studentId = Integer.parseInt(req.getParameter("studentId"));
		int updatedPhoneNumber = Integer.parseInt(req.getParameter("upn"));
		
		Session sc = new Configuration().configure().addAnnotatedClass(Student.class).buildSessionFactory().openSession();
		Transaction t = sc.beginTransaction();
		
		NativeQuery cnq = sc.createNativeQuery("update student set parentNumber=:upn where studentId=:sid");
		cnq.setParameter("upn",updatedPhoneNumber );
		cnq.setParameter("sid", studentId);
		int ans = cnq.executeUpdate();
		if(ans==1)
		{
			PrintWriter wr = resp.getWriter();
			wr.println("Record Updated Successfully");
		}
		else
		{
			PrintWriter wr = resp.getWriter();
			wr.println("Record  Not Updated ");	
		}
		
		t.commit();
		sc.close();
	}

}
