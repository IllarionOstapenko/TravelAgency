<%--
  Created by IntelliJ IDEA.
  User: Ilarion
  Date: 9/28/2020
  Time: 3:32 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Home</title>
    <jsp:include page="../modules/header.jsp"/>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/res/css/index.css"/>
</head>
<body>

<div class="home">
    <a href="hotels">All Hotels</a>
    <a href="find_rooms">Find Rooms</a>
    <a href="book_hotel">Book Hotel</a>
</div>

</body>
</html>
