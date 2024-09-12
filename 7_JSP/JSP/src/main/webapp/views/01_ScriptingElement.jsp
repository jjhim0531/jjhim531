<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
	<!DOCTYPE html>
	<html>

	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>

	<body>
		<h1>스크립팅 원소</h1>

		<!-- HTML주석 : 개발자도구 탭에 노출됨 - why? html은 브라우저의 언어이기에 요청이 톰캣서버에 가서도 읽히지 않고 살아있다가 브라우저로 다시 돌아오면 읽혀지기에 브라우저에 보이게 됨-->
		<%-- JSP주석 : 개발자도구 탭에 노출안됨 - why? java는 서버에서 실행되기에 요청이 톰캣서버에 도착했을때 주석이 읽혀지고 이미 처리됫다고 봐야함. 그러므로 브라우저에서 다시 와서는 보이지 않음 --%>

		<%
		//스크립틀릿 : 해당영역에 일반적인 자바코드를 작성(변수선언 및 초기화, 제어문 등)
		//(영역은 이 페이지 내에서는 전부 같은 변수를 공유하므로 살아있다.)
		int sum = 0;
		for(int i = 1; i <= 100; i++) {
			sum += i;
		}
		%>
	
	<p>
		화면으로 출력하고자 한다면 <br>
		스크립틀릿 이용해서 출력 가능 : <% out.println(sum); %> <br>
		표현식(출력식) 이용해서 출력 가능 : <%=sum %>
	</p>
	
	<%
		String[] nameArr = {"최지원", "최주원", "최수원"};
	%>
	
	<h5>배열의 길이 : <%=nameArr.length %></h5>
	<h5>배열에 담긴 값 : <%=String.join(", ", nameArr) %></h5>
	
	<h4>반복문을 통해서 html요소 반복적으로 화면에 출력할 수 있다.</h4>
	<ul>
		<% for(int i=0; i < nameArr.length; i++) { %>
			<li><%=nameArr[i] %></li>
		<% } %>
		
		<% for(String name : nameArr) { %>
			<li><%=name %></li>
		<% } %>
	</ul>
</body>
</html>