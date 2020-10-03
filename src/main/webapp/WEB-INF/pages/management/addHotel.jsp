<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add Hotel</title>
    <jsp:include page="../modules/header.jsp"/>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/res/css/index.css"/>
</head>
<body>
<div>
    <form:form action="addHotelByCityId" method="post" modelAttribute="hotel">
        <div>
            <label>Hotel Name</label> <form:input path="name"/>
        </div>
        <div>
            <input type="hidden" value="${city.id}" name="id">
        </div>
        <p><input type="submit" value="Add" class="button book_button"></p>
    </form:form>
</div>

</body>
</html>
