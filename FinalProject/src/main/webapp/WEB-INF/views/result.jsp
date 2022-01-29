<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>등록된 내용</title>
</head>
<body>
<h1>등록된 내용</h1>
<table>
<tr><td>아이디 : </td><td>${msg.id}</td></tr>
<tr><td>성명 : </td><td>${msg.name}</td></tr>
<tr><td>출석 : </td><td>${msg.attendance}</td></tr>
<tr><td>과제 : </td><td>${msg.assignment}</td></tr>
<tr><td>프로젝트 : </td><td>${msg.project}</td></tr>
<tr><td>중간고사 : </td><td>${msg.midTest}</td></tr>
<tr><td>기말고사 : </td><td>${msg.finalTest}</td></tr>
<tr><td>성적 : </td><td>${msg.grade}</td></tr>
</table>
<c:if test="${not empty msg.seq }">
	<a href="inf_delete.do?seq=${msg.seq }">삭제</a><br>
	<a href="inf_update.do?seq=${msg.seq }">수정</a><br>
</c:if>
<a href="inf_list.do">전체 목록</a>
</body>
</html>