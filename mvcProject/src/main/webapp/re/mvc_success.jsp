<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="com.model.LoginBean" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>MVC</title>
</head>
<body>
	<p>로그인에 성공하였습니다.</p>
	<p>
	${bean.id}님 환영합니다!
<%-- 	<% --%>
<!--  		LoginBean bean=(LoginBean) request.getAttribute("bean"); -->
<!--  		out.print(bean.getId()+"님 환영합니다."); -->
<%-- 	%> --%>
	</p>
</body>
</html>