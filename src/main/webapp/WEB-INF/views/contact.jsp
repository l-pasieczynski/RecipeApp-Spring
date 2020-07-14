<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="parts/header.jsp"%>

<body>
<section class="padding-large bg-light">

    <div id="carouselExampleControls" class="carousel slide main-slider" data-ride="carousel">
        <div class="carousel slider container">
            <div class="carousel-item active">
                <div class="container w-50 d-flex">
                    <div class="carousel-caption d-block">
                        <h1>Maria Iksińska</h1>
                        <h3>email: zaplanujjedzonko@gmail.com</h3>
                    </div>
                </div>
            </div>
            <c:forEach items="${requestScope.contacts}" var="about">
                <div class="carousel-item">
                    <div class="container w-50 d-flex">
                        <div class="carousel-caption d-block">
                            <h1>${about.firstName} ${about.lastName}</h1>
                            <h3>${about.email}</h3>
                        </div>
                    </div>
                </div>
            </c:forEach>
        </div>
        <a class="carousel-control-prev" href="#carouselExampleControls" role="button" data-slide="prev">
            <span class="carousel-control-prev-icon" aria-hidden="true"></span>
            <span class="sr-only">Previous</span>
        </a>
        <a class="carousel-control-next" href="#carouselExampleControls" role="button" data-slide="next">
            <span class="carousel-control-next-icon" aria-hidden="true"></span>
            <span class="sr-only">Next</span>
        </a>
    </div>
</section>

</body>

<%@ include file="parts/footer.jsp"%>


