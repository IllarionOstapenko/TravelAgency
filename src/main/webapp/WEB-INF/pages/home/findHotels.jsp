<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Find Hotel</title>
    <jsp:include page="../modules/header.jsp"/>

</head>
<body>
<div class="content">
    <h2>Hotels</h2>

        <form action="hotel" method="POST">
            <select name="id">
                <c:forEach var="hotel" items="${hotels}">
                    <option value="${hotel.id}">${hotel.name}</option>
                </c:forEach>
            </select>
            <button type="submit" name="check" value="check available rooms" class="button check_button">Check available rooms</button>
        </form>



</div>
</body>
</html>
