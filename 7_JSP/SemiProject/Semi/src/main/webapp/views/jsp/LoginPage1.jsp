<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="utf-8" />
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/views/css/globals.css" />
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/views/css/styleguide.css" />
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/views/css/LoginPage1.css" />
</head>

<body>

	<%@ include file="./header.jsp"%>

	<form action="MemberLogin.do" method="post">

		<div class="body">
			<div class="login-form">
				<div class="text-wrapper-6">푸드피아</div>
				<div class="mid">
					<div class="mid-input">
						<!-- 아이디 입력 필드 -->
						<input class="input-field" type="text" name="userId"
							placeholder="아이디 입력" />
						<!-- 비밀번호 입력 필드 -->
						<input class="input-field" type="password" name="userPwd"
							placeholder="비밀번호 입력" />
					</div>
					<!-- 로그인 버튼 -->

					<button type="submit" class="login-button-2">로그인</button>
				</div>
				<!-- 하단 링크 -->
				<div class="bottom">
					<!-- 아이디 찾기 버튼 -->
					<div class="find-id">
						<a href="${pageContext.request.contextPath}/FindId1.do"
							class="action-button">아이디 찾기</a>
					</div>
					<!-- 비밀번호 찾기 버튼 -->
					<div class="find-pwd">
						<a href="비밀번호찾기.html" class="action-button">비밀번호 찾기</a>
					</div>
					<!-- 회원가입 버튼 -->
					<div class="sign-up">
						<a href="회원가입.html" class="action-button">회원가입</a>
					</div>
				</div>
			</div>
		</div>
	</form>
	<%@ include file="./footer.jsp"%>

</body>

</html>