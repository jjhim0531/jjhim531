<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>


	<%
	//스크립틀릿(scriptlet) -> html문서내에서 자바코드를 쓸 수 있는 영역

	/*
	request.getAttribute()메서드가 Object 타입으로 반환하는 이유 : 다양한 타입의 데이터를 처리할 수 있도록 설계되었기 때문. 
	웹 애플리케이션에서 서블릿(request) 객체를 통해 모든 타입의 데이터(문자열(String), 정수(Integer), 배열(Array), 사용자 정의 객체 등)를 주고받는데, 
	request.getAttribute()는 이러한 모든 데이터를 처리할 수 있는 범용적인 메서드여야해서 Object 타입으로 데이터를 반환한다.
	이 데이터를 꺼낼 때(getAttribute() 메서드를 통해) 그 값이 어떤 타입인지는 요청을 보낸 프로그래머가 알고있어야한다.
	Java는 컴파일 타임에 타입을 결정하는 정적 언어라서 모든 타입을 한꺼번에 처리할 수 있는 유일한 방법은 Object 타입으로 반환하는 것이다.
	*/

	String name = (String) request.getAttribute("name");
	//getAttribute() 메서드가 반환하는 값의 타입이 Object이기 때문에 (String)으로 형변환을 꼭 해줘야한다.
	int age = (Integer) request.getAttribute("age");
	//getAttribute() 메서드가 반환하는 값의 타입이 Object이기 때문에 (Integer)으로 형변환을 꼭 해줘야한다.
	%>

	<h1>개인정보 응답화면</h1>
	<span id="name"><%=name%></span>님은
	<%=age%>살입니다.
</body>
</html>