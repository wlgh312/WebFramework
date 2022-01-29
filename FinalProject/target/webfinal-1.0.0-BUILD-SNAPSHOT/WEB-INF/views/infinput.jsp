<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<c:set var="call" value=""/>
<c:if test="${not empty msg.seq }">
	<c:set var="call" value="/webfinal/update/infinput.do"/>
</c:if>
<c:if test="${msg.seq eq 0}">
	<c:set var="call" value="/webfinal/infinput.do"/>
</c:if>	
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>학생정보등록화면</title>
</head>
<body>
<h1>학생 시험 정보 등록 화면</h1>
<form:form method="POST" action="${call }" modelAttribute="msg">
<table>
<tr><td>아이디</td><td><form:input path="id"/></td></tr>
<tr><td>이름</td><td><form:input path="name"/></td></tr>
<tr><td>출석</td><td><form:input path="attendance"/></td></tr>
<tr><td>과제</td><td><form:input path="assignment"/></td></tr>
<tr><td>프로젝트</td><td><form:input path="project"/></td></tr>
<tr><td>중간고사</td><td><form:input path="midTest"/></td></tr>
<tr><td>기말고사</td><td><form:input path="finalTest"/></td></tr>
<tr><td>성적</td><td><form:input path="grade"/></td></tr>
<tr><td></td><td><input type="submit" value="입력"/></td></tr>
</table>
</form:form>
</body>
</html>