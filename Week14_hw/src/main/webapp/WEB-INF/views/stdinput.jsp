<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>회원정보등록화면</title>
</head>
<body>
<h1>회원 정보 등록 화면</h1>
<form:form method="POST" action="/week14/stdinput.do" modelAttribute="msg">
<table>
<tr><td>아이디</td><td><input type="text" value="" name="id" id="id"/></td></tr>
<tr><td>이름</td><td><form:input path="name"/></td></tr>
<tr><td>나이</td><td><form:input path="age"/></td></tr>
<tr><td></td><td><input type="submit" value="전송"/></td></tr>
</table>
</form:form>
</body>
</html>