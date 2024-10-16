<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE HTML>
<html>

<head>
	<title>Festival Virtuel de la Bière</title>
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"
	    rel="stylesheet">
	<script src=https://code.jquery.com/jquery-3.7.1.min.js></script>
	<link rel="stylesheet" type="text/css"
	    href="css/style.css" />
	<link rel="icon" href="img/beerIcon.png">
</head>

<body>
    <header><jsp:include page="header.jsp"/></header>
    <hr class="solid">
    <main>
        <h1>${param.title}</h1>

        <jsp:include page="${param.content}"/>
    </main>
    
    <footer><jsp:include page="footer.jsp"/></footer>    
</body>

</html>