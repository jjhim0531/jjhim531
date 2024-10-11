<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
    String path = request.getContextPath();
%>
<!DOCTYPE html>
<html lang="ko">
<head>
  <meta charset="utf-8" />
  <link rel="stylesheet" href="../css/globals.css" />
  <link rel="stylesheet" href="../css/styleguide.css" />
  <link rel="stylesheet" href="../css/LoginPage1.css" />
</head>

<body>
<form action="MemberLogin.do" method="post">
  <div class="login-page">
    <header class="header">
      <div class="top">
        <div class="home-button">
          <div class="text-wrapper">푸드피아</div>
        </div>
        <div class="search-bar">
          <img class="search-icon" src="img/img-search-icon.svg" />
          <div class="search-input-text">
            <div class="div">검색어를 입력하세요.</div>
          </div>
        </div>
        <div class="cart-login">
          <div class="shoppin-cart-button">
            <img class="shopping-cart-icon" src="img/img-shopping-cart-icon.svg" />
            <div class="shopping-cart-text">
              <div class="text-wrapper-2">장바구니</div>
            </div>
          </div>
          <div class="login-button">
            <img class="login-icon" src="img/img-login-icon.svg" />
            <div class="login-text">
              <div class="text-wrapper-3">로그인</div>
            </div>
          </div>
        </div>
      </div>
      <div class="menu">
        <div class="category-button">
          <img class="img" src="img/menu.svg" />
          <div class="text-wrapper-4">카테고리</div>
        </div>
        <div class="navbar">
          <div class="text-wrapper-5">이벤트</div>
          <div class="text-wrapper-5">인기상품</div>
          <div class="text-wrapper-5">럭키박스</div>
          <div class="text-wrapper-5">문의</div>
          <div class="text-wrapper-5">관리자</div>
        </div>
      </div>
    </header>
    <div class="body">
      <div class="login-form">
        <div class="text-wrapper-6">푸드피아</div>
        <div class="mid">
          <div class="mid-input">
            <!-- 아이디 입력 필드 -->
            <input class="input-field" type="text" name="userId" placeholder="아이디 입력" />
            <!-- 비밀번호 입력 필드 -->
            <input class="input-field" type="password" name="userPwd" placeholder="비밀번호 입력" />
          </div>
          <!-- 로그인 버튼 -->

          <button class="login-button-2" type="button" onclick="loginFunction()">
            로그인
          </button>

        </div>
        <!-- 하단 링크 -->
        <div class="bottom">
          <!-- 아이디 찾기 버튼 -->
          <div class="find-id">
            <a href="아이디찾기.html" class="action-button">아이디 찾기</a>
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
    <footer class="footer">
      <div class="top-2">
        <div class="company">
          <div class="text-wrapper-11">푸드피아</div>
        </div>
        <div class="ceo">
          <div class="text-wrapper-12">대표자</div>
        </div>
        <div class="employee">
          <div class="frame-2">
            <div class="text-wrapper-12">전제민</div>
            <div class="text-wrapper-12">김용담</div>
            <div class="text-wrapper-12">이현선</div>
            <div class="text-wrapper-12">정주희</div>
            <div class="text-wrapper-12">조석현</div>
          </div>
        </div>
      </div>
      <div class="url">
        <p class="p">CompanyName @ 202X All rights reserved.</p>
      </div>
    </footer>
  </div>
</body>

</html>