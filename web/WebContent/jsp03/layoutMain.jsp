<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title></title>
</head>
<body>
	<table>
		<tr>
			<td>
				<jsp:include page="layoutTop.jsp" flush="false"></jsp:include>
			</td>
		</tr>
		<tr>
			<td>
				<jsp:include page="layoutLeft.jsp"></jsp:include>
			</td>
			<td>
				<form action="pro.jsp" name="registForm" method="post">

					<table>
						<tr>
							<td>아이디<br /> <input type="text" name="id" />
							</td>
						</tr>
						<tr>
							<td>비밀번호<br /> <input type="password" name="pw" id="pw" />
							</td>
						</tr>
						<tr>
							<td>비밀번호 확인<br /> <input type="password" name="pw2"
								id="pw2" />
							</td>
						</tr>
						<tr>
							<td>이름<br /> <input type="text" name="name" />
							</td>
						</tr>
						<tr>
							<td>이메일<br /> <input type="text" name="email" />
							</td>
						</tr>
						<tr>
							<td>성별<br /> <input type="radio" name="gender" value="male" />
								남 <input type="radio" name="gender" value="female" /> 여
							</td>
						</tr>
						<tr>
							<td>직업<br /> <select name="job">
									<option value="student">학생</option>
									<option value="employee">회사원</option>
									<option value="freelancer">프리랜서</option>
									<option value="etc">기타</option>
							</select>
							</td>
						</tr>
						<tr>
							<td>취미<br /> 운동<input type="checkbox" name="hobby"
								value="exercise" /> 노래<input type="checkbox" name="hobby"
								value="sing" /> 영화<input type="checkbox" name="hobby"
								value="movie" />
							</td>
						</tr>
						<tr>
							<td>자기소개글<br /> <textarea name="introduce" rows="10"
									cols="20"></textarea>
							</td>
						</tr>

					</table>
				</form>
			</td>
		</tr>
		<tr>
			<td>
				<jsp:include page="layoutFooter.jsp"></jsp:include>
			</td>
		</tr>



	</table>
</body>
</html>