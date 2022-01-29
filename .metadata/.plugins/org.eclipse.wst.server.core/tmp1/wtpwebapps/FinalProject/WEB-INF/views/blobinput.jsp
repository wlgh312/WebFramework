<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style>
table{
border-spacing:0 20px;
}
</style>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<table>
<tr><th>${msg.seq } 번째 학생의 중간고사 시험지</th><th>${msg.seq } 번째 학생의 기말고사 시험지</th></tr>
<tr>
<td>
<center>
<c:if test="${midP eq null}">등록된 시험지가 없습니다.</c:if>
<c:if test="${midP ne null }"><img width=150 src="resources/upload/${msg.midPic}"/></c:if>
</center>
</td>
<td><center>
<c:if test="${finP eq null}">등록된 시험지가 없습니다.</c:if>
<c:if test="${finP ne null }"><img width=150 src="resources/upload/${msg.finalPic}"/></c:if>
</center>
</td>
</tr>
<tr>
<td>
<form:form method="POST" action="/webfinal/midPrint.do?seq=${msg.seq }" enctype="multipart/form-data">
<table>
<tr><td><input type="file" name="file"/></td></tr>
<tr><td><input type="submit" value="upload"/></td></tr>
</table>
</form:form>
</td>
<td>
<form:form method="POST" action="/webfinal/finPrint.do?seq=${msg.seq }" enctype="multipart/form-data">
<table>
<tr><td><input type="file" name="file"/></td></tr>
<tr><td><input type="submit" value="upload"/></td></tr>
</table>
</form:form>
</td>
</tr>
</table>
</body>
</html>