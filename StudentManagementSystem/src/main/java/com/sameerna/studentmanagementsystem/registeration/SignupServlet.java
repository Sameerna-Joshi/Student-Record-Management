package com.sameerna.studentmanagementsystem.registeration;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.mysql.cj.x.protobuf.MysqlxResultset.FetchDoneMoreOutParamsOrBuilder;

@WebServlet("/signup")
public class SignupServlet extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name = req.getParameter("name");
		int phoneNumber = Integer.parseInt(req.getParameter("number"));
		String password = req.getParameter("password");
		String confirmPassword = req.getParameter("cp");
		
		Signup sp = new Signup();
		sp.setName(name); sp.setPhonenumber(phoneNumber); sp.setPassword(password);sp.setConfirmPassword(confirmPassword);
		
		Session sc = new Configuration().configure().addAnnotatedClass(Signup.class).buildSessionFactory().openSession();
		Transaction t = sc.beginTransaction();
		sc.save(sp);
		t.commit();
		resp.sendRedirect("index.jsp");
		sc.close();
	}

}
