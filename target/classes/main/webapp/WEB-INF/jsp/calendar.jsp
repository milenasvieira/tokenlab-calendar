<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html; charset=UTF-8" %>

<c:set var="contextPath" value="${pageContext.request.contextPath}"/>

<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <!-- BOOTSTRAP -->
    <link href='https://cdn.jsdelivr.net/npm/bootstrap@4.5.0/dist/css/bootstrap.css' rel='stylesheet' />
    <!-- FONTAWESOME -->
    <link href='https://cdn.jsdelivr.net/npm/@fortawesome/fontawesome-free@5.13.1/css/all.css' rel='stylesheet'>
    <!-- FULLCALENDAR -->
    <link rel="stylesheet" href="${contextPath}/resources/js/fullcalendar/main.css">
    <link rel="stylesheet" href="${contextPath}/resources/css/style-calendar.css">

    <script src="${contextPath}/resources/js/calendar-milena.js"></script>
    <script src="${contextPath}/resources/js/fullcalendar/main.js"></script>
    <script src="${contextPath}/resources/js/fullcalendar/locales/pt-br.js"></script>
    <script src="${contextPath}/resources/js/@fullcalendar/interaction/main.js"></script>

    <title>Calendar</title>

</head>
<body>

<navbar>
    <img src="https://www.tokenlab.com.br/img/tl-logo.png">
</navbar>
<div id='calendar'></div>
<div class="container">

    <c:if test="${pageContext.request.userPrincipal.name != null}">
        <form id="logoutForm" method="POST" action="${contextPath}/logout">
            <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
        </form>

        <a onclick="document.forms['logoutForm'].submit()">Logout</a>


    </c:if>

</div>


<!-- /container -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
<script src="${contextPath}/resources/js/bootstrap.min.js"></script>
</body>
</html>
