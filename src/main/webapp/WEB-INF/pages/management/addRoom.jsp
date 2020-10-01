<%--
  Created by IntelliJ IDEA.
  User: Ilarion
  Date: 10/1/2020
  Time: 12:22 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Add Room</title>
    <jsp:include page="../modules/header.jsp"/>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/res/css/index.css"/>
</head>
<body>

<div>
    <form:form action="addRoomByHotelId" method="post" modelAttribute="room">
        <div>
                <%--            <c:if test="room" var="${rooms}" >--%>


                <%--            </c:if>--%>
            <label>Room number</label> <form:input path="number"/>
        </div>
        <div>
            <input type="hidden" value="${id}" name="id">
        </div>
        <p><input type="submit" value="Add"></p>
    </form:form>


    <%--        <p>Hotel id: ${rooms.id}</p>--%>
    <%--        <p>Hotel city: ${rooms.}</p>--%>
    <%--        <p>Hotel name: ${hotel.name}</p>--%>

    <%--        <p>Room Id : ${room.id}</p>--%>
    <%--        <p>Room Hotel id: ${room.hotel.id}</p>--%>
    <%--        <p>Room number: ${room.number}</p>--%>

</div>


</body>
</html>
