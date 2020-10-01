<%--
  Created by IntelliJ IDEA.
  User: Ilarion
  Date: 10/1/2020
  Time: 11:15 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Choose Hotel</title>
    <jsp:include page="../modules/header.jsp"/>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/res/css/index.css"/>
</head>
<body>
<div>
    <h3>Choose Hotel</h3>
    <form action="addRoom" method="GET">
        <select name="id">
            <c:forEach var="hotel" items="${hotels}">
                <option value="${hotel.id}">${hotel.name}</option>
            </c:forEach>
        </select>
        <button type="submit" class="button check_button">Choose
        </button>
    </form>
</div>
</body>
</html>
