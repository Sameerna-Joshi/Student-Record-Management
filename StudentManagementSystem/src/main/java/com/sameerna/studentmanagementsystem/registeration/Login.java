package com.sameerna.studentmanagementsystem.registeration;

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
@WebServlet("/login")
public class Login extends HttpServlet{
 
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		int pNumber = Integer.parseInt(req.getParameter("phoneNumber"));
		String password = req.getParameter("password");
		
		Session sc = new Configuration().configure().addAnnotatedClass(Signup.class).buildSessionFactory().openSession();
		Transaction t = sc.beginTransaction();
		NativeQuery nq = sc.createNativeQuery("select password from signup where phoneNumber =:pn");
		nq.setParameter("pn", pNumber);
		String pass = (String)nq.getSingleResult();
		
		
		if(password.equals(pass))
		{
			resp.sendRedirect("Operations.jsp");
		}
		else
		{
			PrintWriter writer = resp.getWriter();
			writer.println("Password Not Matching");
		}
		t.commit();
		sc.close();
	
		
		}
}
