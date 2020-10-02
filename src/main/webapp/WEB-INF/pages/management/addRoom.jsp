<%@ page contentType="text/html;charset=UTF-8" language="java" %>
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
            <label>Room number</label> <form:input type="number" path="number"/>
        </div>
        <div>
            <input type="hidden" value="${id}" name="id">
        </div>
        <p><input type="submit" value="Add" class="button click_button"></p>
    </form:form>
</div>


</body>
</html>
