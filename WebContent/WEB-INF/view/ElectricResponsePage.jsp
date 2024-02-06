<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>electric</title>
</head>
<body>
	<h2>Electric Response</h2>

    <c:if test="${not empty message}">
        <div >
            ${message},. /
        </div>
    </c:if>
	<br>
    <a class="button" href="<c:url value='/RekodElektrik'/>">Kembali ke Rekod Penggunaan Elektrik</a>
    <button type="button" class="btn btn-outline-primary" onclick="window.location.href='RekodElektrik'">Kembali</button>
    

</body>
</html>