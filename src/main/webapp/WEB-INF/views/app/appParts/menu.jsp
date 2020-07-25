<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<ul class="nav flex-column long-bg">
    <sec:authorize access="isAuthenticated()">
        <li class="nav-item">
        <form action="<c:url value="/logout"/>" method="post">
            <span><input id="logout"  class="btn btn-link nav-link color-header" type="submit" value="Wyloguj"></span>
            <i class="fas fa-angle-right"></i>
            <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
        </form>
        </li>
    </sec:authorize>
    <li class="nav-item">
        <a class="nav-link" href="<c:url value="/app/home"/>">
            <span>Pulpit</span>
            <i class="fas fa-angle-right"></i>
        </a>
    </li>
    <li class="nav-item">
        <a class="nav-link" href="<c:url value="/app/recipes"/>">
            <span>Przepisy</span>
            <i class="fas fa-angle-right"></i>
        </a>
    </li>
    <li class="nav-item">
        <a class="nav-link" href="/app-schedules.html">
            <span>Plany</span>
            <i class="fas fa-angle-right"></i>
        </a>
    </li>
    <li class="nav-item">
        <a class="nav-link" href="/app-edit-user-data.html">
            <span>Edytuj dane</span>
            <i class="fas fa-angle-right"></i>
        </a>
    </li>
    <li class="nav-item">
        <a class="nav-link disabled" href="/app-edit-password.html">
            <span>Zmień hasło</span>
            <i class="fas fa-angle-right"></i>
        </a>
    </li>
    <li class="nav-item">
        <a class="nav-link" href="/super-admin-users.html">
            <span>Użytkownicy</span>
            <i class="fas fa-angle-right"></i>
        </a>
    </li>

</ul>