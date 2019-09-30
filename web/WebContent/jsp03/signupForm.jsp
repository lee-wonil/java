<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"> 
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<title>회원가입폼</title>
<script>
	//	유효성 처리
	function check(){
		var userinput = eval("document.userinput");
		if(!userinput.id.value){
			alert("id를 입력하세요");
			return false;
		}
		if(!userinput.pw.value){
			alert("pw를 입력하세요");
			return false;
		}
	}
	// 아이디 중복검사
	function confirmId(userinput){
		if(userinput.id.value==""){
			alert("아이디를 입력하세요.");
			return;
		}
		url= "comfirmId.jsp?id="+userinput.id.value;

		open(url,"confirm","toolbar=no,location=no,status=no,menubar=no,scrollbar=no, resizable=no, width=400, height=200")
	}
</script>
</head>
<body>
	<form action="signupPro.jsp" name="userinput" method="post" onsubmit ="return check()">
		<h2>회원가입</h2>
		<table>
			<tr>
				<td>아이디<br /> <input type="text" name="id" />
				<input type="button" name="checkId" value="id중복검사" onclick="confirmId(this.form)"/>
				</td>
			</tr>
			<tr>
				<td>비밀번호<br /> <input type="password" name="pw" id="pw" />
				</td>
			</tr>
			<tr>
				<td>비밀번호 확인<br /> <input type="password" name="pw2" id="pw2" />
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
				<td>자기소개글<br /> <textarea name="introduce" rows="10" cols="20"></textarea>
				</td>
			</tr>

		</table>
		<input type="submit" value="가입" /> <input type="reset" value="초기화">

	</form>
</body>
</html>