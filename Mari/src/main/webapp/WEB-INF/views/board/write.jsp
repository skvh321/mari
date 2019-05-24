<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<!-- ����jsp -->
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<%@include file="/WEB-INF/views/basicView/resourceH.jsp" %>
<script src="${pageContext.request.contextPath}/resources/js/jquery-3.3.1.min.js"></script>
<script>
$(function(){
	$("#btnSave").click(function(){
		document.form1.submit();
	});
});
</script>
</head>
<body>
<div class="super_container">
<%@include file="/WEB-INF/views/basicView/header.jsp" %>
<div class="home">
		<div class="parallax_background parallax-window" data-parallax="scroll" data-image-src="${pageContext.request.contextPath}/resources/images/home.jpg" data-speed="0.8"></div>
		<div class="home_container d-flex flex-column align-items-center justify-content-center">
			<div class="home_title"><h1>Book Your Stay</h1></div>
			<div class="home_text text-center">Fusce erat dui, venenatis et erat in, vulputate dignissim lacus. Donec vitae tempus dolor, sit amet elementum lorem. Ut cursus tempor turpis.</div>
			<div class="button home_button"><a href="#">book now</a></div>
		</div>
</div>

<h2>�۾���</h2>
<form id="form1" name="form1" method="post"
action="${pageContext.request.contextPath}/board/insert.do">
<div>
	���� <input name="title" id="title" size="80"
		placeholder="������ �Է��ϼ���.">
</div>
<div style="width:800px;">
	���� <textarea id="content" name="content" rows="3" cols="80"
		placeholder="������ �Է��ϼ���."></textarea>
</div>
<div>
	÷�������� ����ϼ���.
	<div class="fileDrop"></div>
	<div id="uploadedList"></div>
</div>
<div style="width:700px; text-align:center">
	<button type="button" id="btnSave">Ȯ��</button>
</div>
</form>




<!-- �ٷ��� home class�� data-image-src�� ���ϴ� ���������ð� -->
<!--���� ����  �����������-->



<%@include file="/WEB-INF/views/basicView/footer.jsp" %>
</div>
<%@include file="/WEB-INF/views/basicView/resourceF.jsp" %>
</body>
</html>