<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <title>회원가입 폼</title>
    <script>
        function chackpw(){
            var pw = document.getElementById("pw").value;
            var pw2 = document.getElementById("pw2").value;
            if(pw!= pw2) return false;
            return true;
        }
        function check(){
            var user = eval("document.registForm"); 
            if(!user.id.value){
                alert("아이디를 입력하세요");
                return false;
            }
            if(!user.pw.value){
                alert("비밀번호를 입력하세요");
                return false;
            }
            if(!user.name.value){
                alert("이름를 입력하세요");
                return false;
            }
            if(!user.email.value){
                alert("이메일을 입력하세요");
                return false;
            }
            if(!user.gender.value){
                alert("성별을 선택하세요");
                return false;
            }    
            if(!chackpw()){
                alert("비밀번호가 다릅니다");
                return false;
            }           
        }  
    
    </script>
    <style>
        body{
            margin: 10px;
        }
    
    </style>
</head>

<body>
    <form action="checkrigist.jsp" name="registForm" onsubmit="return check()">
        <table border="1"> 
            <tr>
                <td>id<br/>
                <input type="text" name="id" placeholder="id"></td>
            </tr>
            <tr>
                <td>비밀번호<br/>
                <input type="password" id="pw" name="pw" ></td>               
            </tr>
            <tr>
                <td>비밀번호확인<br/>
                <input type="password" id="pw2" ></td>               
            </tr>                                 
            <tr>
                <td>이름<br/>
                <input type="text" name="name" ></td>               
            </tr>
            <tr>
                <td>email<br/>
                <input type="text" name="email" ></td>               
            </tr>
            <tr>
                <td>성별<br/>                
              	남<input type="radio" name="gender" value="male">
                    여<input type="radio" name="gender" value="female">
                </td>               
            </tr>
            <tr>
                <td>직업<br/>                
                    <select name = "job">
                        <option value="student"  >학생</option>
                        <option value="employee">회사원</option>
                        <option value="etc">기타</option>
                   </select>
                </td>
            </tr>
            <tr>
                <td>자기소개<br/>
                <textarea name="cv" cols="20" rows="10"> </textarea></td>
            </tr>
            <tr>
                <td>관심사항<br/>                
                영화<input type="checkbox"name="interest" value="movie">
                    운동<input type="checkbox"name="interest" value="sports">
                    음악<input type="checkbox"name="interest" value="music">
                </td>
            </tr>
        </table>
        <br/>
       <input type="submit" value="가입"/>       
    </form>
</body>
</html>