<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>id 중복체크</title>
<%String id = request.getParameter("id"); %>
<script type="text/javascript">
function changeId(){
	opener.document.userinput.id.value="<%=id%>";
	window.close();
}
</script>
</head>
<body>
	<%
	
// 디비 접근해서 해당 id가 있는지 검사하고 결과를 받아와야함
// check 변수에 결과값이 맞다는 뜻으로 숫자 1을 넣자
	String []arr = {"test","arr","value"};
	boolean check = false;
	for(int i=0;i<arr.length;i++){
		if(arr[i].equals(id)){
			check = true;
			break;
		}
	}

// 또는 String 배열에 아이디 몇개 넣어서 확인해서 결과 도출
	if(check){
		//보여줘야할 페이지
		//해당아이디가 존재합니다.
		// 다시 입력해서 확인할 입력란, 확인 버튼, 취소
		%>
	id :
	<form name="wrongId" action="comfirmId.jsp">
		<input type="text" name="id" value="<%=id%>" />
		<input type="submit" name="close" value="조회" />
		<input type="button" name="close" value="취소" onclick="window.close()" />
		<br/><%=id %>는 이미 존재한 아이디 입니다. <br/>다시 입력해 주세요
	</form>		
	<%}
	else{
		// 아이디 사용가능한 경우
		// 적은 아이디를 form id 태그에 적용해주고
		// 팝업창 닫기 버튼
		%>
	<%=id %>는 사용 가능한 ID입니다.
	<input type="button" name="close" value="닫기" onclick="javascript:changeId()" />

	<% 	
	}
%>


</body>
</html>