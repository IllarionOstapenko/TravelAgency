<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <jsp:include page="../modules/header.jsp"/>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/res/css/index.css"/>
</head>
<body>
<h2>404 - ${msg}</h2>
<a href="/">${rm}</a>

</body>
</html>
