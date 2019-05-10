<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<tiles:insertAttribute name="resourceH"></tiles:insertAttribute>
<title>Insert title here</title>
<tiles:insertAttribute name="header"></tiles:insertAttribute>
</head>
<body>

<tiles:insertAttribute name="body"/>

<tiles:insertAttribute name="footer"></tiles:insertAttribute>
<tiles:insertAttribute name="resourceF"></tiles:insertAttribute>
</body>
</html>