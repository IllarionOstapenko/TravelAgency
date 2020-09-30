<%--
  Created by IntelliJ IDEA.
  User: Ilarion
  Date: 9/29/2020
  Time: 2:38 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>${hotelDto.hotelName} </title>
    <jsp:include page="../modules/header.jsp"/>
</head>
<body>

<div>
    <div>
        <div>
            <h1>${hotelDto.hotelName}</h1>
            <div>
                <p>Hotel Country: ${hotelDto.country.name}</p>
                <p>Country Code: ${hotelDto.country.code}</p>
                <p>Hotel City: ${hotelDto.city.name}</p>
                <p>City Street Name: ${hotelDto.city.streetName}</p>
                <p>City Street Number: ${hotelDto.city.streetNumber}</p>
            </div>

            <c:if test="${hotelDto.availableRooms == null}">
                <form action="/hotel/available" method="POST">
                    <input type="hidden" name="id" value="${hotelDto.hotelId}"/>

                    <h3>Check rooms</h3>
                    <div>
                        <p>From: <input type="date" name="startDateAvailable"
                                        value=${hotelDto.currentDate} min= ${hotelDto.currentDate}
                                        max=${hotelDto.maxDate}>
                            to: <input type="date" name="endDateAvailable"
                                       value=${hotelDto.currentDate} min= ${hotelDto.currentDate}
                                       max=${hotelDto.maxDate}>
                        </p>
                        <button type="submit" class=" button click_button">Check</button>
                    </div>
                </form>
            </c:if>

            <c:if test="${hotelDto.availableRooms != null}">
                <div>
                    <hr>
                    Available rooms from <b>${hotelDto.startDate}</b> to <b>${hotelDto.endDate}</b> :
                    <ul>
                        <c:forEach var="room" items="${hotelDto.availableRooms}">
                            <li>Room Number: ${room.number}</li>
                        </c:forEach>
                    </ul>
                </div>
            </c:if>


            <c:if test="${hotelDto.availableRooms != null}">
                <div>
                    <form action="/hotel/book" method="POST">
                        <input type="hidden" name="id" value="${hotelDto.hotelId}"/>

                        <h3>Book rooms</h3>
                        <div>
                            <form <c:forEach var="room" items="${hotelDto.availableRooms}">>
                                <input type="radio"  value="${room.number}"
                                       name="number"/>${room.number}
                            </form </c:forEach>>

                            <p>From: <input type="date" name="startDateAvailable"
                                            value=${hotelDto.currentDate} min= ${hotelDto.currentDate}
                                            max=${hotelDto.maxDate}>
                                to: <input type="date" name="endDateAvailable"
                                           value=${hotelDto.currentDate} min= ${hotelDto.currentDate}
                                           max=${hotelDto.maxDate}>
                            </p>
                            <button type="submit" class=" button book_button">Book</button>
                        </div>
                    </form>
                </div>
            </c:if>
        </div>
    </div>
</div>
</body>
</html>
