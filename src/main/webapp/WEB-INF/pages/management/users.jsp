<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Users</title>
    <jsp:include page="../modules/header.jsp"/>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/res/css/index.css"/>
</head>
<body>
<form action="info" method="get">
    <select name="id">
        <c:forEach var="user" items="${users}">
            <option value="${user.id}">${user.firstName}</option>
        </c:forEach>
    </select>
    <button type="submit" class="button click_button">Choose</button>
</form>
</body>
</html>
