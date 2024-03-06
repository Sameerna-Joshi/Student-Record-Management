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

import com.sameerna.studentmanagementsystem.operations.Teacher;
@WebServlet("/updateTeacher")
public class UpdateTeacher extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int tid = Integer.parseInt(req.getParameter("teacherId"));
		int upno = Integer.parseInt(req.getParameter("utn"));
		
		
		Session sc = new Configuration().configure().addAnnotatedClass(Teacher.class).buildSessionFactory().openSession();
		Transaction t = sc.beginTransaction();
		NativeQuery cnq = sc.createNativeQuery("select teacherId from teacher where teacherId=:tid");
		cnq.setParameter("tid", tid);
		Integer teacherId = (Integer)cnq.getSingleResult();
	    if(teacherId == tid)
		{
			NativeQuery cn = sc.createNativeQuery("update teacher set teacherNumber =:tno where teacherId=:tid");
			cn.setParameter("tno",upno);
			cn.setParameter("tid",tid);
			int ans = cn.executeUpdate();
			if(ans==1)
			{
				PrintWriter wr = resp.getWriter();
				wr.print("Record Updated Successfully");
			}
			else
			{
				PrintWriter wr = resp.getWriter();
				wr.print("Record Not Updated ");	
			}
			
		}
		else
		{
			PrintWriter wr = resp.getWriter();
			wr.print("No teacher Found");
		}
		
		
		t.commit();
		sc.close();
	}

}
