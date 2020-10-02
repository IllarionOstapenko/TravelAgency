<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add Hotel</title>
    <jsp:include page="../modules/header.jsp"/>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/res/css/index.css"/>
</head>
<body>
<form action="chooseCity" method="get">
    <h3>Choose city</h3>
    <select name="id">
        <c:forEach var="city" items="${cities}">
            <option value="${city.id}">${city.name}</option>
        </c:forEach>
    </select>
    <button type="submit">Chose</button>
</form>
</body>
</html>
