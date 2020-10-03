<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>${user.firstName}</title>
    <jsp:include page="../modules/header.jsp"/>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/res/css/index.css"/>
</head>
<body>
<div>
    <p>User first name: ${user.firstName}</p>
    <p>User last name: ${user.lastName}</p>
    <div>
        <c:forEach var="room" items="${rooms}">
            <p> Room number: ${room.room.number}</p>
            <p> Hotel name: ${room.room.hotel.name}</p>
            <p> City name: ${room.room.hotel.city.name}</p>
            <p> Room order start: ${room.orderStart}</p>
            <p> Room order end: ${room.orderEnd}</p>
            <hr>
        </c:forEach>
    </div>
</div>
</body>
</html>
