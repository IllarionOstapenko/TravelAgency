<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Ilarion
  Date: 10/1/2020
  Time: 1:07 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
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
            <p> Street name: ${room.room.hotel.city.streetName}</p>
            <p> Street number: ${room.room.hotel.city.streetNumber}</p>
            <p> Room order start: ${room.orderStart}</p>
            <p> Room order end: ${room.orderEnd}</p>
            <hr>
        </c:forEach>
    </div>
</div>

</body>
</html>
