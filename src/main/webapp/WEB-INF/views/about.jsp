<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="parts/header.jsp"%>

<body>

<section class="padding-large bg-light">

    <div id="carouselExampleControls" class="carousel slide main-slider" data-ride="carousel">
        <div class="carousel slider container">
            <div class="carousel-item active">
                <div class="container w-50 d-flex">
                    <div class="carousel-caption d-block">
                        <h1>Maria Iksińska autorka bestsellerowej książki</h1>
                        <h3>Zaprasza do wypróbowania swoich nowatorskich przepisów.</h3>
                    </div>
                </div>
            </div>
            <c:forEach items="${requestScope.id}" var="about">
                <div class="carousel-item">
                    <div class="container w-75 d-flex">
                        <div class="carousel-caption d-block">
                            <h1>${about.title}</h1>
                            <h3>${about.description}</h3>
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


