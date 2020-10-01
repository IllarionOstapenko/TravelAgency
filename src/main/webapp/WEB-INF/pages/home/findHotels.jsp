<%--
  Created by IntelliJ IDEA.
  User: Ilarion
  Date: 9/29/2020
  Time: 12:22 PM
  To change this template use File | Settings | File Templates.
--%>
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
            <button type="submit" name="book" value="book available rooms" class="button book_button">Book available rooms</button>
        </form>


<%--    <form action="/hotel" method="POST">--%>
<%--        <ul <c:forEach var="hotel" items="${hotels}">>--%>
<%--            <li value="${hotel.id}">Hotel name:${hotel.name}---%>
<%--                <input type="hidden" name="id" value="${hotel.id}">--%>
<%--                Hotel Country: ${hotel.city.country.name}---%>
<%--                Hotel City:${hotel.city.name}--%>
<%--                <button type="submit" name="check" value="hotel" class="button check_button">Check available rooms</button>--%>
<%--                <button type="submit" name="book" value="book available rooms" class="button book_button">Book available rooms</button>--%>
<%--            </li>--%>
<%--        </ul </c:forEach>>--%>
<%--    </form>--%>

</div>
</body>
</html>
