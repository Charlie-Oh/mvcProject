package com.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model.LoginBean;
//@WebServlet(name = "myController", urlPatterns = { "/ControllerServlet" })
public class ControllerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request,response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=UTF-8");
		
		String id=request.getParameter("id");
		String password=request.getParameter("passwd");
		
		LoginBean bean=new LoginBean();
		bean.setId(id);
		bean.setPassword(password);
		request.setAttribute("bean",bean);
		
		boolean status=bean.validate();
		
		RequestDispatcher rd=null;
		
		if(status) {
			rd=request.getRequestDispatcher("/re/mvc_success.jsp");
		}else {
			rd=request.getRequestDispatcher("/re/mvc_error.jsp");
		}
		rd.forward(request,response);
	}
}
