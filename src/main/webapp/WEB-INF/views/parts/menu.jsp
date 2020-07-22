<nav class="navbar navbar-expand-lg justify-content-around">
    <a href="${pageContext.request.contextPath}/" class="navbar-brand main-logo">
        Zaplanuj <span>Jedzonko</span>
    </a>
    <ul class="nav nounderline text-uppercase">
        <li class="nav-item ml-4">
            <a class="nav-link color-header" href="<c:url value="/app/home"/>">logowanie</a>
        </li>
        <li class="nav-item ml-4">
            <a class="nav-link color-header" href="register">rejestracja</a>
        </li>
        <li class="nav-item ml-4">
            <a class="nav-link" href="about">o aplikacji</a>
        </li>
        <li class="nav-item ml-4">
            <a class="nav-link disabled" href="recipes">Przepisy</a>
        </li>
        <li class="nav-item ml-4">
            <a class="nav-link disabled" href="contact">Kontakt</a>
        </li>

    </ul>
    <div>
    <ul class="nav nounderline text-uppercase">
        <li class="nav-item ml-4">
        <sec:authorize access="isAuthenticated()">
            <form class="nav-link disabled" action="<c:url value="/logout"/>" method="post">
                <input id="logout" class="nav-link disabled color-header" type="submit" value="Wyloguj">
                <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
            </form>
        </sec:authorize>
    </li>
    </ul>
    </div>
</nav>