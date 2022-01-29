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
<h3>글씨체를 확인할 수 있는 문서를 등록해주세요.</h3><br>
이름 : ${name }<br>
<c:if test="${pic eq null}">등록된 시험지가 없습니다.</c:if>
<c:if test="${pic ne null}"><img width=150 src="resources/upload/${pic}"/></c:if>
<form:form method="POST" action="/webfinal/checkprint.do?${pos }" enctype="multipart/form-data">
<table>
<tr><td>이름 : <input type="text" name="name"/></td></tr>
<tr><td><input type="file" name="file"/></td></tr>
<tr><td><input type="submit" value="upload"/></td></tr>
</table>
</form:form>
</body>
</html>