<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>jsp:forward</h1>
	
	<jsp:forward page="footer.jsp" />
	<!-- forward는 응답을 위임하는것. 요청에 대한 응답은 footer.jsp가 해줘 -->
</body>
</html>