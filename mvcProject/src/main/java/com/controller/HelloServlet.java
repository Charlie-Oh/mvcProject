package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//@WebServlet("/hello")
@WebServlet(urlPatterns="/hello")

public class HelloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=utf-8");
		
		PrintWriter out=response.getWriter();
		out.print("<html>");
		out.print("<head><title>인사</title></head>");
		out.print("<body>");
		out.print("안녕하세요, ");
		out.print(request.getParameter("name"));
		out.print("님");
		out.print("</body></html>");
	}
}
