<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!-- errorPage="error500.jsp" -->
<%@ page import="java.util.ArrayList, java.util.Date"%>
<!-- 하나의 스클립틀릿으로 쓰기에 너무 길면, 하나 더 써서 import를 따로 써준다. -->
<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>

<body>
	<h1>page지시어</h1>

	<%
	ArrayList<String> list = new ArrayList<>();
	/*ArrayList 객체는 꼭 import를 해줘야한다.*/
	list.add("Servlet");
	list.add("JSP");

	Date today = new Date();
	%>

	0번째 인덱스 :
	<%=list.get(0)%><br>
	1번째 인덱스 :
	<%=list.get(1)%><br>
	
	<br> 현재날짜 및 시간 :
	<%=today%>
</body>

</html>