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
    <form:form action="/addHotel" method="post" modelAttribute="hotel">
        <h3>Please,add hotel</h3>
        <div>
            <label>Hotel Name</label> <form:input path="name"/>
        </div>
        <div>
            <label>Country</label> <form:input path="city.country.name"/>
        </div>
        <div>
            <label>Country code</label> <form:input path="city.country.code"/>
        </div>
        <div>
            <label>City</label> <form:input path="city.name"/>
        </div>
        <div>
            <label>Street name</label> <form:input path="city.streetName"/>
        </div>
        <div>
            <label>Street Number</label> <form:input path="city.streetNumber"/>
        </div>
        <p><input type="submit" value="Далі"></p>
    </form:form>
</div>


</body>
</html>
