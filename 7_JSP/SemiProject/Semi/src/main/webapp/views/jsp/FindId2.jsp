<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="utf-8" />
<link rel="stylesheet" href="../css/globals.css" />
<link rel="stylesheet" href="../css/styleguide.css" />
<link rel="stylesheet" href="../css/FindId2.css" />
</head>

<body>
	<%@ include file="/views/jsp/header.jsp"%>
	<div class="body">
		<div class="Find-Id-Form2">
			<div class="find-Id-text2">조회된 아이디</div>
			<div class="mid">
				<table>
					<thead>
						<tr>
							<th>번호</th>
							<th>아이디</th>
							<th>전화번호</th>
						</tr>
					</thead>
					<tbody>
						<tr>
							<td>1</td>
							<td>asdf****</td>
							<td>010-1111-2222</td>
						</tr>
						<tr>
							<td>2</td>
							<td>zxcv****</td>
							<td>010-2222-3333</td>
						</tr>

					</tbody>
				</table>
			</div>
			<div class="find-id">
				<a href="${pageContext.request.contextPath}/LoginMember.do"
					class="action-button">조회하기</a>
			</div>
		</div>
	</div>
	<%@ include file="./footer.jsp"%>
</body>
</html>