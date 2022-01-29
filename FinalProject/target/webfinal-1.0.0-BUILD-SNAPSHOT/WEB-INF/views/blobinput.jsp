<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h4>${msg.seq } 번째 학생의 중간고사 시험지 입력</h4>
<form:form method="POST" action="/webfinal/paperPrint.do?seq=${msg.seq }" enctype="multipart/form-data">
<table>
<tr><td><input type="file" name="file"/></td></tr>
<tr><td><input type="submit" value="upload"/></td></tr>
</table>
</form:form>
</body>
</html>