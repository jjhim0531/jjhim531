<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>1. formatNumber</h3>
	
	<p>
		숫자데이터의 포맷(형식) 지정 <br> -표현하고자하는 숫자데이터의 형식을 통화기호, %등으로 원하는 방식에 맞게
		지정하는 태그<br> (fmt : formatNumber value="출력할 값"
		[groupingUsed="true|false" type="percent | currency"
		currencySymbol="문자"])
	</p>

	<c:set var="num1" value="123456789" />
	<c:set var="num2" value="0.75" />
	<c:set var="num3" value="50000" />

	그냥 출력 : ${num1}
	<br> 세자리마다 구분하여 출력 :
	<fmt:formatNumber value="${num1}" />
	<br>
	<!-- default값은 groupingUsed-"true"이다. 그러므로 별다른 표시가 없다면 3자리마다 콤마가 찍혀서 출력된다. -->
	숫자그대로 출력 :
	<fmt:formatNumber value="${num1}" groupingUsed="false" />
	<br> percent :
	<fmt:formatNumber value="${num2}" type="percent" />
	<br>
	<!-- 곱하기100이 되어서 출력된다. -->
	currency :
	<fmt:formatNumber value="${num3}" type="currency" />
	<br> currency :
	<fmt:formatNumber value="${num3}" type="currency" groupingUsed="false" />
	<!-- currencySymbol의 default값은 원화이다. -->
	<br>
	<br> currency :
	<fmt:formatNumber value="${num3}" type="currency" currencySymbol="$" />
	<br> currency :
	<fmt:formatNumber value="${num3}" type="currency" groupingUsed="false"
		currencySymbol="$" />
	<br>

	<h3>2. formatDate</h3>
	<p>날짜 및 시간데이터의 포맷지정(단, java.util.Date객체 사용)</p>

	<c:set var="current" value="<%=new java.util.Date()%>" />

	출력 : ${current}

	<ul>
		<li>현재 날짜 : <fmt:formatDate value="${current }" />
		</li>
		<!-- type생략시 type="date" (연월일)-->
		<li>현재 날짜 : <fmt:formatDate value="${current}" type="date" /></li>
		<li>현재 시간 : <fmt:formatDate value="${current}" type="time" /></li>
		<br>

		<li>둘다 : <fmt:formatDate value="${current}" type="both" /></li>
		<!-- 기본적으로 스타일이 medium으로 작성됨 -->
		<li>Medium : <fmt:formatDate value="${current}" type="both"
				dateStyle="medium" timeStyle="medium" /></li>
		<br>

		<li>현재 날짜(long) : <fmt:formatDate value="${current}" type="both"
				dateStyle="long" timeStyle="long" /></li>
		<li>현재 날짜(short) : <fmt:formatDate value="${current}" type="both"
				dateStyle="short" timeStyle="short" /></li>
		<li>현재 날짜(full) : <fmt:formatDate value="${current}" type="both"
				dateStyle="full" timeStyle="full" /></li>
		<br>

		<li>현재 날짜 : <fmt:formatDate value="${current}" type="both"
				pattern="yyyy-MM-dd(E) HH:mm:ss(a)" /></li>
	</ul>
</body>
</html>