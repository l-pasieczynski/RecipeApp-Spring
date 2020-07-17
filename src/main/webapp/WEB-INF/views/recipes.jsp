<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="parts/header.jsp"%>

<body>

<h1>Recipies</h1>

<c:forEach items="${recipies}" var="recipies">
    <div class="carousel-item">
        ${recipies.name}
    </div>
</c:forEach>

</body>

<%@ include file="parts/footer.jsp"%>


