<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Macknight
  Date: 01/08/2021
  Time: 23:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>operation success</title>
    <c:if test = "${event !=null}">
        eventId: ${event.id}<br />
        eventTitle: ${event.title}<br />
        eventStart: ${event.start}<br />
        eventEnd: ${event.end}<br />
    </c:if>
    <c:if test = "${eventList !=null}">
        <c:forEach  items="${eventList}" var="event">
            eventId: ${event.id}<br />
            eventTitle: ${event.title}<br />
            eventStart: ${event.start}<br />
            eventEnd: ${event.end}<br />
        </c:forEach>
    </c:if>
    <c:if test = "${id !=null}">
        event deleted: ${event.id}<br />
    </c:if>



</head>
<body>

</body>
</html>
