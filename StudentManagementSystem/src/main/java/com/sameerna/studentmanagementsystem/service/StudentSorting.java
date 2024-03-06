package com.sameerna.studentmanagementsystem.service;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.List;

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
@WebServlet("/StudentDetailWithHighestMarks")
public class StudentSorting extends HttpServlet 
{
   @SuppressWarnings("unchecked")
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	String ans = req.getParameter("sortingorder");
	
	Session sc = new Configuration().configure().addAnnotatedClass(Student.class).buildSessionFactory().openSession();
	Transaction t = sc.beginTransaction();
	if(ans.equalsIgnoreCase("Ascending"))
	{
		NativeQuery<Object[]> cnq = sc.createNativeQuery("select studentId, parentNumber,fatherName, teacherId, marksSecured from student order by marksSecured");
		List<Object[]> rs = cnq.getResultList();
		for(Object[]a:rs)
		{
			for(Object an: a)
			{
				List<Object> asList = Arrays.asList(an);
				
				PrintWriter writer = resp.getWriter();
				for(int i =0;i<asList.size();i++)
				{
					writer.println(an+" ");
				}
					
			}
			
		}
		
		
	}
	else
	{
		NativeQuery cnq = sc.createNativeQuery("select studentId, parentNumber,fatherName, teacherId, marksSecured from student order by marksSecured desc");
		List<Object[]> rs = cnq.getResultList();
		//PrintWriter writer = resp.getWriter();
		for(Object[]a:rs)
		{
			for(Object an: a)
			{
				List<Object> asList = Arrays.asList(an);
				
				PrintWriter writer = resp.getWriter();
				for(int i =0;i<asList.size();i++)
				{
					writer.println(an+" ");
				}
					
			}
			
		}
		//writer.println(rs);
		
	}
	
	t.commit();
	sc.close();
}
}
