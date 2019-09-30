<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" errorPage="error.jsp"
    %>
 
<%--
page language="java" 언어 설정
   contentType="text/HTML; 문서형태 JSP 마임타입 설정 HTML 문서이며 text 형태로 되어 있다. 
   contentType charset=UTF-8 UTF-8로 인코딩 되어 있다.
   pageEncoding="UTF-8" 페이지 인코딩을 UTF-8로 설정
   import = "java.util.Date"	사용할 자바 패키지 import 시킬 때 사용
   session="true"		세션 사용 여부 
   buffer="8kb"		출력 버퍼 크기 지정 
   autoFlush ="true" 자동으로 버퍼를 비워준다. false 설정 시 버퍼 예외 발생
   isThreadSafe ="true" 멀티쓰레드 세이프 허용 여부
   info="화면에 출력안되는 메모 기능"
   errorPage="error.jsp" 에러 발생시 지정된 페이지로 이동
   isErrorPage="true" 에러 페이지임을 확인해 줌
   isELIgnored ="false" EL 표현식을 무시할건지 여부 확인
   deferredSyntaxAllowedAsLiteral = "false" 문자가 문자열 값으로 사용되는 것을 허용할지의 여부를 지정한다
   --%>
   
<!DOCTYPE html>

<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	서버 :<%= application.getServerInfo() %><br/>
	서블릿 : <%= application.getMajorVersion()%>, <%=application.getMinorVersion() %><br/>
	jsp : <%=JspFactory.getDefaultFactory().getEngineInfo().getSpecificationVersion()  %><br/>
</body>
</html>
