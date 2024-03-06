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
@WebServlet("/deleteteacher")
public class DeleteTeacher  extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int teacherId = Integer.parseInt(req.getParameter("teacherId"));
		
		Session sc = new Configuration().configure().addAnnotatedClass(Teacher.class).buildSessionFactory().openSession();
		Transaction t = sc.beginTransaction();	
		NativeQuery c = sc.createNativeQuery(" delete from teacher where teacherId =:tid");
		
		
		//Transaction t = sc.beginTransaction();

		c.setParameter("tid", teacherId);
		int ans = c.executeUpdate();
		if(ans==1)
		{
			NativeQuery cm = sc.createNativeQuery(" update student set teacherId = 0 where teacherId =:tid");
			cm.setParameter("tid", teacherId);
			cm.executeUpdate();
			PrintWriter w = resp.getWriter();
			w.print("<marquee>Deletion Done</marquee>");
		}
		else
		{
			PrintWriter w = resp.getWriter();
			w.print("<marquee>Deletion Failed</marquee>");

		}



		t.commit();
		sc.close();
	}

}
