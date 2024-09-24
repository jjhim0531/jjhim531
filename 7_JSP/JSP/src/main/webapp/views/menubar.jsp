<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
  <head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Insert title here</title>
  </head>
  <body>
    <h1 align="center">Welcome KH World</h1>
    <div class="login-area">
      <form action="">
        <table>
          <tr>
            <th>아이디</th>
            <td><input type="text" name="userId" required /></td>
          </tr>
          <tr>
            <th>비밀번호</th>
            <td><input type="password" name="uwerPwd" required /></td>
          </tr>
          <tr>
            <th colspan="2">
              <input type="submit" value="로그인" />
              <input type="button" value="회원가입" />
            </th>
          </tr>
        </table>
      </form>
    </div>
  </body>
</html>
