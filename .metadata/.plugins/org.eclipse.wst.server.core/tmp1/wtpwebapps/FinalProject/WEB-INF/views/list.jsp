<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<%@ page session="false" %>
<html>
<head>
<title>Home</title>
<link rel="preconnect" href="https://fonts.googleapis.com">
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
<link href="https://fonts.googleapis.com/css2?family=IBM+Plex+Sans+KR:wght@100&display=swap" rel="stylesheet">
<style>
a:link{
color:white;
text-decoration:none;
}
a:visited{
color:white;
text-decoration:none;
}
a:hover{
text-decoration:underline;
}
h1{
font-family: 'IBM Plex Sans KR', sans-serif;
font-size:30px;
}
body{
text-align:center;
}
table{
border-collapse : collapse;
width:90%;
margin:auto;
font-size:13px;
text-align:center;
}
tr:nth-child(odd){
background-color:#434343;
}
td{
font-weight:300;
border-bottom:1px solid white;
}
th{
font-weight:300;
background-color:white;
color:black;
border-bottom:1px solid white;
}
body{
background-image:url("resources/background.jpg");
background-size:cover;
}
h1, td{
color:white;
}
section{
background-color:black;
background-color:rgba(0, 0, 0, 0.7);
width:900px;
scrollHeight:90%;
margin:auto;
padding:20px 0px;
}
div{
color:white;
text-align:right;
margin-right:60px;
margin-bottom:20px;
}
section #add{
margin-top:20px;
}
</style>
</head>
<body>
<section>
<h1>
학생 리스트 
</h1>
<div>
교수 : <a href="javascript:void(window.open('checkinput.do?prof','image', 'width=700, height=500'))"><img width=20 src="resources/paper.png"></a>&emsp;
조교 : <a href="javascript:void(window.open('checkinput.do?asst','image', 'width=700, height=500'))"><img width=20 src="resources/paper.png"></a>
</div>
<table>
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
<td><c:if test="${preGrade[statusNm.index] eq 1}"><c:set var="preG" value="A+"/></c:if>
<c:if test="${preGrade[statusNm.index] eq 2}"><c:set var="preG" value="A0"/></c:if>
<c:if test="${preGrade[statusNm.index] eq 3}"><c:set var="preG" value="B+"/></c:if>
<c:if test="${preGrade[statusNm.index] eq 4}"><c:set var="preG" value="B0"/></c:if>
<c:if test="${preGrade[statusNm.index] eq 5}"><c:set var="preG" value="C+"/></c:if>
<c:if test="${preGrade[statusNm.index] eq 6}"><c:set var="preG" value="C0"/></c:if>
<c:if test="${preGrade[statusNm.index] eq 7}"><c:set var="preG" value="D+"/></c:if>
<c:if test="${preGrade[statusNm.index] eq 8}"><c:set var="preG" value="D0"/></c:if>
<c:if test="${inf_n.attendance <75 }"><c:set var="preG" value="F"/></c:if>
${preG }
</td>
<td><a href="javascript:void(window.open('blobinput.do?seq=${inf_n.seq}','image1', 'width=700, height=500'))"><img width=15 src="resources/paper.png"></a></td>
<td>
<c:if test="${inf_n.grade ne preG && preG ne 'F'}">성적 확인<br></c:if>
<c:if test="${inf_n.attendance < 75 && inf_n.grade ne 'F'}">출석 확인<br></c:if>
<c:if test="${inf_n.midPic eq null or inf_n.finalPic eq null}">시험지 확인</c:if>
</td>
</tr>
</c:forEach>
</table>
<div id="add">
<a href="inf1.do">학생 추가</a>
</div>
</section>
</body>
</html>
