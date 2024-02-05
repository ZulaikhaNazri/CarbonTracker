<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Berjaya</title>
</head>
<body>
	 

    <c:if test="${not empty message}">
        <div >
            ${message}
        </div>
    </c:if>
	<br>
    <a href="<c:url value='RekodAir/'/>">Kembali ke Rekod Air</a>
</body>
</html>