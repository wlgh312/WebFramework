<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<%@ page session="false" %>
<html>
<head>
<title>Home</title>
<style>
body{
text-align:center;
}
table{
width:75%;
margin:auto;
}
</style>
</head>
<body>
<h1>
학생 리스트 
</h1>
<table border=1>
<tr>
<th>순서</th><th>아이디</th><th>성명</th><th>출석</th><th>과제</th><th>프로젝트</th><th>중간고사</th><th>기말고사</th><th>총 점수</th><th>최종 학점</th><th>예상 학점</th><th>시험지</th><th>청탁 의심</th>
</tr>
<c:forEach var="inf_n" items="${inf_cmd}" varStatus="statusNm">
<tr>
<td><a href="inf_list.do?seq=${inf_n.seq }">${inf_n.seq }</a></td>
<td>${inf_n.id }</td>
<td>${inf_n.name }</td>
<td>${inf_n.attendance }</td>
<td>${inf_n.assignment }</td>
<td>${inf_n.project }</td>
<td>${inf_n.midTest }</td>
<td>${inf_n.finalTest }</td>
<td>${inf_n.resScore }</td>
<td>${inf_n.grade }</td>
<td><c:if test="${preGrade[statusNm.index] eq 1}"><c:set var="preG" value="A+"/>A+</c:if>
<c:if test="${preGrade[statusNm.index] eq 2}"><c:set var="preG" value="A0"/>A0</c:if>
<c:if test="${preGrade[statusNm.index] eq 3}"><c:set var="preG" value="B+"/>B+</c:if>
<c:if test="${preGrade[statusNm.index] eq 4}"><c:set var="preG" value="B0"/>B0</c:if>
<c:if test="${preGrade[statusNm.index] eq 5}"><c:set var="preG" value="C+"/>C+</c:if>
<c:if test="${preGrade[statusNm.index] eq 6}"><c:set var="preG" value="C0"/>C0</c:if>
<c:if test="${preGrade[statusNm.index] eq 7}"><c:set var="preG" value="D+"/>D+</c:if>
<c:if test="${preGrade[statusNm.index] eq 8}"><c:set var="preG" value="D0"/>D0</c:if>
</td>
<td><a href="javascript:void(window.open('blobinput.do?seq=${inf_n.seq}','image', 'width=400, height=500'))">입력</a></td>
<td>
<c:if test="${inf_n.grade ne preG}">성적 확인<br></c:if>
<c:if test="${inf_n.attendance < 75 && inf_n.grade ne 'F'}">출석 확인</c:if>
</td>
</tr>
</c:forEach>
</table>
</body>
</html>
