<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<!-- 샘플jsp -->
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<%@include file="resourceH.jsp" %>
</head>
<%@include file="header.jsp" %>
<div class="home">
		<div class="parallax_background parallax-window" data-parallax="scroll" data-image-src="/resources/images/home.jpg" data-speed="0.8"></div>
		<div class="home_container d-flex flex-column align-items-center justify-content-center">
			<div class="home_title"><h1>Book Your Stay</h1></div>
			<div class="home_text text-center">Fusce erat dui, venenatis et erat in, vulputate dignissim lacus. Donec vitae tempus dolor, sit amet elementum lorem. Ut cursus tempor turpis.</div>
			<div class="button home_button"><a href="#">book now</a></div>
		</div>
</div>


<!-- 바로위 home class에 data-image-src에 원하는 사진넣으시고 -->
<!--요기다 내용  집어넣으세요-->



<%@include file="footer.jsp" %>
<body>
<%@include file="resourceF.jsp" %>
</body>
</html>