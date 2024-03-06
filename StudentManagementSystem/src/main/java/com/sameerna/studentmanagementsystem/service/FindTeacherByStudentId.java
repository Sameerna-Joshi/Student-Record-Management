package com.sameerna.studentmanagementsystem.service;

import java.io.IOException;
import java.io.PrintWriter;
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
import com.sameerna.studentmanagementsystem.operations.Teacher;
@WebServlet("/findteacher")
public class FindTeacherByStudentId extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int studentId = Integer.parseInt(req.getParameter("studentId"));
		Session sc  = new Configuration().configure().addAnnotatedClass(Student.class).addAnnotatedClass(Teacher.class).buildSessionFactory().openSession();
		Transaction t = sc.beginTransaction();
		NativeQuery cnq = sc.createNativeQuery("select * from teacher where teacherId = (select teacherId from student where studentId =:sid)");
		cnq.setParameter("sid", studentId);
		List<Object[]> resultList = cnq.getResultList();
		for(Object[]ans:resultList)
		{
		for(Object temo:ans)
		{
			PrintWriter print = resp.getWriter();
			print.println(temo);
		}
		}
		
		
		
		
		
		
		t.commit();
		sc.close();
	}
}
