<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Include 지시어</h1>
	<div style="border: 1px solid black">
		<%@ include file="01_ScriptingElement.jsp"%>
		<!-- iframe과는 다르다. iframe은 브라우저 안에 브라우저를 띄우는 것이고, 
		지금은 01_ScriptingElement.jsp 파일에 있는 코드를 통쨰로 복붙이라고 봐야한다.
			그러므로 원래 jsp파일에 있는 모든것들(변수포함)이 전부 여기서도 사용가능하다. -->
	</div>

	포함한 jsp상에 선언되어있는 변수를 가져다 사용가능
	<br> 1부터 100까지의 총 합계 :
	<%=sum%>
</body>
</html>