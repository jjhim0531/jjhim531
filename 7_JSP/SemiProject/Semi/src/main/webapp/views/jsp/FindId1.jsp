<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="utf-8" />
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/views/css/globals.css" />
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/views/css/styleguide.css" />
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/views/css/FindId1.css" />
</head>

<body>
	<%@ include file="/views/jsp/header.jsp"%>
	<div class="body">
		<div class="find-Id-form">
			<div class="find-Id-text">아이디 찾기</div>
			<div class="mid">
				<form action="FindId1.do" method="get">
					<div class="name-function">
						<div class="name-blank">이름</div>
						<input type="text" name="searchName" placeholder="이름을 입력해주세요."
							class="input-field">
					</div>
					<div class="phone-function">
						<div class="phone-blank">전화번호</div>
						<input type="text" name="searchPhone" placeholder="전화번호를 입력해주세요."
							class="input-field">
					</div>
					<button class="find-button" type="submit">조회하기</button>
				</form>

			</div>

			<button class="find-button" type="button" onclick="findIdFunction()">
				조회하기</button>

		</div>
	</div>
	<%@ include file="./footer.jsp"%>
</body>

</html>