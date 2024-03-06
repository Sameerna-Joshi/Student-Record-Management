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
@WebServlet("/addteacher")
public class AddTeacherServlet extends HttpServlet {
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
	{
		
		int teacherId = Integer.parseInt(req.getParameter("teacherIdentificationnumber"));
		String teacherName = req.getParameter("name");
		int teacherNumber = Integer.parseInt(req.getParameter("tNumber"));
		
		Teacher t = new Teacher();
		t.setTeacherId(teacherId); t.setTeacherName(teacherName);t.setTeacherNumber(teacherNumber);
		Session  sc = new Configuration().configure().addAnnotatedClass(Teacher.class).buildSessionFactory().openSession();
		Transaction beginTransaction = sc.beginTransaction();
		
		sc.save(t);
		
		beginTransaction.commit();
		sc.close();
		
		
	}

}
